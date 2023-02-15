import java.io.IOException;
import java.io.UnsupportedEncodingException;

import quiz.������3.RainbowReflect;
import ������.SoWhatIDunGivaShitGetALifeException;

/*
 
# throw
���ϴ� ���ܸ� �߻���Ų��. 
���� ���� ����� ������ ����ϴ� ������� ó���� �ñ� �� �ִ�. 

# throws
�ش� �޼��忡�� ���ܰ� �߻����� �˸��� ����
�ش� �޼��� ���ο��� ���ܰ� �߻��� �� �߰��� �� �ִ�. 
�޼��� ������ ���ܸ� ���� ó������ �ʰ� �޼��带 ȣ���ϴ� ���α׷��ӿ��� ���� ó���� �����Ѵ�. 

# RuntimeException (�� ó������ �ʾƵ� �Ǵ� ����)
RuntimeException Ŭ������ ��ӹ޴� ���ܵ��� �ݵ�� ó������ �ʾƵ� �Ǵ� �����̴�. 

����ó���� ���� �ʾƵ� ������ ����(������)�� �߻����� �ʴ´�. 
(��
�츮�� ������� �����ߴ� ���� �۾��� = "����"
�ڹ��� ������ Ʋ���� �� =  ���ܰ� �ƴ϶� "������ ����" ���µ� ���� �� �´µ�? �̻���)

# Exception (�ݵ�� ó������� ��)
ExceptionŬ������ ��ӹ��� ���ܵ��� �ݵ�� ó���ؾ��ϴ� �����̴�.
����ó���� ���� ������ �������� �Ұ����ϴ�. (�������� ó���ؾ� ��)
��򰡿����� �ݵ�� try-catch�� ó���ؾ� �������� ������ �� �ִ�. 
�޼��带 ������ ���� ������ġ�� main�ο������� throw �ع����� ������ �׳� ��ġ�ϰ� �ȴ�. 
�߻��� ������ �ٷ� ó���ϰ� ���� ���� ��� throws�� ����Ͽ� �ش� �޼��带 ȣ���ϴ� ������ ����ó���� ���ѱ� �� �ִ�. 

*/




public class E02_Throw {
	
	/*
	throws IOException, ClassNotFoundException�� ���� :
			1. method4�޼��尡 �ش� ���ܸ� �߻���ų �� �ִ� �޼����� ���� �˸�
			2. method4�޼��带 ȣ���ϴ� ��򰡿��� ����ó���� ���ѱ��.
	 */
	public static void method4() throws IOException, ClassNotFoundException { 
	
		switch((int)(Math.random() * 5)) {
		case 0:
			throw new ArrayIndexOutOfBoundsException();
		case 1:
			throw new ArithmeticException();
		case 2:
			throw new IOException();
		case 3:
			throw new ClassNotFoundException();
		case 4: 
			throw new UnsupportedEncodingException();
		}
	}
	
	/*
	IOException �� ClassNotFoundException�� 
	Exception Ŭ���� (�ݵ�� ó���ؾ� �ϴ� ����) �� ���Ѵ�. 
	�� ��� �ؾ� �� ����
	1. �ٷ� try-catch������ �����ְų�
	2. �޼��� ����� ���� throws IOException, ClassNotFoundException �� ����� �Ѵ�. 
	2�� �� ��� method4�� ȣ���ϴ� ��򰡿��� ����ó���� ���ð� �ȴ�. (���� ��ź������)
	*/

	
	
	
	
	public static void method3() {
		throw new NullPointerException(); //�ݵ�� ó������� �ϴ� ����
	}
	
	public static void method2() {
		method3();
	}
	public static void method1() {
		method2();
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		//method4�� ȣ���ϸ鼭 IOException �� ClassNotFoundException�� ����ó��. 
		try {
			method4();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			System.out.println("Ŭ�����ͼ���");
		} catch (ArithmeticException e) {
			System.out.println("�Ƹ�����ƽ�ͼ��� ó������");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����ε����ƿ��� �ͼ��� ó������");
		} 
		
		System.out.println("method4�� ���� ����ó���� ����� �� ������ ��µȴ�.");

	
		
		
		
		
		
		
		try {
			method1();
		} catch(Exception e) {
			System.out.println("�߻��� ������ �޼����� \"" + e.getMessage() + "\" �Դϴ�.");
			System.out.println("���ܹ߻� ������ ���� ���� : ");
			e.printStackTrace();
		}
		System.out.println();
		
		
		
		
		//�� ������� ���ܸ� ������ �͵� �����ϴ�. 
		try { 
			throw new ArrayIndexOutOfBoundsException("�׳� �ɽ��ؼ� �������ҽ��ϴ�. ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�߻��� ������ �޼��� : " + e.getMessage());
			System.out.println("���ܹ߻� ������ ���� ���� : ");
			e.printStackTrace();
		}
		System.out.println();

		
		
		
		
		//â������ ������
		String someoneSaid = "�޷�";
		if(someoneSaid.equals(someoneSaid)) {
			throw new RainbowReflect("�������ݻ�");
		}
	}
	
	
	
	//�̷��� ���ڴ�� ���ܸ� â���ؼ� ������ �͵� ����!
	static class RainbowReflect extends RuntimeException { // ����Ŭ����? 
		public RainbowReflect(String errorMsg) {
			super(errorMsg); 
			/*
			java.lang.RuntimeException.RuntimeException(String message)
			Constructs a new runtime exception with the specified detail message.
			 */
		}
	}
}
