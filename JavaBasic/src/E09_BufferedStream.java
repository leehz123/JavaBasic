import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
# Buffer
�����͸� �� ���� ������ �����ϴ� �ͺ��� ��Ƽ� �Ѳ����� �����ϴ� ����� �ξ� ó���ӵ��� ������.
(�����͸� ��Ƽ� �Ѳ����� ���� �� �ִ��� ���ۿ��ڴ�?)
���۰� �̸� ������ StreamŬ�������� �տ� Buffered��� �̸��� �پ��ִ�. 

BufferedInputStream, BufferedReader... ��� �̸����� �Ҹ��� ��
(InputStream�� ����Ʈ������ �����͸� �ٷ�µ� ���۰� ������ �ִ� �Ű�
Reader�� Char������ �����͸� �ٷ�µ� ���۰� ������ �ִ� ��)
 
*/

public class E09_BufferedStream {

	static File book = new File("files/frankenstein.txt");

	// ������ ũ�⿡ ���� �д� �ӵ��� ���̰� �ִ°�?

	/** �� ���ڽ� �б� */
	public static void read1() {

		FileReader in = null; // �ʱ�ȭ �� ���ָ� ���� ��
		try {
			in = new FileReader(book);
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close(); // �߰��� ������ ���� �� ���� �ݾ��ְ��� (finally�� �ִ°� �� �ո���)
			} catch (IOException e) { // �ٵ� in.close()�� Ʈĳ���� �ʿ��ؼ� �̷��� �������� ���°� �� �� �ۿ� ����.
				e.printStackTrace();
			}
		}
	}

	/** ���۹������ �б� (1024) */
	public static void read2() {
		FileReader in = null;
		try {
			in = new FileReader(book);
			char[] buffer = new char[1024];
			int len = -1;
			while ((len = in.read(buffer)) != -1) {
				System.out.print(new String(buffer, 0, len));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/** ���۹������ �б� (2048) */
	public static void read3() {
		FileInputStream in = null;
		try {
			in = new FileInputStream(book);
			byte[] buffer = new byte[2048];
			int len = -1;
			while ((len = in.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, len));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/** bufferedReader ����ϱ� */
	public static void read4() {
		
		FileReader fin = null ; 
		BufferedReader bin = null;
		
		try {
			fin = new FileReader(book);
			bin = new BufferedReader(fin);
			
			//BufferedReader ���� readLine()�� �־ �� �پ� �б� ���ϴ�. 		
			//bin.readLine() : �� �پ� �дµ� �� �̻� ���� �� ������ null�� ����
			
			String line;
			while((line = bin.readLine()) != null) {
				System.out.println(line);
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//���� �ֱٿ� ������ ������� �ݾ��� �� (���� ����!�ڡڡڱ״ϱ� ���� ���߿� ���� �� ���� ���� ������ �ֱ� ����) 
				bin.close();   
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	;
		
		
		
		
		
		//BufferedReader in = new BufferedReader(new FileReader(book)); //������ Reader�� �־�� �ϴµ� FileReader�� ������ ���� �־��� �� ���� 
		
	}
	
	
	public static void main(String[] args) {

//		long  start = System.currentTimeMillis();
//		read1(); //�ѱ��ھ� �б� �޼��� 
//		System.out.println("\n�ɸ� �ð� : " + (System.currentTimeMillis() - start) + "ms");

//		long start = System.currentTimeMillis();
//		read2();
//		System.out.println("\n �ɸ� �ð� : " + (System.currentTimeMillis() - start) + "ms");

//		long start = System.currentTimeMillis();
//		read3();
//		System.out.println("\n �ɸ� �ð�  " + (System.currentTimeMillis() - start) + "ms");

		long start = System.currentTimeMillis();
		read4();
		System.out.println("\n �ɸ� �ð�  " + (System.currentTimeMillis() - start) + "ms");
		//���پ� �ٽ� ���� �ð��� �ɷ��� �ణ �� ���� �ɸ��� ��� 2, 3 ���� �� �� ���� �ɸ� 
	}
}
