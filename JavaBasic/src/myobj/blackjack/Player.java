package myobj.blackjack;

public class Player {
	
	private int money;
	private int win;
	private int lose;
	private int draw;
	private int betmoney;  
	//private은 없는 거나 마찬가지 진자 별 거 아님
	//blackJack의 Player에서만 변수들을 쓸 수 있게 만드는 것. 같은 클래스 내부에서만 접근 가능하게 만드는 것. 
	//다른 데선 쓰려고 점 찍어도 안 보임
	
	
	
	public void betting(int betmoney) {
		this.betmoney = betmoney;
	}
	
	
	public Player() {
		money = 5000;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void win() {
		win++;
		money += betmoney;
		
	}
	
	public void draw() {
		draw++;
	}
	
	public void lose() {
		lose++;
		money -= betmoney;
	}
	
	@Override
	public String toString() {
		return String.format("보유 머니: %d\n" 
								+ "승률: %.2f%%\n" , money, (double) win / (win + lose + draw) * 100);
	}
}
