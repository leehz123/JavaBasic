import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D02_HashSet {
/*
리스트와 셋. 자료구조의 핵심

# Set
집합을 구현해놓은 클래스
집합처럼 요소 중에 같은 값이 중복되는 것을 허용하지 않는다. 

# Hash
같은 값을 넣으면 항상 일정한 값이 나오는 단방향성 알고리즘
결과값으로 원래의 값을 유추하는 것이 불가능해야 한다. 
데이터 위변조 체크에 아주 뛰어난 성능을 보인다.
//Hash의 결과값은 ★ 순서가 존재하지 않는다 ★ = 인덱스가 존재하지 않는다. 
특정 데이터의 고유 번호로서 활용된다.
(Set이랑 list랑 같은 부모의 자식이라 사용방법이 비슷함. 
인터페이스를 사용해서 여러 작동방식을 정의해놓은 거지)
(속도가 빨라서 많이 쓰임, 인덱스가 필요하면 어레리 쓰면 되고 아니면 해시셋)



"abc" => ba7816b..... 이거 보고 "abc"인줄 알겠음? 어떤 짓을 해도 찾는게 불가능. 
"abcd" => 88d4266... d 하나가 바뀌었을 뿐인데 내용이 확 달라짐
(시간이 지나서 넣어도 항상 같은 값이 나옴)
중복 체크시에 아주 뛰어난 성능을 보인다. 
긴 내용을 넣어도 항상 일정한 길이의 값이 나옴. 근데 점 하나만 찍어도 내용이 확 바뀜
"cat" => 77af778...
우리가 아무리 규칙적인 값을 넣어도 결과값이 항상 일정치 않음 
작은 데이터를 비교할 때는 해시보다 걍 비교햐는게 빠름
근데 긴 기사를 비교할 때는 해시로 비교하는게 빠르지
 */
	
	
	public static void main(String[] args) {
		//add(item) : list와 Set모두 Collections의 자식이기 때문에 거의 같은 메서드를 사용한다. 
		HashSet<String> fruits = new HashSet<>();
		
		
		//set에는 중복되는 데이터를 추가해도 알아서 제거된다. 
		//그리고 절대로 알파벳 순이 아님 지멋대로 들어가 있음 
		fruits.add("mango");
		fruits.add(new String("mango"));
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("green apple");
		fruits.add("red apple");
		fruits.add("apple");
		fruits.add("apple");
		System.out.println(fruits); //중복된 apple들은 출력되지 않음 하나만 출력됨 
		
		//Hash Set은 Hash알고리즘이기 때문에 순서가 없고 인덱스가 없어서 get()을 사용할 수 없다.
		//그럼 어떻게 꺼내냐
		//순서가 매번 바뀌어서 인덱스가 의미 없을 뿐, 값을 순서대로 꺼내는 것은 가능!
		//for-each문으로 꺼내기 딱이지~
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//set.size() : set의 크기
		System.out.println("set의 크기 : " + fruits.size());
		
		//컬렉션은 다른 컬렉션으로의 변환이 자유롭다. 
		//HashSet을 ArrayList로 넣어주는 방법은 ArrayList<>(해시셋); 해주면 됨
		ArrayList<String> fruitList = new ArrayList<>(fruits); //아 이렇게 () 안에 넣어주면 됨?
		Collections.sort(fruitList);
		System.out.println(fruitList);
		
	} 
}
