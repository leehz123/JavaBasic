
public class B02_Operator2 {
	/*
	 # �� ������ -�� ���� ���ϴ� ���� -�� ������ ����� �׻� ��(true) �Ǵ� ����(false)�̴�. = �񱳿����� �����
	 BooleanŸ�� -�������� �񱳿����� �Բ� ������ ��������� ���� ����Ѵ�.
	  
	 # �� ������ -true�� false �� booleanŸ���� ������ �ϴ� ���� &&: �� ���� ��� true�� �� true (and����)
	 || : �� �� �ϳ��� true���� true (or����) ! : true�� false, false�� true. ���� (not ����) 
	 */
	public static void main(String[] args) {
		int a = 10, b = 7;

		char ch1 = 'A';
		char ch2 = 'K'; // ������ �ڵ尪~!�� �������

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b); // �� ���� ������ true
		System.out.println(a != b);// �� ���� �ٸ��� true

		System.out.println(a + 15 == 15);
		// ���⼭ �������κп� ��ȣ�� ������ �ʾƵ� ������ �켱������ ���� a+15�� ���� ����

		System.out.println(a % 3 != 0);

		System.out.println("#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("#### NOT ####");
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("##�񱳿����� ���� boolean���� Ȱ��##");
		a = 95;
		System.out.println(a < 100 && a % 5 == 0);

	}
}
