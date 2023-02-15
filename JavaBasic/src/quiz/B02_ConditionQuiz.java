package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz {
	public static void main(String[] args) {
		// 1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		int a = -5;
		System.out.println(a > 10 && a < 20);
		// 2. int�� ���� b�� ¦���� �� true
		int b = 4;
		System.out.println(b % 2 == 0);
		// 3. int�� ���� c�� 7�� ����� �� true
		int c = -21;
		System.out.println(c % 7 == 0);

		// 4. int�� ���� hour�� ���Ŀ� �ش��ϴ� �ð��� �� = 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� t
		int hour = 24;
		// !(hour<0) && !(hour>=24) && !(hour>=12)
		System.out.println(!(hour < 0 || hour >= 24) && (hour >= 12));
		// ���⼭ 0�̸� 24�̻� ���� ���� ����!! ������0    24������ �̷� ���´ϱ� &&���� ||��� ��! !A��!B =!(A��B)
		// System.out.println(hour >=12 && hour < 24); hour>0�� hour>=12�� ���ļ� ���ֵ� ��.

		// 5. int�� ���� d�� e�� ���̰� 30�� �� true
		int d, e;
		d = 70;
		e = 100;
		System.out.println((Math.abs(d - e) == 30));

		// 6. int�� ���� year�� 400���� ������ �������ų�, 4�� ������ �������� 100���� ����������� ���� �� true
		// ���� ��� ����
		int year = 2096;
		System.out.printf("%d���� 2���� �Ϸ� �� �ִ� ���ΰ���?", year);
		System.out.println((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

		// 7. �μ��� ö������ ������ 3�� ������ true
		int mBMonth, cBMonth;
		mBMonth = 7;
		cBMonth = 10;
		System.out.println(cBMonth - mBMonth == 3);
		System.out.println(mBMonth + 3 == cBMonth);
		// �ٵ� �μ� ������ 11���̰� ö�������� 2���� ��쵵 �����ؾ� ��..
		System.out.println((mBMonth + 3) % 12 == cBMonth); // �̰� ����Ʈ ����
		// �μ�+3 ���� ö��-3���� �ص� ������ �׷��� �ϸ� ö�������� 2���� �� ����� �̻��ϰ� ��.
		// 12�� �����ָ� �Ǳ� �ϴµ� ���� �� ������⸸ ��.
		System.out.println(cBMonth - 3 == mBMonth);
		System.out.println((cBMonth - 3 + 12) % 12 == 3);
		System.out.println(cBMonth - mBMonth == 3 || mBMonth - cBMonth == 9);

		// 8. boolean�� ���� powerOn�� false�� �� true
		boolean powerOn = false;
		System.out.println(!powerOn); // ����! (powerOn==false)�� �̽��������

		// 9. ���ڿ� �������� str�� "yes"�� �� true

		System.out.println("yes�� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(str == "yes");
		// ������������ ==���� ���ϸ� ������ �������� ���� �ڡڡ�
		// �Ʒ� ���� ����------------------------------------------------------
		// �ϴ� String�� ���� �ƴ� �ּҸ� �����ϴ� ��������
		String str1 = "yes";
		String str2 = "yes";
		System.out.println(str1 == "yes"); // t
		System.out.println(str2 == "yes"); // t
		System.out.println(str1 == str2); // t
		// "yes"�� �̹� ������� �� ������ str1 �� str2�� �Ȱ��� �ּҸ� ����Ű�� ��.
		// ==�� �ּҰ��� ���ϱ� ������ �Ȱ��ٰ� ����

		// �ٵ� ���⼭ new�� ���� ��ĳ�ʷ� ���ο� �ּҸ� ������ ����������
		System.out.println("yes�� �Է��ϼ���");
		String str3 = scanner.next();
		// str3�� str1�� str2�� �ּҿ� �ٸ� ���� ����Ű�� �ǰ� ==���� ���ϰ� �Ǹ� �ٸ��ٰ� ������ ��.
		System.out.println(str3 == str1); // f
		System.out.println(str3 == str2); // f
		// �ٽ��� String���� ==���� ���ϸ� '����'�� �ƴ� '�ּ�'�� ���Ѵٴ� ��!

		// --------------------------------------------------------------------

		// �ٽ� ���� ==�� ������ �ִ� �ּҰ��� ������ ���ϰ�(���� ��ü�� ����Ű�� �ִ��� ��)
		// ���� ���� ���� ���Ϸ��� �ش� ������ ������ ���� �ִ� .equals()�� ����Ѵ�.
		System.out.println(str1.equals(str3));

	}

}
