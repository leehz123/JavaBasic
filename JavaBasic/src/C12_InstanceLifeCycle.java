
public class C12_InstanceLifeCycle {
/*
# �ν��Ͻ� ������ �ڵ����� ����Ǵ� �ڵ���� ���� ����
1. ù ���� �� ����ƽ ����� ���� (Ŭ������ �޸𸮿� �ö� �� static ����� �����)
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
2. �ν��Ͻ� ����
3. �ν��Ͻ� ��� ����
4. ������ ���� 

 */
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		//����ƽ ������ ������ �޸𸮿� �Ǿ���� ���� �ƴ϶� ���ش� Ŭ������ ���ʷ� ���Ǵ� �����ڿ� �޸𸮿� �Ǹ��� �ȴ�.
		System.out.println(InstanceLife.a);
		
		
		new InstanceLife();
		new InstanceLife();
		new InstanceLife();
		// ����ƽ��� - �ν��Ͻ� ��� - ������ ���� / - �ν��Ͻ� ��� - ������ ���� / - �ν��Ͻ� ��� - ������ ���� ...
		// �׸��� ����ƽ�� ù ����ÿ��� ����ǹǷ�, �� ��° ������ʹ� ������� ����. 
		
		System.out.println("���α׷� ����");

	}
}

class InstanceLife {
	static int a;
	static { //����ƽ ����� Ŭ���� ��޽� �޸𸮿� �ε��
		System.out.println("1. ����ƽ �ʱ�ȭ ��� ����");
	}
	
	{
		System.out.println("2. �ν��Ͻ� �ʱ�ȭ ��� ����");
	}
	
	InstanceLife() {
		System.out.println("3. ������ ��� ����");
	}

}