package quiz;

import java.util.Scanner;
	//���ڿ��� Ǫ�� ��.
	//�� �ǿܷ� ����.. �� ���� �����Ÿ��� �Ϥ��� �־��� �� 
public class B11_Count369_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է�>>");
		int num = sc.nextInt();
		int clap = 0;
		
		for(int i = 1; i <= num ; ++i) {
			System.out.printf("%d : ", i);
			
			//i�� ��� �ִ� ���ڸ� ���ڿ��� ��ȯ�ؼ� ���ڿ� ���� numStr�� �־��ֱ�
			String numStr = "" + i; //�ش� ���ڸ� �ϳ��� ���ڿ��� �ٲ��ֱ�. (���ڿ� + ���� = ���ڿ�)
			
			//���ڿ������� �� ���� numStr�� �� ���ھ� ������ charAt(i)�� ��
			for(int j= 0; j < numStr.length(); ++j) {
				char ch = numStr .charAt(j);
				if(ch == '3' || ch == '6' || ch == '9') {
					System.out.print("¦");
					++clap;
				} 
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
