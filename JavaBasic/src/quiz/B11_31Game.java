package quiz;

import java.util.Scanner;

public class B11_31Game {
	/*
	 배스킨라빈스 서티원 겜
	 1. 처음 프로그램을 실행하면 몇 명으로 시작할 지 선택한다.(인원은 최소 2명 이상) 
	 2. 여러 플레이어가 번갈아가면서 숫자를 선택한다. 
	 	숫자는 123만 선택할 수 있다. 
	 3. 누적된 숫자가 31이상일 때 그 사람이 패배한다. 
	 */
	//내 풀이. 
	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		int people = 0;
		
		while(true) {
			System.out.println("플레이어 수를 입력하시오.");
			people = sc.nextInt();
			if(people >= 2) {
				System.out.println("인원 충족. 게임 시작.");
				System.out.println("####################GAME START#######################");
				System.out.println();
				break;
			}
			System.out.println("2 명 이상이어야 게임을 시작할 수 있습니다. 다시 입력.");
		}
		
		int i = 1;
		int cnt = 0;
		int pNum = 0;
		
		while (i <= 31) {
			
			while(true) {
				++pNum;
				System.out.println("★플레이어 "+ pNum + "★ : 현재 숫자에서 몇 번 전진할 지 정하시오. (3 번 이하로 가능)");
				System.out.println("현재 숫자 : " + cnt);
				int num = sc.nextInt();
				if(num >0 && num <= 3) {
					System.out.println(num + "번 전진합니다.");
					cnt += num;
					System.out.println("결과: " + cnt);
					System.out.println("____________________________________________");
					System.out.println();
					if(pNum >= people) {
						pNum = 0;
					}
					break;
				}
				System.out.println("▲▲ 3 이하의 양수만 입력 가능. ▲▲");
				--pNum;
				System.out.println("___________________________________________");
				System.out.println();
			
			}
			
			if(cnt >= 31) {
				System.out.println("★플레이어" + pNum + "★ 이/가 졌습니다.");
				System.out.println("#####################GAME OVER########################");
				break;
			}
			
			++i;
		}
*/
			
			//정답 풀이. 
			Scanner sc = new Scanner(System.in);
	
			//올바른 max_player(플레이어수)를 입력받기 위한 무한루프
			int max_player;
			while (true) {	
				System.out.println("몇 명?");
				max_player = sc.nextInt();
				
				if (max_player > 2) {
					break;
				}
				System.out.println("다시 제대로");
			}
			
			System.out.println("플레이어는 " + max_player + "명 입니다.");
	
			
			
			int num = 0;  //31까지 세기 위한 변수
			int current_player = 0; //현재 플레이어가 몇 번인지 표시하기 위한 변수
			
			//num이 31이 될 때 까지 게임을 반복하기 위한 무한루프
			while(true) {
				
				//올바른 user_num(1~3)을 입력받기 위한 무한루프
				int user_num = 0;
				while (user_num < 1 || user_num > 3) {
					System.out.printf("플레이어 %d님 숫자를 입력하세요>>", current_player + 1);
					user_num = sc.nextInt();
				}
				//플레이어가 1~3 중에 하나의 수를 입력하면 그 수를 num에 누적.
				num += user_num;
				
				//게임반복 무한루프 통과 조건 (31을 넘기면 게임 끝)
				//num에 누적된 수가 31을 넘길 때 GAME OVER를 알리고 패자의 번호 current_player(+1)도 같이 제공.
				if(num >= 31) {
					System.out.printf("플레이어 %d의 패배.", current_player + 1);
					break;
				}
				
				//num이 아직 31에 도달하지 못해서 위의 if문에 걸리지 않았고 게임이 종료되지 않음.
				//게임이 진행되는 중이고, 현재까지 누적된 숫자와 다음 플레이어로 넘어가기 위해 current_player에 +1을 해준다.
				//그리고 current_player에 1씩 계속 누적될텐데 이걸 max_player(인원)수 내에서 순환시키기 위해 %이용!
				System.out.println("현재 숫자는 " + num + "입니다.");
				current_player = (current_player + 1) % max_player; 
				//3명이서 진행하고 맨 처음 current_player의 값이 0으로 내려왔을 때 (0+1) % 3 하면
				//current_player에 1이 담겨서 게임반복 무한루프의 다음 회전이 시작되고 
				//콘솔에 표시될 때 current_player에 담긴 값 1 + 1 -> 2 가 되어 플레이어 2님 ..어쩌고가 표시됨. 
				
			}
			
			System.out.println("num이 31을 넘어서 while문을 벗어났습니다.");
			
			
				
		
			
			
	
	
	
	
	
	}
}
