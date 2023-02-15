package quiz;

import java.util.Scanner;

public class B10극뽁_Prime {
	/*
	 사용자로부터 숫자를 입력 받으면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보시오. 
	 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수. 1 제외. 그리고 소수는 양수에만 존재
	 2,3,5,7,11,13,17,19...
	 사용자가 음수를 입력하는 경우 다시 제대로 입력하게 만들기
	 */
	public static void main(String[] args) {
		/*		
				Scanner sc = new Scanner(System.in);
				
				for(;;) {
					System.out.print("양의 정수를 입력하시오.>>");
					int input = sc.nextInt();
		*/
		// 소수인지 아닌지 어떻게 구별? >> 1로 나누어떨어진다 && 자기자신으로 나누어 떨어진다
		// 근데 중간에 이상한 수로 나누어 떨어지는 건 어떻게 거르지?
//			for문으로 1~자기자신 까지 ++하면서 
//			아 첫번째 조건 1로 나누어떨어진다 && 자기자신으로 떨어진다. 
//			    true일 때 for문 (2~자기자신-1까지 ++) cnt세서 1 이상이면 탈락
		/*			    
					if(input < 0) {
						System.out.println("입력값을 잘못 입력하셨습니다.");
					} else {
						for(int i=2; i<input-1; i++) {
							
						}
					}
		*/

// 정답풀이.
		Scanner sc = new Scanner(System.in);

		int num;
		/*
				System.out.println("2이상의 숫자를 입력해주세요>>");
				// for문을 이렇게도 쓸 수 있다. (잘 쓰진 않는 방법)
				for (int num = sc.nextInt(); num < 2; num = sc.nextInt()) {
					System.out.println("다시 입력해주세요" + num);
					System.out.println("2이상의 숫자를 입력해주세요>>");
				}
				System.out.println("숫자가 제대로 입력되었습니다." + num);
		*/
		// 아니면 break문 활용해서 .. 이쪽이 좀 더 보기에는 좋음
		for (;;) {
			System.out.println("2이상의 숫자를 입력해주세요>>");
			num = sc.nextInt();
			if (num > 2) {
				System.out.println("잘 하셨습니다.");
				break;
			}
			System.out.println("다시 입력해주세요.");
		}
        //어라 근데 이 식으로 2가 소수라고 나오면 안 되는 거 아니야? 2%2는 0이라 ++cnt될텐데..?????????????????
		//아 안쪽 for문의 test<i 때문에 안쪽 for문의 문장들이 실행되지 않음!!!
		for (int i = 2; i <= num; ++i) {
			int cnt = 0;
			for (int test = 2; test < i; ++test) {// 1과 자기자신을 포함해서 0이라는 건 1과 자기자신을 안 세면 0이라는 거니까.
				if (i % test == 0) {
					++cnt;
					break;
				}
			}
			if (cnt == 0) {
				System.out.printf("%d는 소수입니다.\n", i);
			}

		}

		// 소수인지 구하는 방법 2 가지
		// 1. 1부터 자기 자신까지 나눴을 때 약수가 2개라면 소수다
		// 2. 2부터 자기 자신 바로 전까지 나눴을 때 약수가 0개라면 소수다.
		// 3. 2부터 해당숫자의 제곱근까지 나눴을 떄 약수가 0개라면 소수다.

		// 근데 만약 100이 소수인지 아닌지 구하라 하면? 그 중간의 수를 모두 해봐야 하는 거?
		// 규칙을 찾아보면 1, 2, 4, 5, 10, 20, 25, 50, 100 1*100 =100, 2*50=100, .. 이니까
		// 중간인 10까지만 구해봐도 됨. 10은 루트 100

//		for (int test = 2; test <= Math.sqrt(i); ++test) {
//			이렇게만 해도 된다는 거 !!!
//		} 근데 이렇게 for문을 돌렸을 때의 문제점은 올 때마다 Math.sqrt(i)를 다시 계산하게 된다는 것.

		// 계산을 한번만 할 수 있는 방법은 들어오기 전에 계산하는 것
		/*
		 * 
		for ( int i = 2; i <= inout; ++i) {
			double sqrt = Math.sqrt(i);
			boolean prime = true;
			for (int test = 2; test <= Math.sqrt(i) ; ++test) {
				if (i % test == 0) {
					prime = false;
					break;
				}
			}
		}
			
	*/
		
		
	}
}
