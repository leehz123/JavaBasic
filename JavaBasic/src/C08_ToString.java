import java.util.Arrays;

/*
# Object.toString() : �ش� Ŭ������ ���ڿ��μ� ��µǾ�� �� �� ������ ȣ��Ǵ� �޼���. 
	Object�� ��� Ÿ���� �θ��̱� ������ ��� Ŭ������ toString�� ���ԵǾ� �ִ�. 
	�������̵��ؼ� ������� ������ �޸� ���� �ּҰ��� ���ڿ��� ��ȯ�Ѵ�. 
 	�׷��� �������̵带 ���� �츮�� ���ϴ� ���ڿ��� �������ֱ�
 */
class Pig{
	int gram_price;
	int gram;
	
	final static String type = "����";
	
	public Pig(int gram, int gram_price) {
		this.gram = gram;
		this.gram_price = gram_price;	
	}
	@Override
	public String toString() { 
		return String.format("����\t: %s\n" 
							+ "g �� ����\t: $d\n" 
							+ "�� ���� :\t" 
							+ "����\t: %d", type , gram_price , gram , gram_price*gram);
	}
}


public class C08_ToString {
	public static void main(String[] args) {

		
		
		Pig meat = new Pig(150, 40);
		
		System.out.println(meat);
		

	}
}
