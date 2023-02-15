package quiz;

import java.util.Scanner;

public class B03_ScoreToGrade {
	/*
	 점수를 3 개 입력 받으면 평균 점수를 낸 후 평균 점수에 해당하는 등급을 출력해주는 프로그램 
	 1. 과목은 국, 영, 수 
	 2. 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 그 외는 F등급 
	 3. 유효한 점수는 0~100점이다. 유효하지 않은 등급은 F등급 처리
	 4. 평균 점수는 소수 셋째자리에서 반올림하여 기록한다.
	 */
	public static void main(String[] args) {
		/* 내 풀이. 
		 * Scanner sc = new Scanner(System.in); 
		 * int kor, eng, math, sum; 
		 * final double subnum = 3.0; //double로 해줘야 sum/subnum할 때 나머지까지 나옴 double avg;
		 * 
		 * kor= sc.nextInt(); 
		 * eng= sc.nextInt(); 
		 * math= sc.nextInt();
		 * 
		 * sum = kor + eng + math; 
		 * avg = Math.round((sum/subnum)*100)/100.0;
		 * 
		 * System.out.printf("평균 : %.2f점 \n", avg); 
		 * if (avg>100) {
		 * System.out.println("유효하지 않은 등급입니다. F등급"); 
		 * } else if (avg >= 90) {
		 * System.out.println("A등급"); 
		 * } else if (avg >= 80) { 
		 * System.out.println("B등급");
		 * } else if (avg >= 70) { 
		 * System.out.println("C등급"); 
		 * } else if (avg >= 60) {
		 * System.out.println("D등급"); 
		 * } else if (avg >= 0) { 
		 * System.out.println("F등급");
		 * } else { 
		 * System.out.println("유효하지 않은 등급입니다. F등급"); 
		 * }
		 */
		
		// 정답풀이.
		Scanner sc = new Scanner(System.in);
		// 국, 영, 수, 총점, 평균, 등급 을 변수로 만듦.
		int kor, math, eng, total;
		double avg;
		char grade;

		System.out.print("국영수 점수를 입력>>");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt(); // 순서 주의!★

		// 총점과 평균 구하기
		total = (kor + math + eng);
		avg = Math.round(total / 3.0 * 100) / 100.0; // 3으로 나누면 몫으로 정수만 구해버림

		System.out.printf("총점 : %d\t평균 : %.2f\n", total, avg);

		// 등급 구하기
		if (kor < 0 || kor > 100) {
			System.out.println("국어 점수가 유효하지 않습니다.");
			grade = 'F';
		} else if (eng < 0 || eng > 100) {
			System.out.println("영어 점수가 유효하지 않습니다.");
			grade = 'F';
		} else if (math < 0 || math > 100) {
			System.out.println("수학 점수가 유효하지 않습니다.");
			grade = 'F';
		} else if (avg >= 90) { // 위에서 정상인지 아닌지 판단했으니 이제 밑으로 쭉 등급 구하기.
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

		System.out.printf("당신의 등급은 '%c'입니다.", grade); // 마지막에 출력

		/*
		 * 입력한 값이 잘못된 게 2개 이상일 때 뭐가 잘못됐다고 각각표시하고 싶으면 아래처럼. 
		 * boolean cheating = false; 
		 * if (kor<0 || kor>100) { 
		 * System.out.println("국어 점수가 유효하지 않습니다."); 
		 * cheating = true; 
		 * } 
		 * if (eng<0 || eng>100) { 
		 * System.out.println("영어 점수가 유효하지 않습니다.");
		 * cheating = true; 
		 * } 
		 * if (math<0 || math>100) {
		 * System.out.println("수학 점수가 유효하지 않습니다."); 
		 * cheating = true; 
		 * } 
		 * if (cheating) {
		 * System.out.println("프로그램을 강제종료합니다."); 
		 * return; //main함수 종료! 
		 * } 이렇게 해주면 됨.
		 */

	}
}
