import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E05_FileInputStream_정리ver {
	public static void main(String[] args) {
		
		File file = new File("files/abc.txt");
		try {
			FileInputStream in = new FileInputStream(file);
			
			// .read() : 데이터를 1byte만 읽어서 반환한다. 영어 1글자 = 1byte
			//			 더 이상 읽은 글자가 없을 때 -1을 반환.
			//			 반복문과 함께 사용하면 1byte씩 읽은 데이터를 반환하다가 더 이상 읽은 글자가 없을 때 -1을 반환.			 
//			int ch = -1;
//			while((ch = in.read()) != -1) {
//				System.out.print((char)ch);
//			}
			
			
			// .readAllBytes() : 파일의 모든 데이터를 한번에 읽어들여서 byte[] 배열로 반환.
//			byte[] allBytes = in.readAllBytes();
//			String FileDataStr = new String(allBytes);
//			//String FileDataStr = new String(allBytes, Charset.forName("UTF-8"));
//			System.out.println(FileDataStr);
			
			
			// .read(byte[]) : 전달한 byte[]배열의 크기 만큼 데이터를 byte[]배열에 읽어들임. 
			//                 .read()와 마찬가지로 더 이상 읽어들일 데이터가 없을 때 -1을 반환한다. 
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
