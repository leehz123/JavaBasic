package quiz;

public class B11����_WhileQuiz {
	public static void main(String[] args) {

		// while���� ����Ͽ� ������ ���Ͻÿ�.

		// 1. 500���� 1200 ���̿� �ִ� ��� 3�� ����� ����. (���� ����)
		int i = 500;
		int sum = 0;

		while (i <= 1200) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("Q1. " + sum);

		System.out.println("________________________________________");

		// 2. 30���� 1���� �� �ٿ� ���ڸ� 5���� ���.
		i = 30;
		int cnt = 0;
		while (i > 0) { // ��while���� ���ǽĿ� ���� �ִ� �� �� ���� ����. �򰥷���. �ٵ� ������ ���� ��. ������ Ư�� ���� ����.
			System.out.printf("%-5d", i);
			if (i % 5 == 1) { //6��°���ڰ� �ٹٲ� �������� �ϴϱ�.�� 
				System.out.println();
			}
			--i;
		}
		System.out.println("________________________________________");

		// 3. 1���� 200���� ���� �߿� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����.
		i = 1;
		sum = 0;
		while (i <= 200) {

			if ((i % 2 != 0) && (i % 3 != 0)) {
				sum += i;
			}
			i++;
		}
		System.out.printf("Q3. %d", sum);
	

	}
}
