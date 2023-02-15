package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.blackjack.BlackjackDeck;
import myobj.blackjack.Card;
import myobj.blackjack.Deck;
import myobj.blackjack.Player;

//추상클래스는 하향식 개발이네 그럼 있다고 생각하고 세부적인 부분으로 파고 들어가니까 
//내가 여태까지 하던 건 상향식이고 
//세부적인 것부터 하면 합치면서 끼워맞춰지지 않는 것들이 많이 생김 근데 하향식으로 하면 그런 것들이 줄어드는 효과
//근데 어떻게 해도 문제는 생기니까 이건 취향의 문제  추상을 굳이 안 써도 됨 

public class C13_BlackJack {
	
	Deck deck; //게임을 굴리기 위해선 덱타입의 덱이 있어야 겠쥐
	Player player;
	Player dealer;
	
	Card[] playerCards;
	Card[] dealerCards;
	
	int playerCardIndex;
	int dealerCardIndex;//초기화 0. 어차피 0번째부터 카드 뽑.
	
	public C13_BlackJack() {
		deck = new BlackjackDeck(3); //BlackjackDeck(int size) 
		//블랙잭덱(자식타입)이 덱(부모타입) 타입에 들어가서 활용되도록.  ▲▲▲▲▲▲▲먼소리여 흐흑 
		//대외적으로 사용하는 것만 부모타입에 추가하는 거래 
		//얘땜에 visible과 reverse()를 선언하는 곳이 Card클래스가 돼야 함
		
		
		playerCards = new Card[21];
		dealerCards = new Card[21]; //카드는 1씩만 뽑아도 21이 되지 않겠냐. 그래서 최대 칸수를 21개로 정함. 
		
		dealer = new Player();
		dealer.setMoney(1000000);
		
		player = new Player();
		player.setMoney(3000);
	}
	
	private int calcScore(Card[] cards) {
		int valueSum = 0;
		int aceCnt = 0;//A 세는 용
		
		for (int i = 0; cards[i] != null; ++i ) {
			Card card = cards[i];
			int value = card.getValue();
			valueSum += value;
			
			//A가 몇 개 있는지 세야 함
			if(value == 11) {
				aceCnt++;
			}
		}
		//현재 합이 21을 초과하면서 A를 포함한다면 10을 뺄 수 잇다. 
		if(valueSum > 21) {
			while(valueSum > 21 && aceCnt > 0) {  //A를 하나만 빼고 싶을 수가 잇으니까 첫번째 조건 포함
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
		
		// 근데 딜러는 카드 한 장을 가려놔야 하잖아? 
		
		System.out.print("Player Cards : ");
		for(int i = 0; playerCards[i] != null ; ++i ) {
			System.out.print(playerCards[i].getCardShape()+ " ");
		}
		System.out.println();
		System.out.printf("%d\n", calcScore(playerCards));
	}
	
	
	public void start() {  //인스턴스를 만들었으니까 인스턴스로 해볼궤
		Scanner sc = new Scanner(System.in);
		deck.shuffle();
		
		//딜러 2 장
//		dealerCards[dealerCardIndex] = deck.draw();
//		dealerCardIndex++;
//		dealerCards[dealerCardIndex] = deck.draw();
//		dealerCardIndex++;  아 반복되는 거 보니 또 메서드로 만들고 싶쥐
		dealerDraw();
		dealerDraw();
		dealerCards[0].reverse();
		//위에서 업캐스팅 한 것 때문에! reverse() 문제 생김
		
		
		
//		dealerDraw();
//		dealerDraw(); //A를 11에서 1로 만드는 조건이 잘 작동하는지 확인하기 위해 4번씩 draw해보자 
		
		//플레이어 2 장
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
				//뽑았는데 카드의 합이 21 초과라면 강제 게임 종료. 
				if(calcScore(playerCards) > 21) {
					break;
				}
			} else {
				System.out.println("올바른 번호를 다시 입력해주세요.");
			}
			
		}
		
		int playerValue = calcScore(playerCards);
		int dealerValue = calcScore(dealerCards);
		
		print();
		//플레이어 합이 21이 넘는다면 딜러는 카드를 뽑지도 않는다. 
		if(playerValue > 21) {
			System.out.println("플레이어의 버스트입니다. ");
			player.lose();
			return;
		}
		
		//딜러의 카드를 뽑으면서 누가 이겼는지 체크해야 함.
		System.out.println("이제 딜러가 카드를 뽑습니다...");
		dealerCards[0].reverse();
		
		while(calcScore(dealerCards)< 17) {
			dealerDraw();	
		}
		
		print();
		
		if(dealerValue > 21) {
			System.out.println("딜러의 패배입니다. ");
		} else if (playerValue < dealerValue ) {
			System.out.println("플레이어의 패배입니다. ");
			player.lose();
		}  else if(playerValue > dealerValue ) {
			System.out.println("딜러의 패배입니다. ");
			dealer.lose();
		} else {
			player.draw();
			System.out.println("무승부입니다. "); //딜러 전적은 따로 기록 안 할래
		}
		
		
//		System.out.println(Arrays.toString(dealerCards));   //테스트용
//		System.out.println(calcScore(dealerCards));
//		System.out.println(Arrays.toString(playerCards));
//		System.out.println(calcScore(playerCards));
			
	}
	
	public static void main(String[] args) {
//		C13_BlackJack game = new C13_BlackJack();
//		game.deck.draw();
		
//		Player p1 = new Player(); //임포트 해줘라 좀 팍쉬 
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
