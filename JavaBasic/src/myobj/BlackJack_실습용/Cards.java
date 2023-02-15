package myobj.BlackJack_실습용;

import java.util.Arrays;
import java.util.Random;

public class Cards {
	
	Random ran;
	static String[] cards = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Q", "K", "J"};
	//이걸 static으로 한 이유는 Cards c1 = new Cards(); Cards c2 = new Cards();.. 이렇게 c1,c2,c3, ..인스턴스를 여러개 생성할 때
	//cards 배열에 든 값이 항상 같기 때문이돠
	int randomCardIndex;
	public String randomCard;
	public String[] cardsList = new String[15];
	public int cardsListIndex = 2;
	public int cardsSum = 0;
	
	boolean chkA;
	
	public Cards() {
		randomCard();
	}
	
	public String randomCard() { //랜덤으로 카드 한 장 뽑기
		int randomCardIndex = (int)(Math.random() * cards.length);
		randomCard = cards[randomCardIndex];
		return randomCard;
	}
	
	public String[] deal() { //맨 처음 플레이어와 딜러 각각에게 카드 두 장씩 나눠주는 것
		Arrays.fill(cardsList, " ");
		for(int i = 0; i <= 1 ; ++i) {
			cardsList[i] = randomCard();
		}
		return cardsList;
	}
	
	public int convertToNum(String str) { // 문자열 "A", "Q", "K", "J"를 숫자로 바꿔주는 메서드 
		int tmp = 0;
		switch(str) {
		case "Q": case "K": case "J":
			tmp = 10;
			break;
		case "A" :
			tmp = 11;
			break;
		default:
			tmp = Integer.parseInt(str);
		}
		return tmp;
	}
	
	public int dealCardsSum() { //일단 딜에서 나온 두 카드의 합(cardsList)만 구하기.  
		for(int i = 0; i <= 1; ++i) {
			cardsSum += convertToNum(cardsList[i]);	
			
		}
		
		
		
		return cardsSum;
	}					
						
	public void hit() { 
		String hit = randomCard();
		System.out.println("추가된 카드 : " + hit);
		cardsList[cardsListIndex] = hit;
		System.out.println("카드 리스트 : " + Arrays.toString(cardsList));
		cardsSum += convertToNum(hit);
		aToOne();
		System.out.println("총 카드의 합 : " + cardsSum);
		cardsListIndex++;
	}


	
	@Override
	public String toString() {
		return Arrays.toString(cardsList);
	}

	
	public void playerJudge() {
		if (cardsSum == 21) {
			System.out.println("블랙잭!!!! 플레이어 win!");
			System.exit(0);
		} else if (cardsSum > 21) {
			System.out.println("▲점수 초과▲ 딜러 win!");	
			System.exit(0);
		}
	}
	
	public void dealerJudge() {
		if(cardsSum == 21) {
			System.out.println("블랙잭!!! 딜러 win!");
			System.exit(0);
			
		} else if (cardsSum > 21) {
			System.out.println("▲점수 초과▲ 플레이어 win!");	
			System.exit(0);
			
		} 
	}
	
	
	public boolean containsA() {

		for(int i = 0; i < cardsList.length; ++i) {
			if(cardsList[i].equals("A")) {
				chkA = true;
			}
		}
		return chkA;
	}
	
	public void aToOne() {
		if((cardsSum > 21) && chkA ) {
			cardsSum = cardsSum - 10;
		}
	}
	
	
	
}

