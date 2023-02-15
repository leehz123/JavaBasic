import java.util.Scanner;

import quiz.A01_MemberInfo;
import quiz.A04_Gildong;
import quiz.A00_Rabbit;

/*
 
 */

public class B00_Scanner {
	/*
	 # import
	-다른 패키지에 저장되어 있는 클래스를 패키지명을 생략하고 사용하기 위한 문법
	-import로 끌어다 놓으면 다른 패키지에 있어도 패키지명 생략 가능  
	 # java.util.Scanner 클래스 
	 -프로그램으로 입력을 받을 수 있는 기능들이 모여 있는 클래스 
	 -어느 곳으로부터 입력 받을지 결정한 뒤 스캐너를 생성하여 사용한다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ctrl shift o(영문자) 누르면 import java.util.Scanner;가 자동으로 생김

		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// java패키지 안에 util패키지 안에 Scanner클래스
		// import java.util.Scanner 를 통해 패키지명 생략하고 Scanner sc = new Scanner(System.in);만 쓸 수 있다.

		// 사실 우리는 다른 패키지에 만들었던 것을 가져다 사용할 수 있다.
		quiz.A00_Rabbit.main(null);
		quiz.A01_MemberInfo.main(null);
		quiz.A04_Gildong.main(null);
		//quiz패키지에 A04_Gildong클래스의 main()함수(전체 소스)
		// 이렇게 원래 가져올 때 패키지명을 적어줘야함

		// 같은 패키지에 속해있는 다른 클래스는 패키지명을 생략하고 사용할 수 있다.
		A00_Hello.main(null);
		A01_Escape.main(null);
		A06_Print.main(null);
		// A06_Print패키지의 main()함수(소스코드 전체)
		
		// System.in으로 입력받는 새로운 스캐너를 생성
		Scanner abbc = new Scanner(System.in);

		/*
		#) next타입() 
		-입력된 값들 중 다음 값을 하나 꺼낸 뒤 해당 타입으로 변환하여 가져온다. 
		-통로에서 꺼낸 값이 해당 타입이 될 수 없다면 에러가 발생한다. 
		-공백(스페이스), \t, \n을 기준으로 값을 구분한다. 
		-통로에 아무 값도 없다면 프로그램을 멈추고 새로운 입력을 기다린다.
		
		1) next() 
		-입력된 값들 중 값 하나(한 덩어리)를 문자열 타입으로 꺼낸다. 
		(☆근데 문자열은 어떤 입력이 들어와도 문자열로 받을 수 있음. 그래서 에러가 발생하지 않는 일종의 무적타입)
		  
		2) nextLine() 
		-입력된 값을 모두 문자열 타입으로 꺼낸다. 
		-\n만 기준으로 삼아 값을 구분한다. (즉 한 줄을 통째로 입력받는다.)
		※ ctrl space누르면 next어쩌고 뭐뭐 있는지 목록 나옴 
		
		3) nextInt()
		 */
		
		// System.out : 시스템으로 내보내는 통로
		System.out.print("정수를 입력하세요>>");
		
		int input = abbc.nextInt();
		int input2 = abbc.nextInt();
		//	10 11 12 13 을 입력하면 input에는 10 input2에는 11이 들어가 있음 그리고 12 13은 대기 타고 있음
		// 입력 받는 통로는 inputstream인데 어디로 받냐에 따라 또 종류가 나뉨
		// 소수 넣으면 에러남 nextdouble로 넣어야 함★★★
		
		System.out.printf("입력받은 값: %d\n", input);
		System.out.printf("입력받은 값2: %d\n", input2);
		
		
		System.out.print("아무거나 입력하시오.>>"); //next()로 받으니까. (어떤 입력이 들어와도 문자열로 받을 수 있음)
//		String input = abbc.next();
//		String input2 = abbc.next();
//		System.out.printf("입력받은 값: %s\n", input);	    //I'm
//		System.out.printf("입력받은 값: %s\n", input2);	//very
		// I'm very hungry 공백을 기준으로 구분하니까 세 덩어리

		System.out.print("아무거나 입력하시오.>>");   
//		String input = abbc.nextLine();
		//얘도 문자열로 받아서 아무거나 받을 수 있음. 대신 next()와의 차이점은 \n을 기준으로 값을 구분한다는 점.
//		System.out.printf("입력받은 값: %s\n", input);
		// I'm very hungry. 한 줄 전부 출력됨

	}
}
