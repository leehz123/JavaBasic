
public class B11_While {
	/*
	# While��
	for���� ������ �ణ �ٸ� �ݺ���
	�ʱⰪ�� �������� ��ġ�� �����Ӵ�
	()���� ������ ���� ���� {} ���� ������ �ݺ��ؼ� �����Ѵ�. 
	�������� ��ġ�� ���� ���α׷� ���� ����� �޶��� �� �ִ�. 
	*/
	public static void main(String[] args) {
		
		System.out.println("0~9");
		int i = 0;
		while (i<10) {
			System.out.print(i++ + "\t");  
		}
		System.out.println();
		
		System.out.println("1~10");
		i = 0;
		while (i<10) {
			System.out.print(++i + "\t");
		}
		System.out.println();
		
		System.out.println("1~10"); 
		//���� while (++i<10) { ��� �񱳿����� ���� ������ �� 1���� 9���� ��µ�. 
		i = 0;
		while (i++<10) {
			System.out.print(i + "\t"); //������ �켱������ ���� ���������� ���� ������ ��. 1���� 10���� ��µ�. 
		}	
		System.out.println();
		
		System.out.println("1~9"); 
		i = 0;
		while (++i<10) {
			System.out.print(i + "\t"); //������ �켱������ ���� ���������� ���� ������ ��. 1���� 10���� ��µ�.
		}
		System.out.println();
		
		System.out.println("1~10"); 	
		i = 0;
		while (i++<10) {
			System.out.print(i + "\t"); 
		}
		System.out.println();
		
		
		
		
		
	}

}
