package myobj.blackjack;

import java.util.Arrays;
import java.util.Random;

public class BlackjackDeck extends Deck {
	
	Card[] cards; //아 여따가 벌수에 따른 카드 다 집어넣을건가봐 
	int size;
	int index; //인덱스가 0부터 시작하면서 draw할 때마다 cards[index++]; 
	
	//아 이거 뭐야 존나 헬이네 
	public BlackjackDeck(int size) {
		this.size = size;
		this.cards = new Card[52 * size]; // 13*4 = 52 카드 벌수 늘릴 때마다 자유롭게 늘릴 수 있음
		
		for (int i = 0; i < size; ++i) { // 0~51, 52~103, 104~155 ...
			for(int suit = 0; suit < 4; ++suit) {  //suit(모양) 은 4개. 0~3으로 돌리기 
				for(int num = 0; num < 13; ++num) {
					//System.out.printf("[%d] %s [index: %d] \n" ,i,  new BlackjackCard(suit, num), i * 52 + suit * 13 + num);
					//이해 안 가니까 일단 배열에 넣지 말고 출력을 해보자
					cards[i * 52 + suit * 13 + num] = new BlackjackCard(suit, num);  //뭐야 이거 뭔식이야 
					//카드 한 벌에 52장 size는 벌수를 뜻함. 
				}
			}
		}
		shuffle();
	}
	
	
	
	@Override
	public void shuffle() {
		for(int i = 0, len = 200 * size; i < len; ++i) { //계산을 매번 하지 않기 위해 len을 박아주기. 그리고 대충 200번 섞는 걸로 하려다가 카드수가 200이상일 땐 200번 섞는 걸로 모자르겠지 그래서 size를 곱해주는 것

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

	
	
//	public static void main(String[] args) { //이해 안 가서 이해용. BlackjackCard()의 for문 가장 안 쪽 주석처리한 Sysout과 함께 보기 
		//new BlackjackDeck(1); //앗 싀바 new왜 써줘야 함? 같은 클래스 내에 있는디...
		//System.out.println(Arrays.toString(new BlackjackDeck(10).cards)); //잘 섞이고 있음을 알 수 있다. 
//	}
	
}
