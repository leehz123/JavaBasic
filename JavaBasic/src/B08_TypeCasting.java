
public class B08_TypeCasting {
/*
# Ÿ�� ĳ����
Ư�� �������� ���� �״�� �ΰ� Ÿ�Ը� ��ȯ�� �� ����ϴ� ����
�ش� ���� �ջ�� ����� ���� ���� ������ Ÿ���� ��ȯ��Ų��. 
�ش� ���� �ջ�� ����� ���� ���� ���� �˾Ƽ� Ÿ���� ���Ѵ�. 

 */
	public static void main(String[] args) {
		byte _byte = 11; // ǥ������ -128 ~ 127
		int _int = 22; // ǥ������ -21�� ~ 21��
		
		//1. �ڿ������� Ÿ��ĳ����
		//4byte�� 1byte���� ���� ���� �˾Ƽ� Ÿ���� ���Ѵ�. (byte -> int)
		_int = _byte;
		System.out.println(_int);
		
		//2. ���� �ջ�� ���� �ִ� Ÿ�� ĳ����
		//�� ���� ������ ���� ���� ������ �������� �� �� ���� �ջ�� ����� �־� ������ ���� �߻�.  
		//�����ڰ� ������ Ÿ��ĳ���� �ؾ� �������� ����������.
		_byte = (byte)_int; 
		//�ٵ� 11�̶� �ջ�� ����� ���µ� ���� �ջ��~ �̷� �� ������ �ٲ��� �� ����
		 
		int _int_ = 200;
		_byte = (byte)_int_; 
		System.out.println(_byte);
		//�̷� �� ���� �ջ��� �߻�. 
		
		//3. �ؼ��� �ٸ��� �ϰ� ���� Ÿ�� ĳ����
		int ch = 65;
		double value = 70.123; 
		int a =3, b = 7;
		
		
		System.out.println(ch);
		System.out.println((char)ch);
		System.out.println(value);
		System.out.println((int)value); //value�� �Ҽ��� .123 ����. 
		System.out.println(a / b);
		System.out.println(a / (double)b); //������ �Ǽ��� ����� �Ǽ� 
	} 
}
