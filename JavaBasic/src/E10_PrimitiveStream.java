import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
#DataoutputStream, DataInputStream
기본형 타입의 데이터를 손쉽게 stream으로 전송하기 위한 클래스 
(기본 타입들은 datainputStream과 dataoutputstream을 통해서 저장할 수 있다는 소뤼)
java의 기본형 타입이기 때문에 java이외의 언어에서는 해당 데이터를 활용할 수 없다.
(이쪽컴에서 저쪽컴으로 전송을 했다면 이쪽컴도 자바 저쪽컴도 자바여야 한다)
(어디 멀리 보내기보다는 내부적으로 사용하는 편)
데이터를 저장해둔 순서대로 꺼낼 수 있음. 

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
			out.writeUTF("大信");
	
			//텍파를 보면 문자를 분간할 수 없을 정도로 효율적으로 쪼개고 전송을 함
			
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
			//UTF는 두 글자씩이니까 한 글자씩 꺼내는 것도 가능하지 않을까?
			//안됨 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





}
