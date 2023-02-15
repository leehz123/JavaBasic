package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D07_CountFruits {
/*
 �迭�� �ٸ� ������ �������� 1000�� �߰��� �� �� ������ �� ���� �����ߴ��� �������.
 �� �ؽø��� ���� �ʾƵ� ��
 */
	private static String[] fruitNames = {"apple", "banana", "orange", "kiwi", "grape", "peach", "strawberry"};

	
	public static void main(String[] args) {
		//����Ǯ��.
		// �� �迭�� �߰��϶� �߳� ��..
		HashMap<String, Integer> fruitCountMap = new HashMap<>();
		
		String[] fruits = new String[1000];
		for(int i = 0; i < fruits.length ; ++i) {
			fruits[i] = fruitNames[(int)(Math.random() * fruitNames.length)];
		}
		
		//�̷��� ���ִ� ����� �ְ��� (���� �� ����� ����. �̰ͺ��� for-each���°� ����. for-each�� 1000���� Ž���ϸ� �Ǵϱ�.)
		List<String> fruitList = Arrays.asList(fruits);
		for(int i = 0; i < fruitNames.length; ++i) {
			fruitCountMap.put(fruitNames[i], 
				Collections.frequency(fruitList, fruitNames[i]));
				//�� Collections.frequency()�޼��� ��ü�� ����Ʈ ��ü��ŭ Ž���� �ϱ� ������ �ؿ� for-each���� �ξ� ���ɻ� �̵�.
		}
		
		
		for(String fruit : fruits) {
			//������ �ϳ��� �����鼭 �� �� �����ߴ��� ���� ��
			/*
			//�� �� �� ������ �ٽ� ���� �ڡڡ�
				//Map���� �����̸��� �ش��ϴ� ���� ������ ������. 
			Integer cnt = fruitCountMap.get(fruit);
			//�ش� ���� �̸��� ��ϵ� ���� ���� �� null�� ���´ٴ� ���� �̿��ϴ� ��. 
			
			if(cnt == null) { //�ʿ� ���� ��ϵ��� ���� ����. ó�� ��ϵǴ� �����̹Ƿ� ���� 1�� ���
				fruitCountMap.put(fruit, 1);
			} else { 
				fruitCountMap.put(fruit, cnt+1);
			}
			 */

			//������ �̷��� ª�� ���� ���� ���� �� �ڡڡ�
			Integer cnt = fruitCountMap.putIfAbsent(fruit, 1);
			if(cnt != null) {
				fruitCountMap.put(fruit, cnt+1);  
			}
		}
		System.out.println(fruitCountMap); //���Ͽ� ���� ����Ƚ���� �������� . ���࿡ �̰� �迭�� �־��ٸ� ���� ��� �����ߴ��� �Ǵ��ϱ� ������. �ؽø��� ��
		//���� ����Ʈ�� �ѹ� ���ְ� ���⼭ �� ���� �ű� ������ 2�谪���� ��µ�. ���������
		
		
		
		
		
		
		/*
		�� Ǯ��. (���� �߸� ��. �迭�� �������µ� �� Ǯ�̰� ���� �޶��ڳ�)
		//�ؽø� �����ؼ� �������� value ä���ֱ� 
		HashMap<Integer, String> map = new HashMap<>();
		for(int i = 0; i < 1000; ++i) {
			map.put(i, fruitNames[(int)(Math.random() * fruitNames.length)]);
		}
		System.out.println(map);
		
		//�ؽø� map���� .values()��  ��(���ڿ�)�� �̾Ƽ� ���ڿ� �÷��ǿ� ����ֱ� 
		Collection<String> values = map.values();
		System.out.println(values);
		System.out.println();
		
		int frequencySum = 0;
		for(int i = 0; i < fruitNames.length ; ++i) {
			int frequency  = Collections.frequency(values, fruitNames[i]);
			System.out.println(fruitNames[i] + "�� ����Ƚ�� : " + frequency);
			frequencySum += frequency;
		}
		System.out.println();
		System.out.println("�˻� : "  + frequencySum);
		*/
		
	}
	
	
	
	
	
	
}