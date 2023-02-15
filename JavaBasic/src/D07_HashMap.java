import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class D07_HashMap {
	
	
/*
# Hash Map 사물함 같은 것
데이터를 Key-Value 한쌍으로 저장하는 방식의 자료구조
인덱스 번호 대신 Key를 통해 데이터에 접근한다. 
Key는 중복을 허용하지 않늗다.




 */

	public static void main(String[] args) {
		//K와 V에 제네릭 지정해주기(지정 안 해주면 Object가 들어가겠지)
		HashMap<String, Integer> map1 = new HashMap<>();
						//타입으로 배열도 올 수 있음. 제네릭의 타입으로 참조형도 가능한데, 배열의 타입은 참조형이니까.
		HashMap<Integer, String> map2 = new HashMap<>();
		//put(K, V) : 해당 키에 값을 저장한다. 
		map1.put("age", 10);
		map1.put("score", 1234);
		map1.put("qty", 5);
		map1.put("cash", 5000);
		
		map2.put(330, "도라지");
		map2.put(350, "마을버스");
		
		System.out.println(map1);
		System.out.println(map2);
		
		//get(K) : 키값에 해당하는 값을 꺼낸다. 해당 키 또는 값이 없으면 null
		System.out.println(map1.get("score"));
		System.out.println(map1.get("Score")); 
		System.out.println(map2.get(330));
		
		HashMap<String, String> nav = new HashMap<>();
		nav.put("우리집", "서울시 무슨구 무슨동 123-123");
		nav.put("회사", "서울시 무슨구 가산디지털단지역");
		nav.put("거래처1", "서울시 무슨구 무슨동 321-321");
		System.out.println(nav);
		
		//이미 존재하는 키에 put을 하면 값을 덮어쓴다.
		nav.put("회사", "구디역");
		System.out.println(nav);
		
		// putIfAbsent(K, V) : 해당 키값이 비어 있으면 값을 넣고 null을 리턴. 
		String value = nav.putIfAbsent("맛집1" , "경기도 무슨구 무슨동 111-111");
		System.out.println(nav);
		System.out.println(value); //null이 나옴
		
		//키값이 이미 값이 존재한다면 값을 넣지 않고 들어있던 값을 리턴
		value = nav.putIfAbsent("맛집1", "맥도날드");
		System.out.println(nav);
		System.out.println(value);
		
		
		System.out.println();
		System.out.println();
		
		//Map은 컬렉션이 아니지만, Key또는 Value를 각각 Set과 Colleciton으로 꺼낼 수 있다. 
		//map.keySet() : : 해당 맵의 키들로만 이루어진 Set을 반환한다. 
		Set<String> keys = nav.keySet();
		System.out.println(keys);
		
		
		//Key들을 반복문으로 활용할 수 있다.  
		System.out.println("■■■■■■■■■■■■■ map.keySet() for-each로 하나씩 출력 ■■■■■■■■■■■■■ ");
		for (String key : keys) {
			System.out.println(key);
		}
		
		System.out.println();
		System.out.println();
		
		//map.values() : 해당 맵의 Value들로만 이루어진 컬렉션을 반환한다. 
		Collection<String> values = nav.values();
		//value에 대해서는 중복을 허용해서 컬렉션으로 꺼내고 key에 대해서는 중복을 허용하지 않기 때문에 Set으로 꺼내는군
		List<String> valueList = new ArrayList<>(values); //이렇게 하면 어레리로도 변환 가능 
		
		Collections.sort(valueList); //정렬도 가능하고 
		System.out.println(valueList);
		System.out.println("■■■■■■■■■■■■■ map.values() for-each로 하나씩 출력 ■■■■■■■■■■■■■ ");
		for(String val : values) {
			System.out.println(val);
		}

	}
}
