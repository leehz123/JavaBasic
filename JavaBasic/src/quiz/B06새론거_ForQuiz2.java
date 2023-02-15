package quiz;

import java.util.Scanner;

public class B06새론거_ForQuiz2 {
//1. 사용자로부터 숫자를 입력 받으면 1부터 해당숫자 사이에 있는 5의 배수를 한 줄에 7 개씩 모두 출력해보세요. 
//	음수를 입력받는 경우에도 동작해야 함. 
	public static void main(String[] args) {
		/*
		 System.out.println("숫자를 입력하세요."); 
		 Scanner sc = new Scanner(System.in); 
		 int num = sc.nextInt();
		 
		 if(num>=1) { 
		 	for(int i=1, cnt=0; i<=num;i++) { 
		 		if(i%5==0) { 
		 			System.out.printf("%-4d",i); 
		 				if(cnt++ %7 == 6) { 
		 					System.out.println(); 
		 				} 
		 			} 
		 		}
		  } else { 
		  		for(int i=1, cnt=0; i>=num;i--) { 
		  			if(i%5==0) {
		  				System.out.printf("%-4d",i); 
		  				if(cnt++ %7 == 6) { 
		  					System.out.println(); 
		  				} 
		  			} 
		  		}
		  	}
				 */

		Scanner sc = new Scanner(System.in);
		int userNum;
		System.out.println("숫자 >>");
		userNum = sc.nextInt();

		int startNum, endNum;
		// ★★★ 양수를 받을 때와 음수를 받을 때의 차이는 시작 넘버와 끝넘버가 다르다는 것!을 이용
		if (userNum > 1) {
			startNum = 1;
			endNum = userNum;
		} else {
			startNum = userNum;
			endNum = 1;
		}
		//이렇게 startNum, endNum 변수로 통일시켜준 다음에 for문에서는 그 변수만 사용. 식이 더 간단해짐 
		
		for (int num = startNum, cnt = 0; num < endNum; ++num) {
			if (num % 5 == 0) {
				System.out.printf("%+-8d", num); // "%+-8d"는 부호를 붙여주겠단 소리★★★
				if (cnt++ % 7 == 6) {			//★★★cnt는 0~6까지. 그래서 7글자 출력하고 나서 줄넘김
					System.out.println();
				}
			}
		}

	}

}
