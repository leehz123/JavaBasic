import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {
/*
# TreeSet, TreeMap
트리 : 데이터를 추가하면서 자기의 자리를 찾아가는 자료 구조 방식
데이터를 추가하는 동시에 미리 정렬이 돼 있기 때문에 추가로 정렬할 필요가 없다. 
(도서관 책 꽂을 때 애초에 자리 잘 찾아서 꽂아놓으면 꺼낼 때 편한 느낌)
근데 추가와 동시에 정렬을 해야 하기 때문에 Hash가 들어간 것 보다는 느리다. 
하지만 조회가 자주 발생하는 어쩌고에 메리트가 있음. 
정렬이 돼 있기 때문에 Hash 와는 다르게 인덱스를 사용할 수 있다. 
 */
	
	public static void main(String[] args) {
				
		/*
		numbers.add(4); //근데 설명을 보면 Comparator을 넣어달라는 표시가 있음. 
		//Comparator가 구현된 객체라면 그냥 넣어도 좋지만 원한다면 너가 고쳐서 넣어도 된다. 
		numbers.add(11);
		numbers.add(5);
		numbers.add(100);
		numbers.add(13);
		numbers.add(32);
		//이렇게 넣어도 넣으면서 정렬을 하기 때문에 순서대로 들어가 있음. 
		System.out.println(numbers);
		 */

		
		//TreeSet()의 여러 오버라이드 메서드 중 Comparator를 생성자로 요구하는 것을 사용해보자
		//new위에 마우스를 올려보면 java.util.TreeSet.TreeSet<Integer>(Comparator<? super Integer> comparator)
		 
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() { 
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			} 
		});
		
		
		/*
		위의 코드는 아래의 코드와 같음
		Comparator comp = new Comparator<Integer>() { 
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			} 
		};
		TreeSet<Integer> numbers = new TreeSet<>(comp);
		
		comp자리에 컴퍼레이터를 전달하는데 컴퍼를 담은 변수를 전달하느냐, 컴퍼를 생성하는 동시에 전달하느냐의 차이   
		 */
		
		// TreeSet은 add() 를 사용하여 데이터를 추가한다.
		
		//TreeSet에 랜덤숫자 100개 집어넣기 
		for(int i = 0; i < 100; ++i) {
			numbers.add((int)(Math.random() * 1000));
			
		}
		System.out.println(numbers);
		
		
		
		
		
		
		
		//headSet(toElemetnt) : 맨 앞부터 기준점까지의 모든 값들로 이루어진 부분집합을 반환한다. 
		System.out.println(numbers.headSet(50));  //내림차순 해놨으니 1000~500사이의 값들이 나오것지
		//1000포함 500미포함★
		
		//tailSet(fromElement) : 기준점부터 맨 뒤까지 부분집합을 반환한다. 
		System.out.println(numbers.tailSet(50));// 500포함 0포함
		
		//subSet(from, to) : 해당 범위의 부분집합을 반환. 
		//System.out.println(numbers.subSet(100,  200)); //근데 내림차순이라 안 나오고 에러남
		System.out.println("subSet : " + numbers.subSet(200,  100));
		
		//pollFirst() : 맨 앞의 값을 하나씩 삭제하면서 남아 있는 값들을 리턴 (카드뽑기에 유용. 오 짱인디) 
		TreeSet<Integer> subset = new TreeSet<>(numbers.subSet(300, 200)); 
		//원본값을 훼손할 수 없으니 이렇게 new로 subset을 해준대
		while(subset.pollFirst() != null) { //더 이상 값이 없으면 null이 나옴
		//★★while문 안에서 subset.pollFirst() 해줄 필요 없이 반복문이 돌아갈 때마다 조건문 내의 subset.pollFirst() 가 실행됨 
			
			System.out.println(subset);  
		}
		//pollLast() : 맨 뒤의 값들을 하나씩 삭제하면서 남아 있는 값들을 리턴 
		TreeSet<Integer> subset2 = new TreeSet<>(numbers.subSet(300, 200)); 
		//원본값을 훼손할 수 없으니 이렇게 new로 subset을 해준대
		while(subset2.pollLast() != null) { //더 이상 값이 없으면 null이 나옴
			System.out.println(subset2);
		}
		
		
		//numbers.floor(Integer e) : e와 가장 가까운 왼쪽값
		//numbers.ceiling(Integer e) : e와 가장 가까운 오른쪽값
		System.out.println("50과 가장 가까운 왼쪽값 : " + numbers.floor(50));
		System.out.println("50과 가장 가까운 오른쪽값 : " + numbers.ceiling(50));
		
		
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■TreeMap 설명■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		
		
		/*
		 트리맵의 정렬 기준은 key 이다. 
		(value를 정렬 기준으로 삼을 순 없다)
		컴퍼레이터를 넣으려 해도 키값 타입의 컴퍼레이터만 넣을 수 있다.
		 */
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Apple", 1);
		treeMap.put("apple", 5);
		treeMap.put("cat", 15);
		treeMap.put("dog", 1);
		treeMap.put("Mango", 13);
		System.out.println(treeMap);
		
		// TreeSet과 유사한 메서드들이 있다. 
		System.out.println(treeMap.subMap("a", "d"));
		
	}
}
