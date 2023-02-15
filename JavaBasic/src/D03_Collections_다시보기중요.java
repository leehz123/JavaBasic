import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import myobj.Police;

public class D03_Collections_다시보기중요 {
/*
	# java.util.Arrays
	배열을 편하게 다룰 수 있는 기능(메서드)들이 모여 있는 클래스
	
	# java.util.Collections
	컬렉션을 편하게 다룰 수 있는 기능(메서드)들이 모여 있는 클래스
	
 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //List는 추클. 
		Set<String> set = new HashSet<>();
		
		
		//Collections.addAll() : 해당 컬렉션에 여러가지 데이터를 한번에 더한다. 
		Collections.addAll(list, "pineapple", "pineapple", "redorange", "pear");
		list.add("apple");
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		Collections.addAll(set, "melon", "apple", "banana");
		set.add("melon");
		set.add("watermelon");
		set.add("strawberry");
		set.add("dragon fruit");
		
		System.out.println(list);
		System.out.println(set);
		
		//Collection.addAll(anotherCollection) : 해당 컬렉션에 다른 컬렉션의 모든 데이터를 더한다. 
		list.addAll(set);
		System.out.println(list);
		
		set.addAll(list); //중복이 싹 제거 되겠지
		System.out.println(set);
		
		//Collection.removeAll(anotherCollection) : 해당 컬렉션에서 다른 컬렉션의 모든 데이터를 지운다. 
		Set<String> dislike = new HashSet<>();
		dislike.add("orange");
		dislike.add("apple");
		
		list.removeAll(dislike);
		System.out.println("removeAll : " + list); //싫어하는 과일 다 지워진
		
		
		//Collection.retainAll(anotherCollection) : 해당 컬렉션에서 다른 컬렉션에도 있는 값만 남긴다. 
		//친구가 좋아하는 과일과 내가 좋아하는 과일(위에서 removeAll로 싫어하는거 뺌) 중에 겹치는게 있는지. 
		Set<String> friendsLike = new HashSet<>();
		friendsLike.add("pineapple");
		friendsLike.add("apple");
		friendsLike.add("banana");
		friendsLike.add("watermelon");
		friendsLike.add("pear");
		
		list.retainAll(friendsLike);
		System.out.println("retainAll : " + friendsLike);
		
		//Collections.fill(list, obj) : 전달한 리스트를 원하는 값으로 가득 채운다. 초기화 메서드인 셈
		//Collections.fill(list, "default fruit"); //어레이에도 있었지. 그리고 리스트만 가능. 
		//System.out.println(list);
		ArrayList<String> arrList = new ArrayList<>();
		Collections.addAll(arrList, "1", "2");
		Collections.fill(arrList, "메렁");
		System.out.println(arrList);
		
		//Collections.frequency(Collection, obj) : 해당 컬렉션에 어떤 값이 몇 개 들어 있는지 알아내서 반환한다. 
		list.set(3, "apple");
		list.set(4, "apple");
		list.set(5, "apple");
		int appleFreq = Collections.frequency(list, "apple");
		System.out.println("apple의 등장 횟수 : " + appleFreq);
		
//		int appleFreq = Collections.frequency(set, "apple");
//		System.out.println("apple의 등장 횟수 : " + appleFreq); //set이라 1이겠지
		
		
		//Collectionos.rotate(list, distance): 리스트를 원하는만큼 순환시킨다. 
		//당연히 set은 인덱스가 없어서 순환이 안 됨
		Collections.sort(list);
		System.out.println(list); 
		
		for(int i = 0; i < 5; ++i) {
			Collections.rotate(list, -1);
			System.out.printf("rotate : %d %s\n" , i, list);
		}
		// distance에 -1 넣으면 반시계방향, 1은 시계방향
		
		//Collections.shuffle(list) : 리스트를 랜덤으로 뒤섞는다. 
		Collections.shuffle(list);
		System.out.println(list);
		
		
		//Collections.swap(list, i, j) : 해당 리스트의 두 값을 서로 교체한다. 
		
		ArrayList<Integer> swaplist = new ArrayList<>();
		Collections.addAll(swaplist, 1, 2, 3, 4, 5, 6, 0);
		System.out.println("교체 전 : " + swaplist);
		Collections.swap(swaplist, 0, 3);
		System.out.println("교체 후 : " + swaplist);
		
		//Collections.replaceAll(list, obj, obj) : 해당 리스트의 모든 값을 수정한다. 
		Collections.replaceAll(list, "pineapple", "kiwi");
		System.out.println(list);
		
		
		
		/*
		//컬렉션은 다른 컬렉션으로의 변환이 자유롭다. 
		ArrayList<String> fruitList = new ArrayList<>(fruits); //아 이렇게 () 안에 넣어주면 됨?
		Collections.sort(fruitList);
		System.out.println(fruitList);
		 */

	
	
		//제네릭엔 모든 참조형 타입 들어갈 수 ㅇ
				//우리가 직접 만든 클래스도 컬렉션의 제네릭에 사용할 수 있다. 임포트 하기 싫으면 myobj.써주공 
				ArrayList<myobj.Police> polices = new ArrayList<>();
				polices.add(new myobj.Police());
				polices.add(new myobj.Police());
				polices.add(new myobj.Police());
				polices.add(new myobj.Police());
				System.out.println(polices);
				//Police클래스에서 toString오버라이드 안 해놔서 주소값 나옴
				
	
	
	}
}
