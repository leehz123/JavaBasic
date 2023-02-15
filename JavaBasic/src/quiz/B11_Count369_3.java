package quiz;

import java.util.Scanner;
//와 이것도 간단하네.......아아아아아아아아아아아아아아ㅏ악!!!!!!!!!!!
public class B11_Count369_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자만 입력>>");
		int num = sc.nextInt();

		int clap = 0;
		
		// 1234/5
		// 일의자리 5번 분리
		// 123/4
		// 12/3
		// 1/2
		// 1
		// 0
		for (int i = 1; i <= num; ++i) {
			int chkNum = i; //i값은 변하면 안 되니까 chkNum에 담아놓고 비교를 하는 것. 
			System.out.printf("%d : ", i);
			
			while (chkNum > 0) {
				int digit = chkNum % 10;// 일의자리 분리 가능
				if (digit == 3 || digit == 6 || digit == 9) {
					System.out.print("짝");
					++clap;
				}
				chkNum /= 10;
			}
			System.out.println();
		}
	}
}
