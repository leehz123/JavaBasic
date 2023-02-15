package quiz;

import java.util.Arrays;

public class C01�����ϱ�_MethodQuiz {
	
	public static boolean isAlphabet(char alph) {
		return ((alph >= 'a' && alph <= 'z') || (alph >= 'A' && alph <= 'Z'));	
	}
	
	
	public static boolean isTriple (int a) {
		//return(a % 3 == 0); ��ȣ ���� �� ���൵ �� 
		return a % 3 == 0;
	}
	
	public static String drainage_2 (int a) {
//		if(a % 2 == 0) {
//			return("¦���Դϴ�.");
//		} else {
//			return("Ȧ���Դϴ�.");
//		}
		return a % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
	} 
	
		
		

	
	public static int yaksuCnt(int num) {
		//�ƿ� ����� ���� ���ϴ� �޼ҵ带 ���� ����� ���� . 
		//�۾������� ���ε��� �и��س����� ���߿� ����� ���� �� �� ��.
		int cnt = 0;
		
		for(int i = 2; i < num; ++i) {
			if(num % i == 0 ) {
				++cnt;
			}
		}
		return cnt + 2;  //1�� �ڱ� �ڽŵ� �����ؾ� �ϴϱ� + 2
	}
	
	public static int[] divisor (int a) {
		//����� �迭�� �����Ͽ� ��ȯ
		
		/*�� Ǯ��
		//����� ���ؼ� �迭�� ����ְ� �迭 ����
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
	
	//�� �� �̰� �� ��øfor������ Ǯ���� ? 
	//�� �װ� a������ ��� �Ҽ��� ���ϴ� ������ �� �׷��� Ǫ�� �� (�ٱ�fori���� 2~<=a ���� ���� forj���� 2~<i���� ���°�)
	
	public static boolean isPrime(int a) {
		boolean result = false;
		double sqrt = Math.sqrt(a);
		
		for (int i = 2; i < a; ++i) {
			if (a % i == 0) {
				return false;
				//�� �ؿ��� break���� �ʿ䰡 ���� return�ϸ鼭 �� �Լ��� ȣ���� ������ ���ư��ϱ�!
			} 
		}
		
		return true;
	}
	
	//�ߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡߡ�
	public static int factorial (int a) {
		int fact = 1;
		
		for (int i = a; i > 1; --i) {
			fact *= i;
		}
		return fact;
	}
	
	/*
	# ����Լ� recursive
	�ڱ� �ڽ��� �ҷ��� ����ϴ� �Լ�
	Ż�ⱸ�� ����� ���� ������ ����ؼ� ȣ���ϴٰ� ���ÿ����÷θ� ����Ų��.
	���ÿ����÷� : �ѹ��� �ʹ� ���� �Լ��� ȣ���ؼ� �߻��ϴ� ����
	������ �Ϲ� �Լ��� ���� ���������� �ݵ�� �ʿ��� ��찡 �����Ѵ�.(���� �𸣰� ��� ������ �� ���� ����)
	 */
	 
	
	public static int refac(int num) {
		
		if(num < 1) {
			return -9999; //�� �ڱ� ����� ���� ����~
 		} else if (num == 1) {
			return 1;
		} else {
			return num * refac(num - 1); //������ ��� ����Լ�!!
		}
	}
	
	
	
	public static void main(String[] args) {
		
		// # ���� �޼��带 �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ
		
		//1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		System.out.println(isAlphabet('c'));
		
		//2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ �ƴϸ� f
		System.out.println(isTriple(33));
		
		//3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�." �Ǵ� "Ȧ���Դϴ�."�� ��ȯ�ϴ� �Լ�
		System.out.println(drainage_2(5));
		
		//4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
		System.out.println(Arrays.toString(divisor(300)));
		
		//5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		System.out.println(isPrime(7));
		
		//6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
		System.out.println(factorial(10));   
		System.out.println(refac(7));	

		
		
		
		
	}
}
