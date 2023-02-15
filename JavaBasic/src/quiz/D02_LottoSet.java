package quiz;

import java.util.HashSet;

public class D02_LottoSet {
//해시셋을 이용해 1부터 45의 중복 없는 7 개의 랜덤 숫자를 생성해보세요
	
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() != 7) {
			int ran = (int)(Math.random() * 45 + 1);
			lotto.add(ran);
			System.out.println("이번에 추가한 숫자 : " + ran);
			System.out.println(lotto);
			//새로 추가된 숫자가 아무 자리에나 냅다 들어가 있음 역시 순서 없는 HashSet
		}
	
		System.out.println();
		System.out.println("결과 : " + lotto);
	}
		
}
