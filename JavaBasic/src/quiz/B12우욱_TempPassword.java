package quiz;

public class B12���_TempPassword {
	//���� ���̴� ���!!!�ڡڡڡڡ�
	public static void main(String[] args) {
/*
6�ڸ��� ���� �ӽ� ��й�ȣ�� �����ϴ� ���α׷��� ����� ������. 
(��й�ȣ�� �����ϴ� ���� = ����, ����, Ư��)
��� ������ Ư������
! " # $ & ' ( ) ... ~ \

 */
		//(int)(Math.random() * ? + ? );
		
//		System.out.println((int)'A');
//		int n = 92 - 32;
//		System.out.println(n);
		//A-Z = 65 ~ 90
/*	
		//�� Ǯ��....���ѵ�
		char u_letter = (char)( Math.random() * 26 + 65 );
		char l_letter = (char)( Math.random() * 27 + 97 );
		char s_letter = (char) (Math.random() * 60 + 33 );
		
		for(int i = 0; i <6 ; i++) {
			int randomV = (int)(Math.random() * 3 + 1);
			switch(randomV) {
			case 1: 
				System.out.println(u_letter);
				break;
			case 2:
				System.out.println(l_letter);
				break;
			case 3:
				System.out.println(s_letter);
				break;
			}
		}		
*/		
	
		//�ƽ�Ű �ڵ� ǥ ���� Ǯ���� �������� ������ ������..
		String symbols = "abcdefghijklmnopqrstuvwxyz"
						+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
						+ "0123456789"
						+ "!\"#$%^&'()+,-./:;<=>@[]^_'{|}~\\";
		//�̷��Ա��� �밡�� �Ѵٰ�? ������ ������ ���
							
		System.out.println(symbols);
		System.out.println(symbols.length()); //�� 93���� ����
		
		String temp_password = "";
		
		//temp_password�� 0~5���� �ϳ��ϳ� �������ڸ� �̾Ƽ� �־��� ����. 
		for(int i = 0; i < 6; ++i) {
			int random_index = (int)(Math.random() * symbols.length()); 
			//�ε����� 0���� �����̴ϱ� ���� �� ������ �ʿ� ����. 
			char random_char = symbols.charAt(random_index);
			//������ ���� ���� �ε����� ���� char ���ؼ� 
			temp_password += random_char;
			//�������� �߰� �߰� �߰� �߰� ..6��
			
		}
		
		System.out.println("������ �ӽ� ��й�ȣ : " + temp_password);
	}
}
