import java.util.ArrayList;

public class D05_Generic {
/*
 
 
# ���׸�
Ŭ���� ���� �ڿ��� Ÿ���� �ܺο��� ���߿� ������ �� �ְ� �ϴ� ����
�١� ���׸����� �⺻ Ÿ���� ����� �� ���� ������ Wrapper Ŭ������ ����ؾ� �Ѵ�. �١�


# static Generic
����ƽ �޼��忡 ���׸��� ����� ���� ����Ÿ�� �տ� ���׸��� �߰����ش�. 
�� ������ ����

 
 */


	
	public static void main(String[] args) {
					
					//�ڡڡ��ν��Ͻ�ȭ�� �� �� ���׸��� Ÿ�� ����!�ڡڡ�
		GenericTest<String, Integer, Double> test = new GenericTest(); 
		
		
		// �׷� static�޼���� �ν��Ͻ�ȭ�� �� �ϴµ� ��¾��? 
		
		// static ���׸� �޼��� Ÿ�� ���� ��� = ���� ���� ���ÿ� Ÿ�� ����
		// Ŭ������.<T>�޼����();
		GenericTest.<Apple>staticMethod1(); 
		//�̷��� (�ٸ�Ŭ������)���� ��� ����� �� �ִ�. (���� Ŭ���� ���� static�޼���� �� �� ��� �ٷ� �� �� ����)
		
	}
	
}

class GenericTest<A, B, C> { //GenericŬ���� �ȿ��� A, B, C ���׸� Ÿ���� ���� �Ŷ� ���� 
	
	A var1;
	A var2;
	B var3;
	C var4;
	
	
	//�޼��� Ÿ�Ե� ���׸����� ����
	public A method1() {   // A�� ��ȯŸ��
		return null; //�������� �⺻�� null. A���� ������ ������ Ÿ�Ը� ���� �� �����ϱ� 
	}
	
	
	
	//�� ���� ���� ���� �̰ɷ� �� �� �� ������
	static <MyType> int staticMethod1() { 
	//�ڡڡڿ��⼭ �� �ٸ��� <MyType> �� ��ȯŸ���� ������ �� �ƴ϶� staticMethod1() ���ο� MyType Ÿ���� ���� �Ŷ� ������.  
		
		
		ArrayList<MyType> list = new ArrayList<>();
		MyType a  = list.get(0);
		
		
		//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		//���׸� A, B, C�� �ν��Ͻ� ������ �������� ������ static �޼��忡���� ��� �Ұ�.(static�� �ν��Ͻ� ���� ������ �� �����غ���) 
		//A v1 = null;
				
		
		return 1;
	}
	
	/*
	static Ű����� �ν��Ͻ� ������ ������ Ŭ������ ���Ǵ� ������ �޸𸮰� �ö󰣴�. 
	�׷��� �׷� static���� ����� �޼ҵ忡 �ν��Ͻ��� �����Ǵ� �������� �����Ǵ� ���׸� Ÿ�̺� �Ű������� ���� ���� ����.
	�ݸ鿡 ���׸����� �ñ״�ó �� �޼ҵ�� ȣ��Ǵ� ������ Ÿ���� �����Ǳ� ������ ������ ������ �߻����� �ʴ´�.
	 */
	
}





/*


//���׸��� ��� ������ Ÿ�� �� �� ��
		//�츮�� ���� ���� Ŭ������ �÷����� ���׸��� ����� �� �ִ�. ����Ʈ �ϱ� ������ myobj.���ְ� 
		ArrayList<myobj.Police> polices = new ArrayList<>();
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		System.out.println(polices);
		//PoliceŬ�������� toString�������̵� �� �ؼ� �ּҰ� ����
		


*/


