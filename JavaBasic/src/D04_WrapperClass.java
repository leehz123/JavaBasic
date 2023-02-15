
public class D04_WrapperClass {

/*
# Wrapper Class
�⺻ Ÿ�Ե��� ������ Ÿ������ ����ϱ� ���� ���γ��� Ŭ���� 
�� �⺻ Ÿ�Ե鿡 ���� ������ ��ɵ��� ��� �ִ�.

�⺻��
byte, short, char, int, long, float, double, boolean

������
Byte, Short, Character, Integer, Long, Float, Double, Boolean 

 */
	
/*

Integer.parseInt() : "12345" ��  12345	���ڿ����� ���ڷ� 
Integer.toString() :  12345  �� "12345"	���ڿ��� ���ڿ��� 
	
 */
	
	
	public static void main(String[] args) {
		/*
		# Parsing
		���ڿ��� �ش� Ÿ�� ������ ��ȯ�ϴ� ��
		�� WrapperŬ������ �˸��� �޼��尡 �����Ѵ�. 
		
		�ٵ� �ش� ������ �ٲٴ� �͵� Ÿ���� �¾ƾ� �������� ���ڰ� �ƴ� �� ���ڷ� �Ľ� �Ұ�. 
		int num = Integer.parseInt("ABCD1234");
		�翬�� �ȵ� ABCD1234�� ���ڰ� �ƴ��ڳ� 
		 */
		
//parseInt_________________________________________________________		
		
		//���ڿ� Ÿ���̱� ������ ������ ���ڶ� int�� �Ľ� ����
		int num = Integer.parseInt("1234");
		System.out.println(num);
		
	//Tip. ���� char�� ��� ���ڶ�� '0'�� ���ָ� �� �����ϱ� ��
		num = '1' - '0';
		System.out.println(num);
		//int num2 = "1" - "0"; ���ڿ��� �� ��
	
	//���° ���ĺ����� �ƴ� ���� char���� '0' ���ָ� �� 	
		int alphNum = 'D' - 'A';
		System.out.println("D�� �� ��° ����? : " + alphNum);
		
		
		//parseInt �� �������̵� 1. radix(����) ���� ����
		num = Integer.parseInt("10", 8);  
		System.out.println(num);
		//parseInt�� �������̵� 2. beginIndex, endIndex, radix���� ����
		num = Integer.parseInt("��ö��/1000101010/A+", 4, 14, 10); 
		System.out.println(num);
		
		
//parseFloat______________________________________________________
		
		float value = Float.parseFloat("123.12345678");
		System.out.println(value);

		
//parseBoolean______________________________________________________		
		
		boolean isPrime = Boolean.parseBoolean("true"); 
		//parseBoolean() �� ������ "True" "true" �ƴϸ� �� false�� 
		

		
//toString__________________________________________________________		
		
		
		/*
		# toString
		��� ����Ŭ���� �ȿ��� ����Ʈ���� �ִ�. �١�
		�� Ÿ���� ���� ���ڿ��� ��ȯ�ϴ� ���
		*/

		
		String data = Integer.toString(12345678);
		System.out.println(data);
		
		//Integer.toString()�� radix���� ����
		data = Integer.toString(12345678, 2); //2�������� . ���ڿ���.
		System.out.println(data);
		data = Integer.toString(12345678, 16);
		System.out.println(data);
		
		
//�� Ÿ�Կ� �����ϴ� �����___________________________________________________
		
		
		//int�� �ִ밪, �ּҰ�
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
		
		//int�� ������
		System.out.println("������?" + Integer.SIZE); //32��Ʈ�� ���� 
		System.out.println(Integer.SIZE / 8 + "bytes"); //32��Ʈ�� 4����Ʈ 
		
		
//Character_____________________________________________________________		
		
		//���⼭���� ����

		// Character.isDigit() : �������� �ƴ��� �����ִ� �޼���
		System.out.println("0�� �����ΰ���? " + Character.isDigit('0')); //�̰� ���ڴ�
		System.out.println("A�� �����ΰ���? " + Character.isDigit('A'));
		
		
		//�� Character.isAlphabetic() : ���ĺ����� �����ִ°� �ƴ϶� �������� �����ִ� �޼���. ������ ���忡���� alphabet�� ���ڰ��� �׷� 
		System.out.println("�� �� ���ڴ�? : " + Character.isAlphabetic('��')); //����
		System.out.println("A �� ���ڴ�? : " + Character.isAlphabetic('A')); //����
		System.out.println(Character.isAlphabetic('3'));	//�ƴ�
		System.out.println(Character.isAlphabetic('_'));	//�ƴ�
		
		// Character.isLetter() : �������� �ƴ��� ������.
		System.out.println("�� �� ���ڴ�? : " + Character.isLetter('��'));
		System.out.println("A �� ���ڴ�? : " + Character.isLetter('A'));
		System.out.println("a �� ���ڴ�? : " + Character.isLetter('a'));
		System.out.println("3 �� ���ڴ�? : " + Character.isLetter('3'));
		System.out.println("  �� ���ڴ�? : " + Character.isLetter(' '));
		System.out.println("! �� ���ڴ�? : " + Character.isLetter('!'));
		// �� alphabetic�̶� letter�� ��� �Ȱ��� ;;
		
		
		
		// Character.isSpaceChar() : �����̽� �� ��쿡�� true
		System.out.println(Character.isSpaceChar(' ')); 

		// Character.isUpperCase(), isLowerCase() : �빮������ �ҹ������� �����ִ� �޼��� 
		System.out.println(" A �� �빮�� �Դϱ�? : " + Character.isUpperCase('A')); 
		System.out.println(" a �� �ҹ��� �Դϱ�? : " + Character.isLowerCase('a')); 
		
		
		// Character.isJavaIdentifierStart() : �ڹ��� ������ ù ���ڷ� ��� ������ ���ڳ� 
		// ������ ù���� ���� : ����/���� x, Ư���� $ �� _ �� ����
		System.out.println(Character.isJavaIdentifierStart('$'));  
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isJavaIdentifierStart(' ')); //�����̳� ���ڴ� �� ��
		System.out.println(Character.isJavaIdentifierStart('3'));
		
		
		
		

		
		
		
		
		//������ʹ�  �� �� ���� �޼����________________________________________________________________
		System.out.println("Character.MAX_CODE_POINT : " + Character.MAX_CODE_POINT);
		System.out.println("Character.MAX_VALUE : " + Character.MAX_VALUE);
		System.out.println("Character.MIN_VALUE : " + Character.MIN_VALUE);
		System.out.println("Character.SIZE : " + Character.SIZE / 8 + "bytes");
		System.out.println("Character.MAX_RADIX : " + Character.MAX_RADIX); 
		//System.out.println(Character.digit('A', 10)); //���̰� �� -'0'�ϴ� �Ŷ� ���ٴµ� �� ��� -1 ����? 
		
		System.out.println("�����ѹ�? ############################# �ʿ� ���� �ϴ� ");
		System.out.println(Character.getType('_')); //�����ѹ��� ������ Character�� 23�� Ÿ�� 
		System.out.println(Character.CONNECTOR_PUNCTUATION); //������ �̰Ŵ�
		
		System.out.println(Character.getType('A')); //Character�� 1�� Ÿ��
		System.out.println(Character.UPPERCASE_LETTER); //������ �̰Ŵ�
	}
}
