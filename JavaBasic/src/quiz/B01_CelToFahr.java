package quiz;

import java.util.Scanner;

public class B01_CelToFahr {
	public static void main(String[] args) {
		System.out.println("섭씨℃온도를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		double cel = scanner.nextDouble();
		
		System.out.printf("%.2f℃는 %.2f℉입니다.", cel, (cel*1.8)+32);
		
		//----------------------------답안-----------------------------
		/*
		 double cel = new Scanner(System.in).nextDouble(); //이렇게 하면 한번 쓰고 버리는 스캐너가 됨.
		 만약에 입력을 계속 받으려면 변수에 담아야 함. 
		 double fahr = (cel*9/5)+32;
		 System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.\n", cel, fahr);
		  
		 //그래서 아래처럼 하기~ 
		 Scanner sc = new Scanner(System.in); 
		 double cel, fahr;
		 
		 cel = sc.nextDouble(); fahr = (cel*9/5)+32; 
		 System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.\n", cel, fahr);
		 */
	}
}



