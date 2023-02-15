


public class C09_AccessModifier extends myobj.C09_PublicClass{
	
	public C09_AccessModifier() {
		super.m1();
		super.m2();
		//��� ���� Ŭ���������� �ٸ� ��Ű���� �ڿ��̴��� proteced���� ����� �� �ִ�. 
	}
/*
# ���������� Access Modifier
�ٸ� Ŭ�������� �ش� �ڿ��� ����Ϸ��� �� ���� �������� �����Ѵ�. 

# ����
public		: �ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ�  
protected	: �ٸ� ��Ű�������� ��ӹ��� Ŭ���� ������ ������ �� �ִ� �ڿ�
default		: ���� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ� (�� �״�� ����Ʈ. �ƹ��͵� �� ���� ��! �� �׷��� void�� �ٿ��� �ű���)
private		: ���� Ŭ���� ���ο����� ������ �� �ִ� �ڿ� 
*/
	public static void main(String[] args) {
		/*
		 
					�ϴ� C09_PublicClass�� �ٸ� ��Ű��(myobj)�� ����. 
					�׸��� ��Ŭ����(default package.C09_AccessModifier)�� myobj.C09_PublicClass�� ��ӹ���
					
					myobj.C09_PublicClass �� �� �״�� �տ� ���������� public�� �پ���
					 myobj.DefaultClass�� �� �״�� �ƹ��͵� �� ���� defaultŬ������
					 
					 �׸��� C09_PublicClass�� default package���� �����ϰ� myobj���� �����Ѵ�. 
		 */
		
		//���� ��Ű�� �� �ִ� Ŭ������ �ڿ��� public, protected, default ���� ��� ����
		C09_PublicClass instance1 = new C09_PublicClass();	
		DefaultClass instance2 = new DefaultClass(); //�ƹ� ���������ڵ� �پ� ���� ���� Ŭ�������� ���� ��Ű�� ���� ��� ���� 
		
		//private�� ���� ������ �� ������ �ٸ� �޼��带 ���� �������� ����� �����ϴ�. 
		//private�� ������ �ƿ� ���� �� �ƴϰ� ���� ������ ���� ��. ���������� ��� ���� (m1, m2, m3�� ���� m4�� ���� ����)
		instance1.m1();
		instance1.m2();
		instance1.m3();
		//instance1.m4();
		
		instance2.m1();
		instance2.m2();
		instance2.m3();
		
		//�ٸ� ��Ű���� �ִ� Ŭ������ �ڿ��� �⺻������ public�� ���� �͸� ����� �� �ִ�.
		myobj.C09_PublicClass  instance3 = new myobj.C09_PublicClass(); //C09_PublicClass�� default package���� �����ϰ� myobj���� �����Ѵ�.
		// myobj.DefaultClass instance4 = new myobj.DefaultClass(); Public�� ��𿡼���, Default�� ���� ��Ű�� ��������!
	
		instance3.m1();
	
	
	
	}
}
