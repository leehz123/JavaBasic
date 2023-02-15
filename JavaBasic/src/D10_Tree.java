import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {
/*
# TreeSet, TreeMap
Ʈ�� : �����͸� �߰��ϸ鼭 �ڱ��� �ڸ��� ã�ư��� �ڷ� ���� ���
�����͸� �߰��ϴ� ���ÿ� �̸� ������ �� �ֱ� ������ �߰��� ������ �ʿ䰡 ����. 
(������ å ���� �� ���ʿ� �ڸ� �� ã�Ƽ� �ȾƳ����� ���� �� ���� ����)
�ٵ� �߰��� ���ÿ� ������ �ؾ� �ϱ� ������ Hash�� �� �� ���ٴ� ������. 
������ ��ȸ�� ���� �߻��ϴ� ��¼�� �޸�Ʈ�� ����. 
������ �� �ֱ� ������ Hash �ʹ� �ٸ��� �ε����� ����� �� �ִ�. 
 */
	
	public static void main(String[] args) {
				
		/*
		numbers.add(4); //�ٵ� ������ ���� Comparator�� �־�޶�� ǥ�ð� ����. 
		//Comparator�� ������ ��ü��� �׳� �־ ������ ���Ѵٸ� �ʰ� ���ļ� �־ �ȴ�. 
		numbers.add(11);
		numbers.add(5);
		numbers.add(100);
		numbers.add(13);
		numbers.add(32);
		//�̷��� �־ �����鼭 ������ �ϱ� ������ ������� �� ����. 
		System.out.println(numbers);
		 */

		
		//TreeSet()�� ���� �������̵� �޼��� �� Comparator�� �����ڷ� �䱸�ϴ� ���� ����غ���
		//new���� ���콺�� �÷����� java.util.TreeSet.TreeSet<Integer>(Comparator<? super Integer> comparator)
		 
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() { 
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			} 
		});
		
		
		/*
		���� �ڵ�� �Ʒ��� �ڵ�� ����
		Comparator comp = new Comparator<Integer>() { 
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			} 
		};
		TreeSet<Integer> numbers = new TreeSet<>(comp);
		
		comp�ڸ��� ���۷����͸� �����ϴµ� ���۸� ���� ������ �����ϴ���, ���۸� �����ϴ� ���ÿ� �����ϴ����� ����   
		 */
		
		// TreeSet�� add() �� ����Ͽ� �����͸� �߰��Ѵ�.
		
		//TreeSet�� �������� 100�� ����ֱ� 
		for(int i = 0; i < 100; ++i) {
			numbers.add((int)(Math.random() * 1000));
			
		}
		System.out.println(numbers);
		
		
		
		
		
		
		
		//headSet(toElemetnt) : �� �պ��� ������������ ��� ����� �̷���� �κ������� ��ȯ�Ѵ�. 
		System.out.println(numbers.headSet(50));  //�������� �س����� 1000~500������ ������ ��������
		//1000���� 500�����ԡ�
		
		//tailSet(fromElement) : ���������� �� �ڱ��� �κ������� ��ȯ�Ѵ�. 
		System.out.println(numbers.tailSet(50));// 500���� 0����
		
		//subSet(from, to) : �ش� ������ �κ������� ��ȯ. 
		//System.out.println(numbers.subSet(100,  200)); //�ٵ� ���������̶� �� ������ ������
		System.out.println("subSet : " + numbers.subSet(200,  100));
		
		//pollFirst() : �� ���� ���� �ϳ��� �����ϸ鼭 ���� �ִ� ������ ���� (ī��̱⿡ ����. �� ¯�ε�) 
		TreeSet<Integer> subset = new TreeSet<>(numbers.subSet(300, 200)); 
		//�������� �Ѽ��� �� ������ �̷��� new�� subset�� ���ش�
		while(subset.pollFirst() != null) { //�� �̻� ���� ������ null�� ����
		//�ڡ�while�� �ȿ��� subset.pollFirst() ���� �ʿ� ���� �ݺ����� ���ư� ������ ���ǹ� ���� subset.pollFirst() �� ����� 
			
			System.out.println(subset);  
		}
		//pollLast() : �� ���� ������ �ϳ��� �����ϸ鼭 ���� �ִ� ������ ���� 
		TreeSet<Integer> subset2 = new TreeSet<>(numbers.subSet(300, 200)); 
		//�������� �Ѽ��� �� ������ �̷��� new�� subset�� ���ش�
		while(subset2.pollLast() != null) { //�� �̻� ���� ������ null�� ����
			System.out.println(subset2);
		}
		
		
		//numbers.floor(Integer e) : e�� ���� ����� ���ʰ�
		//numbers.ceiling(Integer e) : e�� ���� ����� �����ʰ�
		System.out.println("50�� ���� ����� ���ʰ� : " + numbers.floor(50));
		System.out.println("50�� ���� ����� �����ʰ� : " + numbers.ceiling(50));
		
		
		//�������������������������������������������������������TreeMap �������������������������������������������������������������
		
		
		/*
		 Ʈ������ ���� ������ key �̴�. 
		(value�� ���� �������� ���� �� ����)
		���۷����͸� ������ �ص� Ű�� Ÿ���� ���۷����͸� ���� �� �ִ�.
		 */
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Apple", 1);
		treeMap.put("apple", 5);
		treeMap.put("cat", 15);
		treeMap.put("dog", 1);
		treeMap.put("Mango", 13);
		System.out.println(treeMap);
		
		// TreeSet�� ������ �޼������ �ִ�. 
		System.out.println(treeMap.subMap("a", "d"));
		
	}
}
