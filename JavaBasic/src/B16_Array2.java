

public class B16_Array2 {
/*
 배열 안에 배열을 넣을 수 있다. (배열로 이루어진 배열을 만들 수 있다.)
 
 */
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		//인덱스를 통해 인트에 접근
		int[][] numbers2 = {numbers, numbers, numbers, numbers};
		//인덱스를 통해 인덱스 배열에 접근
		
		System.out.println(numbers2[0]); //0번째 위치의 int[]을 가리킴
		System.out.println(numbers2[0][0]); //0번째 위치 int[]의 0번째 요소를 가리킴
		
		numbers2[0][2] = 33;
		System.out.println(numbers2[0][2]); //바꾼 33이 나와야
		System.out.println(numbers2[3][2]); //3? 33? >> 33이 나옴
		//결국 numbers배열에 접근해 값을 바꾸는 거니까!
		System.out.println(numbers2[1][2]);
		System.out.println(numbers2[2][2]);
		System.out.println();
		
		
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);  //다 똑같은 주소가 나옴. 배열의 시작 주소!
		
/*		int[][] numbers2 = {numbers, {1, 2, 3, 4, 5}, numbers, numbers};
		이렇게 바꾸면
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]); //얘만 주소가 달라짐
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		
		System.out.println(numbers2[0][2]);
		System.out.println(numbers2[3][2]); 
		System.out.println(numbers2[1][2]); //얘 혼자 값이 다름! 가리키는 위치가 다르니까 
		System.out.println(numbers2[2][2]);
*/

/*
n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
근데 n차원 배열은 잘 쓰지 x. 많이 써봤자 2차원.  
 */
		char[][] chs= {
			{'a', 'b', 'c', 'd'},
			"Hello, world".toCharArray(),   //이런 것도 집어넣을 수 있겠지
			"I have a dream".toCharArray(), //얘네 둘은 문자 개수가 다름
			{'x', 'y'}
		};
		
//		char[][][] today_chat_log = {
//				chs,
//				chs2,
//				chs3
//		}
//		char[][][] today_chat_log = {
//				today_chat_log,
//				yesterday_chat_log,
//				tommorow_chat_log
//		}
		
		for (int i = 0; i < chs.length; ++i) {
			char[] arr = chs[i];
			System.out.println(arr); //배열을 하나씩 꺼냄
			for (int j = 0; j < chs[i].length; ++j) {
				System.out.printf("chs[%d][%d] : %c\n", i, j, chs[i][j]);
			}
		} 
		
		
		
		
		
		
		
	}
}
