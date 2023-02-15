package quiz;

public class B15_RandomScore {

	public static void main(String[] args) {
		//1. 학생 100명의 점수(0~100)를 랜덤으로 생성하여 배열에 저장. 
		int[] score = new int[100];
		for (int i = 0; i < score.length; ++i) {
			score[i] = (int)(Math.random() * 101);
		}
		System.out.println();
		System.out.println("___________________");
		
		//2. 배열에 저장된 값을 보기 좋은 형태로 출력
		for (int i = 0 ; i < score.length; ++i) {
			System.out.println("┌─────┐");
			System.out.printf ("│ %3d │\n", score[i]);
			System.out.println("└─────┘");
			
			if(i % 10 == 9 && i != 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("___________________");
		// 3. 모든 학생들의 평균 점수를 출력 (소수 둘째 자리까지 출력)
		int sum = 0;
		for (int i = 0; i < 100; ++i) {
			sum += score[i];
		}
		
		System.out.printf("총점 : %d, 평균 : %.2f \n", sum, sum / 100.0);
		//아 저렇게 걍 바로 sum/100.0바로 printf()에 써줬구나
		
		System.out.println();
		System.out.println("___________________");
		
		// 4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
		int min = score[0];
		int max = score[0];
	
		//나는 temp_min이랑 temp_max 변수 따로 만들어서 썼는데 굳이 넣을 필요 없었음!	
		for(int i = 0; i<score.length; ++i) {	
			min = min <= score[i] ? min : score[i];
			max = max >= score[i] ? max : score[i];
			/*
			 if문으로 해보면
			 if (best < score[i]) {
			 	best = score[i];
			 } 이렇게 100번 반복하면 점수가 제일 높은 애가 남아 있을 것. 
			 >> 이걸 삼항으로 적으면
			 best = best < score[i] ? score[i] : best;
			 
			 if (worst > score[i]) {
			 	worst = score[i];
			 }
			 >> 이걸 삼항으로 적으면
			 worst = worst > score[i] ? score[i] : worst;
			 
			 그런데 여기서는 int worst를 0으로 초기화 하면 값이 이상하게 나옴. 0보다 작은 점수는 없으니까!
			 그래서 int worst = 100;으로 처음에 100으로 초기화 해줘야 함. 
			 int best = 0; 
			 int worst = 100; 이렇게
			 */
			
		}
		
		System.out.printf("최소값 : %d , 최대값 : %d\n", min, max);
		
		System.out.println();

		
		
	}
}
