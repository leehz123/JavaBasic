package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	/*
	 사용자로부터 몇월을 입력받으면 해당 게절을 출력하는 프로그램 (반드시 switch-case문을 사용할 것)
	 */
	public static void main(String[] args) {
/*
 내 풀이. 
 Scanner sc = new Scanner(System.in);
 int month = sc.nextInt();
String season;

switch(month) {
case 12: case  1: case 2:
	System.out.println("겨울");
	break;
case 3: case 4: case 5:
	System.out.println("봄");
	break;
case 6: case 7: case 8:
	System.out.println("여름");
	break;
case 9: case 10: case 11:
	System.out.println("가을");
	break;
default:
	System.out.println("잘못 입력하셨습니다.");
	break;

}
 */
		
		//정답 풀이.
		int month = new Scanner(System.in).nextInt();
		String season;
		
		switch(month) { //★★이렇게 바로 넣어줘도 됨!
		
		case 12: case  1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			season = "모름";
			break;
		}
		System.out.printf("%d월은 [%s]월 입니다. \n", month, season);
		
		
		
	}
}
