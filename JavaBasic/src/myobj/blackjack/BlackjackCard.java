package myobj.blackjack;

public class BlackjackCard extends Card {

	
		private final static char[] SUITS = 
			{'♠', '♡', '♣', '◇'};
	
		private final static String[] NUMBERS = 
			{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		private final static int[] VALUES = 
			{11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		
		private int suit;
		private int num;
		
//		private boolean visible = true; //딜러 카드 한 장 가리기 위해 . 근데 이거 C13_BlackJack에서 업캐스팅 어쩌고 땜에 부클 Card에 선언해줘야 함. 
		
		
		public BlackjackCard( int suit, int num ) {
			this.suit = suit;
			this.num = num;
		}
		
		//카드를 뒤집는 메서드 (딜러카드 한 장)
		public void reverse() {
			visible = !visible;
		}
		
		//BlackjackDeck클래스의 BlackjackDeck() 이해 안 가는 거 이해용. 
		@Override
		public String toString() {
		return String.format("Shape : %c%s\t Value : %d\n", SUITS[suit], NUMBERS[num], VALUES[num]);
		}
		
		@Override
		public int getValue() { 
			return VALUES[num];
		}//값만 돌려주면 깔끔~
		
		
		@Override
		public String getCardShape() {	
			if(visible) {
				return String.format("%c %s", SUITS[suit], NUMBERS[num]);
			} else {
				return "[뒷면]";
			}
		}
		
		
		
		
		
}
