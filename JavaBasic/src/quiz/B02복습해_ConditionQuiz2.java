package quiz;

import java.util.Scanner;

public class B02복습해_ConditionQuiz2 {
	public static void main(String[] args) {
		// #알맞은 조건식을 만들어보시오
		// 1. char형 변수 a가 'q' 또는 'Q'일 때 t
		String a = "q";
		System.out.println(a.equalsIgnoreCase("q"));
		
		// 2. char형 변수 b가 공백이나 탭이 아닐 때 true
		/*
		 내 풀이. String b =" "; 
		 System.out.println((b.equals(" "))||(b.equals("\t")));
		 근데 그냥 ==으로 비교하심 그리고 '아닐 때'인데 .equals해서 틀림
		 */
		
		// 정답 풀이.
		char b = '\t';
		System.out.println(b != ' ' && b != '\t');

		// 3. char형 변수 c가 '0'~'9'일 때 true
		char c = '5';
		System.out.println('0' <= c && c <= '9');

		// 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 t
		char d = 'g';
		System.out.println(('a' <= d && d <= 'z') || ('A' <= d && d <= 'Z'));
		// 굳이 숫자 외워서 쓰지 말란 말야~~~~

		// 5. char형 변수 e가 한글일 때 true
		// http://unicode.org/charts/에서 Hangul Syllables로 들어가면
		// AC00 ~ D7A3 (계산기로 십진수로 바꾸면 44032~55203)
		char e = '힣';
		System.out.println((char) 44032);
		System.out.println((char) 55203);

		System.out.println(e >= 44032 && e <= 55203); // 이게 베스트
		System.out.println(e >= '가' && e <= '힣');// 이 경우에는 오히려 가와 힣을 외우는게 더 번거로운 거.

		// 사실 자바에서 16진수를 직접 사용할 수도 있음
		// 16진수를 사용할 땐 앞엔 0x붙여주면 됨 0xAC00 이렇게 ★★★★
		System.out.println(e >= 0xAC00 && e <= 0xD7AF);

		// 6. char형 변수 f가 일본어일 때 true
		char f = 'ひ';
		// Hiragana로 들어가면 일어 범위 3040 ~ 309F
		System.out.println("f가 일본어인가요?" + (f >= 0x3040 && f <= 0x309F));

		// 7. 사용자가 입력한 문자열이 exit일 때 true
		/*
		Scanner sc = new Scanner(System.in); 
		String command = sc.nextLine();를 아래 한 줄로
		 */
		System.out.println("문자열을 입력하세요");
		String command = new Scanner(System.in).next();
		System.out.println(command.equals("exit"));
	}
}
