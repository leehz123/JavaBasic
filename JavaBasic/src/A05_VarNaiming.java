
public class A05_VarNaiming {
	/*
	 # �츮�� ������ ����ϴ� ���� 
	 1. ���� �ѹ��� ������ �� �ִ�.(������ ����� ���� �̸� �����صΰ� ������ �� �ִ�.) 
	 2. �������� ���� �� �ִ�.
	 
	 # ������ �۸��Ģ (����) 
	 1. �� �ܾ� �̻��� �̾���� �������� ����� �� _�� Ȱ���Ѵ�. (snake_case)_c���� ��ȣ
	 	apple_price, apple_weight, fav_movie 
	 2. �� �ܾ� �̻��� �̾���� �������� ����� �� �빮�ڸ� Ȱ���Ѵ�. (camelCase)_java���� ��ȣ 
		applePrice, appleWeight, favMovie
	3. �������� ù ���ڴ� �ҹ��ڸ� ����ؾ� �Ѵ�. 
	4. Ư�� ������ ���̳� ���α׷� ������ ������ ���� ������ ��� �빮�ڸ� ���. 
		MAX_APPLE_COUNT, MAX_PERCHASE_QTY, PI 
	5. Ŭ�������� ù ���ڴ� �빮�ڸ� ����Ѵ�. 
	6. ��Ű������ ��� �ҹ��ڸ� ����ؾ� �Ѵ�. 
	7. �ش� ������ ������ ���� �ľ��� �� �ִ� �ܾ ���������� ����ؾ� �Ѵ�. 
	 
	# ������ �۸��Ģ (�ʼ�) 
	1. ������ ù ��° ���ڴ� ���ڸ� ����� �� ����. 
		4pple, 7eleven, 1st 
	2. ������ ���̿��� ������ ����� �� ����. 
	3. Ư�����ڴ� _�� $������� �� �ִ�. 
		$_apple, $uperman, 
	4. �̹� �ڹٿ��� ����ϰ� �ִ� Ű����(�����)���� ���������� ����� �� ����. (Eclipse������ ���� ��������� ǥ��) 
		public, static, void, int, double, float 5.
	 */
	public static void main(String[] args) {
		int apple = 15;
		int apple_weight = 567;
		double apple_price = 123.33;

		// �ѱ۵� ���������� ����� ���� �ִµ� �����ϴ� ���� �� ����
		int ��� = 123;

		System.out.println("����� ���� : " + apple);
		System.out.println("����� �� ����(g) : " + apple * apple_weight);
		System.out.println("����� �� ����(won) : " + apple * apple_price);

		int String = 10;
		System.out.println(String);
		String str = "No"; // ������ ���������ص� ����� �� ����
		// �ٵ� �̷��� ��������
	}
}
