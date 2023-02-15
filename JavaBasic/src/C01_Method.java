

public class C01_Method {
/*
# 함수 (Function)
-기능을 미리 정의해두고 나중에 가져다 쓰는 것
-함수를 정의한 시점에는 실행되지 않고 나중에 호출되었을 때 실행된다. 
-'함수명()' 의 형태로 호출 가능  
-나중에 재사용할 가능성이 있는 기능들을 함수로 만들어두면 작업의 반복을 줄일 수 있다. 
-자바에서 함수는 반드시 클래스 내부에 선언(정의)해야 한다. 
다른 언어 같으면 클래스 안에 넣을 필요 없이 바로 void printRabbit() { } 이렇게 해버림. 
함수 안에 함수를 만드는 것은 안 됨. (그래서 main()메서드 내부에 선언 불가)
-클래스 내부에 선언된 함수는 메서드라고 부른다. 

# 함수의 리턴 (return)
-함수를 정의할 때 함수명 앞에 해당 함수가 반드시 반환하는 값의 타입을 지정할 수 있다. 
-해당 함수를 호출하면 호출한 자리에 함수의 실행 결과가 반환됨. 
-리턴 타입에 void를 적으면 해당 함수는 값을 반환하지 않는다는 것을 의미.
-함수 내부에서 리턴을 만나면 해당 함수를 즉시 종료하고 함수를 호출한 곳으로 돌아간다.

# 함수의 매개변수 (argument >> args)
함수를 호출할 때 ()에 전달하는 값을 '인자'라고 한다. 
함수를 정의할 때 ()에 전달하는 인자값을 받을 수 있는 변수를 '매개변수'라고 한다. 

 */

						//괄호 안의 타입은 반드시 반환값의 타입에 맞춰 int가 아니어도 됨.
	public static int plus(int a, int b) {  //plus 앞의 int는 plus함수가 반환하는 값의 타입 
		int num = a + b;
		return num;    
	}
	
/*	public static int plus(int a, int b) {  //plus 앞의int는 plus함수가 반환하는 값의 타입
		int num = a + b;
		return "안녕";       >>이러면 에러남 String이니까
	}
*/	
	
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >★");
	}
	//리턴타입이 void이기 떄문에 main부에서 String str = printRabbit(); 이런 거 불가능 리턴이 없기 때문에 값을 받을 수 x
	//printRabbit(3)처럼 값을 전달할 수는 ㅇ
	
/*	public static void printRabbit(int num) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		if(num % 2 == 0) {
			return;
		}
		System.out.println("(  >★");
	}
	//넘어온 값이 2일 떄 얼굴만 출력
*/	
	
	
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		printRabbit();
		printRabbit();
		printRabbit();
		printRabbit();
		
		System.out.println("토끼 10개 만들기");
		for(int i = 0; i < 10; ++i) {
			printRabbit();
		}
		
		int result = plus(10, 20);
		System.out.println(result);
		
	}
	
	
}
