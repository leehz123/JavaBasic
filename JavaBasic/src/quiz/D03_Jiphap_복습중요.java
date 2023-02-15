package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphap_�����߿�<T, X, Y> { //�� Ŭ������ ���׸��� ����� ���̴� ��� ���� �˷��ֱ� <T>
										//���׸��� ������ �� �� �ִµ� ���� ���� �� �ƴ� 
										//��� �޼ҵ帶�� ���׸��� �ٸ��� �� �� �ְ��� 
	
	/*
	// A�� B�� �ּҰ��� a�� b�� ���޵� �׷��� a�� ��ĳ�� ArrayList, b�� ��ĳ��ArrayList
	//A�� a, B�� b ������ �Ȱ��� ���� ����Ű�� �����ϱ� a�� b�� ���� A�� B�� �� ���� �ǵ�°� �ǹ���  
	Set<Integer> union(Collection<Integer>a, Collection<Integer>b) {
		//�� �׸��� ����Ÿ���̶� �Ű����� Ÿ�Կ� �̷��� <>���׸��� ���ֳ�
		a.addAll(b);
		return new HashSet<>(a);  //�ؽü����� �����϶� �����ϲ�. list�� ��� �ؽü����� �ٲ������. 
		//�÷��ǳ����� ��ȯ�� () �ȿ� �־��ָ� ��. 
	}
	*/
	
	//���׸����δ� �����ε��� �� �� ���١ڡ�
	//�׷��� ������ �ٸ� ���׸��� ���� �ʹٸ� ��� �ؾ� �ϴ°�? �������� 
	Set<T> union(Collection<T> a, Collection<T> b) {
		Set<T> union = new HashSet<>(a);//������ �Ѽս�Ű�� �ʴ� ��. ������ �ǵ��� ���� ó������ ������ ��ü�� (new)���� �������� ���ָ� ��
		union.addAll(b);
		return union; 
	}
	Set<X> inter(Collection<X> a, Collection<X> b) {
		Set<X> inter = new HashSet<>(a);
		inter.retainAll(b);
		return inter; 
	}
	
	Set<Y> diff(Collection<Y> a, Collection<Y> b) {
		Set<Y> diff = new HashSet<>(a);
		diff.removeAll(b);
		return diff; 
	}
	
	/*
	<T>
	T�� �� �ǹ� ���� ���� ������ �ᵵ �� <X> <car>�̷� ������ �ϰų�
	���� static�� �ƴ� �ν��Ͻ� �޼��尡 �Ǿ� 
	�ν��Ͻ��� �����ϸ鼭 ���׸��� �����ִ� ��!
	 */
	
	  
		
	
	
	
	/* �� Ǯ��.
		//1. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	static Set union(Collection col1, Collection col2) { 
		//���� �Ű������� List list, Set set���� �Ѵٸ� ù��°�� Set���� �ְ� ���� �� �� ����. Collection���� �޵��� �ؾ߰���?
		Set<String> union = new HashSet<>();
		union.addAll(col1);
		union.addAll(col2);
		return union;
	}
	//2. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	static Set intersection(Collection col1, Collection col2) {
		Set<String> intersection = new HashSet<>();
		intersection.addAll(col1);
		intersection.retainAll(col2);
		return intersection;
	}
	//3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼��� 
	static Set difference(Collection col1, Collection col2) {
		Set<String> difference = new HashSet<>();
		difference.addAll(col1);
		difference.removeAll(col2);
		return difference;
	 */
	

	
	public static void main(String[] args) {
		
		
		List<Integer> A = new ArrayList<>();
		Set<Integer> B = new HashSet<>();
		List<String> C = new ArrayList<>();
		Set<String> D = new HashSet<>();
		List<Character> E = new ArrayList<>();
		Set<Character> F = new HashSet<>();
		
		Collections.addAll(A, 1, 3, 5, 7, 9);   //�� addAll()�־���.. ���� ���� �߳� 
		Collections.addAll(B, 7, 9, 11, 13, 15); 
		Collections.addAll(C, "�����", "����", "�ܹ���");
		Collections.addAll(D, "«��", "����", "������", "�ܹ���");
		Collections.addAll(E, '��', '��', '��', '��');
		Collections.addAll(F, '��', '��', '��');
		
		D03_Jiphap_�����߿�<Integer, String, Character> jiphapTool = new D03_Jiphap_�����߿�();
		//�̷��� �ν��Ͻ� �����ϸ鼭 ����ִ� ���׸�<T>�� ä����!
		//�׸��� ���� static�� �ƴϴ� union(A, B) �� �ƴ϶� jiphapTool.union(A, B);�̷��� ����ؾ� ��. 
		
		
		//System.out.println(intersection("�����հ�� : "+ A,B));//�������� ������ ���� ���� ���������� �� �����ŵ�?
		System.out.println("�����հ�� : " + jiphapTool.union(A, B));
		System.out.println("�����հ�� : "+ jiphapTool.inter(C, D));//�ٵ� �������� �̻��ϰ� ����. a�� �� ���� A�� �������� �ǹ��� ���·� �������� �����ؼ� �׷� 
 		System.out.println("A-B" + jiphapTool.diff(E, F));
 		System.out.println("B-A : " + jiphapTool.diff(E, F));
		
		
		
		
		List<String> lunch = new ArrayList<>();
		lunch.add("�ø�");
		lunch.add("���뱹��");
		lunch.add("���");
		lunch.add("�ʹ�");
		lunch.add("�����");
		lunch.add("�ܹ���");
		lunch.add("�������");
		
		Set<String> dinner = new HashSet<>();
		dinner.add("���İ�Ƽ");
		dinner.add("�����ҹ�");
		dinner.add("�ø�");
		dinner.add("����");
		dinner.add("�������");
		dinner.add("����");
		dinner.add("ġŲ");
		dinner.add("�ܹ���");
		
//		System.out.println("�����ո޼���: " + union(dinner, lunch));
//		System.out.println("�����ո޼���: " + inter(lunch, dinner));
//		System.out.println("�����ո޼���: " + diff(lunch, dinner));
	
		/*
		
		Set<String> addAll = new HashSet<>();
		addAll.addAll(lunch);
		addAll.addAll(dinner);
		System.out.println("addAll(��������Ʈ ����) : " + addAll);
		
		//2. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
		Set<String> retainAll = new HashSet<>();
		retainAll.addAll(lunch);
		retainAll.retainAll(dinner);
		System.out.println("retainAll(�ߺ�����Ʈ) : " + retainAll);
		
		//3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼��� 
		addAll.removeAll(retainAll);
		System.out.println("removeAll(�ߺ������� ��������Ʈ) : " + addAll);
		 */

	}
}
