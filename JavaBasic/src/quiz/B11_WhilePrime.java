package quiz;

import java.util.Scanner;

public class B11_WhilePrime {
	/*
	 사용자로부터 숫자를 입력 받으면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보시오. 
	 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수. 1 제외. 그리고 소수는 양수로만 존재
	 2,3,5,7,11,13,17,19...
	 사용자가 음수를 입력하는 경우 다시 제대로 입력하게 만들기
	 이걸 while문으로만 풀어보기
	 */
	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);

		int input = 0;

		// 입력한 값이 2 이하면 다시 입력
		while (true) {
			System.out.print("2 이상의 숫자를 입력하시오.>>");
			input = sc.nextInt();
			if (input > 2) {
				System.out.println("입력값: 정상");
				break;
			}
			System.out.println("2 이상의 숫자를 다시 입력하시오.");
		}
		//소수 거르기
		int i = 2;
		
		while (i <= input) {
			int cnt = 0;
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					++cnt;
					break;
				}
				++j;
			}
			if (cnt == 0) {
				System.out.println(i + "는 소수입니다.");
			}
			++i;
		}
*/
		//정답 풀이
		Scanner sc = new Scanner(System.in);
		int bound = 0;
		
		while (true) {
			System.out.print("소수의 범위를 지정: ");
			bound = sc.nextInt();
			if(bound >1 ) {		
				break;
			}
		}
		
		
		System.out.println("소수의 범위를 지정");
		
		int num = 2; 
		while (num <= bound) {
			boolean prime = true; 
			
			int chk = 2;
			double sqrt = Math.sqrt(num);
			while (chk <= sqrt) {
				if (num % chk == 0) {
					prime = false;
					break;
				}
				++chk;
			}
			if (prime) {
				System.out.println(num);
			}
			++num;
		}
		
		
		
		
		
	}
}
