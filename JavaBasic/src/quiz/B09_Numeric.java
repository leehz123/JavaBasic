package quiz;

import java.util.Scanner;

public class B09_Numeric {
	/*
	����ڰ� � ���ڿ��� �Է����� ��
	�ش� �ܾ ��� ���ڷθ� �����Ǿ� �ִ��� �˻��Ͻÿ�. 
	 */
	public static void main(String[] args) {
//		�� Ǯ��. (�����߱�����)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڷθ� ������ ���ڿ��� �Է��Ͻÿ�.>>");
//		String input = sc.next();
//		
//		int cnt = 0;
//		
//		for (int index = 0; index < input.length(); ++index) {
//			if (input.charAt(index) >= '0' && input.charAt(index) <= '9') {
//				continue;
//			} else {
//				System.out.printf("%d��° ���ڴ� ���ڰ� �ƴմϴ�.\n", index);
//			}
//		}
//		
//		 
//		if (cnt == input.length()) {
//			System.out.printf("�Է��� %s�� ��� ���ڷ� ���� �� �ֽ��ϴ�. ", input);
//		} else {
//			System.out.printf("�Է��� %s�� ��� ���ڷ� ���� �� ���� �ʽ��ϴ�. ", input);
//		}

		
		//���� Ǯ��. 
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("�ƹ��ų� �Է�>>");
		input = sc.next();
		
		boolean numbersOnly = true;
		
		for(int i=0; i<input.length();++i) {
			char ch = input.charAt(i);
			//���ڰ� �ƴ� ���ڰ� �߰ߵȴٸ� false�� �ٲٰ� �ݺ��� �ߴ�. 
			if (ch <'0' || ch<'9') {
				numbersOnly = false;
				break;
			}		
		} 
		System.out.println("���ڷθ� �̷���� �ֳ���?>>" + numbersOnly);
		
	}
}
