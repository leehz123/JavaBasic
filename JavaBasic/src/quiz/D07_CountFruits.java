package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D07_CountFruits {
/*
 배열에 다른 과일을 랜덤으로 1000개 추가한 후 각 과일이 몇 번씩 등장했는지 세어보세요.
 꼭 해시맵을 쓰지 않아도 됨
 */
	private static String[] fruitNames = {"apple", "banana", "orange", "kiwi", "grape", "peach", "strawberry"};

	
	public static void main(String[] args) {
		//정답풀이.
		// 아 배열에 추가하라 했네 ㅋ..
		HashMap<String, Integer> fruitCountMap = new HashMap<>();
		
		String[] fruits = new String[1000];
		for(int i = 0; i < fruits.length ; ++i) {
			fruits[i] = fruitNames[(int)(Math.random() * fruitNames.length)];
		}
		
		//이렇게 해주는 방법도 있겠지 (내가 쓴 방법과 유사. 이것보다 for-each쓰는게 나음. for-each는 1000번만 탐색하면 되니까.)
		List<String> fruitList = Arrays.asList(fruits);
		for(int i = 0; i < fruitNames.length; ++i) {
			fruitCountMap.put(fruitNames[i], 
				Collections.frequency(fruitList, fruitNames[i]));
				//이 Collections.frequency()메서드 자체가 리스트 전체만큼 탐색을 하기 떄문에 밑에 for-each식이 훨씬 성능상 이득.
		}
		
		
		for(String fruit : fruits) {
			//과일을 하나씩 꺼내면서 몇 번 등장했는지 세는 것
			/*
			//오 좀 안 들어오네 다시 보기 ★★★
				//Map에서 과일이름에 해당하는 과일 개수를 꺼낸다. 
			Integer cnt = fruitCountMap.get(fruit);
			//해당 과일 이름이 등록돼 있지 않을 떄 null이 나온다는 점을 이용하는 것. 
			
			if(cnt == null) { //맵에 아직 등록되지 않은 과일. 처음 등록되는 과일이므로 값을 1로 등록
				fruitCountMap.put(fruit, 1);
			} else { 
				fruitCountMap.put(fruit, cnt+1);
			}
			 */

			//위에걸 이렇게 짧게 줄일 수도 있음 와 ★★★
			Integer cnt = fruitCountMap.putIfAbsent(fruit, 1);
			if(cnt != null) {
				fruitCountMap.put(fruit, cnt+1);  
			}
		}
		System.out.println(fruitCountMap); //과일에 따른 등장횟수가 나오것지 . 만약에 이걸 배열에 넣었다면 뭐가 몇번 등장했는지 판단하기 귀찮음. 해시맵이 딱
		//위에 리스트로 한번 세주고 여기서 또 세는 거기 때문에 2배값으로 출력됨. 놀라지마라
		
		
		
		
		
		
		/*
		내 풀이. (문제 잘못 봄. 배열에 담으랬는데 ㅋ 풀이가 완전 달라졋자나)
		//해시맵 생성해서 랜덤으로 value 채워주기 
		HashMap<Integer, String> map = new HashMap<>();
		for(int i = 0; i < 1000; ++i) {
			map.put(i, fruitNames[(int)(Math.random() * fruitNames.length)]);
		}
		System.out.println(map);
		
		//해시맵 map에서 .values()로  값(문자열)만 뽑아서 문자열 컬렉션에 담아주기 
		Collection<String> values = map.values();
		System.out.println(values);
		System.out.println();
		
		int frequencySum = 0;
		for(int i = 0; i < fruitNames.length ; ++i) {
			int frequency  = Collections.frequency(values, fruitNames[i]);
			System.out.println(fruitNames[i] + "의 등장횟수 : " + frequency);
			frequencySum += frequency;
		}
		System.out.println();
		System.out.println("검산 : "  + frequencySum);
		*/
		
	}
	
	
	
	
	
	
}