import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
# Buffer
데이터를 한 개씩 여러번 전달하는 것보다 모아서 한꺼번에 전달하는 방식이 훨씬 처리속도가 빠르다.
(데이터를 모아서 한꺼번에 보낼 수 있던게 버퍼였자늠?)
버퍼가 미리 구현된 Stream클래스들은 앞에 Buffered라는 이름이 붙어있다. 

BufferedInputStream, BufferedReader... 라는 이름으로 불리게 됨
(InputStream은 바이트단위로 데이터를 다루는데 버퍼가 구현돼 있는 거고
Reader는 Char단위로 데이터를 다루는데 버퍼가 구현돼 있는 것)
 
*/

public class E09_BufferedStream {

	static File book = new File("files/frankenstein.txt");

	// 버퍼의 크기에 따라 읽는 속도에 차이가 있는가?

	/** 한 글자식 읽기 */
	public static void read1() {

		FileReader in = null; // 초기화 안 해주면 에러 뜸
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
				in.close(); // 중간에 에러가 나든 안 나든 닫아주겠지 (finally에 넣는게 더 합리적)
			} catch (IOException e) { // 근데 in.close()도 트캐문이 필요해서 이렇게 지저분한 형태가 될 수 밖에 없다.
				e.printStackTrace();
			}
		}
	}

	/** 버퍼방식으로 읽기 (1024) */
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

	/** 버퍼방식으로 읽기 (2048) */
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

	/** bufferedReader 사용하기 */
	public static void read4() {
		
		FileReader fin = null ; 
		BufferedReader bin = null;
		
		try {
			fin = new FileReader(book);
			bin = new BufferedReader(fin);
			
			//BufferedReader 에는 readLine()이 있어서 한 줄씩 읽기 편하다. 		
			//bin.readLine() : 한 줄씩 읽는데 더 이상 읽을 게 없으면 null이 나옴
			
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
				//가장 최근에 열엇던 순서대로 닫아줄 것 (순서 주의!★★★그니까 가장 나중에 열린 걸 제일 먼저 닫으란 애기 같음) 
				bin.close();   
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	;
		
		
		
		
		
		//BufferedReader in = new BufferedReader(new FileReader(book)); //원래는 Reader를 넣어야 하는데 FileReader도 리더기 땜에 넣어줄 수 있음 
		
	}
	
	
	public static void main(String[] args) {

//		long  start = System.currentTimeMillis();
//		read1(); //한글자씩 읽기 메서드 
//		System.out.println("\n걸린 시간 : " + (System.currentTimeMillis() - start) + "ms");

//		long start = System.currentTimeMillis();
//		read2();
//		System.out.println("\n 걸린 시간 : " + (System.currentTimeMillis() - start) + "ms");

//		long start = System.currentTimeMillis();
//		read3();
//		System.out.println("\n 걸린 시간  " + (System.currentTimeMillis() - start) + "ms");

		long start = System.currentTimeMillis();
		read4();
		System.out.println("\n 걸린 시간  " + (System.currentTimeMillis() - start) + "ms");
		//한줄씩 다시 끊는 시간이 걸려서 약간 더 많이 걸리는 모습 2, 3 보다 좀 더 오래 걸림 
	}
}
