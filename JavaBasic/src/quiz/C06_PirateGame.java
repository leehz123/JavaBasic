package quiz;
//통아저씨 게임을 만들어보세요. 
	/*
	1 게임이 시작되면 플레이어가 몇 명인지 정한다. 
	2. 여러 플레이어가 돌아가면서 원하는 위치에 칼을 찌른다. - 배열?
	3. 칼을 찌를 수 있는 홈은 20 개가 있고 그 중 2 개가 꽝이 된다. (매 판마다 위치가 랜덤으로 생성된다.)
	4. 잘못된 곳을 칼로 찌른 플레이어는 게임에 패배한다. 
	5. 게임은 계속 이어서 플레이 할 수 있고, 각 플레이어의 전적도 누적 집계 되어야 한다.  -전적은 부클의 인스턴스 변수로?
		main()으로만 다 할 수 있는데 클래스 이용해서 해보기 
	 */

import java.util.Scanner;

import myobj.pirate.Player;
import myobj.pirate.Tong;

import myobj.pirate.Player;
import myobj.pirate.Tong;

import myobj.pirate.Player;
import myobj.pirate.Tong;
public class C06_PirateGame extends Player { //통아저씨 겜
	
	//이렇게 선언해주면 PirateGame클래스 안 어디서든 쓸 수 있으니까. 
	static int playerNum;
	static Player[] players; //클래스는 String처럼 하나의 타입이 될 수 있음. 
	static Tong tong; //static Tong타입의 tong이 있다. 
	static Scanner sc; //스캐너도 전역으로 올릴 수 있음. 
	
	public static void main(String[] args) { //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		sc = new Scanner(System.in); //이거 빼먹었더니 31번째 줄 playerNum = sc.nextInt();에서 에러 났었음. Numpointer Exception 
		tong = new Tong();
		
		
		System.out.print("플레이어의 수 >>");
		playerNum = sc.nextInt();
		
		//Players를 여러 명 담을 수 있는 배열을 생성. 배열 안의 내용은 비어 있다 껍데기만 만들어 놓은 것 
		players = new Player[playerNum]; //이게 원래는 Player[] players = new Player[playerNum];인 거 Player[] player만 static변수로 미리 선언해놓고 사용. 
		//Player인스턴스를 생성해 배열에 추가
		for(int i = 0; i < players.length; ++i) {
			players[i] = new Player();
		}
		
		
		//Player[] players = new Player[playerNum];
		
		while(true) {
			System.out.println("1. 새 게임");
			System.out.println("2. 전적 보기");
			System.out.print("> ");
			
			switch(sc.nextInt()) {
				case 1:
					game();
					break;
				case 2:
					record();
					break;
				default:
					break;
			}			
		}
	}//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++main부 종료+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public static void record() {
		for (int i = 0; i < playerNum; ++i) {
			System.out.println("[player " + (i + 1) + "]");
//			Player p = players[i];
//			System.out.println("");
			
			players[i].print();
		}
	}
	
	public static void game() {
		//새로 시작
		tong.rewind();
		
		int turn = 0;
		while(true) {
			int current_player = turn % playerNum;				//사용자에게 보여줄 때의 숫자가 됨
			System.out.printf("[%d] Player %d의 차례 >> " , turn + 1, current_player + 1); 
			int slotIndex = sc.nextInt() - 1; //사용자가 1부터 20까지 선택하게 해주는 것 
			
			switch( tong .stab(slotIndex)) {
				case 1:
					turn++;
					break;
				case 0:
					System.out.println("다른 곳을 선택해주세요.");
					//turn--; 얘는 없어야 되지 않나? 이상한 번호(or중복) 잘못 찔렀을 때는 순서 카운트 안 해야지?
					break;
				case -1:
					System.out.printf("해적 아저씨가 날라갔습니다. Player %d 님의 패배입니다. \n", current_player + 1);
					for(int i = 0; i < playerNum; ++i) {
						if(i == current_player) { //아 통아저씨 날린 애는 점수 깎고(lose + 1) 살아남은 애는 win + 1 해줘야지  
							players[i].lose();
						}else {
							players[i].win();
						}
					}
					//break; //맞나? switch문의 마지막 조건이라 break 없어도 되나?▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲	
			}
		}
	
	
	}
		
		
		
}

