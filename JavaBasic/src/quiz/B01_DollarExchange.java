package quiz;

import java.util.Scanner;

public class B01_DollarExchange {
	public static void main(String[] args) {
		System.out.println("�޷�$�� �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);

		double dollar = scanner.nextDouble();

		double exRate, dollToWon;

		exRate = 1224.60;
		dollToWon = dollar * exRate;

		System.out.println(dollToWon + "��");

		// ----------------------------���-----------------------------

		Scanner sc = new Scanner(System.in);
		double usd, krw; // krw�� �Ҽ��� �߶��ִ� �޼ҵ� ���߿� ���� int�� �ϱ�

		System.out.println("�޷� >>");
		usd = sc.nextDouble(); // next�޼ҵ� ���� �Է��� ������ ���� �� ���α׷��� �ϴ� �����Ѵٴ� �� ����ϱ�
		krw = usd * 1224.60;

		System.out.printf("%.2f �޷��� �ѱ� ������ %.0f�� �Դϴ�.\n", usd, krw);

	}
}
