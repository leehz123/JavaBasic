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
			//파일로부터 데이터를 읽어들이는 통로
			FileInputStream in = new FileInputStream(f);
			
			
			
			// ■ read() : 데이터를 한 바이트씩 읽는다. 한 바이트씩 읽기 때문에 한글 등의 2byte문자로 직접 합치기가 (매우매우매우) 어렵다. 
//			int ch = -1;
//			while((ch = in.read()) != -1) {
//				System.out.print((char)ch);
//			}	
			
			
			
			// ■ readAllBytes() : 파일의 모든 데이터를 한번에 읽어들여서 byte[] 배열로 반환한다.   
//			byte[] allBytes = in.readAllBytes();
//			String fileDataStr = new String(allBytes, Charset.forName("MS949"));  
//			System.out.println(fileDataStr);
			// , Charset.forName("UTF-8")이 뭐냐면  (이거 내가 안 돼서 MS949로 바꿈)
			//Charset 은 문자열을 byte단위로 쪼개거나 합칠 때(이 과정에서 문자가 깨질 수 있다) 사용하는 방식을 가리킨다.  
			//byte단위로 분해할 때와 합칠 때의 규격이 일치해야 한다. 
			//UTF-8로 쪼개진 데이터를 UTF-8 규격으롣 다시 합치겠다는 뜻 
		
			//아 굳이 캐릭터셋 지정 안 해줘도 되나?
			//Copy문제 풀 때도 이미지도 읽어들일 수 잇으려면 byte로 해줘야 한다면서
			//read(byte배열) 쓰면서 캐릭터셋은 지정 안 해줬었음
			//바로 out.write해줬었네 그러고보니 out.write(buffer, 0, len)이렇게 해줬었음
			
			
			
			
			// ■ read(byte[]) : 전달한 바이트형 배열에 데이터를 담고 리턴값으로 읽은 길이를 반환한다. 
								//파일을 끝까지 다 읽어서 더 이상 읽을 게 없을 때 -1을 반환한다. 
			byte[] buffer = new byte[10]; //10바이트씩만 읽어보자. 영어는 한글자가 1byte니까 10글자씩 읽겠단 뜻
			int len = -1;
			while((len = in.read(buffer)) != -1) {
				System.out.println(Arrays.toString(buffer)); //버퍼안에 든 내용 을 볼 수 있음 
				System.out.println(new String(buffer)); //버퍼에 든 내용을 문자로 변환해서 읽어줌 
				//그런데 첫번째 10글자는 aaaaaaaaaa가 잘 나왔는데
				//두 번째 회전에선 나머지 3글자 bbb만 나오면 되는데 bbbaaaaaaa라고 나온다. 왜 그럴까?
				
				//이유는 10개씩 읽기로 했는데 파일에는 aaaaaaaaaabbb 총 13개의 문자가 들어있다. 
				//aaaaaaaaaa 10개 읽고 그 데이터가 그대로 남아 있는 상태에서
				//bbb가 0~2까지 채우고 나머지는 그대로 남아 있어서 (대충 bbbaaaaaaa 이런 형태) 이상하게 나오는 것
				//System.out.println(Arrays.toString(buffer) + ", 이번에 읽은 바이트 개수 : " + len); //아래거와 비교해보기
				
				//그래서 해결책은 offset과 length를 지정해줘서 len미만까지만 출력하면 되는 것이다. 
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
