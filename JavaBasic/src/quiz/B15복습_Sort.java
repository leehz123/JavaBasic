package quiz;

import java.util.Arrays;

public class B15복습_Sort {

	public static void main(String[] args) {
		/*
		정렬 알고리즘
		# 선택 정렬
		1.배열 전체에서 가장 작은 값을 찾아 맨 앞에 놓는다. 
		2. 맨 앞을 제외한 배열 전체에서 가장 작은 값을 찾아 두 번째 자리에 넣는다. 
		3. ...
		94321
		14329
		12349에서 끝나긴 하는데 349도 돌려지긴 함
		12349
		12349
		
		# 버블정렬
		솎아주는 거 
		특정값(최소값 or 최대값)을 맨 뒤로 보내준다. (앞에서부터 솎아줌)
		(특정값을 맨 앞으로 보내는 것도 가능. 뒤에서부터 솎아주면 됨.)
		 */
		
//문제: 랜덤 숫자 10개(0~99999)가 들어있는 배열을 생성하시오. (중복 제거도 포함)
		int[] origin_data = new int[10];
		// origin_data에 랜덤숫자(1~10)을 인덱스 0부터 끝자리까지 채워넣는 for문.
		for (int i = 0; i < origin_data.length; ++i) {	
			origin_data[i] = (int)(Math.random() * 10 + 1);
			//현재 위치(인덱스)에 들어 있는 값이 그 앞에 먼저 채워진 값들과 겹친다면 현재 위치에 랜덤 값을 다시 채워야 함.
			//예를 들면 현재위치가 2이고 인덱스 0, 1에 든 값들과 비교하는데 겹치는게 있다면 인덱스2에 값을 다시 채워야 함 = 외부 for i문을 i=2인채로 다시 돌려야 함. 
			for (int j = 0; j < i; ++j) {
				if (origin_data[i] == origin_data[j]) {
					--i; // 외부 for문을 i=2인채로 다시 돌리기 위해 여기서 --i를 해준다. 그러면 외부 for i문의 다음 회전 때 ++i가 되어 i=2인채로 다시 돌아가게 됨. 
					break; //겹치는게 하나라도 나오면 그 뒤에 건 검사할 필요도 없음. 
				}
			}
		}
		System.out.printf("원본 : %s\n", Arrays.toString(origin_data));
		
		//원본 배열을 손상시키지 않기 위해 같은 길이의 배열을 새로 만들어서 거기에 값들을 복사.
		int[] asc = new int[origin_data.length]; 
		int[] desc = new int[origin_data.length];

		for (int i = 0; i < asc.length ; ++i) {
			asc[i]=origin_data[i];
			desc[i]=origin_data[i];
		}
		
// 1. 해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성해보세요.
		
	// # 선택정렬ver.
		
		//배열의 모든 요소를 정렬해주지 않아도 됨. 배열의 요소가 10개라면 9개까지만 정렬해줘도 마지막 10번째 자리는 자동으로 최대값이든 최소값이든 특정 값이 위치하게 됨.
		//선택 정렬은 '정렬대상인덱스'가 각 단계마다 한 칸씩 옆으로 이동함. 그래서 마지막 자리를 정렬대상위치에서 배제한다면 '< 배열의길이-1' 단계까지만 for문을 반복해도 됨.
		for (int step = 0; step < asc.length - 1; ++step) {  
			//그리고 선탥정렬은 단계와 해단 단계의 정렬대상 인덱스가 일치하므로 step은 몇 단계 를 의미하는 동시에 정렬대상인덱스 를 의미하기도 함. 
			
			//1단계
			// 최소값의 위치(min_index)를 찾는다. 
			int min_index = step; //일단 맨 처음에는 각 단계의 첫번째 인덱스(정렬대상이 위치하는 인덱스)를 min_index로 삼아준다.
			 
			for(int i = step + 1; i < asc.length; ++i) { 
				min_index = asc[min_index] > asc[i] ? i: min_index ;
				//step에 든 값과 그 뒤의 값들을 하나씩 비교해가며 둘 중 작은 값에 해당하는 인덱스가 min_index에 담기게 되고, 마지막 자리에 든 값까지 비교해서 
				///fori가 끝나고 나면 min_index에 해당(step)단계에서의 최소값의 인덱스가 담기게 됨.	
			}
			
			//2단계: 최소값을 현재 단계의 맨 앞(step)으로 이동시킨다. 
			//temp는 빈 컵역할. 두 컵의 내용물을 서로 바꾸기 위해서는 중간에 빈 컵이 하나 필요함. 
			int temp = asc[step];
			asc[step] = asc[min_index];
			asc[min_index] = temp;
			
			System.out.printf("%d단계 : %s\n", step, Arrays.toString(asc)); 
			//바깥for문이 한 번 끝난다는 것은 정렬대상인덱스(step)에 올바른 순서의 값이 왔다는 거고 해당 단계가 끝났다는 것. 
			//그래서 for문이 한 번의 회전을 마칠 때마다 선택정렬의 단계별 결과값 출력 가능. 
		}
		
		
		
	//# 버블정렬ver. 최소값을 맨 뒤로 보내보자 내림차순으로 해볼 것
		System.out.println("####버블정렬####");
		//버블정렬은 선택정렬과 2중첩for문인 건 같은데 내용이 다름. 
		//버블정렬은 그림으로 그려보면 정렬대상인덱스(i)가 단계내에서 멈춰있지 않고 1씩 증가하면서 한칸씩 옆으로 이동함. 
		//그리고 정렬대상인덱스의 바로 옆에 있는 인덱스의 내용과 크고 작은지 비교를 하기 때문에 정렬대상인덱스(i)는 그 옆의 인덱스(i+1)와 나란히 쌍으로 이동함.
		//첫번째 스텝(단계)을 마치고 나면 맨 마지막 요소에 특정값이 위치하면서 마지막요소의 정렬이 완성되고, 두 번째 스텝을 마치면 마지막 - 1 번째 요소의 정렬이 완성됨  ... 
		//그러다보면 첫 번쨰 요소는 자동으로 정렬이 왼성되기 때문에 스텝은 요소의 개수-1개(.length - 1)만큼 설정하면 됨. 
		for (int step = 0; step < desc.length - 1; ++step) { 
			for(int i = 0; i < desc.length - 1 - step; ++i) {
				//그리고 단계가 증가함에 따라 정렬이 완료된 요소들이 뒤에 쌓이기 때문에 단계가 올라갈수록 정렬대상인덱스(i)는 멀리까지 움직이지 않아도 된다. 그걸 desc.length - 1 - step으로 표현한 것. 
				if(desc[i]<desc[i+1]) {
				//지금 하려는 정렬은 내림차순이고 i에 있는 값이 i+1에 있는 값보다 크길 원하니까 작다면 뒤에 있는 큰 값과 바꿔야 됨. 
					int temp = desc[i];
					desc[i] = desc[i+1];
					desc[i+1] = temp;	
				}
			}   
			System.out.printf("%d단계 : %s\n", step, Arrays.toString(desc));
		}
	
		
	}
}
