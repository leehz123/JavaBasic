package quiz;

import java.util.Scanner;

public class ������ {
	public static void main(String[] args) {
	
		
		System.out.println((int)'��');
		System.out.println((char)44032);
		
		int n = 89;
		
		System.out.println(10/3.0);
		
		double value = 123.77777777;
		System.out.println(Math.round(value * 10000)/10000.0);
		
		//sysout> ctrl+space
		System.out.println();
		
		System.out.println(Math.round(55.6));
		
		
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.round(10.5));
		
		System.out.println((char)('A' + 32));
		System.out.println('1'== 1);
		
		for (long i = 7; i<= 7777777777L; i= i * 10 + 7) {
			System.out.println(i);	
			
		}
		System.out.println(-27 % 5);
		
		System.out.printf("%+-8d", -2);
		System.out.printf("%+-8d", +2);
		System.out.println();
		
		System.out.println((char)('k' +('A'-'a')));
		char ch = 97;
		System.out.println(ch);

		System.out.println(7%1);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("2�̻��� ���ڸ� �Է����ּ���>>");
//		for (int num = sc.nextInt(); num < 2; num = sc.nextInt()) {
//			System.out.println("�ٽ� �Է����ּ���" + num);
//			System.out.println("2�̻��� ���ڸ� �Է����ּ���>>");
//		}
		//System.out.println("���ڰ� ����� �ԷµǾ����ϴ�." + num);
		System.out.println("__________________________________");
		int i = 1;
		while (i <= 10) {
			
				System.out.println(i);	
				i++;
		}
		
		i = 500;
		int sum = 0;
		while (i <= 1200) {
//			if (i % 3 == 0) {
//				sum += i;	
//			}
			System.out.println(i);
			i++;
		}
		
		System.out.println(Math.sqrt(10));
	
		System.out.println(2%2);
		
		i = 2;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(125%93);
		
		int random_num = 5; 
		int[] winning_number = new int[2];
		winning_number[0] = 5;
		winning_number[1] = 6;
		System.out.println(winning_number[0] == random_num);
		//int�迭�� �� �� (winning_number[0] = 5;) �� �ٸ� int������ random_num �� �� 5 ==�� ���� 
	}
}

