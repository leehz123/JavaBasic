package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import myobj.phonebook.PersonInfo;


/*
 package myobj.phonebook 패키지에 public class PersonInfo 이용
*/

public class D08_PhoneBook_최고어려움 {
	/*
	#HashMap을 이용해서 전화번호부를 구현해보세요. 
		[그룹/[전화번호/개인정보]]
	1. [그룹/전화번호/개인정보]를 저장해야 한다.  
	HashMap<String, HashMap<String, Info> phoneBook = new HashMap<>();
	2. 전화번호부 해쉬맵에 그룹명을 키값으로 넣으면 해당 그룹의 해시맵을 꺼낼 수 있다. ㅇ
	3. 꺼낸 그룹 해시맵에 전화번호를 키값으로 넣으면 그 사람의 개인정보를 꺼낼 수 있다. ㅇ
	
	구현해야 할 메서드
	새로운 그룹을 추가하는 메서드 ㅇ
	존재하는 그룹에 새로운 전화번호 및 개인정보를 등록하는 메서드 △ age, memo 추가해야됨
	이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드 ㅇ 
	전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드 ㅇ
	등록된 모든 정보를 원하는 항목 기준으로 오름/내림차순으로 출력하는 메서드 
	*/
	
	HashMap<String, HashMap<String, PersonInfo>> phonebook = new HashMap<>();

	
	
	//새로운 그룹을 추가하는 메서드 (생성자 이용)
	public D08_PhoneBook_최고어려움() {
		phonebook.put("기본", new HashMap<>());
	}
	
	public boolean addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<>());
			System.out.println("새 그룹을 생성했습니다. ");
			return true;
		} else {
			System.out.println("이미 존재하는 그룹입니다. ");
			return false;
		}
	}
	
	public boolean addPerson(PersonInfo info) {
		
		String group = info.getGroup();
		String number = info.getNumber();
		
		
		if (phonebook.containsKey(group)) {
			HashMap<String, PersonInfo> groupMap = phonebook.get(group); //이거 여기 있는 거 맞음?	
			groupMap.put(number, info);
			return true;
		} else {
			System.out.println("해당 그룹이 존재하지 않습니다. 그룹을 먼저 생성해주세요.");
			return false;
		}
	}
	
	public void searchByName(String query) {
		for(HashMap<String, PersonInfo> group : phonebook.values()) {
			//값들을 하나씩 꺼내면 그룹 해시맵이 나옴.
			for(PersonInfo info : group.values()) {
				if(info.checkByName(query)) { 	
					System.out.println(info);//이름(checkByName())으로 걸린 사람들을 출력해줘라 
				}
				
			}
		}
	}
			
	public void searchByNumber(String query) {
		for(HashMap<String, PersonInfo> group : phonebook.values()) {
			//값들을 하나씩 꺼내면 그룹 해시맵이 나옴.
			for(PersonInfo info : group.values()) {
				if(info.checkByNumber(query)) { 	
					System.out.println(info);//이름(checkByName())으로 걸린 사람들을 출력해줘라 
				}
			}	
		}
	}
	
	public void printlAll(int column, boolean asc) {
		
		ArrayList<PersonInfo> allInfo = new ArrayList<>();
		for(HashMap<String, PersonInfo> group : phonebook.values()) {
			allInfo.addAll(group.values());
		} //이제 모든 PersonInfo가 리스트에 들어가 있겠지 

		
		Comparator<PersonInfo> comparator = PersonInfo.getComparator(column,asc);
		Collections.sort(allInfo, comparator);	 
		//없애도 된다네.. 엥 근데 없애면 안 되지 않음? 오잉 그리고 이상하게 정렬되네;;;; 출력도 중복출력됨 
		
		for(PersonInfo info : allInfo) {
			System.out.println(info);
		}
	}

	
//	내풀이.. 이러면 PersonInfo의 멤버변수들을 활용하기 어렵지 
//	public void putPersonInfo(String number, String group, String name) {
//		phonebook.get(group).put(number, new PersonInfo(number, name, group));
//		
//	}
	
	
	public static void main(String[] args) {
		
		D08_PhoneBook_최고어려움 mybook = new D08_PhoneBook_최고어려움();
		
//		mybook.addGroup("가족");
//		mybook.phonebook.get("기본").put("011-1111-1111",new PersonInfo("기본", "333", "ㅁㄴㅇ"));
//		mybook.phonebook.get("가족").put("011-1111-1111",new PersonInfo("가족", "123", "김씨"));
		//이렇게 들어가는 건 막아야 하지 않갔어 
		
		//mybook.addGroup("가족"); 이걸 걍 if문의 조건식에 넣어줄 수 있음.
		if(mybook.addGroup("가족")) { // mybook맵에 새 그룹을 생성햇습니다. 와 return true 해서 "잘됨" 도 출력
			System.out.println("잘됨");
		} else {
			System.out.println("잘안됨");
		}
		//mybook.addGroup("기본"); 
		//이미 존재하는 그룹입니다. 출력됨. 클래스를 인스턴스화 하면서 "기본"그룹이 추가되도록 해놨기 때문(생성자에 정의)
		mybook.addGroup("친구");
		
		mybook.addPerson(new PersonInfo("가족", "1-333-3", "김아빠"));
		mybook.addPerson(new PersonInfo("가족", "1-2-4", "박엄마"));
		mybook.addPerson(new PersonInfo("가족", "1-333-5", "김동생"));
		mybook.addPerson(new PersonInfo("가족", "1-333-6", "박친척"));
		mybook.addPerson(new PersonInfo("가족", "1-2-7", "박친척동생")); //엥
		mybook.addPerson(new PersonInfo("가족", "1-333-6", "나친척"));
		
		System.out.println(mybook.phonebook); //했을 땐 주소만 나오겠지 phonebook에 toString()이 구현돼있지 않기 때문에 
		System.out.println("김씨 찾기");
		mybook.searchByName("김"); //엥 
		mybook.searchByNumber("333");
		
		mybook.printlAll(PersonInfo.NAME_COLUMN, true);
		
	}
}
