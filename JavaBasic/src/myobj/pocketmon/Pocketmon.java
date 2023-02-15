package myobj.pocketmon;

import java.util.Scanner;

public class Pocketmon {
	//��� ���ϸ���� ���� �ִ� �ɷ�ġ��
	String name;
	int hp;
	int atk;
	int def;
	int sAtk;
	int sDef;
	int spd;
	
	//������
	//�̷��� �������� �Ű��������� ���� ���ϸ��� �ɷ�ġ��(�ν��Ͻ�������)�� �־��� ����. 
	public Pocketmon (String name, int hp, int atk, int def, int sAtk, int sDef, int spd) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.sAtk = sAtk;
		this.sDef = sDef;
		this.spd = spd;
		
	}
	
	//static�޼���
	//static������ �� Ŭ���� �� �ϳ�.
	
	/*
	 �ν��Ͻ��޼���� �������� �Ű������� �� �� ����
	��Ȯ���� �ν��Ͻ�ȭ�ϰ� �ִ� ù �ٿ����� �ν��Ͻ� �޼��带 �� �� ����!
	������ ���ο����� static�޼���ۿ� ����� �� ����.
	�ν��Ͻ� �ڿ��� ���� ����� �� ����.
	�ν��Ͻ� ���� ���°� ������ �ν��Ͻ� �޼���� �� ��
	 */
	public static String nickname(String defaultName) {  
		Scanner sc = new Scanner(System.in);
		System.out.print("�г����� ���Ͻðڽ��ϱ�? [Y/N]");
		char select = sc.next().charAt(0);
		String nickname = defaultName;
		
		if( select == 'Y') {
			System.out.println("�г����� �Է����ּ���...");
			nickname = sc.nextLine();  //���� �޴� �ɷ�
		} 
		//sc.close(); ��ǲ��Ʈ�� �� ������ �ϱ� ���� �� �� ��
		return nickname;
	}
	
	
	
	//��ȯ���� ���� ��¸� �ϴ� �ν��Ͻ� �޼��� 
	public void printStats() {
		System.out.printf( "[%s 's stats]\n"
				+ "hp\t%d\n"
				+ "atk\t%d\n"
				+ "def\t%d\n"
				+ "sAtk\t%d\n"
				+ "sDef\t%d\n"
				+ "spd\t%d\n",
				name, hp, atk, def, sAtk, sDef, spd
				);
	}
	
	
	
	public int getTotalStats() {
		return hp + atk + sAtk + sDef + spd; 
	}
}
