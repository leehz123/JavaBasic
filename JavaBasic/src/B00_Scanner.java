import java.util.Scanner;

import quiz.A01_MemberInfo;
import quiz.A04_Gildong;
import quiz.A00_Rabbit;

/*
 
 */

public class B00_Scanner {
	/*
	 # import
	-�ٸ� ��Ű���� ����Ǿ� �ִ� Ŭ������ ��Ű������ �����ϰ� ����ϱ� ���� ����
	-import�� ����� ������ �ٸ� ��Ű���� �־ ��Ű���� ���� ����  
	 # java.util.Scanner Ŭ���� 
	 -���α׷����� �Է��� ���� �� �ִ� ��ɵ��� �� �ִ� Ŭ���� 
	 -��� �����κ��� �Է� ������ ������ �� ��ĳ�ʸ� �����Ͽ� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ctrl shift o(������) ������ import java.util.Scanner;�� �ڵ����� ����

		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// java��Ű�� �ȿ� util��Ű�� �ȿ� ScannerŬ����
		// import java.util.Scanner �� ���� ��Ű���� �����ϰ� Scanner sc = new Scanner(System.in);�� �� �� �ִ�.

		// ��� �츮�� �ٸ� ��Ű���� ������� ���� ������ ����� �� �ִ�.
		quiz.A00_Rabbit.main(null);
		quiz.A01_MemberInfo.main(null);
		quiz.A04_Gildong.main(null);
		//quiz��Ű���� A04_GildongŬ������ main()�Լ�(��ü �ҽ�)
		// �̷��� ���� ������ �� ��Ű������ ���������

		// ���� ��Ű���� �����ִ� �ٸ� Ŭ������ ��Ű������ �����ϰ� ����� �� �ִ�.
		A00_Hello.main(null);
		A01_Escape.main(null);
		A06_Print.main(null);
		// A06_Print��Ű���� main()�Լ�(�ҽ��ڵ� ��ü)
		
		// System.in���� �Է¹޴� ���ο� ��ĳ�ʸ� ����
		Scanner abbc = new Scanner(System.in);

		/*
		#) nextŸ��() 
		-�Էµ� ���� �� ���� ���� �ϳ� ���� �� �ش� Ÿ������ ��ȯ�Ͽ� �����´�. 
		-��ο��� ���� ���� �ش� Ÿ���� �� �� ���ٸ� ������ �߻��Ѵ�. 
		-����(�����̽�), \t, \n�� �������� ���� �����Ѵ�. 
		-��ο� �ƹ� ���� ���ٸ� ���α׷��� ���߰� ���ο� �Է��� ��ٸ���.
		
		1) next() 
		-�Էµ� ���� �� �� �ϳ�(�� ���)�� ���ڿ� Ÿ������ ������. 
		(�ٱٵ� ���ڿ��� � �Է��� ���͵� ���ڿ��� ���� �� ����. �׷��� ������ �߻����� �ʴ� ������ ����Ÿ��)
		  
		2) nextLine() 
		-�Էµ� ���� ��� ���ڿ� Ÿ������ ������. 
		-\n�� �������� ��� ���� �����Ѵ�. (�� �� ���� ��°�� �Է¹޴´�.)
		�� ctrl space������ next��¼�� ���� �ִ��� ��� ���� 
		
		3) nextInt()
		 */
		
		// System.out : �ý������� �������� ���
		System.out.print("������ �Է��ϼ���>>");
		
		int input = abbc.nextInt();
		int input2 = abbc.nextInt();
		//	10 11 12 13 �� �Է��ϸ� input���� 10 input2���� 11�� �� ���� �׸��� 12 13�� ��� Ÿ�� ����
		// �Է� �޴� ��δ� inputstream�ε� ���� �޳Ŀ� ���� �� ������ ����
		// �Ҽ� ������ ������ nextdouble�� �־�� �ԡڡڡ�
		
		System.out.printf("�Է¹��� ��: %d\n", input);
		System.out.printf("�Է¹��� ��2: %d\n", input2);
		
		
		System.out.print("�ƹ��ų� �Է��Ͻÿ�.>>"); //next()�� �����ϱ�. (� �Է��� ���͵� ���ڿ��� ���� �� ����)
//		String input = abbc.next();
//		String input2 = abbc.next();
//		System.out.printf("�Է¹��� ��: %s\n", input);	    //I'm
//		System.out.printf("�Է¹��� ��: %s\n", input2);	//very
		// I'm very hungry ������ �������� �����ϴϱ� �� ���

		System.out.print("�ƹ��ų� �Է��Ͻÿ�.>>");   
//		String input = abbc.nextLine();
		//�굵 ���ڿ��� �޾Ƽ� �ƹ��ų� ���� �� ����. ��� next()���� �������� \n�� �������� ���� �����Ѵٴ� ��.
//		System.out.printf("�Է¹��� ��: %s\n", input);
		// I'm very hungry. �� �� ���� ��µ�

	}
}
