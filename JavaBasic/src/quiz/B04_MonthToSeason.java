package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	/*
	 ����ڷκ��� ����� �Է¹����� �ش� ������ ����ϴ� ���α׷� (�ݵ�� switch-case���� ����� ��)
	 */
	public static void main(String[] args) {
/*
 �� Ǯ��. 
 Scanner sc = new Scanner(System.in);
 int month = sc.nextInt();
String season;

switch(month) {
case 12: case  1: case 2:
	System.out.println("�ܿ�");
	break;
case 3: case 4: case 5:
	System.out.println("��");
	break;
case 6: case 7: case 8:
	System.out.println("����");
	break;
case 9: case 10: case 11:
	System.out.println("����");
	break;
default:
	System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	break;

}
 */
		
		//���� Ǯ��.
		int month = new Scanner(System.in).nextInt();
		String season;
		
		switch(month) { //�ڡ��̷��� �ٷ� �־��൵ ��!
		
		case 12: case  1: case 2:
			season = "�ܿ�";
			break;
		case 3: case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
			break;
		default:
			season = "��";
			break;
		}
		System.out.printf("%d���� [%s]�� �Դϴ�. \n", month, season);
		
		
		
	}
}
