
public class C03_Constructor_�����ڸ���� {
	public static void main(String[] args) {
		Car1 c = new Car1();
		System.out.println(c.color);
	}
}

//���� ��Ű���� �̸��� ���� Ŭ������ �����ϸ� �ȵȴ�!!!!
class Car1 {
	int mileage;
	boolean flaw;
	int oil;
	String color;
	
	Car1() {
		this("pink");
	}

	Car1(String color) {  //�޼��� �����ε��� ���� 
		this.color = color;
	}
	
	void drive() {
		mileage += 1;
		oil -= 10;
	}

	void accident() {
		flaw = true;
	}

	void info() {
		System.out.println("######���� ����#######");
		System.out.println("����Ÿ� : " + mileage + "km");
		System.out.println("����� : " + flaw);
		System.out.println("�⸧ �ܿ��� : " + oil + "L");
		System.out.println("���� ���� : " + color);
	}
}