package myobj.phonebook;

import java.util.Comparator;

public class PersonInfo {
	
	final public static int NUMBER_COLUMN = 0;
	final public static int NAME_COLUMN = 1;
	final public static int GROUP_COLUMN = 2; //매직넘버 막는법
	
	private String group;
	private String name;
	private String number; //폰넘

	private Integer age; //인티저로 하고 널로 냅둬도 나쁘지 않갯군
	private String memo;
	
	public PersonInfo(String group, String number, String name) {
		this.group = group;
		this.name = name;
		this.number = number;
		
	}
	
	public String getNumber() {
		return number;
	}
	
		
	public String getGroup() {
		return group;
	}

	
	public boolean checkByName(String query) {
		return name.contains(query);
	}
	
	public boolean checkByNumber(String query) {
		return number.contains(query);
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", group, name, number); //엥 왜 name이랑 number가 바뀌어서 나오냔 말임..
	}
	
	public static Comparator<PersonInfo> getComparator(int column, boolean asc) {
		return new Comparator<PersonInfo>() {

			@Override
			public int compare(PersonInfo o1, PersonInfo o2) {
				switch(column) { //swtich는 getComparator()에 column값이 담겼을 때 한 번 실행 됨 (sort()를 할 때 비교를 한 100번 한다할 때 매번 실행되는게 아님)
				case NUMBER_COLUMN:	 // compareTo()는 구현 하지 않아도 사용 가능한 이유가 String에 이미 구현 돼 있음 문자열 비교가 자동으로 됨. 사전순 -> 문자코드순 
					return o1.number.compareTo(o2.number) * (asc ? 1 : -1);//1은 너희 둘이 순서 틀렸으니 서로 바꿔라. (s) -1은 순서 틀렸는데 걍 냅둬라
				case GROUP_COLUMN:
					return o1.group.compareTo(o2.group) * (asc ? 1 : -1); 
				case NAME_COLUMN:
					return o1.name.compareTo(o2.name) * (asc ? 1 : -1);
				default:
					return 0; //걍 정렬 안 해버리는 걸로. null 하면 오류나나봄
				}
			}
		};
	}
	
	
}	
	
