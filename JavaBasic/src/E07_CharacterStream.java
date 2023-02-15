import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/*
# InputStream / OutputStream
byte������ �����͸� ������ϴ� Ŭ����

# Reader / Writer
char������ �����͸� ������ϴ� Ŭ����
2����Ʈ �� �̷���� ���ڵ� ���� ������� �� �ִ�.

# CharSet
ASCII�ڵ������ ��� ���ڼ��� ���������� �� ������ �����ڵ�� �� ȸ�縶�� �ٸ���. 
MS949 : ��������� ����ϴ� ���ڼ�
EUC-KR : ��Ŭ������ �⺻������ ����ϴ� �ѱ��� ���ڼ�. ��ȿ��(== ���Ǵ� != ��f�r) �ѱ�� ����ִ�. 
UTF-8 : ���� ǥ���� �Ǵ� ���ڼ�. ���� ���ڸ� �����ϰ� �־ �뷮�� ũ��. 

�ɰ��� MS949�� �ɰ����� ��ĥ���� MS949�� ���ľ� �Ѵ�

 */
public class E07_CharacterStream {
	public static void main(String[] args) {
		System.out.println(Arrays.toString("�ȳ��ϼ�yo".getBytes(Charset.forName("MS949"))));
		//[-66, -56, -77, -25, -57, -49, -68, -68, -65, -87]
		System.out.println(Arrays.toString("�ȳ��ϼ�yo".getBytes(Charset.forName("EUC-KR"))));
		//[-66, -56, -77, -25, -57, -49, -68, -68, -65, -87]
		System.out.println(Arrays.toString("�ȳ��ϼ�yo".getBytes(Charset.forName("UTF-8"))));
		//[-20, -107, -120, -21, -123, -107, -19, -107, -104, -20, -124, -72, -20, -105, -84]
		//UTF-8�� ���� ���� �뷮 ����
		
		File f = new File("files/filewrite.abc");
		try {									
			
			//FileWriter out = new FileWriter(f, Charset.forName("UTF-8"));
			
			FileWriter out = new FileWriter(f, Charset.forName("UTF-8"), true);//���� ������ ������ ���ڴٴ� ��
			//append = true  ������ �߰� (������ �����Կ� ���� ���� ������ ������ �����. ����°� �ƴ϶� �߰��Ǵ� �Ŵϱ�)  
			//append = false (�⺻����) ������ �����. 
			//FileWriter��ü�� ����ó���� �䱸�ϱ� ������ try/catch������ �����ֱ� 
			out.write('��');
			out.write('��');
			out.write('��');
			out.write('��');
			
			out.write("�ѹ��� ���� ���ھ� �ų��� �� �� �ִ�.\n" 
						+ "byte[]�迭�� �ٲ�� �ϴ� �͵� �� ä�� �� �� �ִ�.");
			
			char[] arr = "\nABCDEFG".toCharArray();
			out.write(arr); //�׳� ���簡			
			out.write(arr, 5, 3); //���ڴ����ε� �߰� ����
			//off : ������ġ, len : �� ���ڸ� ����� �� 
			//5������ں��� 3���� �о��ּ��� >> EFG
		
			for(int i= 0; i < 3; i++) {
				out.append("\n /)/)\n"); //.append() : ��Ƴ��ٰ� �ѹ��� ���� ���� (out.write(csq.toString()) �� ������ �Ȱ��ٰ� �� ���� .write()�� �� ���� ����)
				out.append("(  ..)\n");
				out.append("(  ># \n");
			}
			
			out.write(arr);
			out.write(arr);
			out.write(arr);
			
			
			out.close();
			System.out.println("���� ���� �Ϸ�");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		// =================================================================================================================================
		
		System.out.println("�б� ����");
																	
		try {
			FileReader in = new FileReader(f, Charset.forName("UTF-8")); //UTF-8�� ������ UTF-8�� �о�� 
			
			char[] buffer = new char[1024];
			
			//in.read(buffer);
			
			int len;
			while((len = in.read(buffer)) != -1 ) {
				System.out.println(new String(buffer, 0, len));
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	
	
	
	}
}
