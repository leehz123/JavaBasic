package quiz;

import java.util.Scanner;

public class B01_CelToFahr {
	public static void main(String[] args) {
		System.out.println("�����ɿµ��� �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		double cel = scanner.nextDouble();
		
		System.out.printf("%.2f�ɴ� %.2f���Դϴ�.", cel, (cel*1.8)+32);
		
		//----------------------------���-----------------------------
		/*
		 double cel = new Scanner(System.in).nextDouble(); //�̷��� �ϸ� �ѹ� ���� ������ ��ĳ�ʰ� ��.
		 ���࿡ �Է��� ��� �������� ������ ��ƾ� ��. 
		 double fahr = (cel*9/5)+32;
		 System.out.printf("���� %.1f�ɴ� ȭ�� %.1f���Դϴ�.\n", cel, fahr);
		  
		 //�׷��� �Ʒ�ó�� �ϱ�~ 
		 Scanner sc = new Scanner(System.in); 
		 double cel, fahr;
		 
		 cel = sc.nextDouble(); fahr = (cel*9/5)+32; 
		 System.out.printf("���� %.1f�ɴ� ȭ�� %.1f���Դϴ�.\n", cel, fahr);
		 */
	}
}



