package myobj;

public class Police extends Person {
	
	public Police() {
		
	}
	

	public String name;
	public int age;
	
	public void hi() {  //�޼ҵ嵵 this hi()�� super sayHi() �� �ٸ�����
		super.sayHi();
	} 
	//�� hi()�޼���� super.sayHi();�� �θ�Ŭ������ sayHi()�� �̿��ϰ�
	//�׳� (this.)sayHi();�� PoliceŬ������ sayHi()(ProgrammerŬ������sayHi()�� �������̵��� sayHi())�� �̿��ϰ� �ȴ�. 
							//(�Ʒ� @Override)ǥ���ص� sayHi();) 
	//�ȿ� �� ä����Ŀ� ���� �ٸ��� �۵�
 	
	//@Override         Extend���� Police popo1, Programmer coder ���ø� ��� ���� ��� �ּ�ó�� 
	public void sayHi() {  //�̰͵� sayHiġ�� ctrl + space���ָ� override�� �� �ִ� ����� ����. 
		System.out.println("�ȳ��Ͻʴϱ� " + name + "�Դϴ�.");
		//this.name
		
		System.out.println("�ȳ��Ͻʴϱ� " + super.name + "�Դϴ�.");
	}
	
	
	public void setName(String name) {
		super.name = name;
	}
	
	public void setAge(int age) {
		super.age = age;
	}
	
	//super�� name�� age�� ��ġ�� ����� �̷��� �޼ҵ带 ���� super.name �� super.age�� �־��ִ� ����ۿ� ����
	//�ƴϸ� ���ʿ� �� Police�� name�� age�� ������ ���簡 (�׷��� Extend���Ͽ��� p3.name p3.age�� ���� �߰��ϸ� �ٷ� Person�� age, name�� ���ϱ�
	//�׸��� Extend���Ͽ��� super�� �� �� ���°� �� ������ Person�� ����ϰ� ���� �����ϱ�. 
	
	//�ƹ�ư this�� ���� �� �⺻������ this�� ��. 
}
