
public class C07_StringFormat {
public static void main(String[] args) {
		System.out.printf("%d\n", 0x10); //16
		//������ ���ڿ��� ����� ���� ��
		
		String time = String.format("%d�� %d�� %d��", 10, 59, 59);
		//���ڿ��� ����� �ϴ°� �ƴ϶� ������ �ϰ� ���� ��  String.format();�� �̿�
		// String.format() ������ �̿��� ���ڿ��� ����. 
		//�̰� ����Ϸ��� System.out.println(time);�� �����.  
	
		
		//�ٸ� �޼��忡�� �����ϴ� String.format()�� ����� ����ϰ� ������ 
	    System.out.println(getStr()); 
	    //�̷� ����� ������
	    
	    //�̷��� getStr()�޼��带 �ν��Ͻ�ȭ�ؼ� ���������� ��Ƽ� ���������� ����ص� ��. 
	    String message = getStr();
		System.out.println(message); 
		
	}


	public static String getStr() {
		return String.format("������ �ζ� ��ȣ�� [%d, %d, %d, %d, %d, %d, %d] �Դϴ�.",
				1, 2, 3, 4, 5, 6, 7);	
	}
}
