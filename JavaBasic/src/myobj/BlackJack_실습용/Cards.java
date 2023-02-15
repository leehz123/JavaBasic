package myobj.BlackJack_�ǽ���;

import java.util.Arrays;
import java.util.Random;

public class Cards {
	
	Random ran;
	static String[] cards = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Q", "K", "J"};
	//�̰� static���� �� ������ Cards c1 = new Cards(); Cards c2 = new Cards();.. �̷��� c1,c2,c3, ..�ν��Ͻ��� ������ ������ ��
	//cards �迭�� �� ���� �׻� ���� �����̵�
	int randomCardIndex;
	public String randomCard;
	public String[] cardsList = new String[15];
	public int cardsListIndex = 2;
	public int cardsSum = 0;
	
	boolean chkA;
	
	public Cards() {
		randomCard();
	}
	
	public String randomCard() { //�������� ī�� �� �� �̱�
		int randomCardIndex = (int)(Math.random() * cards.length);
		randomCard = cards[randomCardIndex];
		return randomCard;
	}
	
	public String[] deal() { //�� ó�� �÷��̾�� ���� �������� ī�� �� �徿 �����ִ� ��
		Arrays.fill(cardsList, " ");
		for(int i = 0; i <= 1 ; ++i) {
			cardsList[i] = randomCard();
		}
		return cardsList;
	}
	
	public int convertToNum(String str) { // ���ڿ� "A", "Q", "K", "J"�� ���ڷ� �ٲ��ִ� �޼��� 
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
	
	public int dealCardsSum() { //�ϴ� ������ ���� �� ī���� ��(cardsList)�� ���ϱ�.  
		for(int i = 0; i <= 1; ++i) {
			cardsSum += convertToNum(cardsList[i]);	
			
		}
		
		
		
		return cardsSum;
	}					
						
	public void hit() { 
		String hit = randomCard();
		System.out.println("�߰��� ī�� : " + hit);
		cardsList[cardsListIndex] = hit;
		System.out.println("ī�� ����Ʈ : " + Arrays.toString(cardsList));
		cardsSum += convertToNum(hit);
		aToOne();
		System.out.println("�� ī���� �� : " + cardsSum);
		cardsListIndex++;
	}


	
	@Override
	public String toString() {
		return Arrays.toString(cardsList);
	}

	
	public void playerJudge() {
		if (cardsSum == 21) {
			System.out.println("����!!!! �÷��̾� win!");
			System.exit(0);
		} else if (cardsSum > 21) {
			System.out.println("������ �ʰ��� ���� win!");	
			System.exit(0);
		}
	}
	
	public void dealerJudge() {
		if(cardsSum == 21) {
			System.out.println("����!!! ���� win!");
			System.exit(0);
			
		} else if (cardsSum > 21) {
			System.out.println("������ �ʰ��� �÷��̾� win!");	
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

