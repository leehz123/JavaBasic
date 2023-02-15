package quiz;

import java.util.Random;

public class B12다시보기_GCD {
	/*
	랜덤으로 생성된 두 숫자의 최대 공약수를 구해보세요. 
	서로소 (공약수가 1뿐인 두 개 이상의 자연수)
	최대공약수 구하는 법 
	1. 공약수로 나누는 것 
	2. 지수 이용
	아 진짜 어캄 돌아버리겠네네에에에에ㅔ에에에에에에에에엥에에엥에엥에ㅔ
	 */
	public static void main(String[] args) {
	/*
		//내풀이. 아 못 풀었으
		int num1 = (int) (Math.random() * 100 + 1);
		int num2 = (int) (Math.random() * 100 + 1);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		String n1 = "";
		for (int i = 1; i < 9; ++i) {
			if (num1 % i == 0) {
				System.out.println(i);
				String chI = "" + i;
				n1 += chI;
			}
		}
		System.out.println("n1 : " + n1);
		System.out.println("______________");

		System.out.println("num2 : " + num2);
		String n2 = "";
		for (int j = 1; j < 9; ++j) {
			if (num2 % j == 0) {
				System.out.println(j);
				String chj = "" + j;
				n2 += chj;
			}
		}
		System.out.println("n2 : " + n2);
*/	

//		###	랜덤 ab 구하기 ver.1	### 
		//Integer.MAX_VALUE : 정수의 최대값. (4byte정수의 최대 양수값)
		//최대공약수를 구할 때 음수가 나오건 양수가 나오건 상관 없긴 한데 이건 일단 양수만 구해줌.  
		//int a = (int)(Math.random() * Integer.MAX_VALUE); //우리가 뽑을 수 있는 최대 정수값 
		//int b =  (int)(Math.random() * Integer.MAX_VALUE);
		//시작은 20부터할 필요가 없지 더 작은쪽부터 나눠보면 됨.

//		###	랜덤 ab구하기 ver.2	###
/*		//아니면 Random클래스 생성해서 하는데 
		//이렇게 하면 음수도 나오게 됨. 근데 아래 식에는 음수를 집어넣을 때 오류가 남. 그래서 위에 Integer.MAX_VALUE 이용하는게 나음. 
		Random ran = new Random();
		int a = ran.nextInt();
		int b = ran.nextInt();
		//아니면 int b = Math.abs(ran.nextInt()); 이렇게 절대값을 구해줘버리면 됨. 
*/		
		int a = 88;
		int b = 72;
		//	###	a 와 b 중 뭐가 더 크고 작은지 구하기	ver.1	###
		int min;
		//min = Math.min(a, b); 함수를 쓰거나 
		
		if(a>b) {
			min = b;
		} else {
			min = a;
		}
		
		//아니면 삼항연산자를 쓰면 간단하쥐
		//min = a > b ? b : a;
		
		int gcd = 1;
		for(int i= min; i > 0; --i) {
			if(a % i == 0 && b % i == 0) { //ㅇ ㅏ 그렇네.. 어차피 같은 값으로 나눠지는게 공약수니까.. i로 통일 가능하지...
				gcd = i;
				break;
			}
		}
		System.out.printf("%d 와 %d의 최대 공약수는 %d입니다.\n", a, b, gcd);
	}	
}		
