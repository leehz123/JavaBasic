package quiz;

import java.util.Scanner;

public class B07_PrintReverse {
	/*
	 * ����ڷκ��� ������ �Է¹����� �� ������ �Ųٷ� ����ϴ� ���α׷��� ��������.
	 */
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//���ڿ� ���� - 1 : ������ ����
		//���ڿ� ���� -2 : �ڿ��� �� ��° ����
		//���ڿ� ���� - ���ڿ� ���� : ù ��° ����
		
		// i++�ε� �� �� ����
		for (int i = 1; i <= str.length(); ++i) {
			System.out.print(str.length() - i);
			
		}
		System.out.println();
		
		for (int index = str.length() - 1; index >= 0; --index) {
			System.out.print(str.charAt(index));
		}
		System.out.println();
	}
}
