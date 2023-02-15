//주석(Comment) 
// - 개발자가 하고싶은 말을 적어놓는 곳
// - 프로그램 실행에 영향을 미치지 않는다. 
// - 언어별로 주석을 사용하는 방법이 다를 수 있다. 
// - 한 줄 주석과 여러 줄 주석이 있다.
/* 
   여
   러 
   줄
   주
   석
 */
/*
 	#Eclipse 단축키
  	Ctrl + [+, -] : 글자 크기 조절
	Ctrl + M : 현재 창 최대/ 최소화
	Ctrl + F11 : 컴파일 및 실행
	#Windows단축키
	[win] + E 탐색기
	[win] + Shift + S 스크린샷
	[win] + 방향키 : 창 크기 조절
	
	# 블록지정 단축키 (Shift 블록 / Ctrl 전체)
	Home :현재 줄의 맨 앞으로 이동
	End : 현재 줄의 맨 뒤로 이동
	Shift + Home : 현재 커서 위치부터 맨 앞까지 블록지정
	Shift + End : 현재 커서 위치부터 맨 뒤까지 블록지정
	Shift + 방향키 : 커서를 움직이며 블록지정
	Ctrl + A : 전체 문서를 블록 지정
	Ctrl + Home/ End : 문서의 맨 위, 맨 아래로 이동
	Ctrl + Shift + Home : 현재 위치부터 문서의 맨 위까지 블록지정
	Ctrl + Shift + End : 현재 위치부터 문서의 맨 아래까지 
	
 */

// ※ public class 의 이름은 반드시 파일명과 같아야 한다. Hello.java  
public class A00_Hello {
	/*
	 * // Eclipse에서 빨간 줄이 생겼을 때 (에러를 발견했을 때, 그 곳에 커서를 두고 F2를 누르면 해당 에러에 대한 정보와 해결책을
	 * 알 수 있다.
	 */
	/*
	 * #main() 함수 - Java에서 어떤 단어 뒤에 소괄호()가 있으면 함수라고 한다. - 프로그램의 시작지점. - 사용자가 프로그램을
	 * 실행하면 가장 먼저 main()을 찾아서 실행한다. - main 함수가 종료되면 프로그램도 종료됨.
	 */
	public static void main(String[] args) {
		// 프로그램 시작하면 가장 먼저 도착하는 것
		System.out.println("Hello, world!"); // ctrl + F11
		System.out.println();
		System.out.println("┌────────────┐");
		System.out.println("│   merong   │");
		System.out.println("└────────────┘");
		/*
		 * System.out.println() 함수 () 안에 전달한 데이터를 콘솔 화면에 출력하는 함수
		 * 
		 * # 콘솔 - 바탕화면에 반대되는 개념 - 글자만 나오는 검은 화면 - CLI(Command Line Interface) 환경의 화면 -
		 * 그림으로 보는 화면이 아니라 글자로 보는 화면 - Eclipse에서는 테스트용으로 콘솔을 제공해준다. (하얀색인 이유) - 우리가 만든
		 * 프로그램은 실제 콘솔에서도 동일하게 동작한다. 윈도알키 cmd입력 - 제작한 소스코드(.java)의 컴파일 결과(.class)는 프로젝트
		 * 내부의 bin폴더에 저장된다.
		 * 
		 * # 세미콜론 - 한 명령어가 끝났음을 컴파일러에게 알리는 문자 -
		 */

		/*
		 * #자바의 데이터 종류 (리터럴의 종류) 1. "" 사이에 적는 것 : 문자열(String), 문자를 여러 개 적을 수 있는 데이터 타입
		 * 2. '' 사이에 적는 것 : 문자(Character), 하나의 문자를 의미하는 데이터 타입 3. 그냥 숫자를 적는 것 :
		 * 정수(Integer), 계산이 가능 4. 소수를 적는 것 : 실수(float / double), 5. true/false : 참/거짓
		 * (Boolean)
		 */
		System.out.println("Hello");
		System.out.println('H');
		System.out.println(100 * 3);
		System.out.println(123.456 / 100);
		System.out.println(true);
		System.out.println(false);
		// 문자열과 다른 타입을 +하면 이어붙이기 (문자열끼리도 가능)
		System.out.println("Hello " + 1234);
		System.out.println("Hello" + "World");
		System.out.println("Hello" + true);
		System.out.println("Hello" + 123.1234);

		/*
		 * #들여쓰기 (Tab) -코드 블록이 {} 내부에 있다면 한 단계 더 들여써야 한다. -전체적인 코드의 형태를 알아보기 쉬워진다. - Tab
		 * 들여쓰기, Shift Tab 백탭, 블록지정해서 탭/백탭도 가능 - 블록지정 후 Ctrl I : 자동 들여쓰기(Autto Indent)
		 */

		// 팁 : 대괄호 먼저 만들어놓으면 소괄호 들여쓰기 같은 건 자동으로 해줌
		{
			System.out.println();
		}
		// 프로그램의 마지막 부분
	} // main()부터 여기까지 사실상 프로그램 그 자체
}
