package quiz;

import java.util.Random;

public class B12�ٽú���_GCD {
	/*
	�������� ������ �� ������ �ִ� ������� ���غ�����. 
	���μ� (������� 1���� �� �� �̻��� �ڿ���)
	�ִ����� ���ϴ� �� 
	1. ������� ������ �� 
	2. ���� �̿�
	�� ��¥ ��į ���ƹ����ڳ׳׿��������Ŀ�������������������������������
	 */
	public static void main(String[] args) {
	/*
		//��Ǯ��. �� �� Ǯ����
		int num1 = (int) (Math.random() * 100 + 1);
		int num2 = (int) (Math.random() * 100 + 1);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		String n1 = "";
		for (int i = 1; i < 9; ++i) {
			if (num1 % i == 0) {
				System.out.println(i);
				String chI = "" + i;
				n1 += chI;
			}
		}
		System.out.println("n1 : " + n1);
		System.out.println("______________");

		System.out.println("num2 : " + num2);
		String n2 = "";
		for (int j = 1; j < 9; ++j) {
			if (num2 % j == 0) {
				System.out.println(j);
				String chj = "" + j;
				n2 += chj;
			}
		}
		System.out.println("n2 : " + n2);
*/	

//		###	���� ab ���ϱ� ver.1	### 
		//Integer.MAX_VALUE : ������ �ִ밪. (4byte������ �ִ� �����)
		//�ִ������� ���� �� ������ ������ ����� ������ ��� ���� �ѵ� �̰� �ϴ� ����� ������.  
		//int a = (int)(Math.random() * Integer.MAX_VALUE); //�츮�� ���� �� �ִ� �ִ� ������ 
		//int b =  (int)(Math.random() * Integer.MAX_VALUE);
		//������ 20������ �ʿ䰡 ���� �� �����ʺ��� �������� ��.

//		###	���� ab���ϱ� ver.2	###
/*		//�ƴϸ� RandomŬ���� �����ؼ� �ϴµ� 
		//�̷��� �ϸ� ������ ������ ��. �ٵ� �Ʒ� �Ŀ��� ������ ������� �� ������ ��. �׷��� ���� Integer.MAX_VALUE �̿��ϴ°� ����. 
		Random ran = new Random();
		int a = ran.nextInt();
		int b = ran.nextInt();
		//�ƴϸ� int b = Math.abs(ran.nextInt()); �̷��� ���밪�� ����������� ��. 
*/		
		int a = 88;
		int b = 72;
		//	###	a �� b �� ���� �� ũ�� ������ ���ϱ�	ver.1	###
		int min;
		//min = Math.min(a, b); �Լ��� ���ų� 
		
		if(a>b) {
			min = b;
		} else {
			min = a;
		}
		
		//�ƴϸ� ���׿����ڸ� ���� ��������
		//min = a > b ? b : a;
		
		int gcd = 1;
		for(int i= min; i > 0; --i) {
			if(a % i == 0 && b % i == 0) { //�� �� �׷���.. ������ ���� ������ �������°� ������ϱ�.. i�� ���� ��������...
				gcd = i;
				break;
			}
		}
		System.out.printf("%d �� %d�� �ִ� ������� %d�Դϴ�.\n", a, b, gcd);
	}	
}		
