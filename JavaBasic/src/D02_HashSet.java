import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D02_HashSet {
/*
����Ʈ�� ��. �ڷᱸ���� �ٽ�

# Set
������ �����س��� Ŭ����
����ó�� ��� �߿� ���� ���� �ߺ��Ǵ� ���� ������� �ʴ´�. 

# Hash
���� ���� ������ �׻� ������ ���� ������ �ܹ��⼺ �˰���
��������� ������ ���� �����ϴ� ���� �Ұ����ؾ� �Ѵ�. 
������ ������ üũ�� ���� �پ ������ ���δ�.
//Hash�� ������� �� ������ �������� �ʴ´� �� = �ε����� �������� �ʴ´�. 
Ư�� �������� ���� ��ȣ�μ� Ȱ��ȴ�.
(Set�̶� list�� ���� �θ��� �ڽ��̶� ������� �����. 
�������̽��� ����ؼ� ���� �۵������ �����س��� ����)
(�ӵ��� ���� ���� ����, �ε����� �ʿ��ϸ� ��� ���� �ǰ� �ƴϸ� �ؽü�)



"abc" => ba7816b..... �̰� ���� "abc"���� �˰���? � ���� �ص� ã�°� �Ұ���. 
"abcd" => 88d4266... d �ϳ��� �ٲ���� ���ε� ������ Ȯ �޶���
(�ð��� ������ �־ �׻� ���� ���� ����)
�ߺ� üũ�ÿ� ���� �پ ������ ���δ�. 
�� ������ �־ �׻� ������ ������ ���� ����. �ٵ� �� �ϳ��� �� ������ Ȯ �ٲ�
"cat" => 77af778...
�츮�� �ƹ��� ��Ģ���� ���� �־ ������� �׻� ����ġ ���� 
���� �����͸� ���� ���� �ؽú��� �� ����°� ����
�ٵ� �� ��縦 ���� ���� �ؽ÷� ���ϴ°� ������
 */
	
	
	public static void main(String[] args) {
		//add(item) : list�� Set��� Collections�� �ڽ��̱� ������ ���� ���� �޼��带 ����Ѵ�. 
		HashSet<String> fruits = new HashSet<>();
		
		
		//set���� �ߺ��Ǵ� �����͸� �߰��ص� �˾Ƽ� ���ŵȴ�. 
		//�׸��� ����� ���ĺ� ���� �ƴ� ���ڴ�� �� ���� 
		fruits.add("mango");
		fruits.add(new String("mango"));
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("green apple");
		fruits.add("red apple");
		fruits.add("apple");
		fruits.add("apple");
		System.out.println(fruits); //�ߺ��� apple���� ��µ��� ���� �ϳ��� ��µ� 
		
		//Hash Set�� Hash�˰����̱� ������ ������ ���� �ε����� ��� get()�� ����� �� ����.
		//�׷� ��� ������
		//������ �Ź� �ٲ� �ε����� �ǹ� ���� ��, ���� ������� ������ ���� ����!
		//for-each������ ������ ������~
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//set.size() : set�� ũ��
		System.out.println("set�� ũ�� : " + fruits.size());
		
		//�÷����� �ٸ� �÷��������� ��ȯ�� �����Ӵ�. 
		//HashSet�� ArrayList�� �־��ִ� ����� ArrayList<>(�ؽü�); ���ָ� ��
		ArrayList<String> fruitList = new ArrayList<>(fruits); //�� �̷��� () �ȿ� �־��ָ� ��?
		Collections.sort(fruitList);
		System.out.println(fruitList);
		
	} 
}
