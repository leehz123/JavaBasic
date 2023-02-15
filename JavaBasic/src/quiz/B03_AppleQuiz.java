package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	/*
	 사과를 10개씩 담을 수 있는 바구니가 있다. 
	 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램
	 */
	public static void main(String[] args) {


		//정답. (개발자스럽게 생각하기! 항상 오류의 가능성을 대비)
		//식1.
		Scanner sc1 = new Scanner(System.in);
		int appleCount1;
		
		System.out.println("사과의 개수를 입력");
		appleCount1 = sc1.nextInt();
		
		System.out.printf("필요한 바구니의 개수는 모두 %d개 입니다.\n", appleCount1 / 10);
		//10개 씩 담고 남은 사과가 있으면 바구니를 더 
		if (appleCount1 < 0) {
			System.out.println("사과의 개수가 이상합니다."); 	 
		} else if(appleCount1 % 10 == 0) {
			System.out.printf("필요한 바구니의 개수는 모두 %d개 입니다.\n", appleCount1/10);
		} else {
			System.out.printf("필요한 바구니의 개수는 모두 %d개 입니다.\n", appleCount1 / 10 + 1);
		}
		 
		//식2. 
		Scanner sc = new Scanner(System.in);
		final int BASKET_SIZE= 10; //상수. 식 2에서 10 대신 이 변수를 넣으면 됨. 
		int appleCount, basketCount;
			
		System.out.println("사과의 개수를 입력");
		appleCount = sc.nextInt();
				
		if(appleCount < 0) {
				//사과의 개수가 비정상일 때 
			System.out.println("사과의 수가 이상합니다.");
			}	else {
				//사과의 개수가 정상적일 때
					if (appleCount % 10 == BASKET_SIZE ) {
					basketCount = appleCount / BASKET_SIZE;	
					} else {
					basketCount = appleCount / BASKET_SIZE + 1;
					}
				System.out.printf("필요한 바구니의 개수는 모두 %d개 입니다. \n", basketCount);
				}
			
		 
			
		}
}
