import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
# Java I/O (Input/Output)
�ڹٴ� ��Ʈ���̶�� ������ �̿��� ���α׷��� ������� �ٷ��. 
���α׷����� ������ ��� �����͵��� �Է��̶�� �θ���. 
���α׷����� ���Ǿ� ������ ��� �����͵��� ���(Output)�̶�� �θ���. 

# Stream
�����͵��� ������ ���
�����͵��� ���α׷����� ������ ��θ� InputStream �̶�� �θ���. 
�����͵��� ���α׷����� �������� ������ ��θ� OutputStream�̶�� �θ���. 
�����Ͱ� ��Ʈ������ �������� ���ؼ� �ش� �����͸� ����ƮŸ������ ��ȯ���Ѿ� �Ѵ�. 
(�����͸� �ڵ����� byteŸ������ ���� ���ִ� Ŭ�����鵵 �ִ�. )
 */


public class E04_JavaIO {
	public static void main(String[] args) {
		
		try {
			
			//�츮�� �ִܼ�� ������ ���� �ִ� ��
			FileOutputStream out = new FileOutputStream("files/abc.txt"); //���� ����? ������Ʈ ������ �ؾ� �� 
			out.write(65);  // A
			out.write(66); // B
			out.write(67); // C
			//�������� �ߴµ� �⺻������ �ذ��ؾ� �� ������ �մٴ� ��
			//�������� ���ַ��� ���� ���ΰ� �ִ� Ʈĳ���� ĳġ�� �߰��ض�(Add catch clause to surrounding try) Ŭ�� 
			//Ŭ���ϸ� catch (IOException e) {e.printStackTrace();} �߰���
			out.write('\n');
			
			//str.getBytes() : �ش� ���ڿ��� ���ۿ� ����Ʈ �迭�� ��ȯ�ϴ� �޼��� 
			out.write("�ȳ��ϼ��� �ݰ����ϴ�~~~~~~".getBytes());
			//�پ� ��δ� �ݵ�� �ݾ���� �Ѵ�. 
			out.close(); //��Ʈ���� ���α׷� ������ ���� �ݾ���� ���� �������� ���ϱ� ������ �츮�� �������� ���� �ݾ���� �Ѵ�. 
			//��� �ڹ��� ��� �������� �޸� ������ ���� ����� ��. ���� ������ ��.  ������ Integer i;  free(i);����� �ϴµ� �ڹٴ� �̰� �˾Ƽ� ����.  
		
		} catch (FileNotFoundException e) { 
			//new FileOutputStream("files/abc.txt"); ó���� ���� ���� �� �س��� ��� ���Ļ������� �ؼ� ���� ������. 
			e.printStackTrace();
		} catch (IOException e) { //out.write()...�� ������ �ߴ� �� �ذ��ϴ� ��(������ �ߴ� ���� ���콺 ���ٴ�ų� f2������ 
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�");
	}
	
}



// files�� ���� ������ �ϰ� �ؽ�Ʈ������ ������ ����µ� 
//�ڽ�����ϰ� files�� ���콺 ������-refresh�ϵ簡 f5 ������ ���� ���� 