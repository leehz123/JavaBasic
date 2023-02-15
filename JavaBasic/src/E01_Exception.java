import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


/*
# ���� Exception 

������ ���� : ������ �ÿ� �߻��ϴ� ����. 
		   �ҽ��ڵ�(*.java) �� ���� ��Ÿ�� �߸��� ����, �ڷ��� üũ ���� �⺻���� �˻翡�� ������ ���� �� �߻� 

��Ÿ�� ���� : ���� �ÿ� �߻��ϴ� ����
���� ���� : ������ ������ �ǵ��� �ٸ��� �����ϴ� ��



���� : ���α׷� �ڵ忡 ���� ������ �� ���� �ɰ��� ����
���� : ���α׷� �ڵ忡 ���� ������ �� �ִ� �ټ� �̾��� ���� 


RunTime Exception Ŭ����
: �ַ� ���α׷����� �Ǽ��� ���� �߻��� �� �ִ� ���ܵ�
- ArrayIndexOutOfBoundsException : �迭�� ������ ���
- NullPointerException : ���� null�� ���������� ����� ȣ��
- ClassCastException : Ŭ���� ���� �� ������ �߸���
- ArithmaticException : ������ 0���� ����

�� ���� Exception Ŭ������ (IO Exception ... ) 
: �ַ� ������� �Ǽ��� ���� ���� ���ο� ���� �߻��Ǵ� ���ܵ�
- FileNotFoundException : ������ ã�� �� ����
- ClassNotFoundExcetion : Ŭ������ ã�� �� ����
- DataFormatException : ������ ������ �߸��� 



�츮�� ������� �����ߴ� ���� �۾��� = "����"
�ڹ��� ������ Ʋ���� �� =  ���ܰ� �ƴ϶� "������ ����" (�Ḹ �̰� �� �̻��ѵ� E02_Throw �����̶� �� ����)


# ����ó�� 
���α׷��Ӵ� �߻��� ���ܸ� �̸� �����ϰ� ����� �� �ִ�. 
���� �߻��� �⺻ ���� = System.exit(0); ���α׷� ��������


���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�ų �� �ִ�. 
try�� ���ο��� ���ܰ� �߻����� ������ ��� ������� �ȴ�.
try�� ���ο��� ���ܰ� �߻��ϸ� ��� try���� ������ �ߴ��ϰ� �߻��� ���ܿ� �ش��ϴ� catch������ �Ѿ��. 
catch���� ���� �� �� �� �ִ�. 
���ܹ߻��� �߻��� ���ܿ� ���� �ڼ��� ������ ��� �ִ� �ν��Ͻ��� catch������ ���޵ȴ�.  
 */


public class E01_Exception {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			arr[0] = 1;
			arr[12] = 100;
			arr[1] = 3;
			//arr[10] = 123;
			//ArrayIndexOutOfBoundsException�� �߻��Ͽ� ���ܹ߻��� �⺻������ ���α׷� �������ᰡ �����. 
			System.out.println("try���� ��� �ڵ带 ������ �����߽��ϴ�!");
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.exit(0); //������ �̰� catch���� �⺻ ����
			System.out.println("�迭 �ε��� ������ ������ϴ�.");
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Hello!");
	
	
	
		//____________________________________________________________________________________________________
		//����ó���� Scanner����ϱ� 
		
		Scanner sc = new Scanner(System.in);
		int num; //try�� �ȿ� ������ �͵��� try���� ������ ������� ������ ��. �״ϱ� ������� ���� ������ try�� �ۿ� �ְŶ�
		
		try {
			
			System.out.println("���ڸ� �Է��ϼ���");
			num = sc.nextInt();
			num = 10 / num;
			
		} catch (InputMismatchException e){
			
			System.out.println("�ݵ�� ���ڸ� �Է��ؾ� �մϴ�.");
			
			// e.getMessage()�� ����� �������� ����
			System.out.println(e.getMessage()); //�׳� �� ���� ���� null�� ���´�.   
			
			e.printStackTrace(); //���������� ������ش�.  
			
			num = -1;
			
		} catch(ArithmeticException e) {
			
			System.out.println("num���� 0�� ������ �ȵ˴ϴ�.");
			num = -2;
			
		} catch(Exception e) {
			
			System.out.println("Exception�� ��� ������ �θ��̱� ������ ������ ��� ���ܸ� �� ���� ó�� ����");
			num = -3;
			
		} finally {
			
			System.out.println(" /)/)");
			System.out.println("( _ _)");
			System.out.println("(   >@");
			System.out.println("�� �䳢�� ���ܰ� �߻��ϵ� �� �ϵ� ������ �����մϴ�. ");
		
		}
		
		System.out.println("�Է��Ͻ� ���ڴ� : " + num);
	
	}
}
