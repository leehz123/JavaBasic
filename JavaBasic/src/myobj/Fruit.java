package myobj;

public class Fruit {	
	int price;
	double sweet;
	
	public Fruit(int price, double sweet) {
		this.price = price;
		this.sweet = sweet;
	}
}

//�ڽ� Ŭ������ �ݵ�� �θ��� �����ڸ� ���� ù�ٿ� ȣ���ؾ� �Ѵ�. 
//�θ�Ŭ������ �⺻ �����ڰ� ���ٸ� super()�� �ݵ�� ����ؾ� �Ѵ�. 
class Peach extends Fruit {
	Peach() {
		super(1500, 9.9); //�ڽ� �����ڿ����� �⺻���� �θ� �����ڸ� ȣ������� �ϴµ� ���� ������ �ʰ� ���� �־���� 1500, 9.9
	}
}