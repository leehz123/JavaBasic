package myobj.phonebook;

import java.util.Comparator;

public class PersonInfo {
	
	final public static int NUMBER_COLUMN = 0;
	final public static int NAME_COLUMN = 1;
	final public static int GROUP_COLUMN = 2; //�����ѹ� ���¹�
	
	private String group;
	private String name;
	private String number; //����

	private Integer age; //��Ƽ���� �ϰ� �η� ���ֵ� ������ �ʰ���
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
		return String.format("[%s, %s, %s]", group, name, number); //�� �� name�̶� number�� �ٲ� ������ ����..
	}
	
	public static Comparator<PersonInfo> getComparator(int column, boolean asc) {
		return new Comparator<PersonInfo>() {

			@Override
			public int compare(PersonInfo o1, PersonInfo o2) {
				switch(column) { //swtich�� getComparator()�� column���� ����� �� �� �� ���� �� (sort()�� �� �� �񱳸� �� 100�� �Ѵ��� �� �Ź� ����Ǵ°� �ƴ�)
				case NUMBER_COLUMN:	 // compareTo()�� ���� ���� �ʾƵ� ��� ������ ������ String�� �̹� ���� �� ���� ���ڿ� �񱳰� �ڵ����� ��. ������ -> �����ڵ�� 
					return o1.number.compareTo(o2.number) * (asc ? 1 : -1);//1�� ���� ���� ���� Ʋ������ ���� �ٲ��. (s) -1�� ���� Ʋ�ȴµ� �� ���ֶ�
				case GROUP_COLUMN:
					return o1.group.compareTo(o2.group) * (asc ? 1 : -1); 
				case NAME_COLUMN:
					return o1.name.compareTo(o2.name) * (asc ? 1 : -1);
				default:
					return 0; //�� ���� �� �ع����� �ɷ�. null �ϸ� ����������
				}
			}
		};
	}
	
	
}	
	
