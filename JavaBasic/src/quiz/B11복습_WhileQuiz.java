package quiz;

public class B11복습_WhileQuiz {
	public static void main(String[] args) {

		// while문만 사용하여 다음을 구하시오.

		// 1. 500부터 1200 사이에 있는 모든 3의 배수의 통합. (범위 포함)
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

		// 2. 30부터 1까지 한 줄에 숫자를 5개씩 출력.
		i = 30;
		int cnt = 0;
		while (i > 0) { // ★while문의 조건식에 증감 넣는 건 잘 쓰지 않음. 헷갈려서. 근데 후위는 가끔 씀. 전위는 특히 쓰지 말기.
			System.out.printf("%-5d", i);
			if (i % 5 == 1) { //6번째글자가 줄바뀌어서 내려가야 하니까.★ 
				System.out.println();
			}
			--i;
		}
		System.out.println("________________________________________");

		// 3. 1부터 200까지 숫자 중에 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합.
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
