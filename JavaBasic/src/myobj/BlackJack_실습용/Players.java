package myobj.BlackJack_�ǽ���;

public class Players {
	int score;
								
	Cards card = new Cards();
	
	public void currentCardsScore() {
		score = card.cardsSum;
		System.out.println(score);
	}
}



