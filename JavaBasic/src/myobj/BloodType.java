package myobj;
/*
C13_AbstractClass �ǽ�
myobj��Ű���� �������� Ȱ���� �� �ִ� abstractŬ������ �ϳ� �����غ�����
 */


//���� �̷� �޼��尡 �־�� �ұ�
//�״� �ո������� �ʴ�. �� ������

public abstract class BloodType {
	String bloodType;
	
	abstract void character();
}

class A extends BloodType {
	A() {
		bloodType = "A";
	}
	@Override
	void character() {
		System.out.println("�Ĳ��ϰ� �����ϴ�. ");	
	}
	
	@Override
	public String toString() {
		return "������ : " + bloodType;
	}
}

class B extends BloodType {
	B() {
		bloodType = "B";
	}
	@Override
	void character() {
		System.out.println("�米���̴�. ");
		
	}
	@Override
	public String toString() {
		return "������ : " + bloodType;
	}
	
}

class O extends BloodType {
	O() {
		bloodType = "O";
	}
	@Override
	void character() {
		System.out.println("�������̴�. ");
		
	}
	@Override
	public String toString() {
		return "������ : " + bloodType;
	}
	
}

