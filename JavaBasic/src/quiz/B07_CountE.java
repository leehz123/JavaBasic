package quiz;

import java.util.Scanner;

public class B07_CountE {
	public static void main(String[] args) {
		/*
		����ڰ� ������ �Է� ���� �� �ش� ������ ���ĺ� E�� �� �� �����ϴ��� �˷��ִ� ���α׷��� ����� ������. 
		��ҹ��� ��� ����� �մϴ�. 
		 */
		//���� �� �ձ��� �ڲ� �빮�� ���� ���� ����.. ����!
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�.>>");
		String input = sc.nextLine();
		
		int eCount = 0;
		int uECount = 0;

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'e') {
				++eCount;
				System.out.println(index + 1 + "��° ���ڿ� �ҹ��� e�� �ֽ��ϴ�.");
			} else if (input.charAt(index) == 'E') {
				++uECount;
				System.out.println(index + 1 + "��° ���ڿ� �빮�� E�� �ֽ��ϴ�.");
			}
		}
		System.out.println("________________________________________");
		System.out.println("���ĺ� e�� " + eCount + " �� �����մϴ�.");
		System.out.println("���ĺ� E�� " + uECount + " �� �����մϴ�.");
	
	}
}
