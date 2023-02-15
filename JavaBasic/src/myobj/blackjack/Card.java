package myobj.blackjack;

abstract public class Card {
	
	
	protected boolean visible = true;
	
	
//	public void reverse() {
//		 visible = !visible; 
//	}//카드를 뒤집을 수 있는 메서드는 여기 잉ㅆ어야 한다. blackjackCard가 아니라
//	아님 앱스트랙트로 하든가 
	abstract public void reverse();
	
	
	abstract public int getValue(); //점수계산
	
	abstract public String getCardShape(); //카드 모양 출력할 때 사용
	//먼저 이렇게 abstract로 틀만 짜놓기
	
	//위에 abstract메서드들을 자식클래스 BlackjackCard에서 구현할 것
	
	//나중에 이거 다 완성 될거니까 일단 날 믿고 써~ 어음 인 셈 
	
}
