package quiz;

import java.util.Scanner;

public class B00_Gugudan {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("몇 단?");
		int num = scanner.nextInt();
		// 밑에 이름도 받아 출력하고 싶어서 당신의 이름은? 문단을 집어넣었는데, 숫자 입력하고 바로 쭉쭉 구구단으로 넘어가버림
		// nextInt()의 문제점?이 9\n을 받으면 9만 받고 \n이 남아 있음 그래서 println()에 \n이 들어가서 공백으로 출력되는 것
		// 9[스페이스]도 마찬가지

		// 해결방법은 InputStream(찌꺼기)인 \n을 비워주면 됨
		String trash = scanner.nextLine();

		System.out.print("당신의 이름은?");
		String name = scanner.nextLine();
		System.out.println("User name: " + name);

		System.out.printf("%d * %d = %02d\n", num, 1, num * 1);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 2);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 3);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 4);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 5);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 6);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 7);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 8);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 9);

		/*
		 for(int i =1; i<=9; i++) { 
		 System.out.printf("%d * %d = %d\n", num, i, num*i); 
		 }
		 */

	}

}
