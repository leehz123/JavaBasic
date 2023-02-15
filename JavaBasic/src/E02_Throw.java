import java.io.IOException;
import java.io.UnsupportedEncodingException;

import quiz.연습장3.RainbowReflect;
import 연습장.SoWhatIDunGivaShitGetALifeException;

/*
 
# throw
원하는 예외를 발생시킨다. 
내가 만든 기능을 가져다 사용하는 사람에게 처리를 맡길 수 있다. 

# throws
해당 메서드에서 예외가 발생함을 알리는 문법
해당 메서드 내부에서 예외가 발생할 때 추가할 수 있다. 
메서드 내부의 예외를 직접 처리하지 않고 메서드를 호출하는 프로그래머에게 예외 처리를 전가한다. 

# RuntimeException (꼭 처리하지 않아도 되는 예외)
RuntimeException 클래스를 상속받는 예외들은 반드시 처리하지 않아도 되는 예외이다. 

예외처리를 하지 않아도 컴파일 에러(빨간줄)이 발생하지 않는다. 
(엥
우리가 에러라고 생각했던 빨간 글씨들 = "예외"
자바의 문법을 틀리는 것 =  예외가 아니라 "컴파일 오류" 랬는데 말이 안 맞는디? 이상함)

# Exception (반드시 처리해줘야 함)
Exception클래스를 상속받은 예외들은 반드시 처리해야하는 예외이다.
예외처리를 하지 않으면 컴파일이 불가능하다. (빨간줄을 처리해야 함)
어딘가에서는 반드시 try-catch로 처리해야 컴파일을 진행할 수 있다. 
메서드를 가져다 쓰는 최종위치인 main부에서마저 throw 해버리면 오류를 그냥 방치하게 된다. 
발생한 곳에서 바로 처리하고 싶지 않은 경우 throws로 경고하여 해당 메서드를 호출하는 곳으로 예외처리를 떠넘길 수 있다. 

*/




public class E02_Throw {
	
	/*
	throws IOException, ClassNotFoundException의 역할 :
			1. method4메서드가 해당 예외를 발생시킬 수 있는 메서드라는 것을 알림
			2. method4메서드를 호출하는 어딘가에게 예외처리를 떠넘긴다.
	 */
	public static void method4() throws IOException, ClassNotFoundException { 
	
		switch((int)(Math.random() * 5)) {
		case 0:
			throw new ArrayIndexOutOfBoundsException();
		case 1:
			throw new ArithmeticException();
		case 2:
			throw new IOException();
		case 3:
			throw new ClassNotFoundException();
		case 4: 
			throw new UnsupportedEncodingException();
		}
	}
	
	/*
	IOException 과 ClassNotFoundException은 
	Exception 클래스 (반드시 처리해야 하는 예외) 에 속한다. 
	이 경우 해야 할 일은
	1. 바로 try-catch문으로 감싸주거나
	2. 메서드 선언부 옆에 throws IOException, ClassNotFoundException 을 해줘야 한다. 
	2로 할 경우 method4를 호출하는 어딘가에서 예외처리를 떠맡게 된다. (완전 폭탄돌리기)
	*/

	
	
	
	
	public static void method3() {
		throw new NullPointerException(); //반드시 처리해줘야 하는 예외
	}
	
	public static void method2() {
		method3();
	}
	public static void method1() {
		method2();
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		//method4를 호출하면서 IOException 과 ClassNotFoundException을 예외처리. 
		try {
			method4();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			System.out.println("클낫파익셉션");
		} catch (ArithmeticException e) {
			System.out.println("아리스메틱익셉션 처리해줌");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아오바 익셉션 처리해줌");
		} 
		
		System.out.println("method4에 대한 예외처리를 해줘야 이 문장이 출력된다.");

	
		
		
		
		
		
		
		try {
			method1();
		} catch(Exception e) {
			System.out.println("발생한 예외의 메세지는 \"" + e.getMessage() + "\" 입니다.");
			System.out.println("예외발생 시점의 스택 정보 : ");
			e.printStackTrace();
		}
		System.out.println();
		
		
		
		
		//내 마음대로 예외를 던지는 것도 가능하다. 
		try { 
			throw new ArrayIndexOutOfBoundsException("그냥 심심해서 던져보았습니다. ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("발생한 예외의 메세지 : " + e.getMessage());
			System.out.println("예외발생 시점의 스택 정보 : ");
			e.printStackTrace();
		}
		System.out.println();

		
		
		
		
		//창조예외 던지깅
		String someoneSaid = "메롱";
		if(someoneSaid.equals(someoneSaid)) {
			throw new RainbowReflect("무지개반사");
		}
	}
	
	
	
	//이렇게 내멋대로 예외를 창조해서 던지는 것도 가능!
	static class RainbowReflect extends RuntimeException { // 내부클래스? 
		public RainbowReflect(String errorMsg) {
			super(errorMsg); 
			/*
			java.lang.RuntimeException.RuntimeException(String message)
			Constructs a new runtime exception with the specified detail message.
			 */
		}
	}
}
