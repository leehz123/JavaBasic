package quiz;

import java.util.Scanner;

public class B11����_Count369 {
	/*
	����ڷκ��� ������ �ϳ� �Է¹ް� 
	�ش� ���ڱ��� 369������ ����ȴٸ� �ڼ��� �� �� �� �ľ� �ϴ��� ����غ�����. 
	��Ʈ: ���ڸ��� ��� �ϱ�. 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		while(true) {
			System.out.println("���� �Է� >>");
			num = sc.nextLine();
			boolean numeric = true;
			
			for (int i =0; i < num.length(); ++i) {
				char ch = num.charAt(i);
				if(!(ch >= 0 && ch <='9')) {
					numeric = false;
					break;
				}
			}
			if (numeric) {
				break;
			}
			System.out.println("�ٽ� �Է�");
		}
		
		//���ڷθ� �� ���ڿ��� ������. 
		//�� �ٵ� ��� �� ��� �� Integer.parseInt() ��� �ؼ� �ϴ� ����
		
		
		
		
		
		
	
	}
}
