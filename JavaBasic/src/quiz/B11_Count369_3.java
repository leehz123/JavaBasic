package quiz;

import java.util.Scanner;
//�� �̰͵� �����ϳ�.......�ƾƾƾƾƾƾƾƾƾƾƾƾƾƤ���!!!!!!!!!!!
public class B11_Count369_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է�>>");
		int num = sc.nextInt();

		int clap = 0;
		
		// 1234/5
		// �����ڸ� 5�� �и�
		// 123/4
		// 12/3
		// 1/2
		// 1
		// 0
		for (int i = 1; i <= num; ++i) {
			int chkNum = i; //i���� ���ϸ� �� �Ǵϱ� chkNum�� ��Ƴ��� �񱳸� �ϴ� ��. 
			System.out.printf("%d : ", i);
			
			while (chkNum > 0) {
				int digit = chkNum % 10;// �����ڸ� �и� ����
				if (digit == 3 || digit == 6 || digit == 9) {
					System.out.print("¦");
					++clap;
				}
				chkNum /= 10;
			}
			System.out.println();
		}
	}
}
