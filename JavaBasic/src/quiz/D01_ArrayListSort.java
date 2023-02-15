package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D01_ArrayListSort {
	
	public static void main(String[] args) {
		/*
		//���ڿ��� ������������ �����ϴ� ����
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("monkey");
		animals.add("zibra");
		animals.add("lion");
		animals.add("giraffe");
		
		//Collections.sort(list) : ����Ʈ�� ������ ������������ �������ִ� �޼���. ���������� ������ �������� ������ ��.
		Collections.sort(animals);
		System.out.println(animals);
		*/
		
		// Q. ArrayList�� 100���� ���� ���� ä�� ��(���� ����) ������������ �����Ͽ� ����غ��ÿ�
		//Collection ������� ���� ���� �˰��� ��� �ɷ� ������ �غ��� 
	
		
		//���� �迭 ����� 
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 100; ++i) {
			list.add((int)(Math.random() * 1000));
		}
		System.out.println(list);
		//���� ���� 
		for(int i = 0; i < list.size() - 1; ++i) {
			for(int j = 0; j < list.size() - 1 - i; ++j) {
				if(list.get(j) < list.get(j+1)) {
					int tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1,tmp);
				}
			} 
		}
		System.out.println("���� �´�? : " + list);
			
			//���⼭ ������ ���� list.add()�� �ϸ� ���ѷ����� ���� ��(OutOfMemoryError).  
			//add�� �ϸ� ��� �߰��ϰ� �Ǵ� �Ŵϱ�!
			//�׷��� set���� �ؾ� ��!
		
		//����.
		//list.add()�� �����͸� ��� �߰��ϴ� ��
		// ���Կ��꿡�� .set�� �� ������. 
		
		//Collections.sort(list) : ����Ʈ�� ������ ������������ �������ִ� �޼���
 		Collections.sort(list);
		//Collections.reverse(list) : ����Ʈ�� ������ �Ųٷ� �������ִ� �޼��� 
		Collections.reverse(list);
		System.out.println(list);
		//������ �ϰ� ������ 
		//��� ����Ÿ���� void�ΰ���?
		 
		//���� �̷��� �ߴµ� ���� .sort()�� .reverse()����ϸ� ���� �̷� �ʿ� ����
		ArrayList<Integer> desc = new ArrayList<>();
		for(int i = 0; i < 100; ++i) {
			desc.add(Collections.max(list));
			list.remove(Collections.max(list));
		}
		System.out.println(desc);
		
	}
}
