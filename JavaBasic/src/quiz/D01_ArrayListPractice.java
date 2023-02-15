package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class D01_ArrayListPractice {	
	public static void main(String[] args) {

		
		//	# ArrayList에 1000부터 9999의 랜덤정수를 100개 추가한 후 다음을 구해보세요. 
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i <= 100; ++i) {
			list.add((int)(Math.random() * 9000) + 1000); 
		}
		System.out.println(list);

		//정답 풀이
		//와 이렇게 한방에 끝내는구나 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ대박
		int sum_ = 0;
		int min = list.get(0);
		int max = list.get(0);
		
		for(int num : list) {
			sum_ += 0;
			min = min > num ? num : min;
			max = max < num ? num : max;
		}
		
		System.out.println("평균 : " + sum_ / (double) list.size());
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("77번째 값 : " + list.get(76));
		
		
		
		//이 밑으로는 내 풀이~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//	1. 모든 숫자의 평균
		int sum = 0;
		for(int num : list) {
			sum += num;
		}
		
		System.out.println("평균 : " + sum);
		
		//	2. 모든 숫자 중 가장 큰 수 
		int maxNum = list.get(0);
		for(int i = 0; i < list.size(); ++i) {
			maxNum = Math.max(maxNum, list.get(i));
		}
		System.out.println("최대값 : " + maxNum);
		
		
		//	3. 모든 숫자 중 가장 작은 수 
		int minNum = list.get(0);
		for(int i = 0; i < list.size(); ++i) {
			minNum = Math.min(minNum, list.get(i));
		}
		System.out.println("최소값 : " + minNum);
		
		
		//	4. 77번째로 나온 수 
		System.out.println("77번째 값 : " + list.get(76));
		
	
		// ----------------------------------------------------------------------------------------------------------------
		
		System.out.println("Collections로 구한 최대값 : " + Collections.max(list));
		System.out.println("Collections로 구한 최소값 : " + Collections.min(list));
		//Collection을 달라 했는데 ArrayList는 Collection의 자식이라 들어갈 수 있음
		//결론 : 아는 것이 힘이다~~~~! 모르면 배열 돌리는 거고, 알면 한 줄로 끝내는 거고
		
		
		//배열을 ArrayList로 바꾸는 방법은? 있을까? 
		
		//일단 리스트를 배열로 변환하는 법은 있음
		//1. 값을 담을 배열을 미리 생성해둔다. 
		Integer[] arr = new Integer[list.size()]; //초기화 안 해주면 오류남
		//int로 하면 안 됨. Integer로 해야 됨!
		
		//2. toArray() 메서드에 미리 만들어둔 배열을 전달한다. 
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//배열을 리스트로 변환하는 법
		//List<Integer> list = Arrays.asList(arr);
		//List타입으로 업캐스팅 된 것 
		System.out.println(list);
		
		//리스트로 변환된 배열은 Collection이기 때문에 다시 ArrayList로 변환할 수 있다. 
		list = new ArrayList<>(list); //다시 업캐스팅 한 것
		
		
		
		Collection<Integer> c = new ArrayList<>(list);
		List<Integer> l = new ArrayList<>(list);
		ArrayList<Integer> l2 = new ArrayList<>(list);
		//ArrayList의 부모인 List의 부모인 Collection 
		//Collection , List, ArrayList 다 임포트 해줘라 타입미스매치 난다 
		
		
		//리스트로 변환한 결과를 수정
		//리스트로 변환한 결과를 수정해도 원본 배열에는 영향을 미치지 않는다. new ArrayList하면서 새로 만들어 낸 거니까(복사한 셈)
		for(int i = 0; i < l2.size(); ++i) {
			if (l2.get(i) > 1100) {
				l2.remove(i--); //만약에 지웠다면 --
			}
		}
		System.out.println(l2);
		System.out.println(Arrays.toString(arr)); //원본 배열은 그대로 있네 
	
	}
}
