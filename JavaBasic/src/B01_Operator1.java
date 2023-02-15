
public class B01_Operator1 {
	/*
	 # ������(Operator) 
	 - ����� �� ���. 
	 - +,-, *, /, %, >, =>, ...
	
	 # : ���������, + : ���ϱ�, - : ����, * : ���ϱ�, / : ������, % : ������	 
	 */
	public static void main(String[] args) {
		int a = 33, b = 8;
		double c = 33, d = 8;

		System.out.println("a + b : " + a + b);
		// ��ȣ�� �� �ļ� 338
		System.out.println("a + b : " + (a + b));
		// ����� �Ƿ��� ��ȣ�� �ļ� �켱������ ��������� �Ѵ�.
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		// ���� ������ ������ �ϸ� �����κ��� �� ��������. (�Ҽ��� ���ڸ��� ����)
		System.out.println("a / b : " + a / b);

		// ������ �Ǽ��� ������ ���� �ϸ� ����� �Ǽ��̰�, �Ҽ��� ���ڸ����� ��Ȯ�� ���� ��������.
		System.out.println("c/b :" + c / b);
		System.out.println("a/d :" + a / d);
		System.out.println("c/d :" + c / d);
		// ������ ����
		System.out.println("a % b : " + a % b);

		// n���� ���� �������� 0���� n-1���� �ۿ� ���� �� ����.
		System.out.println("19 % 10 : " + 19 % 10);
		System.out.println("20 % 10 : " + 20 % 10);
		System.out.println("21 % 10 : " + 21 % 10);
		System.out.println("22 % 10 : " + 22 % 10);
		// ������ ������ ���� ��ȯ��ų �� ���.

		// Math.pow(a,b) : a���� b�� ��ȯ�Ѵ�.
		System.out.println(Math.pow(2, 10));

		System.out.println(2 ^ 10); 
		// ��Ʈ����(�״� �� �߿�)�� XOR���� (Exclusive or). �̷��� �ϸ� 2�� 10�� �� ���� ����.

		// Math.sqrt(a) : a�� �������� ���ؼ� ��ȯ�Ѵ�.
		System.out.println(Math.sqrt(2));

		// Math.abs(a) : a�� ���밪�� ��ȯ�Ѵ�.
		System.out.println(Math.abs(11));
		System.out.println(Math.abs(-11));

		// Math.round(a) : a�� �Ҽ� ù° �ڸ����� �ݿø��� ����� ��ȯ�Ѵ�.

		System.out.println(Math.round(123.555));

		// '��ȯ�Ѵ�'?
		double result = Math.round(123.555); // Math.round()�� ����� ��ȯ ��.
		// double result = System.out.println("abc"); //println�� ����� ���� ��ȯ�� �������� ����.

		// Math.round�� ���ϴ� �ڸ������� �ݿø��� �� �ִ�.
		double value = 123.77777777;
		System.out.println(value);
		// �ټ���° �ڸ����� �ݿø� �ϰ� ���� �� �ټ���° �ڸ��� �Ҽ� ù��° �ڸ��� ������ش�.
		System.out.println(Math.round(value * 10000) / 10000.0);
		//Math.round()�� ���� ���������� ��ȯ. �׷��� �Ҽ��� �ڸ��� ����� ���ϰ� ������ �������� �Ǽ��� ���� �������ָ� ��. 
		// �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù��° �ڸ��� ���� Math.round()�� ������ �� �ٽ� ������
		
	}
}
