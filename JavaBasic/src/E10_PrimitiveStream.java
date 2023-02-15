import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
#DataoutputStream, DataInputStream
�⺻�� Ÿ���� �����͸� �ս��� stream���� �����ϱ� ���� Ŭ���� 
(�⺻ Ÿ�Ե��� datainputStream�� dataoutputstream�� ���ؼ� ������ �� �ִٴ� �ҷ�)
java�� �⺻�� Ÿ���̱� ������ java�̿��� ������ �ش� �����͸� Ȱ���� �� ����.
(�����Ŀ��� ���������� ������ �ߴٸ� �����ĵ� �ڹ� �����ĵ� �ڹٿ��� �Ѵ�)
(��� �ָ� �����⺸�ٴ� ���������� ����ϴ� ��)
�����͸� �����ص� ������� ���� �� ����. 

*/


public class E10_PrimitiveStream {
	public static void main(String[] args) {
		File dataFile = new File("files/primitive.txt");
		try(
				FileOutputStream fout = new FileOutputStream(dataFile);
				DataOutputStream out = new DataOutputStream(fout);
		) {
			
			out.writeBoolean(true);
			out.writeDouble(123.12345);
			out.writeFloat(123.1234F);
			out.writeInt(123);
			out.writeUTF("����");
	
			//���ĸ� ���� ���ڸ� �а��� �� ���� ������ ȿ�������� �ɰ��� ������ ��
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		try(
				FileInputStream fin = new FileInputStream(dataFile);
				DataInputStream in = new DataInputStream(fin);
		) {
		
			System.out.println(in.readBoolean());
			System.out.println(in.readDouble());
			System.out.println(in.readFloat());
			System.out.println(in.readInt());
			System.out.println(in.readUTF()); 
			//UTF�� �� ���ھ��̴ϱ� �� ���ھ� ������ �͵� �������� ������?
			//�ȵ� 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





}
