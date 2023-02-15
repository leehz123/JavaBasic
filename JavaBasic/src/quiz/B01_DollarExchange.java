package quiz;

import java.util.Scanner;

public class B01_DollarExchange {
	public static void main(String[] args) {
		System.out.println("달러$를 입력하시오.");
		Scanner scanner = new Scanner(System.in);

		double dollar = scanner.nextDouble();

		double exRate, dollToWon;

		exRate = 1224.60;
		dollToWon = dollar * exRate;

		System.out.println(dollToWon + "원");

		// ----------------------------답안-----------------------------

		Scanner sc = new Scanner(System.in);
		double usd, krw; // krw는 소수부 잘라주는 메소드 나중에 배우면 int로 하기

		System.out.println("달러 >>");
		usd = sc.nextDouble(); // next메소드 쓰면 입력이 들어오지 않을 떄 프로그램이 일단 정지한다는 것 기억하기
		krw = usd * 1224.60;

		System.out.printf("%.2f 달러는 한국 돈으로 %.0f원 입니다.\n", usd, krw);

	}
}
