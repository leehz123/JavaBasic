package quiz;

import java.util.Scanner;

public class B11_WhilePrime {
	/*
	 ����ڷκ��� ���ڸ� �Է� ������ 1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ����غ��ÿ�. 
	 �Ҽ� : ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ��. 1 ����. �׸��� �Ҽ��� ����θ� ����
	 2,3,5,7,11,13,17,19...
	 ����ڰ� ������ �Է��ϴ� ��� �ٽ� ����� �Է��ϰ� �����
	 �̰� while�����θ� Ǯ���
	 */
	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);

		int input = 0;

		// �Է��� ���� 2 ���ϸ� �ٽ� �Է�
		while (true) {
			System.out.print("2 �̻��� ���ڸ� �Է��Ͻÿ�.>>");
			input = sc.nextInt();
			if (input > 2) {
				System.out.println("�Է°�: ����");
				break;
			}
			System.out.println("2 �̻��� ���ڸ� �ٽ� �Է��Ͻÿ�.");
		}
		//�Ҽ� �Ÿ���
		int i = 2;
		
		while (i <= input) {
			int cnt = 0;
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					++cnt;
					break;
				}
				++j;
			}
			if (cnt == 0) {
				System.out.println(i + "�� �Ҽ��Դϴ�.");
			}
			++i;
		}
*/
		//���� Ǯ��
		Scanner sc = new Scanner(System.in);
		int bound = 0;
		
		while (true) {
			System.out.print("�Ҽ��� ������ ����: ");
			bound = sc.nextInt();
			if(bound >1 ) {		
				break;
			}
		}
		
		
		System.out.println("�Ҽ��� ������ ����");
		
		int num = 2; 
		while (num <= bound) {
			boolean prime = true; 
			
			int chk = 2;
			double sqrt = Math.sqrt(num);
			while (chk <= sqrt) {
				if (num % chk == 0) {
					prime = false;
					break;
				}
				++chk;
			}
			if (prime) {
				System.out.println(num);
			}
			++num;
		}
		
		
		
		
		
	}
}
