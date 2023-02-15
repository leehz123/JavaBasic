import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import myobj.Police;

public class D03_Collections_�ٽú����߿� {
/*
	# java.util.Arrays
	�迭�� ���ϰ� �ٷ� �� �ִ� ���(�޼���)���� �� �ִ� Ŭ����
	
	# java.util.Collections
	�÷����� ���ϰ� �ٷ� �� �ִ� ���(�޼���)���� �� �ִ� Ŭ����
	
 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //List�� ��Ŭ. 
		Set<String> set = new HashSet<>();
		
		
		//Collections.addAll() : �ش� �÷��ǿ� �������� �����͸� �ѹ��� ���Ѵ�. 
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
		
		//Collection.addAll(anotherCollection) : �ش� �÷��ǿ� �ٸ� �÷����� ��� �����͸� ���Ѵ�. 
		list.addAll(set);
		System.out.println(list);
		
		set.addAll(list); //�ߺ��� �� ���� �ǰ���
		System.out.println(set);
		
		//Collection.removeAll(anotherCollection) : �ش� �÷��ǿ��� �ٸ� �÷����� ��� �����͸� �����. 
		Set<String> dislike = new HashSet<>();
		dislike.add("orange");
		dislike.add("apple");
		
		list.removeAll(dislike);
		System.out.println("removeAll : " + list); //�Ⱦ��ϴ� ���� �� ������
		
		
		//Collection.retainAll(anotherCollection) : �ش� �÷��ǿ��� �ٸ� �÷��ǿ��� �ִ� ���� �����. 
		//ģ���� �����ϴ� ���ϰ� ���� �����ϴ� ����(������ removeAll�� �Ⱦ��ϴ°� ��) �߿� ��ġ�°� �ִ���. 
		Set<String> friendsLike = new HashSet<>();
		friendsLike.add("pineapple");
		friendsLike.add("apple");
		friendsLike.add("banana");
		friendsLike.add("watermelon");
		friendsLike.add("pear");
		
		list.retainAll(friendsLike);
		System.out.println("retainAll : " + friendsLike);
		
		//Collections.fill(list, obj) : ������ ����Ʈ�� ���ϴ� ������ ���� ä���. �ʱ�ȭ �޼����� ��
		//Collections.fill(list, "default fruit"); //��̿��� �־���. �׸��� ����Ʈ�� ����. 
		//System.out.println(list);
		ArrayList<String> arrList = new ArrayList<>();
		Collections.addAll(arrList, "1", "2");
		Collections.fill(arrList, "�޷�");
		System.out.println(arrList);
		
		//Collections.frequency(Collection, obj) : �ش� �÷��ǿ� � ���� �� �� ��� �ִ��� �˾Ƴ��� ��ȯ�Ѵ�. 
		list.set(3, "apple");
		list.set(4, "apple");
		list.set(5, "apple");
		int appleFreq = Collections.frequency(list, "apple");
		System.out.println("apple�� ���� Ƚ�� : " + appleFreq);
		
//		int appleFreq = Collections.frequency(set, "apple");
//		System.out.println("apple�� ���� Ƚ�� : " + appleFreq); //set�̶� 1�̰���
		
		
		//Collectionos.rotate(list, distance): ����Ʈ�� ���ϴ¸�ŭ ��ȯ��Ų��. 
		//�翬�� set�� �ε����� ��� ��ȯ�� �� ��
		Collections.sort(list);
		System.out.println(list); 
		
		for(int i = 0; i < 5; ++i) {
			Collections.rotate(list, -1);
			System.out.printf("rotate : %d %s\n" , i, list);
		}
		// distance�� -1 ������ �ݽð����, 1�� �ð����
		
		//Collections.shuffle(list) : ����Ʈ�� �������� �ڼ��´�. 
		Collections.shuffle(list);
		System.out.println(list);
		
		
		//Collections.swap(list, i, j) : �ش� ����Ʈ�� �� ���� ���� ��ü�Ѵ�. 
		
		ArrayList<Integer> swaplist = new ArrayList<>();
		Collections.addAll(swaplist, 1, 2, 3, 4, 5, 6, 0);
		System.out.println("��ü �� : " + swaplist);
		Collections.swap(swaplist, 0, 3);
		System.out.println("��ü �� : " + swaplist);
		
		//Collections.replaceAll(list, obj, obj) : �ش� ����Ʈ�� ��� ���� �����Ѵ�. 
		Collections.replaceAll(list, "pineapple", "kiwi");
		System.out.println(list);
		
		
		
		/*
		//�÷����� �ٸ� �÷��������� ��ȯ�� �����Ӵ�. 
		ArrayList<String> fruitList = new ArrayList<>(fruits); //�� �̷��� () �ȿ� �־��ָ� ��?
		Collections.sort(fruitList);
		System.out.println(fruitList);
		 */

	
	
		//���׸��� ��� ������ Ÿ�� �� �� ��
				//�츮�� ���� ���� Ŭ������ �÷����� ���׸��� ����� �� �ִ�. ����Ʈ �ϱ� ������ myobj.���ְ� 
				ArrayList<myobj.Police> polices = new ArrayList<>();
				polices.add(new myobj.Police());
				polices.add(new myobj.Police());
				polices.add(new myobj.Police());
				polices.add(new myobj.Police());
				System.out.println(polices);
				//PoliceŬ�������� toString�������̵� �� �س��� �ּҰ� ����
				
	
	
	}
}
