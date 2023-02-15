import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class D07_HashMap {
	
	
/*
# Hash Map �繰�� ���� ��
�����͸� Key-Value �ѽ����� �����ϴ� ����� �ڷᱸ��
�ε��� ��ȣ ��� Key�� ���� �����Ϳ� �����Ѵ�. 
Key�� �ߺ��� ������� �ʈf��.




 */

	public static void main(String[] args) {
		//K�� V�� ���׸� �������ֱ�(���� �� ���ָ� Object�� ������)
		HashMap<String, Integer> map1 = new HashMap<>();
						//Ÿ������ �迭�� �� �� ����. ���׸��� Ÿ������ �������� �����ѵ�, �迭�� Ÿ���� �������̴ϱ�.
		HashMap<Integer, String> map2 = new HashMap<>();
		//put(K, V) : �ش� Ű�� ���� �����Ѵ�. 
		map1.put("age", 10);
		map1.put("score", 1234);
		map1.put("qty", 5);
		map1.put("cash", 5000);
		
		map2.put(330, "������");
		map2.put(350, "��������");
		
		System.out.println(map1);
		System.out.println(map2);
		
		//get(K) : Ű���� �ش��ϴ� ���� ������. �ش� Ű �Ǵ� ���� ������ null
		System.out.println(map1.get("score"));
		System.out.println(map1.get("Score")); 
		System.out.println(map2.get(330));
		
		HashMap<String, String> nav = new HashMap<>();
		nav.put("�츮��", "����� ������ ������ 123-123");
		nav.put("ȸ��", "����� ������ ��������д�����");
		nav.put("�ŷ�ó1", "����� ������ ������ 321-321");
		System.out.println(nav);
		
		//�̹� �����ϴ� Ű�� put�� �ϸ� ���� �����.
		nav.put("ȸ��", "����");
		System.out.println(nav);
		
		// putIfAbsent(K, V) : �ش� Ű���� ��� ������ ���� �ְ� null�� ����. 
		String value = nav.putIfAbsent("����1" , "��⵵ ������ ������ 111-111");
		System.out.println(nav);
		System.out.println(value); //null�� ����
		
		//Ű���� �̹� ���� �����Ѵٸ� ���� ���� �ʰ� ����ִ� ���� ����
		value = nav.putIfAbsent("����1", "�Ƶ�����");
		System.out.println(nav);
		System.out.println(value);
		
		
		System.out.println();
		System.out.println();
		
		//Map�� �÷����� �ƴ�����, Key�Ǵ� Value�� ���� Set�� Colleciton���� ���� �� �ִ�. 
		//map.keySet() : : �ش� ���� Ű��θ� �̷���� Set�� ��ȯ�Ѵ�. 
		Set<String> keys = nav.keySet();
		System.out.println(keys);
		
		
		//Key���� �ݺ������� Ȱ���� �� �ִ�.  
		System.out.println("�������������� map.keySet() for-each�� �ϳ��� ��� �������������� ");
		for (String key : keys) {
			System.out.println(key);
		}
		
		System.out.println();
		System.out.println();
		
		//map.values() : �ش� ���� Value��θ� �̷���� �÷����� ��ȯ�Ѵ�. 
		Collection<String> values = nav.values();
		//value�� ���ؼ��� �ߺ��� ����ؼ� �÷������� ������ key�� ���ؼ��� �ߺ��� ������� �ʱ� ������ Set���� �����±�
		List<String> valueList = new ArrayList<>(values); //�̷��� �ϸ� ����ε� ��ȯ ���� 
		
		Collections.sort(valueList); //���ĵ� �����ϰ� 
		System.out.println(valueList);
		System.out.println("�������������� map.values() for-each�� �ϳ��� ��� �������������� ");
		for(String val : values) {
			System.out.println(val);
		}

	}
}
