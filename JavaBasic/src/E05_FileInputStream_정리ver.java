import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E05_FileInputStream_����ver {
	public static void main(String[] args) {
		
		File file = new File("files/abc.txt");
		try {
			FileInputStream in = new FileInputStream(file);
			
			// .read() : �����͸� 1byte�� �о ��ȯ�Ѵ�. ���� 1���� = 1byte
			//			 �� �̻� ���� ���ڰ� ���� �� -1�� ��ȯ.
			//			 �ݺ����� �Բ� ����ϸ� 1byte�� ���� �����͸� ��ȯ�ϴٰ� �� �̻� ���� ���ڰ� ���� �� -1�� ��ȯ.			 
//			int ch = -1;
//			while((ch = in.read()) != -1) {
//				System.out.print((char)ch);
//			}
			
			
			// .readAllBytes() : ������ ��� �����͸� �ѹ��� �о�鿩�� byte[] �迭�� ��ȯ.
//			byte[] allBytes = in.readAllBytes();
//			String FileDataStr = new String(allBytes);
//			//String FileDataStr = new String(allBytes, Charset.forName("UTF-8"));
//			System.out.println(FileDataStr);
			
			
			// .read(byte[]) : ������ byte[]�迭�� ũ�� ��ŭ �����͸� byte[]�迭�� �о����. 
			//                 .read()�� ���������� �� �̻� �о���� �����Ͱ� ���� �� -1�� ��ȯ�Ѵ�. 
			byte[] buffer = new byte[10];
			int len  = -1;
			while((len = in.read(buffer)) != -1) {
				System.out.println(buffer);
				System.out.println(Arrays.toString(buffer));
				System.out.println(new String(buffer));
				System.out.println(new String(buffer, 0, len));
				System.out.println("__________________________");
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
