package quiz;

import myobj.Yacht.YachtDice;

/*
#YacktDice 게임을 만들어보세요. 
플레이어는 다섯개의 주사위를 던진다. (주사위 참조배열 만들어야 할 듯) Dice[] dices = new Dice[diceNum];
주사위의 눈은 1~6 육면주사위 - Dice클래스에 속성 눈의 수 
주사위 눈의 결과 다섯 개를 통해 다음을 구분해야 한다. (Dice클래스 안에 메서드로 만들까)

1) 풀하우스 (같은 눈이 2 개/ 3 개) ex) 11133, 31313(순서 상관노), 66655, 65556..
2) 스몰 스트레이트(1234, 2345, 3456 인데 42131 이런식으로 순서 상관 없이 나와도 됨 65431)
3) 라지 스트레잍트(12345, 23456) ex) 53421, 12345
4) 포다이스 (같은 숫자 4개) 44441, 63666, 11311, ..
5) Yackt (같은 숫자 5걔) 111111, 222222
6) 아무 것도 만족하지 못한 경우 주사위 눈 합이 점수가 된다. (어 이거 if문으로 return 1, -1, 0 ...해서 main문에서 switch문으로 받게 만들까)

플레이어는 다시 던지고 싶은 주사위를 여러개 골라서 다시 던질 수 있다. (2회) 12545 중에 5를 3 나오게 하고 싶어서 다시 던지는 거 

 */
public class C06_YachtDice {
	
	public static void main(String[] args) {
		YachtDice yacht = new YachtDice();  //처음에 YachtDice 를 import 안 해줘서 오류가 있었음. Yacht can not be resolved to a type.
		System.out.println("GAME START");
		System.out.println(yacht);
		System.out.println("↓ reroll(\"123\")의 결과");
		yacht.reroll("123");
		System.out.println(yacht);		
		System.out.println("(3번째 주사위는 수정되지 않음)");
		System.out.println("↓ reroll(\"345\")의 결과");
		yacht.reroll("345");
		System.out.println(yacht);
		System.out.println("(life<1 이라서 더는 reroll()이 동작하지 않음)");
		
		System.out.println("______________________________________________________"); 
		
		System.out.println("GAME START");
		//게임 재시작을 위해 인스턴스 재할당.
		yacht = new YachtDice();
		System.out.println(yacht);
	}
}
	
	

