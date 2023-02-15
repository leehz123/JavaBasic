package quiz;

import java.util.Scanner;

import myobj.rps�ǽ�����.Fingers;
import myobj.rps�ǽ�����.Players;
import myobj.rps�ǽ�����.RpsFingers;

/*
���������� ������ ��������
���� ��� ������ �����Ӱ� Ȱ��
*/

public class C14_RPS�ǽ� {
	Scanner sc;
	public Fingers finger;
	public Players player;
	public Players computer;
	
	int playerSelect;
	int computerSelect;
	
	String playerFingersName;
	String computerFingersName;
	
	RpsFingers rpsFingers;
	
	public C14_RPS�ǽ�() {
		player = new Players();

	}
	
	
	String judge() {
		int judge = playerSelect - computerSelect;
		switch(judge) {
		case 1: case -2:
			player.win();
			return "�÷��̾� ��!";
		case 2: case -1:
			player.lose();
			return "�÷��̾� ��!";
		default: 
			player.draw();
			return "���º�!";
		}
	}
	
	//���������� ��� ���
	void print() {
		System.out.println();
		System.out.println("�ƢƢƢƢƢƢƢư���������!�ƢƢƢƢƢƢƢ�");
		System.out.println("�÷��̾�	: " + playerFingersName);
		System.out.println("��ǻ��	: " + computerFingersName);
	}
	
	//���� >> ���ڷ� ex. 1 >> "����"
	String numToName(int num) {
		String Name = rpsFingers.getFingersName(num);
		return Name;
	}
	
	//�÷��̾� ����������
	void playerPlay(int num) {
		playerSelect = num;
		playerFingersName = numToName(playerSelect);
	}
	//��ǻ�� ���������� 
	void computerPlay() {
		computerSelect = rpsFingers.randomFingers();
		computerFingersName = numToName(computerSelect);
	}
	
	//���� ����
	void start() {
		sc = new Scanner(System.in);
		
		rpsFingers = new RpsFingers();

		while(true) {
			
			System.out.print("���ӽ���(1) �÷��̾� ����(2) ���� ���� (3) >> ");
			int intro = sc.nextInt();
			if(intro == 1) {
				System.out.println();
				System.out.println("�ƢƢƢƢƢƢƢƢƢ�GAME START�ƢƢƢƢƢƢƢƢƢ�");
				int input = 0;
				while(true) {
					System.out.print("���������� ���� ����(1) ����(2) >> ");
					input = sc.nextInt();
					if(input == 1 || input == 2) {
						break;	
					}
					System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���. (1~2)");
				}
				
				if(input == 1) {
					while(true) {
						System.out.print("����(1) ����(2) ��(3) ���ÿ� >> ");
						playerPlay(sc.nextInt());
						if(!playerFingersName.equals("4")) {
							break;
						}
						System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.(1~3)");
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
				System.out.println("���� ����");
				return;
			} else {
				System.out.println("���ڸ� �ٽ� �Է����ּ��� (1~3)");
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new C14_RPS�ǽ�().start();
	}
	
}
