package myobj.pocketmon;

import java.util.Scanner;

public class Pocketmon {
	//모든 포켓몬들이 갖고 있는 능력치들
	String name;
	int hp;
	int atk;
	int def;
	int sAtk;
	int sDef;
	int spd;
	
	//생성자
	//이렇게 생성자의 매개변수들을 통해 포켓몬의 능력치들(인스턴스변수들)에 넣어줄 거임. 
	public Pocketmon (String name, int hp, int atk, int def, int sAtk, int sDef, int spd) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.sAtk = sAtk;
		this.sDef = sDef;
		this.spd = spd;
		
	}
	
	//static메서드
	//static영역은 한 클래스 당 하나.
	
	/*
	 인스턴스메서드는 생성자의 매개변수로 쓸 수 없음
	정확히는 인스턴스화하고 있는 첫 줄에서는 인스턴스 메서드를 쓸 수 없다!
	생성자 내부에서는 static메서드밖에 사용할 수 없다.
	인스턴스 자원은 아직 사용할 수 없다.
	인스턴스 값은 쓰는게 되지만 인스턴스 메서드는 안 됨
	 */
	public static String nickname(String defaultName) {  
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임을 정하시겠습니까? [Y/N]");
		char select = sc.next().charAt(0);
		String nickname = defaultName;
		
		if( select == 'Y') {
			System.out.println("닉네임을 입력해주세요...");
			nickname = sc.nextLine();  //공백 받는 걸로
		} 
		//sc.close(); 인풋스트림 안 닫히게 하기 위해 걍 안 씀
		return nickname;
	}
	
	
	
	//반환값은 없고 출력만 하는 인스턴스 메서드 
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
