package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import myobj.phonebook.PersonInfo;


/*
 package myobj.phonebook ��Ű���� public class PersonInfo �̿�
*/

public class D08_PhoneBook_�ְ����� {
	/*
	#HashMap�� �̿��ؼ� ��ȭ��ȣ�θ� �����غ�����. 
		[�׷�/[��ȭ��ȣ/��������]]
	1. [�׷�/��ȭ��ȣ/��������]�� �����ؾ� �Ѵ�.  
	HashMap<String, HashMap<String, Info> phoneBook = new HashMap<>();
	2. ��ȭ��ȣ�� �ؽ��ʿ� �׷���� Ű������ ������ �ش� �׷��� �ؽø��� ���� �� �ִ�. ��
	3. ���� �׷� �ؽøʿ� ��ȭ��ȣ�� Ű������ ������ �� ����� ���������� ���� �� �ִ�. ��
	
	�����ؾ� �� �޼���
	���ο� �׷��� �߰��ϴ� �޼��� ��
	�����ϴ� �׷쿡 ���ο� ��ȭ��ȣ �� ���������� ����ϴ� �޼��� �� age, memo �߰��ؾߵ�
	�̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼��� �� 
	��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼��� ��
	��ϵ� ��� ������ ���ϴ� �׸� �������� ����/������������ ����ϴ� �޼��� 
	*/
	
	HashMap<String, HashMap<String, PersonInfo>> phonebook = new HashMap<>();

	
	
	//���ο� �׷��� �߰��ϴ� �޼��� (������ �̿�)
	public D08_PhoneBook_�ְ�����() {
		phonebook.put("�⺻", new HashMap<>());
	}
	
	public boolean addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<>());
			System.out.println("�� �׷��� �����߽��ϴ�. ");
			return true;
		} else {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�. ");
			return false;
		}
	}
	
	public boolean addPerson(PersonInfo info) {
		
		String group = info.getGroup();
		String number = info.getNumber();
		
		
		if (phonebook.containsKey(group)) {
			HashMap<String, PersonInfo> groupMap = phonebook.get(group); //�̰� ���� �ִ� �� ����?	
			groupMap.put(number, info);
			return true;
		} else {
			System.out.println("�ش� �׷��� �������� �ʽ��ϴ�. �׷��� ���� �������ּ���.");
			return false;
		}
	}
	
	public void searchByName(String query) {
		for(HashMap<String, PersonInfo> group : phonebook.values()) {
			//������ �ϳ��� ������ �׷� �ؽø��� ����.
			for(PersonInfo info : group.values()) {
				if(info.checkByName(query)) { 	
					System.out.println(info);//�̸�(checkByName())���� �ɸ� ������� �������� 
				}
				
			}
		}
	}
			
	public void searchByNumber(String query) {
		for(HashMap<String, PersonInfo> group : phonebook.values()) {
			//������ �ϳ��� ������ �׷� �ؽø��� ����.
			for(PersonInfo info : group.values()) {
				if(info.checkByNumber(query)) { 	
					System.out.println(info);//�̸�(checkByName())���� �ɸ� ������� �������� 
				}
			}	
		}
	}
	
	public void printlAll(int column, boolean asc) {
		
		ArrayList<PersonInfo> allInfo = new ArrayList<>();
		for(HashMap<String, PersonInfo> group : phonebook.values()) {
			allInfo.addAll(group.values());
		} //���� ��� PersonInfo�� ����Ʈ�� �� �ְ��� 

		
		Comparator<PersonInfo> comparator = PersonInfo.getComparator(column,asc);
		Collections.sort(allInfo, comparator);	 
		//���ֵ� �ȴٳ�.. �� �ٵ� ���ָ� �� ���� ����? ���� �׸��� �̻��ϰ� ���ĵǳ�;;;; ��µ� �ߺ���µ� 
		
		for(PersonInfo info : allInfo) {
			System.out.println(info);
		}
	}

	
//	��Ǯ��.. �̷��� PersonInfo�� ����������� Ȱ���ϱ� ����� 
//	public void putPersonInfo(String number, String group, String name) {
//		phonebook.get(group).put(number, new PersonInfo(number, name, group));
//		
//	}
	
	
	public static void main(String[] args) {
		
		D08_PhoneBook_�ְ����� mybook = new D08_PhoneBook_�ְ�����();
		
//		mybook.addGroup("����");
//		mybook.phonebook.get("�⺻").put("011-1111-1111",new PersonInfo("�⺻", "333", "������"));
//		mybook.phonebook.get("����").put("011-1111-1111",new PersonInfo("����", "123", "�达"));
		//�̷��� ���� �� ���ƾ� ���� �ʰ��� 
		
		//mybook.addGroup("����"); �̰� �� if���� ���ǽĿ� �־��� �� ����.
		if(mybook.addGroup("����")) { // mybook�ʿ� �� �׷��� �����޽��ϴ�. �� return true �ؼ� "�ߵ�" �� ���
			System.out.println("�ߵ�");
		} else {
			System.out.println("�߾ȵ�");
		}
		//mybook.addGroup("�⺻"); 
		//�̹� �����ϴ� �׷��Դϴ�. ��µ�. Ŭ������ �ν��Ͻ�ȭ �ϸ鼭 "�⺻"�׷��� �߰��ǵ��� �س��� ����(�����ڿ� ����)
		mybook.addGroup("ģ��");
		
		mybook.addPerson(new PersonInfo("����", "1-333-3", "��ƺ�"));
		mybook.addPerson(new PersonInfo("����", "1-2-4", "�ھ���"));
		mybook.addPerson(new PersonInfo("����", "1-333-5", "�赿��"));
		mybook.addPerson(new PersonInfo("����", "1-333-6", "��ģô"));
		mybook.addPerson(new PersonInfo("����", "1-2-7", "��ģô����")); //��
		mybook.addPerson(new PersonInfo("����", "1-333-6", "��ģô"));
		
		System.out.println(mybook.phonebook); //���� �� �ּҸ� �������� phonebook�� toString()�� ���������� �ʱ� ������ 
		System.out.println("�达 ã��");
		mybook.searchByName("��"); //�� 
		mybook.searchByNumber("333");
		
		mybook.printlAll(PersonInfo.NAME_COLUMN, true);
		
	}
}
