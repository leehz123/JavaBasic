
public class B14_Operator4 {
/*
 # ���׿�����
 �� ? �� : �ƴϿ�;
 ���� ����� true�̸� ������ ���� ����Ѵ�.
 ���� ����� false��� �������� ���� ����Ѵ�. 
 
 */
	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println(ch>= 'a' && ch <= 'z' ? "�ҹ����Դϴ�.": "�빮���Դϴ�." );
		
		int apple =11;
		int basket = apple % 10 == 0 ? apple % 10 : apple % 10 + 1;
		System.out.printf("�ʿ��� �ٱ����� ������ %d �� �Դϴ�.\n", basket);
	}

}
