package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D01_ArrayListSort {
	
	public static void main(String[] args) {
		/*
		//문자열을 오름차순으로 정렬하는 예시
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("monkey");
		animals.add("zibra");
		animals.add("lion");
		animals.add("giraffe");
		
		//Collections.sort(list) : 리스트의 내용을 오름차순으로 정렬해주는 메서드. 내림차순은 없으니 수동으로 만들어야 함.
		Collections.sort(animals);
		System.out.println(animals);
		*/
		
		// Q. ArrayList에 100개의 랜덤 값을 채운 후(범위 자유) 내림차순으로 정렬하여 출력해보시요
		//Collection 사용하지 말고 정렬 알고리즘 배운 걸로 복습겸 해보기 
	
		
		//원본 배열 만들기 
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 100; ++i) {
			list.add((int)(Math.random() * 1000));
		}
		System.out.println(list);
		//버블 정렬 
		for(int i = 0; i < list.size() - 1; ++i) {
			for(int j = 0; j < list.size() - 1 - i; ++j) {
				if(list.get(j) < list.get(j+1)) {
					int tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1,tmp);
				}
			} 
		}
		System.out.println("로직 맞니? : " + list);
			
			//여기서 주의할 점이 list.add()로 하면 무한루프를 돌게 됨(OutOfMemoryError).  
			//add를 하면 계속 추가하게 되는 거니까!
			//그래서 set으로 해야 됨!
		
		//정리.
		//list.add()는 데이터를 계속 추가하는 것
		// 대입연산에는 .set이 더 가깝다. 
		
		//Collections.sort(list) : 리스트의 내용을 오름차순으로 정렬해주는 메서드
 		Collections.sort(list);
		//Collections.reverse(list) : 리스트의 내용을 거꾸로 뒤집어주는 메서드 
		Collections.reverse(list);
		System.out.println(list);
		//정렬을 하고 뒤집기 
		//얘네 리턴타입이 void인가봄?
		 
		//나는 이렇게 했는디 위에 .sort()랑 .reverse()사용하면 굳이 이럴 필요 없음
		ArrayList<Integer> desc = new ArrayList<>();
		for(int i = 0; i < 100; ++i) {
			desc.add(Collections.max(list));
			list.remove(Collections.max(list));
		}
		System.out.println(desc);
		
	}
}
