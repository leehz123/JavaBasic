package quiz;

import java.util.Scanner;

public class B00_Gugudan {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("�� ��?");
		int num = scanner.nextInt();
		// �ؿ� �̸��� �޾� ����ϰ� �; ����� �̸���? ������ ����־��µ�, ���� �Է��ϰ� �ٷ� ���� ���������� �Ѿ����
		// nextInt()�� ������?�� 9\n�� ������ 9�� �ް� \n�� ���� ���� �׷��� println()�� \n�� ���� �������� ��µǴ� ��
		// 9[�����̽�]�� ��������

		// �ذ����� InputStream(���)�� \n�� ����ָ� ��
		String trash = scanner.nextLine();

		System.out.print("����� �̸���?");
		String name = scanner.nextLine();
		System.out.println("User name: " + name);

		System.out.printf("%d * %d = %02d\n", num, 1, num * 1);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 2);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 3);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 4);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 5);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 6);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 7);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 8);
		System.out.printf("%d * %d = %02d\n", num, 1, num * 9);

		/*
		 for(int i =1; i<=9; i++) { 
		 System.out.printf("%d * %d = %d\n", num, i, num*i); 
		 }
		 */

	}

}
