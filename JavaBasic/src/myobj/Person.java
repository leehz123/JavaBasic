package myobj;

public class Person {
		public String name;
		public int age;		
		
		public Person() {
			
		}
		//�ٸ���Ű���� �ۺ��� ������ ������ ���� �Ұ�
		public Person(String name, int age) {
			this.name = name;
			this.age = age;	
		}
		
/*
						// �λ縦 �Ѵٴ� �� �ϴ� � ����� �����ٴ� ������. 
						//������ ������ PersonŬ����(���赵)�� �� �Ű����� Person(�ν��Ͻ�)�� �ٸ� �� ��ö�� ��ͱ� ��¯�� �ƹ��� ���� �� ����.
		public void sayHi(Person p) {
			if (p.age < 10) {
				System.out.println("�ȳ� �� �̸��� " + name + "(��)��. ���̴� " + age + "�� �̾�.");
				//										this.name �ε� this�� ���� �� ����. (Extend���� Police p3����)
			}	else if (p.age < 20) {
				System.out.println("�ȳ��ϼ��� �� �̸��� " + name + "(��)����. ���̴� " + age + "�� �Դϴ�. ");
			}	else if (p.age < 30) {
				System.out.println("�ȳ��Ͻʴϱ� �� �̸��� " + name + "�Դϴ�. ���̴� " + age + "�� �Դϴ�. ");
			}
			
			//Police�� Programmer�� sayHi()�� @Override�� ��� �ּ�ó�� �س�����. 
			
		}
*/		
		
		//��/�ٿ�ĳ������ ���� ���� ���� ���̰� �ƴ� �� ���̴�� ����ϵ��� �غ�����. 
		public void sayHi() {
			if (age < 10) {
				System.out.println("�ȳ� �� �̸��� " + name + "(��)��. ���̴� " + age + "�� �̾�.");									
			}	else if (age < 20) {
				System.out.println("�ȳ��ϼ��� �� �̸��� " + name + "(��)����. ���̴� " + age + "�� �Դϴ�. ");
			}	else if (age < 30) {
				System.out.println("�ȳ��Ͻʴϱ� �� �̸��� " + name + "�Դϴ�. ���̴� " + age + "�� �Դϴ�. ");
			}
			
			
			
		}

		
}
