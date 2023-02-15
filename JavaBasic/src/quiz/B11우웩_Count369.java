package quiz;

import java.util.Scanner;

public class B11우웩_Count369 {
	/*
	사용자로부터 정수를 하나 입력받고 
	해당 숫자까지 369게임이 진행된다면 박수를 총 몇 번 쳐야 하는지 출력해보세요. 
	힌트: 한자리씩 떼어서 하기. 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		while(true) {
			System.out.println("숫자 입력 >>");
			num = sc.nextLine();
			boolean numeric = true;
			
			for (int i =0; i < num.length(); ++i) {
				char ch = num.charAt(i);
				if(!(ch >= 0 && ch <='9')) {
					numeric = false;
					break;
				}
			}
			if (numeric) {
				break;
			}
			System.out.println("다시 입력");
		}
		
		//숫자로만 된 문자열이 내려옴. 
		//어 근데 얘는 안 배운 거 Integer.parseInt() 써야 해서 일단 보류
		
		
		
		
		
		
	
	}
}
