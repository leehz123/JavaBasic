package quiz;

import java.util.Scanner;

public class B07_PrintReverse {
	/*
	 * 사용자로부터 문장을 입력받으면 그 문장을 거꾸로 출력하는 프로그램을 만들어보세요.
	 */
	public static void main(String[] args) {
		System.out.println("문자열을 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//문자열 길이 - 1 : 마지막 글자
		//문자열 길이 -2 : 뒤에서 두 번째 글자
		//문자열 길이 - 문자열 길이 : 첫 번째 글자
		
		// i++로도 할 수 있음
		for (int i = 1; i <= str.length(); ++i) {
			System.out.print(str.length() - i);
			
		}
		System.out.println();
		
		for (int index = str.length() - 1; index >= 0; --index) {
			System.out.print(str.charAt(index));
		}
		System.out.println();
	}
}
