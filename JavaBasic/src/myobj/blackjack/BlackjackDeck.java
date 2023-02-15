package myobj.blackjack;

import java.util.Arrays;
import java.util.Random;

public class BlackjackDeck extends Deck {
	
	Card[] cards; //�� ������ ������ ���� ī�� �� ��������ǰ��� 
	int size;
	int index; //�ε����� 0���� �����ϸ鼭 draw�� ������ cards[index++]; 
	
	//�� �̰� ���� ���� ���̳� 
	public BlackjackDeck(int size) {
		this.size = size;
		this.cards = new Card[52 * size]; // 13*4 = 52 ī�� ���� �ø� ������ �����Ӱ� �ø� �� ����
		
		for (int i = 0; i < size; ++i) { // 0~51, 52~103, 104~155 ...
			for(int suit = 0; suit < 4; ++suit) {  //suit(���) �� 4��. 0~3���� ������ 
				for(int num = 0; num < 13; ++num) {
					//System.out.printf("[%d] %s [index: %d] \n" ,i,  new BlackjackCard(suit, num), i * 52 + suit * 13 + num);
					//���� �� ���ϱ� �ϴ� �迭�� ���� ���� ����� �غ���
					cards[i * 52 + suit * 13 + num] = new BlackjackCard(suit, num);  //���� �̰� �����̾� 
					//ī�� �� ���� 52�� size�� ������ ����. 
				}
			}
		}
		shuffle();
	}
	
	
	
	@Override
	public void shuffle() {
		for(int i = 0, len = 200 * size; i < len; ++i) { //����� �Ź� ���� �ʱ� ���� len�� �ھ��ֱ�. �׸��� ���� 200�� ���� �ɷ� �Ϸ��ٰ� ī����� 200�̻��� �� 200�� ���� �ɷ� ���ڸ����� �׷��� size�� �����ִ� ��

			int ranIndex = (int)(Math.random() * cards.length);
			Card temp = cards[0];
			cards[0] = cards[ranIndex];
			cards[ranIndex] = temp;
		}

	}

	@Override
	public Card draw() {
		return cards[index++];
	}

	
	
//	public static void main(String[] args) { //���� �� ���� ���ؿ�. BlackjackCard()�� for�� ���� �� �� �ּ�ó���� Sysout�� �Բ� ���� 
		//new BlackjackDeck(1); //�� �ù� new�� ����� ��? ���� Ŭ���� ���� �ִµ�...
		//System.out.println(Arrays.toString(new BlackjackDeck(10).cards)); //�� ���̰� ������ �� �� �ִ�. 
//	}
	
}
