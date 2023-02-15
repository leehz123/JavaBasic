package myobj.rps실습오예;

public class Players {
	
	private int win; 
	private int lose; 
	private int draw;
	private int roundCnt;

	
	public void win() {
		win++;
		roundCnt++;
	}
	public void lose() {
		lose++;
		roundCnt++;
	}
	public void draw() {
		draw++;
		roundCnt++;
	}
	
	@Override
	public String toString() {
		
		return "\n플레이어's 전적\n" + "총 게임 수\t:\t" + roundCnt +  "\n이긴 횟수\t:\t" + win + "\n진 횟수\t:\t" + lose + "\n비긴 횟수\t:\t" + draw + "\n"; 
				
	}
}
