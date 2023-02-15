package quiz;

import java.util.Scanner;

public class B02������_ConditionQuiz2 {
	public static void main(String[] args) {
		// #�˸��� ���ǽ��� �����ÿ�
		// 1. char�� ���� a�� 'q' �Ǵ� 'Q'�� �� t
		String a = "q";
		System.out.println(a.equalsIgnoreCase("q"));
		
		// 2. char�� ���� b�� �����̳� ���� �ƴ� �� true
		/*
		 �� Ǯ��. String b =" "; 
		 System.out.println((b.equals(" "))||(b.equals("\t")));
		 �ٵ� �׳� ==���� ���Ͻ� �׸��� '�ƴ� ��'�ε� .equals�ؼ� Ʋ��
		 */
		
		// ���� Ǯ��.
		char b = '\t';
		System.out.println(b != ' ' && b != '\t');

		// 3. char�� ���� c�� '0'~'9'�� �� true
		char c = '5';
		System.out.println('0' <= c && c <= '9');

		// 4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� t
		char d = 'g';
		System.out.println(('a' <= d && d <= 'z') || ('A' <= d && d <= 'Z'));
		// ���� ���� �ܿ��� ���� ���� ����~~~~

		// 5. char�� ���� e�� �ѱ��� �� true
		// http://unicode.org/charts/���� Hangul Syllables�� ����
		// AC00 ~ D7A3 (����� �������� �ٲٸ� 44032~55203)
		char e = '�R';
		System.out.println((char) 44032);
		System.out.println((char) 55203);

		System.out.println(e >= 44032 && e <= 55203); // �̰� ����Ʈ
		System.out.println(e >= '��' && e <= '�R');// �� ��쿡�� ������ ���� �R�� �ܿ�°� �� ���ŷο� ��.

		// ��� �ڹٿ��� 16������ ���� ����� ���� ����
		// 16������ ����� �� �տ� 0x�ٿ��ָ� �� 0xAC00 �̷��� �ڡڡڡ�
		System.out.println(e >= 0xAC00 && e <= 0xD7AF);

		// 6. char�� ���� f�� �Ϻ����� �� true
		char f = '��';
		// Hiragana�� ���� �Ͼ� ���� 3040 ~ 309F
		System.out.println("f�� �Ϻ����ΰ���?" + (f >= 0x3040 && f <= 0x309F));

		// 7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
		/*
		Scanner sc = new Scanner(System.in); 
		String command = sc.nextLine();�� �Ʒ� �� �ٷ�
		 */
		System.out.println("���ڿ��� �Է��ϼ���");
		String command = new Scanner(System.in).next();
		System.out.println(command.equals("exit"));
	}
}
