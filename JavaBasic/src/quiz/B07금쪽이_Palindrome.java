package quiz;

import java.util.Scanner;

public class B07������_Palindrome {
	/*
	 ����ڷκ��� �ܾ �ϳ� �Է� �޾��� �� �ش� �ܾ �Ϻ��ϰ� ��Ī���� �ƴ��� �����ϴ� ���α׷� �¿� ��Ī �ܾ� ���� : level,
	 ������, �Ͽ���...
	 */
	public static void main(String[] args) {
		
//		System.out.println("�ܾ �Է��Ͻÿ�>>");
//		Scanner sc = new Scanner(System.in);
//		String word = sc.nextLine();
//		
//		boolean result = true;
//		                              �ٵ� 1 ���� �ʿ� ���� �񱳿����ڸ� <�� �ٲٸ� ���ڳ�..
//		for (int index = 0; index <= (word.length() / 2) - 1; ++index) {
//			if (word.charAt(index) != word.charAt(word.length() - 1 - index)) {
//				result = false;
//			}
//		}
//		
//		if (result == true) {
//			System.out.println(word + "��/�� ��Ī�Դϴ�.");
//		} else {
//			System.out.println(word + "��/�� ���Ī�Դϴ�.");
//		}
//		
		//����Ǯ��. 
		Scanner sc = new Scanner(System.in);
		String word;
		
		System.out.print("�ܾ�>>");
		word = sc.next();
		
		int to_pass = word.length()/2; //�¿��Ī���ڿ����� Ȯ���ϱ� ���� ���ؾ� �� Ƚ��
		int pass = 0; //�¿� ��Ī���ڵ� ���ڼ� ī��Ʈ. 
		//�׷��� to_pass �� pass�� ��ġ�ϸ� �¿��Ī ���ڿ��� ��!
		
		for (int index=0; index<word.length()/2; ++index) {
			
			char front_ch = word.charAt(index);
			char back_ch = word.charAt(word.length()-1-index);
			
			System.out.println("���� ����: " + front_ch);
			System.out.println("���� ����: " + back_ch);
		
			if (front_ch == back_ch) {
				 ++pass;
				 System.out.println("-��ġ-");
			} else {
				System.out.println("-����ġ-");
			}
			System.out.println("_____________________");
		}
		

		System.out.printf("�¿��Ī�� �Ǳ� ���� �ʿ��� ��ġ�� %d�� �Դϴ�. \n", to_pass);
		System.out.printf("%d���� ���ڰ� ��ġ�մϴ�. \n", pass);
		
		if (to_pass == pass) {
			System.out.println("�� �ܾ�� �¿� ��Ī�Դϴ�.");
		} else {
			System.out.println("�� �ܾ�� �¿��Ī�� �ƴմϴ�.");
		}
	
	
	}
}
