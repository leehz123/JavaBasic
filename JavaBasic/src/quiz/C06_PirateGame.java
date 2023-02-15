package quiz;
//������� ������ ��������. 
	/*
	1 ������ ���۵Ǹ� �÷��̾ �� ������ ���Ѵ�. 
	2. ���� �÷��̾ ���ư��鼭 ���ϴ� ��ġ�� Į�� ���. - �迭?
	3. Į�� � �� �ִ� Ȩ�� 20 ���� �ְ� �� �� 2 ���� ���� �ȴ�. (�� �Ǹ��� ��ġ�� �������� �����ȴ�.)
	4. �߸��� ���� Į�� � �÷��̾�� ���ӿ� �й��Ѵ�. 
	5. ������ ��� �̾ �÷��� �� �� �ְ�, �� �÷��̾��� ������ ���� ���� �Ǿ�� �Ѵ�.  -������ ��Ŭ�� �ν��Ͻ� ������?
		main()���θ� �� �� �� �ִµ� Ŭ���� �̿��ؼ� �غ��� 
	 */

import java.util.Scanner;

import myobj.pirate.Player;
import myobj.pirate.Tong;

import myobj.pirate.Player;
import myobj.pirate.Tong;

import myobj.pirate.Player;
import myobj.pirate.Tong;
public class C06_PirateGame extends Player { //������� ��
	
	//�̷��� �������ָ� PirateGameŬ���� �� ��𼭵� �� �� �����ϱ�. 
	static int playerNum;
	static Player[] players; //Ŭ������ Stringó�� �ϳ��� Ÿ���� �� �� ����. 
	static Tong tong; //static TongŸ���� tong�� �ִ�. 
	static Scanner sc; //��ĳ�ʵ� �������� �ø� �� ����. 
	
	public static void main(String[] args) { //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		sc = new Scanner(System.in); //�̰� ���Ծ����� 31��° �� playerNum = sc.nextInt();���� ���� ������. Numpointer Exception 
		tong = new Tong();
		
		
		System.out.print("�÷��̾��� �� >>");
		playerNum = sc.nextInt();
		
		//Players�� ���� �� ���� �� �ִ� �迭�� ����. �迭 ���� ������ ��� �ִ� �����⸸ ����� ���� �� 
		players = new Player[playerNum]; //�̰� ������ Player[] players = new Player[playerNum];�� �� Player[] player�� static������ �̸� �����س��� ���. 
		//Player�ν��Ͻ��� ������ �迭�� �߰�
		for(int i = 0; i < players.length; ++i) {
			players[i] = new Player();
		}
		
		
		//Player[] players = new Player[playerNum];
		
		while(true) {
			System.out.println("1. �� ����");
			System.out.println("2. ���� ����");
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
	}//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++main�� ����+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public static void record() {
		for (int i = 0; i < playerNum; ++i) {
			System.out.println("[player " + (i + 1) + "]");
//			Player p = players[i];
//			System.out.println("");
			
			players[i].print();
		}
	}
	
	public static void game() {
		//���� ����
		tong.rewind();
		
		int turn = 0;
		while(true) {
			int current_player = turn % playerNum;				//����ڿ��� ������ ���� ���ڰ� ��
			System.out.printf("[%d] Player %d�� ���� >> " , turn + 1, current_player + 1); 
			int slotIndex = sc.nextInt() - 1; //����ڰ� 1���� 20���� �����ϰ� ���ִ� �� 
			
			switch( tong .stab(slotIndex)) {
				case 1:
					turn++;
					break;
				case 0:
					System.out.println("�ٸ� ���� �������ּ���.");
					//turn--; ��� ����� ���� �ʳ�? �̻��� ��ȣ(or�ߺ�) �߸� ���� ���� ���� ī��Ʈ �� �ؾ���?
					break;
				case -1:
					System.out.printf("���� �������� ���󰬽��ϴ�. Player %d ���� �й��Դϴ�. \n", current_player + 1);
					for(int i = 0; i < playerNum; ++i) {
						if(i == current_player) { //�� ������� ���� �ִ� ���� ���(lose + 1) ��Ƴ��� �ִ� win + 1 �������  
							players[i].lose();
						}else {
							players[i].win();
						}
					}
					//break; //�³�? switch���� ������ �����̶� break ��� �ǳ�?�����������������������	
			}
		}
	
	
	}
		
		
		
}

