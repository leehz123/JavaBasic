package quiz;

import java.util.Scanner;

public class B07_CountE {
	public static void main(String[] args) {
		/*
		사용자가 문장을 입력 했을 때 해당 문장의 알파벳 E가 몇 번 등장하는지 알려주는 프로그램을 만들어 보세요. 
		대소문자 모두 세어야 합니다. 
		 */
		//변수 맨 앞글자 자꾸 대문자 쓰는 버릇 생김.. 주의!
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하시오.>>");
		String input = sc.nextLine();
		
		int eCount = 0;
		int uECount = 0;

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'e') {
				++eCount;
				System.out.println(index + 1 + "번째 글자에 소문자 e가 있습니다.");
			} else if (input.charAt(index) == 'E') {
				++uECount;
				System.out.println(index + 1 + "번째 글자에 대문자 E가 있습니다.");
			}
		}
		System.out.println("________________________________________");
		System.out.println("알파벳 e는 " + eCount + " 번 등장합니다.");
		System.out.println("알파벳 E는 " + uECount + " 번 등장합니다.");
	
	}
}
