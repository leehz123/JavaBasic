package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphap_복습중요<T, X, Y> { //이 클래스는 제네릭을 사용할 것이다 라는 것을 알려주기 <T>
										//제네릭을 여러개 쓸 수 있는데 많이 쓰는 거 아님 
										//어쩄든 메소드마다 제네릭을 다르게 쓸 수 있겠지 
	
	/*
	// A와 B의 주소값에 a와 b에 전달됨 그래서 a는 업캐된 ArrayList, b는 업캐된ArrayList
	//A와 a, B와 b 각각이 똑같은 곳을 가리키고 있으니까 a와 b를 통해 A와 B에 든 값을 건드는게 되버림  
	Set<Integer> union(Collection<Integer>a, Collection<Integer>b) {
		//아 그리고 리턴타입이랑 매개변수 타입에 이렇게 <>제네릭도 써주네
		a.addAll(b);
		return new HashSet<>(a);  //해시셋으로 맅턴하라 했으니꽈. list일 경우 해시셋으로 바꽈줘야쥐. 
		//컬렉션끼리의 변환은 () 안에 넣어주면 됨. 
	}
	*/
	
	//제네릭으로는 오버로딩을 할 수 없다★★
	//그러면 떄마다 다른 제네릭을 쓰고 싶다면 어떻게 해야 하는가? ↓↓↓↓↓↓↓ 
	Set<T> union(Collection<T> a, Collection<T> b) {
		Set<T> union = new HashSet<>(a);//원본을 훼손시키지 않는 법. 원본을 건들지 말고 처음부터 새로은 객체를 (new)만들어서 합집합을 해주면 됨
		union.addAll(b);
		return union; 
	}
	Set<X> inter(Collection<X> a, Collection<X> b) {
		Set<X> inter = new HashSet<>(a);
		inter.retainAll(b);
		return inter; 
	}
	
	Set<Y> diff(Collection<Y> a, Collection<Y> b) {
		Set<Y> diff = new HashSet<>(a);
		diff.removeAll(b);
		return diff; 
	}
	
	/*
	<T>
	T는 별 의미 없음 쓰고 싶은거 써도 됨 <X> <car>이런 식으로 암거나
	이제 static이 아닌 인스턴스 메서드가 되어 
	인스턴스를 생성하면서 제네릭을 정해주는 것!
	 */
	
	  
		
	
	
	
	/* 내 풀이.
		//1. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
	static Set union(Collection col1, Collection col2) { 
		//만약 매개변수를 List list, Set set으로 한다면 첫번째에 Set으로 넣고 싶을 때 못 넣음. Collection형을 받도록 해야겠지?
		Set<String> union = new HashSet<>();
		union.addAll(col1);
		union.addAll(col2);
		return union;
	}
	//2. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	static Set intersection(Collection col1, Collection col2) {
		Set<String> intersection = new HashSet<>();
		intersection.addAll(col1);
		intersection.retainAll(col2);
		return intersection;
	}
	//3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드 
	static Set difference(Collection col1, Collection col2) {
		Set<String> difference = new HashSet<>();
		difference.addAll(col1);
		difference.removeAll(col2);
		return difference;
	 */
	

	
	public static void main(String[] args) {
		
		
		List<Integer> A = new ArrayList<>();
		Set<Integer> B = new HashSet<>();
		List<String> C = new ArrayList<>();
		Set<String> D = new HashSet<>();
		List<Character> E = new ArrayList<>();
		Set<Character> F = new HashSet<>();
		
		Collections.addAll(A, 1, 3, 5, 7, 9);   //아 addAll()있었지.. 괜한 수고를 했네 
		Collections.addAll(B, 7, 9, 11, 13, 15); 
		Collections.addAll(C, "자장면", "만두", "단무지");
		Collections.addAll(D, "짬뽕", "만두", "탕수육", "단무지");
		Collections.addAll(E, '어', '린', '이', '날');
		Collections.addAll(F, '한', '글', '날');
		
		D03_Jiphap_복습중요<Integer, String, Character> jiphapTool = new D03_Jiphap_복습중요();
		//이렇게 인스턴스 생성하면서 비어있던 제네릭<T>를 채워줌!
		//그리고 이제 static이 아니니 union(A, B) 가 아니라 jiphapTool.union(A, B);이렇게 사용해야 함. 
		
		
		//System.out.println(intersection("교집합결과 : "+ A,B));//교집합이 합집합 위로 가면 정상적으로 잘 나오거든?
		System.out.println("합집합결과 : " + jiphapTool.union(A, B));
		System.out.println("교집합결과 : "+ jiphapTool.inter(C, D));//근데 교집합이 이상하게 나옴. a와 를 통해 A에 합집합이 되버린 상태로 교집합을 진행해서 그럼 
 		System.out.println("A-B" + jiphapTool.diff(E, F));
 		System.out.println("B-A : " + jiphapTool.diff(E, F));
		
		
		
		
		List<String> lunch = new ArrayList<>();
		lunch.add("냉면");
		lunch.add("순대국밥");
		lunch.add("돈까스");
		lunch.add("초밥");
		lunch.add("자장면");
		lunch.add("햄버거");
		lunch.add("샤브샤브");
		
		Set<String> dinner = new HashSet<>();
		dinner.add("스파게티");
		dinner.add("마제소바");
		dinner.add("냉면");
		dinner.add("족발");
		dinner.add("샤브샤브");
		dinner.add("피자");
		dinner.add("치킨");
		dinner.add("햄버거");
		
//		System.out.println("합집합메서드: " + union(dinner, lunch));
//		System.out.println("교집합메서드: " + inter(lunch, dinner));
//		System.out.println("차집합메서드: " + diff(lunch, dinner));
	
		/*
		
		Set<String> addAll = new HashSet<>();
		addAll.addAll(lunch);
		addAll.addAll(dinner);
		System.out.println("addAll(점저리스트 모음) : " + addAll);
		
		//2. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
		Set<String> retainAll = new HashSet<>();
		retainAll.addAll(lunch);
		retainAll.retainAll(dinner);
		System.out.println("retainAll(중복리스트) : " + retainAll);
		
		//3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드 
		addAll.removeAll(retainAll);
		System.out.println("removeAll(중복제거한 점저리스트) : " + addAll);
		 */

	}
}
