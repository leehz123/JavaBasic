package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	/*
	 ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�. 
	 ����ڰ� ����� ������ �Է��ϸ� ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷�
	 */
	public static void main(String[] args) {


		//����. (�����ڽ����� �����ϱ�! �׻� ������ ���ɼ��� ���)
		//��1.
		Scanner sc1 = new Scanner(System.in);
		int appleCount1;
		
		System.out.println("����� ������ �Է�");
		appleCount1 = sc1.nextInt();
		
		System.out.printf("�ʿ��� �ٱ����� ������ ��� %d�� �Դϴ�.\n", appleCount1 / 10);
		//10�� �� ��� ���� ����� ������ �ٱ��ϸ� �� 
		if (appleCount1 < 0) {
			System.out.println("����� ������ �̻��մϴ�."); 	 
		} else if(appleCount1 % 10 == 0) {
			System.out.printf("�ʿ��� �ٱ����� ������ ��� %d�� �Դϴ�.\n", appleCount1/10);
		} else {
			System.out.printf("�ʿ��� �ٱ����� ������ ��� %d�� �Դϴ�.\n", appleCount1 / 10 + 1);
		}
		 
		//��2. 
		Scanner sc = new Scanner(System.in);
		final int BASKET_SIZE= 10; //���. �� 2���� 10 ��� �� ������ ������ ��. 
		int appleCount, basketCount;
			
		System.out.println("����� ������ �Է�");
		appleCount = sc.nextInt();
				
		if(appleCount < 0) {
				//����� ������ �������� �� 
			System.out.println("����� ���� �̻��մϴ�.");
			}	else {
				//����� ������ �������� ��
					if (appleCount % 10 == BASKET_SIZE ) {
					basketCount = appleCount / BASKET_SIZE;	
					} else {
					basketCount = appleCount / BASKET_SIZE + 1;
					}
				System.out.printf("�ʿ��� �ٱ����� ������ ��� %d�� �Դϴ�. \n", basketCount);
				}
			
		 
			
		}
}
