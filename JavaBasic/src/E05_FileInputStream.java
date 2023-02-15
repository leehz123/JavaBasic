import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E05_FileInputStream {
	
	public static void main(String[] args) {
		
		 
		try {
			File f = new File("files/abc.txt");
			//���Ϸκ��� �����͸� �о���̴� ���
			FileInputStream in = new FileInputStream(f);
			
			
			
			// �� read() : �����͸� �� ����Ʈ�� �д´�. �� ����Ʈ�� �б� ������ �ѱ� ���� 2byte���ڷ� ���� ��ġ�Ⱑ (�ſ�ſ�ſ�) ��ƴ�. 
//			int ch = -1;
//			while((ch = in.read()) != -1) {
//				System.out.print((char)ch);
//			}	
			
			
			
			// �� readAllBytes() : ������ ��� �����͸� �ѹ��� �о�鿩�� byte[] �迭�� ��ȯ�Ѵ�.   
//			byte[] allBytes = in.readAllBytes();
//			String fileDataStr = new String(allBytes, Charset.forName("MS949"));  
//			System.out.println(fileDataStr);
			// , Charset.forName("UTF-8")�� ���ĸ�  (�̰� ���� �� �ż� MS949�� �ٲ�)
			//Charset �� ���ڿ��� byte������ �ɰ��ų� ��ĥ ��(�� �������� ���ڰ� ���� �� �ִ�) ����ϴ� ����� ����Ų��.  
			//byte������ ������ ���� ��ĥ ���� �԰��� ��ġ�ؾ� �Ѵ�. 
			//UTF-8�� �ɰ��� �����͸� UTF-8 �԰����� �ٽ� ��ġ�ڴٴ� �� 
		
			//�� ���� ĳ���ͼ� ���� �� ���൵ �ǳ�?
			//Copy���� Ǯ ���� �̹����� �о���� �� �������� byte�� ����� �Ѵٸ鼭
			//read(byte�迭) ���鼭 ĳ���ͼ��� ���� �� �������
			//�ٷ� out.write������� �׷����� out.write(buffer, 0, len)�̷��� �������
			
			
			
			
			// �� read(byte[]) : ������ ����Ʈ�� �迭�� �����͸� ��� ���ϰ����� ���� ���̸� ��ȯ�Ѵ�. 
								//������ ������ �� �о �� �̻� ���� �� ���� �� -1�� ��ȯ�Ѵ�. 
			byte[] buffer = new byte[10]; //10����Ʈ���� �о��. ����� �ѱ��ڰ� 1byte�ϱ� 10���ھ� �аڴ� ��
			int len = -1;
			while((len = in.read(buffer)) != -1) {
				System.out.println(Arrays.toString(buffer)); //���۾ȿ� �� ���� �� �� �� ���� 
				System.out.println(new String(buffer)); //���ۿ� �� ������ ���ڷ� ��ȯ�ؼ� �о��� 
				//�׷��� ù��° 10���ڴ� aaaaaaaaaa�� �� ���Դµ�
				//�� ��° ȸ������ ������ 3���� bbb�� ������ �Ǵµ� bbbaaaaaaa��� ���´�. �� �׷���?
				
				//������ 10���� �б�� �ߴµ� ���Ͽ��� aaaaaaaaaabbb �� 13���� ���ڰ� ����ִ�. 
				//aaaaaaaaaa 10�� �а� �� �����Ͱ� �״�� ���� �ִ� ���¿���
				//bbb�� 0~2���� ä��� �������� �״�� ���� �־ (���� bbbaaaaaaa �̷� ����) �̻��ϰ� ������ ��
				//System.out.println(Arrays.toString(buffer) + ", �̹��� ���� ����Ʈ ���� : " + len); //�Ʒ��ſ� ���غ���
				
				//�׷��� �ذ�å�� offset�� length�� �������༭ len�̸������� ����ϸ� �Ǵ� ���̴�. 
				System.out.println(new String(buffer, 0, len));  
				
			}
		
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
