package myobj.pirate;

public class Player {
	
	int win;
	int lose; //이기고 지는 횟수
	//클래스는 배열처럼 아무것도 초기화하지 않으면 알아서 0으로 초기화됨. 
	
//플레이어의 행위(이기고 지는 메서드) + 정보 (승률)
	
	public double winRate() {
		if(win + lose == 0) {
			return 0.0;
		}
		return (double) win / (win + lose) * 100;
	}
	
	public void win() {
		win++;
	}
	
	public void lose() {
		lose++;
	}
	
	public void print() {
		System.out.printf("Win : %d , Lose : %d, Rade: %.2f\n" , win, lose, winRate());
	}
	
}
