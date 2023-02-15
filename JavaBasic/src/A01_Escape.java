//클래스 선택하고 f2누르면 이름 바꿀 수 있다는데 노트북 설정이상하게 됐나봄

/* 
 #Escape 문자
 - 특수한 기능을 가진 문자
 - 그냥 출력하기 애매한 문자들을 표현하기 위한 방식
 - \와 하나의 문자가 합쳐져서 특수한 기능을 한다. 
 - \와 문자가 합쳐져 하나의 문자로 인식된다. ('' 내부에 넣을 수 있다.)
 */
public class A01_Escape {
	public static void main(String[] args) {
		System.out.println("안녕하세요 " + "반\n갑습니다.");
		// \n은 줄바꿈의 기능을 가진 특수문자
		System.out.println('\n');
		// \t는 tab의 기능을 가진 특수문자(탭의 가시화)
		System.out.println("안녕하세요 반\t갑습니다.");
		// \\는 \ 하나를 출력하고 싶을 때 사용하는 특수문자
		System.out.println("C:\\ProgramFiles\\Java\\jdk");
		// \"는 그냥 "를 출력하고 싶을 때
		System.out.println("\"");
		// System.out.println("안녕하세요"+반갑+"습니다");
		// 위에서 반갑 은 변수로 인식됨
		// \' 그냥 '를 출력하고 싶을 때 사용하는 특문
		// '를 문자 열 로 사용하는 언어에서 유용하게 사용할 수 있다.
		System.out.println("안녕하세요 \'반갑습니다.\'");
		//
	}
}
