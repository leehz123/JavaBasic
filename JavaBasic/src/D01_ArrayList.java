import java.util.ArrayList;

public class D01_ArrayList {
	/*
	# Java Collection Interface
	- Collection 은 자바에서 제공하는 자료구조 인터페이스 
	- Collection 끼리는 언제든지 다른 컬렉션으로 변환이 가능하다. (List <=> Set 호환 가능) 
	- Collection 인터페이스를 구현한 클래스로는 List, Set 등이 있다.
	
	# 자료구조?
	데이터를 효율적으로 저장하는 여러가지 방식들 
	상황마다 최적의 효율을 내는 자료구조가 있다. 
																						
	# java.uti.ArrayList
	배열과 유사하지만 크기가 자동으로 조절되는 자료구조를 구현한 클래스 
	배열처럼 데이터를 순차적으로 저장한다.(인덱스가 있다)
	모든 데이터를 순서대로 접근하는 속도가 가장 빠른 컬렉션이다 (성능이 좋아서 많이 사용됨)
	 */
	
	public static void main(String[] args) {
		
		
		//▒▒▒▒▒▒▒▒▒ 1.타입을 지정하지 않고 ArrayList생성하기 ▒▒▒▒▒▒▒▒▒▒
		
		ArrayList list1 = new ArrayList(); //얘도 컨쉬오 해주기(임포트) 
		
		//add(item) : 리스트의 맨 뒤에 원하는 데이터를 추가. 
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add("버");
		list1.add("거");
		System.out.println(list1);
		//우리가 느끼기엔 크기를 지정 안 해도 저절로 늘어나는 배열! 개좋음 와 그리고 타입도 제멋대로 넣을 수 있음!
		
		//list.add(index, item) : 리스트의 원하는 위치에 데이터를 추가한다. 
		list1.add(3, "비행기");
		System.out.println(list1);
		
		// get(index) : 리스트에서 해당 인덱스의 데이터를 하나 꺼내는 메서드 
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		//System.out.println(list1.get(8)); // 에러! java.lang.IndexOutOfBoundsException
	
		
		/*
		int num = list1.get(3); // 인덱스3에 든 건 분명히 숫자인데 에러가 남
		// Type mismatch: cannot convert from Object to int 
		//get()에 마우스를 올려서 리턴타입을 보니까 Object네! (모든 객체?의 부모)
		//매개변수로 넣어달라는 타입도 Object임. 아무 타입이나 다 넣어도 된다는 뜻!  
		 */
		
		Object obj = list1.get(3);
		//Object타입으로 업캐스팅 돼 있는 int 
		//그래서 
		//int a = (int)obj;
		//근데 만약에 obj에 든 게 int가 아니라면 에러가 발생하겠지.(실제로 문자열이 들어 있는데 int로 다운캐를 할 경우)
		//다운캐스팅 시 타입이 다르면 에러가 발생할 수 있어 불편하다. 
		//System.out.println(a);
		//꺼낼 때마다 이렇게 일일이 다운캐를 해줘야 함. 불편하네 
		
		
		
		
		// ▒▒▒▒▒▒▒▒▒ 2. 타입에 제한을 걸어서 ArrayList생성하가 ▒▒▒▒▒▒▒▒▒
		
		//요즘은 특정 타입만 저장할 수 잇도록
		// <>로 타입을 지정하며 ArrayList를 생성하는데 이걸 '제네릭' 이라 부름!
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("cat");
		//그러면 이제 매개변수 타입으로 Object가 아닌 String타입으로 바뀐 걸 볼 수 있음. 
		//그리고 get()을 해도 String으로 리턴타입이 바뀌었음을 볼 수 있음 
		list2.add("dog");
		list2.add("zibra");
		list2.add("lion");
		list2.add("giraffe");
		list2.add(2, "꼬부기");
		System.out.println(list2);
		//타입 제한을 걸어서 제한된 타입만 리스트에 추가할 수 있게 함. 
		
		//제네릭 내부에는 기본형 타입 사용 불가! 
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(8);
		list3.add(11);
		list3.add(99);
		list3.add(999);
		System.out.println(list3);
		
		ArrayList<Character> list4 = new ArrayList<>();
		list4.add('A');
		list4.add('H');
		list4.add('E');
		list4.add('O');
		list4.add('L');
		list4.add('L');
		System.out.println(list4);
		
	
		//list.size() : 해당 리스트의 크기를 반환한다. 
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		
		//list.contains(item) : 해당 리스트에 해당 값이 포함 되어 있는지 여부를 반환한다.  
		list2.contains("사자");
		System.out.println("list2 에 사자가 있나요?" + list2.contains("사자"));
		System.out.println("list2 에 lion이 있나요?" + list2.contains("lion"));
	
		//list.indexOf(item) : 리스트에서 해당값의 위치를 반환한다. 
		//찾지 못하면 -1을 반환한다. 
		System.out.println(list2.indexOf("apple"));
		System.out.println(list2.indexOf("lion"));
		
		//set(index ,item) : 리스트의 해당 위치의 값을 수정한다. (값 덮어씌우기)
		list2.set(4, "whale");
		System.out.println(list2);
		System.out.println("list2 에 lion이 있나요?" + list2.contains("lion")); //lion 을 whale로 바꿔서 더 이상 lion이 없다고 나올 것
		
		//추론퀴즈 (이런 식으로 메서드 찾아 쓸 줄 알아야 함)
		//list.remove(index) : 해당 인덱스의 내용을 삭제하고 지운 내용을 반환한다.  
		//list.remove(Object) : 해당 내용을 삭제하고 삭제 성공여부를 반환한다. (해당 내용이 삭제되고 난 후의 배열을 반환)
		System.out.println(list2.remove(1));
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		
		while(list2.remove("apple")) {  //apple이 없을 떄까지 remove해라! △△
			System.out.println(list2);
		} //apple을 하나씩 없애면서 결과값(list2배열)을 출력함 
		
		//반복문 활용하기 
		for(int i = 0; i < list3.size(); ++i ) {
			System.out.println(list3.get(i));
		}
		System.out.println("-------------------------------");
		//하나씩 꺼내는 반복문인 for-each반복문도 사용 가능!
		for(String animal : list2) {
			System.out.println(animal);
		}
		

	}
}
