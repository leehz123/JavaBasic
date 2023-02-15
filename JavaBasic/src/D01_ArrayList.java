import java.util.ArrayList;

public class D01_ArrayList {
	/*
	# Java Collection Interface
	- Collection �� �ڹٿ��� �����ϴ� �ڷᱸ�� �������̽� 
	- Collection ������ �������� �ٸ� �÷������� ��ȯ�� �����ϴ�. (List <=> Set ȣȯ ����) 
	- Collection �������̽��� ������ Ŭ�����δ� List, Set ���� �ִ�.
	
	# �ڷᱸ��?
	�����͸� ȿ�������� �����ϴ� �������� ��ĵ� 
	��Ȳ���� ������ ȿ���� ���� �ڷᱸ���� �ִ�. 
																						
	# java.uti.ArrayList
	�迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ���� ������ Ŭ���� 
	�迭ó�� �����͸� ���������� �����Ѵ�.(�ε����� �ִ�)
	��� �����͸� ������� �����ϴ� �ӵ��� ���� ���� �÷����̴� (������ ���Ƽ� ���� ����)
	 */
	
	public static void main(String[] args) {
		
		
		//�ƢƢƢƢƢƢƢƢ� 1.Ÿ���� �������� �ʰ� ArrayList�����ϱ� �ƢƢƢƢƢƢƢƢƢ�
		
		ArrayList list1 = new ArrayList(); //�굵 ������ ���ֱ�(����Ʈ) 
		
		//add(item) : ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰�. 
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add("��");
		list1.add("��");
		System.out.println(list1);
		//�츮�� �����⿣ ũ�⸦ ���� �� �ص� ������ �þ�� �迭! ������ �� �׸��� Ÿ�Ե� ���ڴ�� ���� �� ����!
		
		//list.add(index, item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �߰��Ѵ�. 
		list1.add(3, "�����");
		System.out.println(list1);
		
		// get(index) : ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ������ �޼��� 
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		//System.out.println(list1.get(8)); // ����! java.lang.IndexOutOfBoundsException
	
		
		/*
		int num = list1.get(3); // �ε���3�� �� �� �и��� �����ε� ������ ��
		// Type mismatch: cannot convert from Object to int 
		//get()�� ���콺�� �÷��� ����Ÿ���� ���ϱ� Object��! (��� ��ü?�� �θ�)
		//�Ű������� �־�޶�� Ÿ�Ե� Object��. �ƹ� Ÿ���̳� �� �־ �ȴٴ� ��!  
		 */
		
		Object obj = list1.get(3);
		//ObjectŸ������ ��ĳ���� �� �ִ� int 
		//�׷��� 
		//int a = (int)obj;
		//�ٵ� ���࿡ obj�� �� �� int�� �ƴ϶�� ������ �߻��ϰ���.(������ ���ڿ��� ��� �ִµ� int�� �ٿ�ĳ�� �� ���)
		//�ٿ�ĳ���� �� Ÿ���� �ٸ��� ������ �߻��� �� �־� �����ϴ�. 
		//System.out.println(a);
		//���� ������ �̷��� ������ �ٿ�ĳ�� ����� ��. �����ϳ� 
		
		
		
		
		// �ƢƢƢƢƢƢƢƢ� 2. Ÿ�Կ� ������ �ɾ ArrayList�����ϰ� �ƢƢƢƢƢƢƢƢ�
		
		//������ Ư�� Ÿ�Ը� ������ �� �յ���
		// <>�� Ÿ���� �����ϸ� ArrayList�� �����ϴµ� �̰� '���׸�' �̶� �θ�!
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("cat");
		//�׷��� ���� �Ű����� Ÿ������ Object�� �ƴ� StringŸ������ �ٲ� �� �� �� ����. 
		//�׸��� get()�� �ص� String���� ����Ÿ���� �ٲ������ �� �� ���� 
		list2.add("dog");
		list2.add("zibra");
		list2.add("lion");
		list2.add("giraffe");
		list2.add(2, "���α�");
		System.out.println(list2);
		//Ÿ�� ������ �ɾ ���ѵ� Ÿ�Ը� ����Ʈ�� �߰��� �� �ְ� ��. 
		
		//���׸� ���ο��� �⺻�� Ÿ�� ��� �Ұ�! 
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
		
	
		//list.size() : �ش� ����Ʈ�� ũ�⸦ ��ȯ�Ѵ�. 
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		
		//list.contains(item) : �ش� ����Ʈ�� �ش� ���� ���� �Ǿ� �ִ��� ���θ� ��ȯ�Ѵ�.  
		list2.contains("����");
		System.out.println("list2 �� ���ڰ� �ֳ���?" + list2.contains("����"));
		System.out.println("list2 �� lion�� �ֳ���?" + list2.contains("lion"));
	
		//list.indexOf(item) : ����Ʈ���� �ش簪�� ��ġ�� ��ȯ�Ѵ�. 
		//ã�� ���ϸ� -1�� ��ȯ�Ѵ�. 
		System.out.println(list2.indexOf("apple"));
		System.out.println(list2.indexOf("lion"));
		
		//set(index ,item) : ����Ʈ�� �ش� ��ġ�� ���� �����Ѵ�. (�� ������)
		list2.set(4, "whale");
		System.out.println(list2);
		System.out.println("list2 �� lion�� �ֳ���?" + list2.contains("lion")); //lion �� whale�� �ٲ㼭 �� �̻� lion�� ���ٰ� ���� ��
		
		//�߷����� (�̷� ������ �޼��� ã�� �� �� �˾ƾ� ��)
		//list.remove(index) : �ش� �ε����� ������ �����ϰ� ���� ������ ��ȯ�Ѵ�.  
		//list.remove(Object) : �ش� ������ �����ϰ� ���� �������θ� ��ȯ�Ѵ�. (�ش� ������ �����ǰ� �� ���� �迭�� ��ȯ)
		System.out.println(list2.remove(1));
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		
		while(list2.remove("apple")) {  //apple�� ���� ������ remove�ض�! ���
			System.out.println(list2);
		} //apple�� �ϳ��� ���ָ鼭 �����(list2�迭)�� ����� 
		
		//�ݺ��� Ȱ���ϱ� 
		for(int i = 0; i < list3.size(); ++i ) {
			System.out.println(list3.get(i));
		}
		System.out.println("-------------------------------");
		//�ϳ��� ������ �ݺ����� for-each�ݺ����� ��� ����!
		for(String animal : list2) {
			System.out.println(animal);
		}
		

	}
}
