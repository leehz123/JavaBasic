package quiz;

public class B06_ForQuiz3 {
	public static void main(String[] args) {
//		For���� ����� ������ ���� ���ڸ� ����غ��ÿ�. 
//		1. 0 3 6 9 12 ... 96 99
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//		2. -35 -28 -21 ... 0 7 ... 35
		for (int num = -35; num < 36; num++) {
			if (num % 7 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
//		3. 100 200 300 400 500... 900 1000
		for (int num = 100; num <= 1000; num++) {
			if (num % 10 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
//		4. 100 99 98 97 .. 5 4 3 2 1 0
		for (int num = 100; num >= 0; num--) {
			if (num % 10 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();

//		5. 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 .... (���ڰ� 30���� �������� ����)
//		for (int count = 0; count < 30; count++) {
//			for (int num = 1; num <= 10; num++) {
//				System.out.print(num + " ");
//			}
//		}
//		System.out.println();
		
		for (int i = 0; i < 30; i++) {
			System.out.print(i % 10 + " ");			
		}
		System.out.println();
		
//		6. 10 9 .. 3 2 1 10 9 8 7 .. 3 2 1 10 9 .. (���ڰ� 30���� �������� ����)
//		for (int count = 0; count < 30; count++) {
//			for (int num = 10; num >= 1; num--) {
//				System.out.print(num + " ");
//			}
//		}
//		System.out.println();
		
		for (int i = 0; i < 30; i++) {
			System.out.print(10 - i % 10 + " ");	
		// 10 - ��� 15 - �� �ٲٸ� 15~6������ ���� ��ȯ��. 		
		}
		System.out.println();
		
//		7. 7 77 777 7777 77777 ...(���� �ƴϰ� ������) 7777777777 (10��)	
		long sum = 0;
		for (int i = 0; i<=9; i++) {			
			sum += (long)(7 * Math.pow(10,i));
			System.out.println(sum);
		}
			System.out.println();
			
		// �ڡڡ� *10�� �������� �������� �̴� �� ��. ��Ʈ�� ���ϸ� 2������ �������� �̴� �Ͱ� ������. 
			// �������� �а� 7 ���ϰ� �������� �а� 7 ���ϰ�  
		for (long i = 7; i<= 7777777777L; i= i * 10 + 7) {
			System.out.println(i);			
		}
			
	}
}

