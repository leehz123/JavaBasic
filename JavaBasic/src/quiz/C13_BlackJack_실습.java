package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.BlackJack_�ǽ���.Cards;
import myobj.BlackJack_�ǽ���.Players;

//�߻�Ŭ���� �� �� ���ᵵ ��(��ƴ�)
/*
������ �������� 
�������� ī�带 ���徿 �޾� 21�� ����� ���� ����� ����� �̱�� 21�� �ʰ��ϸ� ���� ����.
10�� �ش�Ǵ� ī�� 10, J, Q, K

1. ��ǻ��(����) �� ���(�÷��̾�) �� ī�带 �̴´�. 
2. ó������ �� ��� 2�徿 �޴´�. �� �� ������ ī��� ���� �������´�. 
3. �÷��̾�� ��Ȳ�� ���� �� ������(hit) ���⼭ ������(stand) ������ �� �ִ�.
4. �÷��̾ ���߸� ������ ������ �ִ� ī�带 �����ϰ� ��Ģ�� ���� ī�带 ��� �̴´�.
   ������ �ݵ�� ������ �ִ� ī�� ���� 16 ������ �� ������ �̰� 17 �̻��̸� ������ �����. 
   
5. �÷��̾��� ī�� ���� �������� ������ �¸�. 
	�÷��̾��� ī�� ���� ��Ȯ�ϰ� 21�̸� ���� �� �ִ� �ִ밪�̹Ƿ� �� ���� �ʴ´�. 
	�÷��̾��� ī�� ���� 21���� ũ�� (����Ʈ) �й�. 
6. A�� 1�� �� �� �ְ� 11�� �� ���� �ִ�.
�����ڷ� https://www.247blackjack.com/
7. ������ �Ǹ� �÷��̾ ���� ���°ͱ��� ��..

�� �ٵ� ���ڰ� ���� ���� �־�� �ϴ� �� �ƴ�? 19 : 19 �� push������  (�ϴ� push���� �� �ϴ� �ɷ�?)
 */

public class C13_BlackJack_�ǽ� {
	
	Players[] player = new Players[2]; //0�� �ε����� �����, 1�� �ε����� ����
	//�״ϱ� �� ÷�� �� �ѹ� �ϰ� �� ���� ����� player[0]�� ����ְ� �װ� dealer�� �� �����ְ� 
	// �� �㿡 �� �ѹ� �ϰ� �� ���� ����� player[1]�� ����ְ� �װ� dealer�� �� �����ְ�
	//�� �㿡 ����ڰ� hit �� stand�߿� hit���� hit�� ī�带 �����ְ� cardsSum�� ���ؼ� ī����� ���� �����ְ� 
	//���࿡ stand�ϸ� dealer�� cardsSum�� 16������ ���� hit�� ��� �ϰ� 
	
	public static void main(String[] args) {
		
		game();	
		
					
	}
	
	static void game() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 : ���� ���� \n2 : ���� ����");
			System.out.print("��ȣ�� �Է��Ͻÿ� >> ");
			int input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("GAME START");
				break;
			}
			System.out.println("GAME OVER");
			return;
		}
		
		Cards cards1 = new Cards(); //�����
		Cards cards2 = new Cards(); //����
	
		cards1.deal();
		cards2.deal();
		
		//������ ������ ������ ��� ���� �˸��� ���α׷� ����
		cards1.dealCardsSum();
		cards2.dealCardsSum();
		
		
		System.out.print("�÷��̾� �� ī�� : " + cards1 + "\t");
		System.out.println("�÷��̾��� ī�� �� : " + cards1.cardsSum);
		System.out.print("���� �� ī�� : " + cards2 + "\t");
		System.out.println("������ ī�� �� : " + cards2.cardsSum);
		
		cards1.playerJudge();
		cards2.playerJudge();
		
		while(true) {
			System.out.println("1 : hit\n2:stand");
			System.out.print("��ȣ�� �Է��Ͻÿ� >> ");
			int input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("�÷��̾��� ī�带 �̽��ϴ�...");
				cards1.hit();
				
				//cards1.aToOne();
				cards1.playerJudge();
				
			} else if(input == 2) {
				while(true) {
					System.out.println("������ ī�带 �̽��ϴ�...");
					cards2.hit();
					
					//cards2.aToOne();
					cards2.dealerJudge();
					if(cards2.cardsSum >= 17) {
						break;
					}
				}
			} else if(input > 2 || input < 1) {
				System.out.println("�Է� ����. 1 �� 2 �߿��� ��ȣ�� �ٽ� �Է����ּ���. ");
			}
		}
		
	}
	
	static void test() { //�ƴ� �̰� �� ����ƽ ����� ����?
		Cards cards = new Cards();
		
		System.out.println("����ī�� �̱� �׽�Ʈ�� :  " + cards.randomCard()); //����ī�� �̱�
		System.out.println("�� ���� �� ī�� ���� �̱� : " + Arrays.toString(cards.deal())); //�� ���� �� �� �� �̱�
		
		
		System.out.println("�� ���� �� ���� ī�尡 cardList�� ����� ���� �ƴ��� : " + Arrays.toString(cards.cardsList)); //ī�帮��Ʈ�� ����� ���� �ƴ��� Ȯ�� 
		System.out.println("�� �� �� ���������� ���� ����ī�尡 randomCard������ �� ���� �ƴ��� : " + cards.randomCard);
		
		System.out.println("���ڸ� ���ڷ� �ٲٴ� �޼��尡 �� �����ϴ��� : " + cards.convertToNum(cards.randomCard));
		
		System.out.println("deal cards�� �� : " + cards.dealCardsSum()); //��ī���� ���� ���� ��.
		System.out.println("deal cards�� ���� cardsSum�� 1�������� �� ���� �ƴ��� : " + cards.cardsSum);
		
		System.out.println();
		System.out.println("hit���� �� ���� �߰��� ī��� �� ī���� �� : ");
		cards.hit(); 
	}


}








