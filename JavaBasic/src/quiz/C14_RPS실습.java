package quiz;

import java.util.Scanner;

import myobj.rps실습오예.Fingers;
import myobj.rps실습오예.Players;
import myobj.rps실습오예.RpsFingers;

/*
가위바위보 게임을 만들어보세요
여태 배운 문법을 자유롭게 활용
*/

public class C14_RPS실습 {
	Scanner sc;
	public Fingers finger;
	public Players player;
	public Players computer;
	
	int playerSelect;
	int computerSelect;
	
	String playerFingersName;
	String computerFingersName;
	
	RpsFingers rpsFingers;
	
	public C14_RPS실습() {
		player = new Players();

	}
	
	
	String judge() {
		int judge = playerSelect - computerSelect;
		switch(judge) {
		case 1: case -2:
			player.win();
			return "플레이어 승!";
		case 2: case -1:
			player.lose();
			return "플레이어 패!";
		default: 
			player.draw();
			return "무승부!";
		}
	}
	
	//가위바위보 결과 출력
	void print() {
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒가위바위보!▒▒▒▒▒▒▒▒");
		System.out.println("플레이어	: " + playerFingersName);
		System.out.println("컴퓨터	: " + computerFingersName);
	}
	
	//숫자 >> 문자로 ex. 1 >> "가위"
	String numToName(int num) {
		String Name = rpsFingers.getFingersName(num);
		return Name;
	}
	
	//플레이어 가위바위보
	void playerPlay(int num) {
		playerSelect = num;
		playerFingersName = numToName(playerSelect);
	}
	//컴퓨터 가위바위보 
	void computerPlay() {
		computerSelect = rpsFingers.randomFingers();
		computerFingersName = numToName(computerSelect);
	}
	
	//게임 실행
	void start() {
		sc = new Scanner(System.in);
		
		rpsFingers = new RpsFingers();

		while(true) {
			
			System.out.print("게임시작(1) 플레이어 전적(2) 게임 종료 (3) >> ");
			int intro = sc.nextInt();
			if(intro == 1) {
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒GAME START▒▒▒▒▒▒▒▒▒▒");
				int input = 0;
				while(true) {
					System.out.print("가위바위보 직접 선택(1) 랜덤(2) >> ");
					input = sc.nextInt();
					if(input == 1 || input == 2) {
						break;	
					}
					System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력하세요. (1~2)");
				}
				
				if(input == 1) {
					while(true) {
						System.out.print("가위(1) 바위(2) 보(3) 고르시오 >> ");
						playerPlay(sc.nextInt());
						if(!playerFingersName.equals("4")) {
							break;
						}
						System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력하세요.(1~3)");
					}
				} else if(input == 2) {
					playerPlay(rpsFingers.randomFingers());
				}
				
				computerPlay();
				
				print();
				
				System.out.println(judge());
				System.out.println();
				
			} else if(intro == 2) {
				System.out.println(player);
			} else if (intro == 3) {
				System.out.println("게임 종료");
				return;
			} else {
				System.out.println("숫자를 다시 입력해주세요 (1~3)");
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new C14_RPS실습().start();
	}
	
}
