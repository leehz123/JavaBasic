package quiz;

import java.util.Scanner;

public class B09_Numeric {
	/*
	사용자가 어떤 문자열을 입력했을 떄
	해당 단어가 모두 숫자로만 구성되어 있는지 검사하시오. 
	 */
	public static void main(String[] args) {
//		내 풀이. (삽질했군ㅎㅎ)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자로만 구성된 문자열을 입력하시오.>>");
//		String input = sc.next();
//		
//		int cnt = 0;
//		
//		for (int index = 0; index < input.length(); ++index) {
//			if (input.charAt(index) >= '0' && input.charAt(index) <= '9') {
//				continue;
//			} else {
//				System.out.printf("%d번째 글자는 숫자가 아닙니다.\n", index);
//			}
//		}
//		
//		 
//		if (cnt == input.length()) {
//			System.out.printf("입력한 %s는 모두 숫자로 구성 돼 있습니다. ", input);
//		} else {
//			System.out.printf("입력한 %s는 모두 숫자로 구성 돼 있지 않습니다. ", input);
//		}

		
		//정답 풀이. 
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("아무거나 입력>>");
		input = sc.next();
		
		boolean numbersOnly = true;
		
		for(int i=0; i<input.length();++i) {
			char ch = input.charAt(i);
			//숫자가 아닌 문자가 발견된다면 false로 바꾸고 반복을 중단. 
			if (ch <'0' || ch<'9') {
				numbersOnly = false;
				break;
			}		
		} 
		System.out.println("숫자로만 이루어져 있나요?>>" + numbersOnly);
		
	}
}
