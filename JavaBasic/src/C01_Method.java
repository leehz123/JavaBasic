

public class C01_Method {
/*
# �Լ� (Function)
-����� �̸� �����صΰ� ���߿� ������ ���� ��
-�Լ��� ������ �������� ������� �ʰ� ���߿� ȣ��Ǿ��� �� ����ȴ�. 
-'�Լ���()' �� ���·� ȣ�� ����  
-���߿� ������ ���ɼ��� �ִ� ��ɵ��� �Լ��� �����θ� �۾��� �ݺ��� ���� �� �ִ�. 
-�ڹٿ��� �Լ��� �ݵ�� Ŭ���� ���ο� ����(����)�ؾ� �Ѵ�. 
�ٸ� ��� ������ Ŭ���� �ȿ� ���� �ʿ� ���� �ٷ� void printRabbit() { } �̷��� �ع���. 
�Լ� �ȿ� �Լ��� ����� ���� �� ��. (�׷��� main()�޼��� ���ο� ���� �Ұ�)
-Ŭ���� ���ο� ����� �Լ��� �޼����� �θ���. 

# �Լ��� ���� (return)
-�Լ��� ������ �� �Լ��� �տ� �ش� �Լ��� �ݵ�� ��ȯ�ϴ� ���� Ÿ���� ������ �� �ִ�. 
-�ش� �Լ��� ȣ���ϸ� ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ��. 
-���� Ÿ�Կ� void�� ������ �ش� �Լ��� ���� ��ȯ���� �ʴ´ٴ� ���� �ǹ�.
-�Լ� ���ο��� ������ ������ �ش� �Լ��� ��� �����ϰ� �Լ��� ȣ���� ������ ���ư���.

# �Լ��� �Ű����� (argument >> args)
�Լ��� ȣ���� �� ()�� �����ϴ� ���� '����'��� �Ѵ�. 
�Լ��� ������ �� ()�� �����ϴ� ���ڰ��� ���� �� �ִ� ������ '�Ű�����'��� �Ѵ�. 

 */

						//��ȣ ���� Ÿ���� �ݵ�� ��ȯ���� Ÿ�Կ� ���� int�� �ƴϾ ��.
	public static int plus(int a, int b) {  //plus ���� int�� plus�Լ��� ��ȯ�ϴ� ���� Ÿ�� 
		int num = a + b;
		return num;    
	}
	
/*	public static int plus(int a, int b) {  //plus ����int�� plus�Լ��� ��ȯ�ϴ� ���� Ÿ��
		int num = a + b;
		return "�ȳ�";       >>�̷��� ������ String�̴ϱ�
	}
*/	
	
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��");
	}
	//����Ÿ���� void�̱� ������ main�ο��� String str = printRabbit(); �̷� �� �Ұ��� ������ ���� ������ ���� ���� �� x
	//printRabbit(3)ó�� ���� ������ ���� ��
	
/*	public static void printRabbit(int num) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		if(num % 2 == 0) {
			return;
		}
		System.out.println("(  >��");
	}
	//�Ѿ�� ���� 2�� �� �󱼸� ���
*/	
	
	
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		printRabbit();
		printRabbit();
		printRabbit();
		printRabbit();
		
		System.out.println("�䳢 10�� �����");
		for(int i = 0; i < 10; ++i) {
			printRabbit();
		}
		
		int result = plus(10, 20);
		System.out.println(result);
		
	}
	
	
}
