package myobj.blackjack;

public class BlackjackCard extends Card {

	
		private final static char[] SUITS = 
			{'��', '��', '��', '��'};
	
		private final static String[] NUMBERS = 
			{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		private final static int[] VALUES = 
			{11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		
		private int suit;
		private int num;
		
//		private boolean visible = true; //���� ī�� �� �� ������ ���� . �ٵ� �̰� C13_BlackJack���� ��ĳ���� ��¼�� ���� ��Ŭ Card�� ��������� ��. 
		
		
		public BlackjackCard( int suit, int num ) {
			this.suit = suit;
			this.num = num;
		}
		
		//ī�带 ������ �޼��� (����ī�� �� ��)
		public void reverse() {
			visible = !visible;
		}
		
		//BlackjackDeckŬ������ BlackjackDeck() ���� �� ���� �� ���ؿ�. 
		@Override
		public String toString() {
		return String.format("Shape : %c%s\t Value : %d\n", SUITS[suit], NUMBERS[num], VALUES[num]);
		}
		
		@Override
		public int getValue() { 
			return VALUES[num];
		}//���� �����ָ� ���~
		
		
		@Override
		public String getCardShape() {	
			if(visible) {
				return String.format("%c %s", SUITS[suit], NUMBERS[num]);
			} else {
				return "[�޸�]";
			}
		}
		
		
		
		
		
}
