import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/*
# InputStream / OutputStream
byte단위로 데이터를 입출력하는 클래스

# Reader / Writer
char단위로 데이터를 입출력하는 클래스
2바이트 로 이루어진 문자도 쉽게 입출력할 수 있다.

# CharSet
ASCII코드까지는 모든 문자셋이 동일하지만 그 이후의 문자코드는 각 회사마다 다르다. 
MS949 : 윈도우즈에서 사용하는 문자셋
EUC-KR : 이클립스가 기본적으로 사용하는 한국어 문자셋. 유효한(== 사용되는 != 뷁뛣꿹) 한국어만 들어있다. 
UTF-8 : 가장 표준이 되는 문자셋. 많은 문자를 포함하고 있어서 용량도 크다. 

쪼갤때 MS949로 쪼갰으면 합칠때도 MS949로 합쳐야 한다

 */
public class E07_CharacterStream {
	public static void main(String[] args) {
		System.out.println(Arrays.toString("안녕하세yo".getBytes(Charset.forName("MS949"))));
		//[-66, -56, -77, -25, -57, -49, -68, -68, -65, -87]
		System.out.println(Arrays.toString("안녕하세yo".getBytes(Charset.forName("EUC-KR"))));
		//[-66, -56, -77, -25, -57, -49, -68, -68, -65, -87]
		System.out.println(Arrays.toString("안녕하세yo".getBytes(Charset.forName("UTF-8"))));
		//[-20, -107, -120, -21, -123, -107, -19, -107, -104, -20, -124, -72, -20, -105, -84]
		//UTF-8이 가장 많은 용량 차지
		
		File f = new File("files/filewrite.abc");
		try {									
			
			//FileWriter out = new FileWriter(f, Charset.forName("UTF-8"));
			
			FileWriter out = new FileWriter(f, Charset.forName("UTF-8"), true);//문자 단위로 정보를 쓰겠다는 뜻
			//append = true  내용을 추가 (여러번 실행함에 따라 점점 파일의 내용이 길어짐. 덮어쓰는게 아니라 추가되는 거니까)  
			//append = false (기본값은) 내용을 덮어쓴다. 
			//FileWriter자체가 예외처리를 요구하기 때문에 try/catch문으로 감싸주기 
			out.write('한');
			out.write('글');
			out.write('자');
			out.write('씩');
			
			out.write("한번에 여러 글자씩 신나게 쓸 수 있다.\n" 
						+ "byte[]배열로 바꿔야 하는 것도 모른 채로 쓸 수 있다.");
			
			char[] arr = "\nABCDEFG".toCharArray();
			out.write(arr); //그냥 쓰든가			
			out.write(arr, 5, 3); //문자단위로도 추가 가능
			//off : 시작위치, len : 몇 문자를 사용할 지 
			//5번재글자부터 3글자 읽어주세요 >> EFG
		
			for(int i= 0; i < 3; i++) {
				out.append("\n /)/)\n"); //.append() : 모아놨다가 한번에 쓰는 개념 (out.write(csq.toString()) 랑 완전히 똑같다고 써 있음 .write()랑 별 차이 없다)
				out.append("(  ..)\n");
				out.append("(  ># \n");
			}
			
			out.write(arr);
			out.write(arr);
			out.write(arr);
			
			
			out.close();
			System.out.println("파일 쓰기 완료");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		// =================================================================================================================================
		
		System.out.println("읽기 시작");
																	
		try {
			FileReader in = new FileReader(f, Charset.forName("UTF-8")); //UTF-8로 썼으면 UTF-8로 읽어라 
			
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
