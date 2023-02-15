
public class B15_Array {
/*	
# 배열 (Array)
같은 타입 변수를 한번에 여러개 선언하는 문법. 
같은 이름으로 변수를 여러개 선언한 후에 인덱스로 구분할 수 있다. 
배열은 선언과 동시에 크기를 정해야 한다. 
크기가 정해지고 나면 크기를 변경할 수 없다. 
배열의 방번호(인덱스)는 0부터 전체 길이 -1 까지 있다. 
Java의 배열은 생성과 동시에 모든 값이 초기화 되어 있다.
정수 : 0 / 실수 : 0.0 / boolean : false / 참조형 : null

#배열 선언 방법
1. 타입[] 변수명 = new 타입[크기];
2. 타입[] 변수명 = {값1, 값2, 값3, 값4, ...};
3. 타입[] 변수명 = new 타입[] {값1, 값2, 값3, 값4, ...};

*/	
	public static void main(String[] args) {
		
		//배열의 길이가 3일 때 방 번호는 2번까지. 
		int[] score = new int[5];
		score[0] = 99;
		score[1] = 80;
		score[2] = 70;
		//score[3] = 60; 에러남. 
		System.out.println("score의 길이 : " + score.length);  //배열의 길이를 잴 땐 .length에 괄호 안 붙임
		// str.length();   array.length;
		System.out.println(score[3]);
		System.out.println(score[4]);
		//배열은 초기화 하지 않아도 사용 가능. (초기값 0)
		
		//int타입 변수 1000개 생성된 것과 같음
		int[] num = new int[1000];
		num[0] = 5;
		num[1] = 3;
		num[2] = 4;
		
		//char[]은 자바에서 거의 문자열 취급 해줌. 문자열이나 다름 없다. 
		char[] text = new char[100];
		text[0] = 'h';
		text[1] = 'e';
		text[2] = 'l';
		text[3] = 'l';
		text[4] = 'o';
		
		boolean[] complete = new boolean[5];
		for (int i = 0; i < complete.length; ++i) {		
			System.out.printf("complete[%d] : %b \n", i, complete[i]);
		}
		
		
		//배열 선언하기 
		short[] eye_power = new short[10];
		long[] money = {123L, 234L, 5, 6, 789L}; 
		// long 타입만 넣을 수 있는 건 아님. 
		// int형도 들어가있자나. 자연스러운 타입캐스팅(산술형변환?)
	
		String[] name = new String[] {"김철수", "박철수", "최철수", "안철수"};
		
		//값 수정
		name[3] = "송진우"; //최철수 빠지고 송진우 들어감 
		//배열의 값을 꺼내 사용하기 
		for(int i = 0; i < name.length; ++i ) {
			System.out.println(name[i]);
		}
		
		//String 타입은 char[]타입으로 변환하여 사용 가능
		String welcomeMessage = "Hello, world!!";
		char [] msg = welcomeMessage.toCharArray();
		System.out.println(msg[0]);
		System.out.println(msg[msg.length - 1]); //마지막글자
		System.out.println(msg[msg.length - 2]); //뒤에서 두 번째 글자
		System.out.println(msg[msg.length - 3]); //뒤에서 세 번째 글자
		System.out.println(msg[msg.length - 4]);
		System.out.println(msg[msg.length - 5]);
		
		//★★String은 값을 하나만 꺼내서 수정할 수 있는 방법이 없음.
		//근데 String[]배열은 그게 가능하다는 장점~~~~~!!!
		
	}
}
