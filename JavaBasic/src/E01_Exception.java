import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


/*
# 예외 Exception 

컴파일 에러 : 컴파일 시에 발생하는 에러. 
		   소스코드(*.java) 에 대해 오타나 잘못된 구문, 자료형 체크 등의 기본적인 검사에서 오류가 있을 때 발생 

런타임 에러 : 실행 시에 발생하는 에러
논리적 에러 : 실행은 되지만 의도와 다르게 동작하는 것



에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
예외 : 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류 


RunTime Exception 클래스
: 주로 프로그래머의 실수에 의해 발생할 수 있는 예외들
- ArrayIndexOutOfBoundsException : 배열의 범위를 벗어남
- NullPointerException : 값이 null인 참조변수의 멤버를 호출
- ClassCastException : 클래스 간의 형 변한이 잘못됨
- ArithmaticException : 정수를 0으로 나눔

그 외의 Exception 클래스들 (IO Exception ... ) 
: 주로 사용자의 실수와 같은 외적 요인에 의해 발생되는 예외들
- FileNotFoundException : 파일을 찾을 수 없음
- ClassNotFoundExcetion : 클래스를 찾을 수 없음
- DataFormatException : 데이터 형식이 잘못됨 



우리가 에러라고 생각했던 빨간 글씨들 = "예외"
자바의 문법을 틀리는 것 =  예외가 아니라 "컴파일 오류" (잠만 이거 좀 이상한듯 E02_Throw 설명이랑 안 맞음)


# 예외처리 
프로그래머는 발생할 예외를 미리 예측하고 대비할 수 있다. 
에외 발생시 기본 동작 = System.exit(0); 프로그램 강제종료


예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킬 수 있다. 
try문 내부에서 예외가 발생하지 않으면 모두 정상실행 된다.
try문 내부에서 예외가 발생하면 즉시 try문의 실행을 중단하고 발생한 예외에 해당하는 catch문으로 넘어간다. 
catch문은 여러 개 쓸 수 있다. 
예외발생시 발생한 예외에 대한 자세한 정보를 담고 있는 인스턴스가 catch문으로 전달된다.  
 */


public class E01_Exception {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			arr[0] = 1;
			arr[12] = 100;
			arr[1] = 3;
			//arr[10] = 123;
			//ArrayIndexOutOfBoundsException가 발생하여 예외발생시 기본동작인 프로그램 강제종료가 실행됨. 
			System.out.println("try문의 모든 코드를 완전히 실행했습니다!");
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.exit(0); //원래는 이게 catch문의 기본 동작
			System.out.println("배열 인덱스 범위를 벗어났습니다.");
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Hello!");
	
	
	
		//____________________________________________________________________________________________________
		//예외처리로 Scanner사용하기 
		
		Scanner sc = new Scanner(System.in);
		int num; //try문 안에 선언한 것들은 try문이 끝나면 사라지는 변수가 됨. 그니까 사라지고 싶지 않으면 try문 밖에 있거라
		
		try {
			
			System.out.println("숫자를 입력하세요");
			num = sc.nextInt();
			num = 10 / num;
			
		} catch (InputMismatchException e){
			
			System.out.println("반드시 숫자만 입력해야 합니다.");
			
			// e.getMessage()를 사용한 예외추적 예시
			System.out.println(e.getMessage()); //그냥 별 내용 없이 null이 나온다.   
			
			e.printStackTrace(); //오류정보를 출력해준다.  
			
			num = -1;
			
		} catch(ArithmeticException e) {
			
			System.out.println("num에는 0을 넣으면 안됩니다.");
			num = -2;
			
		} catch(Exception e) {
			
			System.out.println("Exception은 모든 예외의 부모이기 때문에 나머지 모든 예외를 한 번에 처리 가능");
			num = -3;
			
		} finally {
			
			System.out.println(" /)/)");
			System.out.println("( _ _)");
			System.out.println("(   >@");
			System.out.println("이 토끼는 예외가 발생하든 안 하든 무조건 등장합니다. ");
		
		}
		
		System.out.println("입력하신 숫자는 : " + num);
	
	}
}
