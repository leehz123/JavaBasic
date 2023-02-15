package quiz;

import java.util.Arrays;
import java.util.Random;

public class B16세로ver복습_Array2Quiz {
	public static void main(String[] args) {
		Random ran = new Random();

		int[][] numArr = new int[][] { { 1, 1, 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1 },
				{ 1, 1, 1, 1 } };

		// 1. numArr 의 모든 값을 0~100 사이의 랜덤 정수로 바꾸기
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] = ran.nextInt(101); // ran.nextInt(범위=boundary) + 시작값
			}
			System.out.println(Arrays.toString(numArr[i]));
		}

		// 2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균을 출력
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		int size = 0; // 평균값 구하기 위한 크기

		for (int i = 0; i < numArr.length; ++i) {
			int len = numArr[i].length;
			size += len;
			for (int j = 0; j < numArr[i].length; ++j) {
				sum += numArr[i][j];
			}
		}
		System.out.printf("총합 : %d , 평균 : %.2f\n", sum, sum / (double) size); // double로 타입캐스팅 해서 나눠줘야 실수가 구해지죠~~

		// 3. numArr의 각 행row 의 합을 구해서 출력하기
		System.out.println("#####행별 총합#####");
		int maxColumnSize = 0; // numArr의 요소 중 가장 길이가 긴 배열의 길이값

		for (int i = 0; i < numArr.length; ++i) {
			int len = numArr[i].length;
			maxColumnSize = len > maxColumnSize ? len : maxColumnSize;
			// maxColumnSize = Math.max(len, maxColumnSize);
			// 쉽게 쓸 수 있으면 쉽게 쓰기! 신입 개발자들을 위해

			int row_sum = 0; // 이걸 여기서 선언해 주면 fori의 마지막에서 굳이 row_sum = 0; 을 해줄 필요가 없지
			for (int j = 0; j < numArr[i].length; ++j) {
				row_sum += numArr[i][j];
			}
			System.out.printf("%d행의 총합 : %d\n", i, row_sum);
		}

		// 4. numArr의 각 열column의 합을 구해서 출력하기 ★★★★★ 보면 쉬운데 헷갈려서 안 되는 거 
		
		System.out.println("#####열별 총합####");
/*		//ver1. ↓↓↓↓이렇게 흘러가는 방법
		//세로로 접근하다 보면 세번쨰 줄부터는 비어있는 곳이 있음
		//비어 있는 곳을 어떻게 아냐
		System.out.println(maxColumnSize);
		for (int col = 0; col < maxColumnSize; ++col) {     //i j를 쓰지 말고 변수명을 바꿈으로써 혼란을 줄일 수 있다. 
			int colSum = 0;
			for(int row = 0; row < numArr.length; ++row) {
				//System.out.printf("i : %d , j : %d \n", i, j);
				if(col < numArr[row].length) {
					colSum += numArr[row][col];
					System.out.printf("col : %d, row : %d 의 값을 더했습니다 .\n", col, row);
				} else {
					System.out.printf("col : %d, row : %d 에는 값이 존재하지 않습니다...\n", col, row);
				}
			}
			System.out.printf("%d열의 합 : %d\n", col, colSum);
		}
	
		
*/		
		
		//아주 쉬운 방법 ★★★★★★★★★★ 배열을 이용
		//ver2. ---->방향으로 흘러감
		int[] colSum = new int[maxColumnSize];
		
		for(int row = 0; row < numArr.length; ++row) {
			for(int col = 0; col < numArr[row].length; ++col) {
				colSum[col] += numArr[row][col]; //0일떄는 0번방에 들어가고 1일 떄는 1번방에 계속 누적 
			}
		}
		System.out.println(Arrays.toString(colSum));
		//이제 반복문은 여기까지 제일 어려움
		//근데 코테 는 이게 기본 난이도.. 한 초중반?.. 슥 보면 슥 나와야 함
		//각회사 코테 중상급 요구
		//코테볼 거 아니면 이정도만 되도 취업 문제 없음 
	}
}
