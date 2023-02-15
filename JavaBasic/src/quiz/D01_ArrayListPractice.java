package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class D01_ArrayListPractice {	
	public static void main(String[] args) {

		
		//	# ArrayList�� 1000���� 9999�� ���������� 100�� �߰��� �� ������ ���غ�����. 
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i <= 100; ++i) {
			list.add((int)(Math.random() * 9000) + 1000); 
		}
		System.out.println(list);

		//���� Ǯ��
		//�� �̷��� �ѹ濡 �����±��� �����������������������
		int sum_ = 0;
		int min = list.get(0);
		int max = list.get(0);
		
		for(int num : list) {
			sum_ += 0;
			min = min > num ? num : min;
			max = max < num ? num : max;
		}
		
		System.out.println("��� : " + sum_ / (double) list.size());
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		System.out.println("77��° �� : " + list.get(76));
		
		
		
		//�� �����δ� �� Ǯ��~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//	1. ��� ������ ���
		int sum = 0;
		for(int num : list) {
			sum += num;
		}
		
		System.out.println("��� : " + sum);
		
		//	2. ��� ���� �� ���� ū �� 
		int maxNum = list.get(0);
		for(int i = 0; i < list.size(); ++i) {
			maxNum = Math.max(maxNum, list.get(i));
		}
		System.out.println("�ִ밪 : " + maxNum);
		
		
		//	3. ��� ���� �� ���� ���� �� 
		int minNum = list.get(0);
		for(int i = 0; i < list.size(); ++i) {
			minNum = Math.min(minNum, list.get(i));
		}
		System.out.println("�ּҰ� : " + minNum);
		
		
		//	4. 77��°�� ���� �� 
		System.out.println("77��° �� : " + list.get(76));
		
	
		// ----------------------------------------------------------------------------------------------------------------
		
		System.out.println("Collections�� ���� �ִ밪 : " + Collections.max(list));
		System.out.println("Collections�� ���� �ּҰ� : " + Collections.min(list));
		//Collection�� �޶� �ߴµ� ArrayList�� Collection�� �ڽ��̶� �� �� ����
		//��� : �ƴ� ���� ���̴�~~~~! �𸣸� �迭 ������ �Ű�, �˸� �� �ٷ� ������ �Ű�
		
		
		//�迭�� ArrayList�� �ٲٴ� �����? ������? 
		
		//�ϴ� ����Ʈ�� �迭�� ��ȯ�ϴ� ���� ����
		//1. ���� ���� �迭�� �̸� �����صд�. 
		Integer[] arr = new Integer[list.size()]; //�ʱ�ȭ �� ���ָ� ������
		//int�� �ϸ� �� ��. Integer�� �ؾ� ��!
		
		//2. toArray() �޼��忡 �̸� ������ �迭�� �����Ѵ�. 
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//�迭�� ����Ʈ�� ��ȯ�ϴ� ��
		//List<Integer> list = Arrays.asList(arr);
		//ListŸ������ ��ĳ���� �� �� 
		System.out.println(list);
		
		//����Ʈ�� ��ȯ�� �迭�� Collection�̱� ������ �ٽ� ArrayList�� ��ȯ�� �� �ִ�. 
		list = new ArrayList<>(list); //�ٽ� ��ĳ���� �� ��
		
		
		
		Collection<Integer> c = new ArrayList<>(list);
		List<Integer> l = new ArrayList<>(list);
		ArrayList<Integer> l2 = new ArrayList<>(list);
		//ArrayList�� �θ��� List�� �θ��� Collection 
		//Collection , List, ArrayList �� ����Ʈ ����� Ÿ�Թ̽���ġ ���� 
		
		
		//����Ʈ�� ��ȯ�� ����� ����
		//����Ʈ�� ��ȯ�� ����� �����ص� ���� �迭���� ������ ��ġ�� �ʴ´�. new ArrayList�ϸ鼭 ���� ����� �� �Ŵϱ�(������ ��)
		for(int i = 0; i < l2.size(); ++i) {
			if (l2.get(i) > 1100) {
				l2.remove(i--); //���࿡ �����ٸ� --
			}
		}
		System.out.println(l2);
		System.out.println(Arrays.toString(arr)); //���� �迭�� �״�� �ֳ� 
	
	}
}
