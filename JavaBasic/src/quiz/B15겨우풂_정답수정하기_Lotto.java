package quiz;

import java.util.Arrays;
//배열 썼어야 했는데 헛짓거리 함
public class B15겨우풂_정답수정하기_Lotto {
	public static void main(String[] args) {
		/*
				//1.	1~45 중복 없는 랜덤숫자 7개를 생성하여 당첨 번호를 만들어보세요.
				
				int[] winning_number = new int[7];
				for(int i = 0; i < 7; ++i) {
				int random_num = (int)(Math.random() * 45 + 1);	
				winning_number[i] = random_num;
				}
				System.out.print("당첨번호 : ");
				for(int i = 0; i < winning_number.length; ++i) {
					System.out.print(winning_number[i]);
					System.out.print(" / ");
				}
				
				
				
			//2.  당첨 될 때까지 랜덤 번호를 생성한 후에 몇 회만에 당첨됐는지 출력해보세요.  (순서 달라도 됨)
				//아 그럼 배열 이용하면 되겠네!!!!!!!
				StringBuilder 
				while(true) {
					int random_num = (int)(Math.random() * 45 + 1);
					if(winning_number[0] == random_num) {
						while(true) {
							int random_num = (int)(Math.random() * 45 + 1);
							if(winning_number[1] == random_num) {
								
							}
						}
					}	
				}	
		*/
		// 정답풀이
		// 1. 중복 없는 숫자 만들기
		/*		int[] win = new int[7];
				for (int i = 0; i < win.length ; ++i) {
					win[i] = (int)(Math.random()*45+1);	
				}
				System.out.println(win);
				//int형 배얼을 그대로 출력하면 이상하게 나옴  >> [I@69222c14
				//Arrays.toString(arr); 전달한 배열을 보기 좋은 문자열로 만들어 반환. 
				System.out.println(Arrays.toString(win));
				//근데 이렇게 하면 중복이 아주 잘 나옴 ..
			
			//그럼 중복 제거를 어떻게 하느냐
		*/ // 숫자를 뽑고 앞에 있는 숫자를 하나씩 다 비교를 해보기

		// 아래처럼 해보자(랜덤숫자 뽑아서 순서대로 채우는데 중복 발견하면 제거하면서 채우는 방법)
		int[] win = new int[7];

		// win의 i번째에 랜덤숫자를 집어넣기 위한 for문
		for (int i = 0; i < win.length; ++i) {

			int newNum = (int) (Math.random() * 45 + 1);
			System.out.printf("이번에 새로 뽑은 번호는 %d입니다.\n", newNum);
			System.out.printf("%d번째 숫자를 뽑는 중 입니다.\n", i);
			win[i] = newNum;
			// 현재 i번째에 뽑은 숫자와 이전에 뽑은 숫자 중에 겹치는게 있는지 검토하는 for문
			for (int j = 0; j < i; ++j) {
				System.out.printf("이전의 숫자들을 검토중입니다. win[%d] : %d\n", j, win[j]);
				// 검토 중에 중복을 발견하면 중복을 찾았음을 알리고 검토를 중단한 후 다음 i로 넘어간다.
				if (newNum == win[j]) {
					System.out.println("중복을 찾았다!");
					--i; // i번째 숫자를 다시 뽑기 위해★
					break;
				}
			}
		}
		System.out.println("당첨번호 : " + Arrays.toString(win));

		// 2. 당첨 될 때까지 랜덤 번호를 생성한 후에 몇 회만에 당첨됐는지 출력해보세요. (순서 달라도 됨)
		System.out.println("~~~~~~~~~~~당첨번호를 예측해봅시다~~~~~~~~~~");

		/*		
				int[] predict = new int[7]; 
				int cnt = 0;
				int hit_cnt = 0;
				while(true) {
					for (int k = 0; k < predict.length; ++k) {
						int newNum = (int) (Math.random() * 45 + 1);
						predict[k] = newNum;
						for(int l = 0; l < k; ++l) {
							if (predict[l] == predict[k]) {
								--k;
								break;
							}
						}
					}
					//순서에 상관 없이 일치 찾는 코드
					for(int m = 0; m < win.length; ++m) {
						++cnt;
						for(int n = 0; n < predict.length; ++n) {
							if (predict[m] == win[n]) {
								++hit_cnt;
							}
						}
						if(hit_cnt == 7) {
							System.out.printf("%d번의 로또 번호 추출 끝에 당첨번호를 맞췄습니다.", cnt);
							System.out.println("예측한 당첨번호는 : " + Arrays.toString(predict));
							return;
						}
					}
					
					hit_cnt = 0;
				}
		
		*/

		while (true) {
			//예측번호 배열 만들기
			int auto_cnt = 0;
			int[] auto = new int[7];
			
			for (int i = 0; i < auto.length; ++i) {
				int newNum = (int) (Math.random() * 45 + 1);
				auto[i] = newNum;
				for (int j = 0; j < i; ++j) {
					if (newNum == auto[j]) {
						--i;
						break;
					}
				}
			}
			++auto_cnt;

			// 일치하는 번호 개수 세기
			int cnt = 0;
			for (int i = 0; i < auto.length; ++i) {
				for (int j = 0; j < win.length; ++j) {
					if (auto[i] == win[j]) {
						++cnt;
						break;
					}
				}	
			}
			if (cnt >= 7) {
				System.out.printf("1등 당첨 (%d회 시도함)\n", auto_cnt);
				System.out.println("당첨번호 : " + Arrays.toString(auto));
				return;
			} //else if (cnt >= 6) {
//				System.out.printf("2등 당첨(%d회 시도함)\n", auto_cnt);
//				System.out.println("당첨번호 : " + Arrays.toString(auto)); //엥 win아니지 않나?
//				return;
//			}
		}

		
		
		
		
		
	}
}
