import java.util.Date;

public class D11_Date {
	/*
	 # java.util.Date Ŭ���� 
	 �ڹٿ��� �ð� �� ��¥�� �ٷ�� Ŭ����
	 ������ �����Ǿ �޼���� �� ������� �ʴ´�. 
	 */
	public static void main(String[] args) {
		
		//System.currentTimeMillis() : ������ ���н� Ÿ���� ���Ѵ�. 
		//���н� Ÿ�� : 1970 �� 1�� 1�� ���ķ� �ð��� �󸶳� �귶���� 1/1000�ʷ� �� ��. 
		
		System.out.println("���� �ð�: " + System.currentTimeMillis() + " ms");
		//���̰� ��� ������ �������� longŸ�Կ� ��ƾ߰���? 
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 + " s");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 / 60 + " min");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 / 60 / 60 + " hour");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 / 60 / 60 /24 + " days");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 / 60 / 60 /24 /365 + " years");
		//�ٵ� ���� �̰� ����ϰ� �ְ��� ������ �������� Ŭ������ �ְ���
		
		//�̰� ��ü ��� ��? 
		//���� �Ʒ�ó�� �ڵ����ð� ������ ���ȴ�. 
		long begin = System.currentTimeMillis();
		for(int i = 0; i >= 0; i+= 1000) { 
			System.out.println(i);
		}
		System.out.println("����ð� : " +(System.currentTimeMillis() - begin) + "ms");

		
		
		
		
		Date now = new Date();  //java.util.Date�� 
		System.out.println("now : " + now);
		
		//DateŬ������ ���� �޼������ �� �̻� �ڹٰ� �������� �ʴ´�. (���� �׾�����)
		Date date = new Date(125, 0, 23); 
		//0�� 1��. 2025������ �ϰ� ������ 125�� �־�� �� ���ֱ��� ����. �� �ܿ��� ���� ������ ����� �޼�����
		System.out.println("date : "+ date); //�ƹ�ư ���� ����� �� ������ ����.��� �̻��а� ����
		System.out.println("���� �ð��� date�� ����� �ð����� �� �ΰ���? : " + now.after(date));
		System.out.println("���� �ð��� date�� ����� �ð����� �� �ΰ���? : " + now.before(date));
		
		//�̷��� ���� �޼������ ������ ������ ���� ��Ƴ��� �뵵�δ� ����
		//�ð� �� ��¥�� �ٷ� �� longŸ���� �䱸�ϴ� �Ķ���ʹ� ��κ� ���н� Ÿ���� �ǹ��Ѵ�.
		date.setTime(4324228333392L);
		System.out.println(date);


	}
}

