package quiz;

import java.util.Scanner;

public class B03_ScoreToGrade {
	/*
	 ������ 3 �� �Է� ������ ��� ������ �� �� ��� ������ �ش��ϴ� ����� ������ִ� ���α׷� 
	 1. ������ ��, ��, �� 
	 2. 90�� �̻��� A, 80�� �̻��� B, 70�� �̻��� C, �� �ܴ� F��� 
	 3. ��ȿ�� ������ 0~100���̴�. ��ȿ���� ���� ����� F��� ó��
	 4. ��� ������ �Ҽ� ��°�ڸ����� �ݿø��Ͽ� ����Ѵ�.
	 */
	public static void main(String[] args) {
		/* �� Ǯ��. 
		 * Scanner sc = new Scanner(System.in); 
		 * int kor, eng, math, sum; 
		 * final double subnum = 3.0; //double�� ����� sum/subnum�� �� ���������� ���� double avg;
		 * 
		 * kor= sc.nextInt(); 
		 * eng= sc.nextInt(); 
		 * math= sc.nextInt();
		 * 
		 * sum = kor + eng + math; 
		 * avg = Math.round((sum/subnum)*100)/100.0;
		 * 
		 * System.out.printf("��� : %.2f�� \n", avg); 
		 * if (avg>100) {
		 * System.out.println("��ȿ���� ���� ����Դϴ�. F���"); 
		 * } else if (avg >= 90) {
		 * System.out.println("A���"); 
		 * } else if (avg >= 80) { 
		 * System.out.println("B���");
		 * } else if (avg >= 70) { 
		 * System.out.println("C���"); 
		 * } else if (avg >= 60) {
		 * System.out.println("D���"); 
		 * } else if (avg >= 0) { 
		 * System.out.println("F���");
		 * } else { 
		 * System.out.println("��ȿ���� ���� ����Դϴ�. F���"); 
		 * }
		 */
		
		// ����Ǯ��.
		Scanner sc = new Scanner(System.in);
		// ��, ��, ��, ����, ���, ��� �� ������ ����.
		int kor, math, eng, total;
		double avg;
		char grade;

		System.out.print("������ ������ �Է�>>");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt(); // ���� ����!��

		// ������ ��� ���ϱ�
		total = (kor + math + eng);
		avg = Math.round(total / 3.0 * 100) / 100.0; // 3���� ������ ������ ������ ���ع���

		System.out.printf("���� : %d\t��� : %.2f\n", total, avg);

		// ��� ���ϱ�
		if (kor < 0 || kor > 100) {
			System.out.println("���� ������ ��ȿ���� �ʽ��ϴ�.");
			grade = 'F';
		} else if (eng < 0 || eng > 100) {
			System.out.println("���� ������ ��ȿ���� �ʽ��ϴ�.");
			grade = 'F';
		} else if (math < 0 || math > 100) {
			System.out.println("���� ������ ��ȿ���� �ʽ��ϴ�.");
			grade = 'F';
		} else if (avg >= 90) { // ������ �������� �ƴ��� �Ǵ������� ���� ������ �� ��� ���ϱ�.
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.printf("����� ����� '%c'�Դϴ�.", grade); // �������� ���

		/*
		 * �Է��� ���� �߸��� �� 2�� �̻��� �� ���� �߸��ƴٰ� ����ǥ���ϰ� ������ �Ʒ�ó��. 
		 * boolean cheating = false; 
		 * if (kor<0 || kor>100) { 
		 * System.out.println("���� ������ ��ȿ���� �ʽ��ϴ�."); 
		 * cheating = true; 
		 * } 
		 * if (eng<0 || eng>100) { 
		 * System.out.println("���� ������ ��ȿ���� �ʽ��ϴ�.");
		 * cheating = true; 
		 * } 
		 * if (math<0 || math>100) {
		 * System.out.println("���� ������ ��ȿ���� �ʽ��ϴ�."); 
		 * cheating = true; 
		 * } 
		 * if (cheating) {
		 * System.out.println("���α׷��� ���������մϴ�."); 
		 * return; //main�Լ� ����! 
		 * } �̷��� ���ָ� ��.
		 */

	}
}
