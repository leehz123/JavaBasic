package myobj;

public class Programmer extends Person {
	//ProgrammerŬ������ PersonŬ������ ��ӹް� ��.
	//	Programmer �� �ڽ� / Person�� �θ�
	
	//��� ����� ������ ���� �� �ְ����� ���α׷��Ӵ� �־���� ��
	public int salary;
	//�ٸ� Ŭ����(Extend)���� �� �� �ֵ��� public ���ֱ�
	
	//�޼ҵ�������̵�
	//@Override //�̷��� ǥ������ ���� ����. 
	//@���̴� �� Annotation(�ּ�) �̶�� ��.  
	//������̼��� �ٿ������� �������̵尡 �������� ���� �� ������ �߻������ش�.  
	public void sayHi () {   //�ަU�� ���� : �θ�Ŭ������ �������̵� �޴ٴ� ǥ��
		//�ٵ� �ȿ� int a �Ű������� �߰����ָ� �������̵��� �ƴ϶� �����ε��� ��. 
		System.out.println("�ȳ��ϼ���. ���� " + salary + " �ް� ���ϴ� " + name + "�Դϴ�.");
	}
	
	public void program(String toProgram) {
		//���α��� ����� ������ ���� �޼��� (toProgram = ���� ���α׷�)
		if (salary < 500) {
			System.out.println(name + "���� \"" + toProgram + "\"���� ���� ������ �߽��ϴ�.");
		} else {
			System.out.println(name + "���� \"" + toProgram + "\"��/�� ���� ������ ������ �߽��ϴ�.");
		}
		//name�� �θ�Ŭ���� Person���� ���� �Ű�, ~~~~~~~~~
	
	}
	
	
	
}
