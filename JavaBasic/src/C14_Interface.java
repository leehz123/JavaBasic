

/*
# �������̽� Interface
�ڹ��� Ŭ������ ����� �ѹ��� ���� �� ���� �� ����. 
 
�ش�Ŭ������ �������� ���¸� �ο��ϱ� ���ؼ� �������̽��� ����ؾ� �Ѵ�. 
(�ش�Ŭ������ �������� ����(ĳ����)�� �ο��ϱ� ���ؼ� (������) �θ� �����̾�� �ϴµ� abstractŬ�����δ� �׷��� �� �� ����.)
�������̽� ���ο� �����ϴ� ��� �޼���� �ڵ����� abstract public�� �ȴ�.
�������̽� ������ ������ final static�� �ȴ�. 
�������̽��� �ν��Ͻ�ȭ �� �� ����. 
�������̽� ������ �޼��� �տ� default�� ���̸� �������̵� ���� �ʾ��� ���� �⺻ ������ ���� �� �� �ִ�. 
����� �����̱��� �����޴°Ű� �������̽��� �����̴� ���� ġ��� �޼��带 �����޴� �� 

 */

//abstract class Runner {
//	abstract void run();
//}
//
//
//abstract class Swimmer {
//	abstract void swim();
//}
//
//class Human extends Swimmer {
//	@Override
//	void swim() {
//	
//	}
//}

//class Human extends Swimmer, Runner { //����� �ϳ��ۿ� �� ����
//	@Override
//	void swim() {
//	
//	}
//}


public class C14_Interface {
	public static void main(String[] args) {
//		Runner r1 = new Human();
//		Swimmer s1 = new Human();  //����� �ν��Ͻ�ȭ �Ұ� 
		
		Human h1 = new Human();
		
		//��ĳ
		Runner r1 = h1;
		Swimmer s1 = h1;
		
		h1.run(); 
		h1.swim();
		//h1�� Runner�ε� ��ĳ���� �ǰ� 
		r1.run();
		s1.swim();
	}
}


interface Breedable { //�̰� ������� ���̸� ������. ������ �ٿ�����. �׷��� �޸��� Breedable�� ��ĳ���� �Ұ�. ���� Breedable�� ��ĳ���� ����
	void feed();
	void sit();
	void standup();
}


interface Swimmer { 
	//default�� �������� �ʴ� ��� �ݵ�� �����ؾ� �ϴ� abstract�޼��尡 �ȴ�. 
	//abstract�� ������ �ش�ȭ. �������̵带 ���� �� �� �� ����.
	void swim();
}


interface Runner { 
	//abstract void run(); //�������̽� ���ο� �����ϴ� ��� �޼���� �ڵ����� abstract public�� �ȴ�.
	int a = 10;
//	void run();
	default void run() {
		System.out.println("run() �̱���");
	}
}

class Human implements Swimmer, Runner {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	} 
	
}

class Bear implements Runner, Swimmer, Breedable {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		
	}
	
	
	

	@Override
	public void standup() {
		// TODO Auto-generated method stub
		
	}
	
}


class Shark implements Swimmer {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}
//�޸� ���� ��ũ�� �����ӷ� ��ĳ���� �� �� ����



