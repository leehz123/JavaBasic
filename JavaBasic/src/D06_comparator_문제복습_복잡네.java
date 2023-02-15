import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_comparator_��������_����� {

/*
  
 
# Comparable
Comparable �������̽��� �����ϴ� Ŭ������ compareTo(Object o) �޼��带 �������̵� �ؾ� �Ѵ�.  
compareTo() �� this �ν��Ͻ��� �Ű������� ���� �ν��Ͻ��� ����. 


# Comparator
Comparator �������̽��� �����ϴ� Ŭ������ compare(Object o1, Object o2) �޼��带 �������̵� �ؾ� �Ѵ�. 
compare()�� o1 �ν��Ͻ��� o2 �ν��Ͻ��� ��
 

** compareTo()�� compare()�� �Ű����� Ÿ�� ���� ���� (�ٿ�ĳ����)

** Integer, String �� Collections�� ���̴� �⺻ Ŭ�������� Comparable�� �̹� ������ �ֱ� ������ ���� ������ �ʿ䰡 ����. 
 
 */
	
	
	public static void main(String[] args) {
		
		//Integer���� f3�� ������ Integer�� �̵��غ��� comparable�� ������ ���� 
		//public final class Integer extends Number implements Comparable<Integer> {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(-1);
		numbers.add(3);
		numbers.add(-11);
		System.out.println(numbers);
		Collections.sort(numbers); 
		//����(Integer)�� ��� �����ؾ����� �ʹ��� ��Ȯ�ؼ� �ڹٰ� ��� �����϶�� �̸� ������
		
		
		
		
		
		ArrayList<Grape> grapes = new ArrayList<>();
		grapes.add(new Grape(3000, 33, 1, "���ѹα�"));
		grapes.add(new Grape(3000, 33, 1, "���ѹα�����"));
		grapes.add(new Grape(3000, 33, 1, "���ѹα�1"));
		grapes.add(new Grape(3000, 33, 1, "���ѹ�"));
		grapes.add(new Grape(3000, 33, 1, "����"));
		grapes.add(new Grape(3000, 33, 1, "���ѱ�"));
//		grapes.add(new Grape(3000, 33, 1, "ĥ��"));
//		grapes.add(new Grape(3000, 55, 2, "������"));
//		grapes.add(new Grape(3000, 56, 2, "������"));
//		grapes.add(new Grape(3200, 28, 3, "������"));
//		grapes.add(new Grape(3200, 31, 1, "ĥ��"));
//		grapes.add(new Grape(3300, 50, 1, "������"));
//		grapes.add(new Grape(3300, 51, 0, "������"));
//		grapes.add(new Grape(3300, 55, 1, "������"));
		System.out.println(grapes);
		//Collections.sort(grapes); //������ ����. price, qty, color, origin �߿� �ַ� ������ �Ǿ� �ϴ��� 
		//�ٵ� �츮�� ���� GrapesŸ�Կ� ���ؼ� ���� �����ؾ� �� �� ������ ����. 
		
//����. Integer���� sort�� ������ ������ Grape���� ���� ������ �����Ƿ� ���� �ۼ��ؾ� �Ѵ�. 
	
		//implements Comparable �ϰ� compareTo()�� �������̵� �ϰ� ������ ������ ���� �ʴ´�. 
		Collections.sort(grapes);
		System.out.println(grapes);
		
		
		
		//compareTo()�� ���� ���� 
		//grapes.get(0) �� this�̰�, grapes.get(3)�� �Ű������� ���� �ν��Ͻ��� ��.
		System.out.println(grapes.get(0).compareTo(grapes.get(3)));
		
		
		//Collections.sort(����Ʈ, ���۷�����) : �ش� ����Ʈ�� ���۷����ͷ� �����Ͻÿ� 
		Collections.sort(grapes, new �����з���());  
		System.out.println(grapes);
	}
}





			//�������̽��� �޾��ָ� ���� �ݵ�� �����ؾ� �ϴ� �޼��尡 ���� 
class Grape implements Comparable { //������ �񱳰� ������ Ŭ������� ���� ǥ��    
						//�ٵ� ��� Comparable�� ���׸��� ���� ���� Comparable<Grape> �̷��� ���ָ� objectŸ������ ���� �ʰ� GrapeŸ������ ����. 
						//�׷��� �ؿ��� CompareTo() �������̵��� �� Grape g = (Grape)o; �̷��� �ٿ�ĳ���� �� ���൵ ��
	
	int price;
	int qty; //��� ����ֳ�
	int color;
	String origin;
							//color pick ���� #�� 0x��� �ϴ°�?
	static String[] colors = {"0x48258A", "0x00C72E", "0x00C72E", "0x00C72E", "0x00C72E"};
	
	public Grape(int price, int qty, int color, String origin) {
		this.price = price;
		this.qty = qty;
		this.color = color;
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d/%s/%s", price, qty, colors[color], origin);
	}

	
	
	
	
	
	@Override			//o���� � Ÿ���̵� �� �� ������ �ڱ��ڽ� �ν��Ͻ��� ���Ϸ��� �ٿ�ĳ������ ����� ��
	public int compareTo(Object o) {
		
		/*
		# compareTo�� ��Ģ
		this.(==�ν��Ͻ�)�� �Ű������� ���޵Ǵ� o.(==���� �ν��Ͻ�)�� ���Ѵ�. 
		�� �ν��Ͻ��� �� ����� ���� �˸��� ������ ����. (-1, 0, 1) 
		
		this. �ν��Ͻ��� ���ʿ� �ΰ� ������ return -1; (Ȥ�� ��� ����) 
		this. �ν��Ͻ��� �����ʿ� �ΰ� ������ return 1; (Ȥ�� ���� ����) 
		�״�� �η��� return 0; 
		 */
		
		
		/*
				 //�񱳴� �������� �� �ű⶧���� �ٿ�ĳ���� �ص� ���� ���� 
		Grape g = (Grape)o; 
		if(this.qty > g.qty) {  
			return -1; // this.qty�� ���ʿ� �ΰڴ� == ū �ͺ��� ���� == �������� �ϰڴ�. 
		} else if (this.qty < g.qty) {
			return 1;
		} else {
			return 0;
		}
				
		*/
		
		
// ����1________________________________________________________________________________________________

		// ������ ���� �������� ������������ ���ĵ� �� �ֵ��� �ٲ㺸����. ������ ���� ���� ������ ��������.

		/*
		Grape g = (Grape)o;
		if(this.price < g.price) {
			return -1;
		} else if (this.price > g.price) {
			return 1;
		} else {
			
			if (this.qty > g.qty) {
				return -1;
			} else if(this.qty < g.qty) {
				return 1;
			} else {
				return 0;
			}
			
		}
		 */
		
		
// ��ȭ����__________________________________________________________________________________		
		 
		/*
		
		������ �̸� �������� �������� �����غ�����. 
		 
		�����
		������
		
		���
		�������
		����ֽ�
		����꽺
		���û
		�̷��� ���� �Ǿ� ��. ������ ���ڼ���� �����ϴ°� ���� ���� �ƴ�
		
		*/
		
// �ϴ� GrapeŬ������ implements Comparable �� �� <Grape>�� ���� �� �������� Object���� (Grape)�� ����ȯ ���ֱ� 
		Grape g = (Grape)o;
		
		
// ���ϴ� �� ���ڿ��� ���̰� ���̳� ��쵵 ó�� ����� �� 
		
		// �ϴ� �� �ν��Ͻ��� origin�� ��� ���ڿ��� ���̸� len1, len2�� ����ֱ� 
		int len1 = origin.length();
		int len2 = g.origin.length();
		
		// len1�� len2 �� �� �� ª�� ���ڿ� ���̸� len�� ����
		// "����"�� "���ѹ�" ���� �� ���ѱ����� ���ϰ� �������� �ϱ� ���� 
		int len = len1 < len2 ? len1 : len2; 
		
		// len�� ��� ���ڼ������� ��
		for(int i = 0; i < len; ++i) {
			char ch1 = origin.charAt(i);
			char ch2 = g.origin.charAt(i);
			
			
			if (ch1 > ch2) {
				return 1;
			} else if (ch1 < ch2) {
				return -1;
			} //�̷��� �ϸ� ù����~len ���ڱ��� ���ϸ鼭 this�ν��Ͻ��� ���ʿ� ���ٰ� �����ʿ� ���ٰ� �ϰ���.
			
		}// ������� �ϰ� ���� �ϴ� len���ڱ����� �� �Ϸ�.  
		// ���⼭ else {return 0;}�� �ع����� ���ڼ��� �ϴ� �񱳴� �̷����� �ʰ���
		// "����" �� "���ѹ�" �� ���� �񱳰� �̷����� ���� �Ŷ� ��. 
		// �׿����� ó���� for�� �ۿ� �ٸ� if������ ó������� ��. 
		
		if (len1 < len2) {
			return -1;
		} else if (len1 > len2) {
			return 1;
		}
		return 0;	
	}
}

/* 
�̰� �� �ӿ� ����
@Override 
public int compareTo(Grape g) {
	return this.origin.compareTo(g.origin);
}
*/




/*


�ٵ� �ٸ� ���� ������ �� ����� ���� ���� ������? 
Comparable()�� �ι� ��� ���� ���� ���� ��¼�� ������?
�̷� �� ����ϴ� ���� �ٷ� Comparator!

Comparator �� Ŭ������ ������ �� �� ����. �̰� �͸���Ŭ�����ε� ���� �� ����(�� ��α׿� ���� �� �ۿ°� ����) 

�׸��� compareTo() �� compare() �������̵� �� �� if������ ������ ����� �ִµ�
�� ����� �ٷ� '������'! 
��) return qty - o.qty;
��, ���� ������� �� ���� �����÷γ� ����÷θ� �����ϱ�


*/


class �����з��� implements Comparator<Grape> {
	@Override
	public int compare(Grape g1, Grape g2) {
		return g1.price != g2.price ? g1.price - g2.price : (g2.qty - g1.qty);
		//�̰� ���� 1���� ���� ������� Ǭ ��. ���� ��������
	}	
}





