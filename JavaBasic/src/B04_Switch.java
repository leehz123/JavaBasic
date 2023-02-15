
public class B04_Switch {
	/*
	 # switch-case�� 
	 ()���� ���� ����� ���� ������ �ڵ带 �����ϴ� ���� 
	 ()�ȿ� booleanŸ�� ��� �ٸ� Ÿ���� ���
	 if������ �Ϻ��ϰ� ��ü�� �� �ֱ� ������ ���� ��������� �ʴ´�. 
	 break�� ������ break�� ���� ������ �������鼭 ��� case�� �����Ѵ�. (break: �� �ؿ��� �������� �����? �˰ھ�~) 
	 , �� ����� �ϳ��� ���̽��� ���� ���� �߰��� �� �ִ�. >> ??? ���� �ȵ� �����ɷ� �ϱ� case 3: case 4: case 5: �̷��� �����ϱ�.
	 default:�� if���� else ���� ������ �Ѵ�. 
	 ������ �ϳ��� ���� �� �Ǹ� default�� �����.
	 */
	public static void main(String[] args) {
		int num = 23;
		switch (num) {
		case 0:
			System.out.println("num�� 0�Դϴ�.");
			break;
		case 1:
			System.out.println("num�� 1�Դϴ�.");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("num�� 2 or 3 or 4�Դϴ�.");
			break;
		default:
			System.out.println("���� case�� ��� �ش����� �ʾ� ����˴ϴ�.");
			break;
		}

	}
}
