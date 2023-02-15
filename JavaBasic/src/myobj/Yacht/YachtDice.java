package myobj.Yacht;

import java.util.Arrays;

//1) 풀하우스 (같은 눈이 2 개/ 3 개) ex) 11133, 31313(순서 상관노), 66655, 65556..
//2) 스몰 스트레이트(1234, 2345, 3456 인데 42131 이런식으로 순서 상관 없이 나와도 됨 65431)
//3) 라지 스트레잍트(12345, 23456) ex) 53421, 12345
//4) 포다이스 (같은 숫자 4개) 44441, 63666, 11311, ..
//5) Yacht (같은 숫자 5걔) 111111, 222222

//6) 아무 것도 만족하지 못한 경우 주사위 눈 합이 점수가 된다. (어 이거 if문으로 return 1, -1, 0 ...해서 main문에서 switch문으로 받게 만들까)

public class YachtDice {
	final static int GAME_SIZE = 5;
	final static int DICE_FACES = 6;

	int life = 2; //처음 시적할 때마다 생명이 2. reroll할 떄마다 하나씩 까이는 것  
	
	int[] dices;
	int[] count = new int[DICE_FACES];
	String made; // 족보

	public YachtDice() {
		dices = new int[GAME_SIZE];
		for (int i = 0; i < dices.length; ++i) {
			roll(i);
		}
		check(); //주사위 한번씩 돌리고 값 체크
		
	}

	// 개수를 세어놓은 카운트 배열에 원하는 숫자가 있는지 체크하는 메서드
	boolean numberContains(int num) {
		return count[num - 1] > 0;
		// 이렇게 하면 해당 숫자가 들어있는지 아닌지 알 수 있음.
	}

	// 개수를 세어놓은 count배열에 원하는 횟수만큼 등장한 숫자가 있는지 체크하는 메서드
	boolean countContains(int cnt) {
		for (int i = 0; i < count.length; ++i) {
			if (count[i] == cnt) {
				return true;
			}
		}
		return false;
	}

		
	//"245"라고 전달받으면 2번째 4번째 5번쨰 주사위를 다시 던질 예정 (인덱스로 다루기)
	public void reroll(String idxs) {
		
		for(int i = 0; i < idxs.length(); ++i) {
			if(life < 1) {
				return;
			}
			int index = idxs.charAt(i) - '0';  //문자에서 숫자를 꺼내기 위해 '0'을 뺴주는 것. '3' - '0' 은 숫자 3이니까. 
			if(index < 0 || index > GAME_SIZE) {
				continue; //숫자가 잘못 들어왓다는 얘기니까
			}
			roll(index - 1);
			life--;
			//리롤이 성공적으로 일어나면 체크를 해서 상태 변화를 시켜줘야 겟쥐
			check();
		}	
	}
	
	// 현재 dices의 값으로 어떤 숫자가 몇 개 있는지 count배열의 대응하는 자릿수(값) 별로 세는 메서드
	void count() {
		// 배열을 원하는 값으로 한번에 가득 채우는 함수 Arrays.fill(arr, val)
		// Arrays.fill(dices, roll()); 근데 이렇게 하면 다 똑같은 값으로 채워짐
		Arrays.fill(count, 0);
		// [0, 0, 0, 0, 0, 0]
		for (int i = 0; i < dices.length; ++i) {
			count[dices[i] - 1]++;
		} // 자릿수별로 개수를 세어서 (6이 나오면 인덱스 5에 +1) 저 배열 안에 2와 3이 있으면 풀하우스 인 것!
	}

	// 현재 dices의 값을 통해 족보를 구분하는 메서드.
	void check() {
		count(); // 이제 count배열 내의 값들을 자유자제로 사용할 수 잇것지.
		if (countContains(5)) {
			made = "Yacht!";
		} else if (countContains(4)) {
			made = "4 dice!";
		} else if (countContains(3) && countContains(2)) {
			made = "Full House!";
		} else if (numberContains(2) && numberContains(3) && numberContains(4) && numberContains(5) 
				&& (numberContains(1) || numberContains(6))) {
			made = "Large Straight!";
		} else if (numberContains(3) && numberContains(4) 
				&& ((numberContains(1) && numberContains(2)) || (numberContains(2) && numberContains(5)) || (numberContains(5) && numberContains(6)))) {    
					made = "Small Straight!";
		} else {
			made = "" + (dices[0] + dices[1] + dices[2] + dices[3] + dices[4]);
		}
						
	} // 재료를 미리 만들어놓으니까 로직 짤 때 깊이 생각 안 해도 됨 . 좀 더 크게크게 생각할 수 있디야
	

	// 원하는 번째의 주사위를 다시 굴리는 메서드
	void roll(int index) {
		dices[index] = (int) (Math.random() * 6 + 1);
	}

//▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶와 이거 뭐냐 ▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶  System.out.println(yacht); 에서 int배열 yacht를 사용자지정서식 문자열로 변환하기 위한 오버라이딩. 
//빈공간에서 컨트롤+스페이스 눌러보면 오버라이드 할 수 있는 메서드들이 뜸.
//이 세상 모든 클래스에는 clone equals hashtag toString.. 이 숨어 있다는 거. 
	@Override
	public String toString() {
		// # String.format() : printf()처럼 문자열을 생성할 때 사용하는 함수.
		return String.format("현재 주사위 : %s" + "현재 상태 : %s", Arrays.toString(dices), made);
	}
//▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶

}
