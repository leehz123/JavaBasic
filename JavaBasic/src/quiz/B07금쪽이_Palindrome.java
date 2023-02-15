package quiz;

import java.util.Scanner;

public class B07금쪽이_Palindrome {
	/*
	 사용자로부터 단어를 하나 입력 받았을 때 해당 단어가 완벽하게 대칭인지 아닌지 구분하는 프로그램 좌우 대칭 단어 예시 : level,
	 스위스, 일요일...
	 */
	public static void main(String[] args) {
		
//		System.out.println("단어를 입력하시오>>");
//		Scanner sc = new Scanner(System.in);
//		String word = sc.nextLine();
//		
//		boolean result = true;
//		                              근데 1 빼줄 필요 없이 비교연산자를 <로 바꾸면 됐자나..
//		for (int index = 0; index <= (word.length() / 2) - 1; ++index) {
//			if (word.charAt(index) != word.charAt(word.length() - 1 - index)) {
//				result = false;
//			}
//		}
//		
//		if (result == true) {
//			System.out.println(word + "은/는 대칭입니다.");
//		} else {
//			System.out.println(word + "은/는 비대칭입니다.");
//		}
//		
		//정답풀이. 
		Scanner sc = new Scanner(System.in);
		String word;
		
		System.out.print("단어>>");
		word = sc.next();
		
		int to_pass = word.length()/2; //좌우대칭문자열인지 확인하기 위해 비교해야 할 횟수
		int pass = 0; //좌우 대칭문자된 글자수 카운트. 
		//그래서 to_pass 와 pass가 일치하면 좌우대칭 문자열인 것!
		
		for (int index=0; index<word.length()/2; ++index) {
			
			char front_ch = word.charAt(index);
			char back_ch = word.charAt(word.length()-1-index);
			
			System.out.println("앞쪽 문자: " + front_ch);
			System.out.println("뒷쪽 문자: " + back_ch);
		
			if (front_ch == back_ch) {
				 ++pass;
				 System.out.println("-일치-");
			} else {
				System.out.println("-불일치-");
			}
			System.out.println("_____________________");
		}
		

		System.out.printf("좌우대칭이 되기 위해 필요한 일치는 %d개 입니다. \n", to_pass);
		System.out.printf("%d개의 문자가 일치합니다. \n", pass);
		
		if (to_pass == pass) {
			System.out.println("이 단어는 좌우 대칭입니다.");
		} else {
			System.out.println("이 단어는 좌우대칭이 아닙니다.");
		}
	
	
	}
}
