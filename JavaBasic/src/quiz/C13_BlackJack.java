package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.blackjack.BlackjackDeck;
import myobj.blackjack.Card;
import myobj.blackjack.Deck;
import myobj.blackjack.Player;

//�߻�Ŭ������ ����� �����̳� �׷� �ִٰ� �����ϰ� �������� �κ����� �İ� ���ϱ� 
//���� ���±��� �ϴ� �� ������̰� 
//�������� �ͺ��� �ϸ� ��ġ�鼭 ������������ �ʴ� �͵��� ���� ���� �ٵ� ��������� �ϸ� �׷� �͵��� �پ��� ȿ��
//�ٵ� ��� �ص� ������ ����ϱ� �̰� ������ ����  �߻��� ���� �� �ᵵ �� 

public class C13_BlackJack {
	
	Deck deck; //������ ������ ���ؼ� ��Ÿ���� ���� �־�� ����
	Player player;
	Player dealer;
	
	Card[] playerCards;
	Card[] dealerCards;
	
	int playerCardIndex;
	int dealerCardIndex;//�ʱ�ȭ 0. ������ 0��°���� ī�� ��.
	
	public C13_BlackJack() {
		deck = new BlackjackDeck(3); //BlackjackDeck(int size) 
		//���赦(�ڽ�Ÿ��)�� ��(�θ�Ÿ��) Ÿ�Կ� ���� Ȱ��ǵ���.  ��������ռҸ��� ���� 
		//��������� ����ϴ� �͸� �θ�Ÿ�Կ� �߰��ϴ� �ŷ� 
		//�궫�� visible�� reverse()�� �����ϴ� ���� CardŬ������ �ž� ��
		
		
		playerCards = new Card[21];
		dealerCards = new Card[21]; //ī��� 1���� �̾Ƶ� 21�� ���� �ʰڳ�. �׷��� �ִ� ĭ���� 21���� ����. 
		
		dealer = new Player();
		dealer.setMoney(1000000);
		
		player = new Player();
		player.setMoney(3000);
	}
	
	private int calcScore(Card[] cards) {
		int valueSum = 0;
		int aceCnt = 0;//A ���� ��
		
		for (int i = 0; cards[i] != null; ++i ) {
			Card card = cards[i];
			int value = card.getValue();
			valueSum += value;
			
			//A�� �� �� �ִ��� ���� ��
			if(value == 11) {
				aceCnt++;
			}
		}
		//���� ���� 21�� �ʰ��ϸ鼭 A�� �����Ѵٸ� 10�� �� �� �մ�. 
		if(valueSum > 21) {
			while(valueSum > 21 && aceCnt > 0) {  //A�� �ϳ��� ���� ���� ���� �����ϱ� ù��° ���� ����
				valueSum -= 10;
				--aceCnt;
			}
		}
		return valueSum;
	}
	
	
	
	
	private void dealerDraw() {
		dealerCards[dealerCardIndex++] = deck.draw();
	}
	
	private void playerDraw() {
		playerCards[playerCardIndex++] = deck.draw();
	}
	
	

	private void print() {
		System.out.print("Dealer Cards : ");

		for(int i = 0;  dealerCards[i] != null ; ++i ) {
			System.out.print(dealerCards[i].getCardShape() + " ");
		}
		System.out.println();
		System.out.printf("%d\n", calcScore(dealerCards));
		
		// �ٵ� ������ ī�� �� ���� �������� ���ݾ�? 
		
		System.out.print("Player Cards : ");
		for(int i = 0; playerCards[i] != null ; ++i ) {
			System.out.print(playerCards[i].getCardShape()+ " ");
		}
		System.out.println();
		System.out.printf("%d\n", calcScore(playerCards));
	}
	
	
	public void start() {  //�ν��Ͻ��� ��������ϱ� �ν��Ͻ��� �غ���
		Scanner sc = new Scanner(System.in);
		deck.shuffle();
		
		//���� 2 ��
//		dealerCards[dealerCardIndex] = deck.draw();
//		dealerCardIndex++;
//		dealerCards[dealerCardIndex] = deck.draw();
//		dealerCardIndex++;  �� �ݺ��Ǵ� �� ���� �� �޼���� ����� ����
		dealerDraw();
		dealerDraw();
		dealerCards[0].reverse();
		//������ ��ĳ���� �� �� ������! reverse() ���� ����
		
		
		
//		dealerDraw();
//		dealerDraw(); //A�� 11���� 1�� ����� ������ �� �۵��ϴ��� Ȯ���ϱ� ���� 4���� draw�غ��� 
		
		//�÷��̾� 2 ��
		playerDraw();
		playerDraw();
		
//		playerDraw();
//		playerDraw();
			
		while(true) {
			print();
			System.out.println("1. Hit or 2.Stand? ");
			int select = sc.nextInt();
			if(select ==2) {
				break;
			} else if (select == 1) {
				playerDraw();				
				//�̾Ҵµ� ī���� ���� 21 �ʰ���� ���� ���� ����. 
				if(calcScore(playerCards) > 21) {
					break;
				}
			} else {
				System.out.println("�ùٸ� ��ȣ�� �ٽ� �Է����ּ���.");
			}
			
		}
		
		int playerValue = calcScore(playerCards);
		int dealerValue = calcScore(dealerCards);
		
		print();
		//�÷��̾� ���� 21�� �Ѵ´ٸ� ������ ī�带 ������ �ʴ´�. 
		if(playerValue > 21) {
			System.out.println("�÷��̾��� ����Ʈ�Դϴ�. ");
			player.lose();
			return;
		}
		
		//������ ī�带 �����鼭 ���� �̰���� üũ�ؾ� ��.
		System.out.println("���� ������ ī�带 �̽��ϴ�...");
		dealerCards[0].reverse();
		
		while(calcScore(dealerCards)< 17) {
			dealerDraw();	
		}
		
		print();
		
		if(dealerValue > 21) {
			System.out.println("������ �й��Դϴ�. ");
		} else if (playerValue < dealerValue ) {
			System.out.println("�÷��̾��� �й��Դϴ�. ");
			player.lose();
		}  else if(playerValue > dealerValue ) {
			System.out.println("������ �й��Դϴ�. ");
			dealer.lose();
		} else {
			player.draw();
			System.out.println("���º��Դϴ�. "); //���� ������ ���� ��� �� �ҷ�
		}
		
		
//		System.out.println(Arrays.toString(dealerCards));   //�׽�Ʈ��
//		System.out.println(calcScore(dealerCards));
//		System.out.println(Arrays.toString(playerCards));
//		System.out.println(calcScore(playerCards));
			
	}
	
	public static void main(String[] args) {
//		C13_BlackJack game = new C13_BlackJack();
//		game.deck.draw();
		
//		Player p1 = new Player(); //����Ʈ ����� �� �Ž� 
//		
//		p1.betting(500);
//		p1.win();
//		System.out.println(p1);
//		
//		p1.betting(200);
//		p1.lose();
//		System.out.println(p1);
//		
//		p1.betting(1500);
//		p1.lose();
//		System.out.println(p1);
//		
//		p1.betting(2000);
//		p1.draw();
//		System.out.println(p1);
		
		new C13_BlackJack().start();
		
	}
}
