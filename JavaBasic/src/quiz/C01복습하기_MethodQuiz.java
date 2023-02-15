package quiz;

import java.util.Arrays;

public class C01복습하기_MethodQuiz {
	
	public static boolean isAlphabet(char alph) {
		return ((alph >= 'a' && alph <= 'z') || (alph >= 'A' && alph <= 'Z'));	
	}
	
	
	public static boolean isTriple (int a) {
		//return(a % 3 == 0); 괄호 굳이 안 쳐줘도 됨 
		return a % 3 == 0;
	}
	
	public static String drainage_2 (int a) {
//		if(a % 2 == 0) {
//			return("짝수입니다.");
//		} else {
//			return("홀수입니다.");
//		}
		return a % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	} 
	
		
		

	
	public static int yaksuCnt(int num) {
		//아예 약수의 개수 구하는 메소드를 따로 만들어 놓기 . 
		//작업단위를 따로따로 분리해놓으면 나중에 약수만 따로 알 수 ㅇ.
		int cnt = 0;
		
		for(int i = 2; i < num; ++i) {
			if(num % i == 0 ) {
				++cnt;
			}
		}
		return cnt + 2;  //1과 자기 자신도 포함해야 하니까 + 2
	}
	
	public static int[] divisor (int a) {
		//약수의 배열을 생성하여 반환
		
		/*내 풀이
		//약수를 구해서 배열에 집어넣고 배열 리턴
		int[] divisors = new int[cnt];
		int index = 0;
		for(int i = 1; i <= a; ++i ) {
			if (a % i == 0) {
				divisors[index] = i;
				++index;
			}
		}
		return divisors;
*/
		int[] yaksu = new int[yaksuCnt(a)];
		int index = 0;
		for (int i = 1; i <= a; ++i) {
			if(a % i ==0) {
				yaksu[index++] = i;
			}
		}
		
		return yaksu;
	}
	
	//헐 나 이거 왜 중첩for문으로 풀었지 ? 
	//아 그건 a까지의 모든 소수를 구하는 문제일 때 그렇게 푸는 거 (바깥fori문은 2~<=a 돌고 안쪽 forj문은 2~<i까지 도는거)
	
	public static boolean isPrime(int a) {
		boolean result = false;
		double sqrt = Math.sqrt(a);
		
		for (int i = 2; i < a; ++i) {
			if (a % i == 0) {
				return false;
				//이 밑에는 break써줄 필요가 없지 return하면서 이 함수를 호출한 곳으로 돌아가니까!
			} 
		}
		
		return true;
	}
	
	//◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆
	public static int factorial (int a) {
		int fact = 1;
		
		for (int i = a; i > 1; --i) {
			fact *= i;
		}
		return fact;
	}
	
	/*
	# 재귀함수 recursive
	자기 자신을 불러서 사용하는 함수
	탈출구를 만들어 놓지 않으면 계속해서 호출하다가 스택오버플로를 일으킨다.
	스택오버플로 : 한번에 너무 많은 함수를 호출해서 발생하는 에러
	성능은 일반 함수에 비해 떨어지지만 반드시 필요한 경우가 존재한다.(끝을 모르고 계속 돌려야 할 때가 있음)
	 */
	 
	
	public static int refac(int num) {
		
		if(num < 1) {
			return -9999; //걍 자기 맘대로 숫자 정해~
 		} else if (num == 1) {
			return 1;
		} else {
			return num * refac(num - 1); //희한한 방식 재귀함수!!
		}
	}
	
	
	
	public static void main(String[] args) {
		
		// # 다음 메서드를 정의하고 올바르게 동작하는지 테스트
		
		//1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
		System.out.println(isAlphabet('c'));
		
		//2. 전달한 숫자가 3의 배수이면 true를 반환 아니면 f
		System.out.println(isTriple(33));
		
		//3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다."를 반환하는 함수
		System.out.println(drainage_2(5));
		
		//4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
		System.out.println(Arrays.toString(divisor(300)));
		
		//5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
		System.out.println(isPrime(7));
		
		//6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
		System.out.println(factorial(10));   
		System.out.println(refac(7));	

		
		
		
		
	}
}
