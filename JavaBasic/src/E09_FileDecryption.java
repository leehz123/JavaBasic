import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class E09_FileDecryption {
	
	static File crypto;
	int sampleLength = 10 ; 
	
	final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	//사실 이건 쓰지도 않는데 메모리에 계속 실어놓는 거기때문에 낭비임. 좋은 짓은 아니지만 걍 하겠음 
	
	final static char[] UPPERCASE = ALPHABET.toCharArray();
	final static char[] LOWERCASE = ALPHABET.toLowerCase().toCharArray();
	
	
	public E09_FileDecryption (File crypto) {
		this.crypto = crypto;
		//file만 받았을 경우 sampleLength 는 기본값인 10으로 진행됨 
	}
	
	
	public E09_FileDecryption (File crypto, int sampleLength) {
		this.crypto = crypto;
		this.sampleLength = sampleLength;
	}
	
	
	
	//복호화 진행
	public String decrypt(String str, int key) {
		StringBuilder builder = new StringBuilder();
		char[] chs = str.toCharArray();
		for(char ch : chs) {
			if(Character.isUpperCase(ch)) {
				int index = ch - 'A';
				builder.append(UPPERCASE[index - key < 0 ? 26 + (index - key) : index - key]);
			} else if(Character.isLowerCase(ch)) {
				int index = ch - 'a';
				builder.append(LOWERCASE[index - key < 0 ? 26 + (index - key) : index - key]);				
			} else {
				builder.append(ch);
			}
		}
		return builder.toString();
	}
	
	
	
	public void sample() {
		
		StringBuilder sampleBuilder = new StringBuilder();
		// AutoClose인터페이스가 구현된 클래스들은 try()문을 사용할 수 있다. 
		// try 옆의 ()에 선언한 객체들은 try문이 끝나면서 자동으로 close()를 실행한다. 
		try (
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
		){
			for(int i = 0; i < 10; ++i ) {
				sampleBuilder.append(in.readLine() + '\n');
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		for(int key = 1; key < 26; ++key) {
			System.out.printf("[key %d]\n\n", key);
			System.out.println(decrypt(sampleBuilder.toString(), key));
			//아 한칸씩 밀 생각을 못 했네 
		
		}
	}
	
	
	//너무 스태틱만 하니까 걍 싹 인스턴스로 해볼게 인스턴스를 하면 매개변수를 전달할 필요가 없어짐
	public void bruteForce() {
		//10줄씩 보여주기
		sample();
		
		//골라서 파일 생성하기 (BufferedReader 를 이용해 콘솔로부터 입력받기)
		//인풋스트림은 바이트타입으로 데이터가 넘어옴 다루기 편하려면 문자열로 변환하는게 좋겠지
		//바이트타입으로 넘겨받은 데이터를 char로감싸주는 InputSreamReader	
		try (
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr); //더 빠르게 받기 위해 버퍼드리더 추가				
/*
# InputStreamReader : byte단위인 InputStream을 char단위인 Reader로 재포장하는 클래스 
 */
		) {
			
			while(true) {
				try {
					System.out.print("원하시는 키를 선택하십시오 > ");	
					String userInput = in.readLine();
					int key = Integer.parseInt(userInput); //만약 파스인트로 했을 때 정수로 변환될 수 없는 데이터가 넘어왔다면 정수가 입력될 때까지 입력받는 
					
					execute(key);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Please input Integer number.");
				}
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void execute(int key) {
		
		//파일 이름 만들고 파일 생성  
		String[] path = crypto.getPath().split("\\_"); 		
		
		File decryptedFile = new File(path[0] + "_decrypted.txt");
		
		
		
		try(
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(decryptedFile);
				BufferedWriter bout= new BufferedWriter(fout);
				PrintWriter out = new PrintWriter(bout); //★★★★★★★★★★
		) {
			String line;
			while((line = in.readLine() ) != null ) {
				//out.write(decrypt(line, key) + "\n");
				out.println(decrypt(line, key)); 
				//이렇게 하면 파일에 나가는 println이 된 것 ★ ★★★★★
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {

	//bruteForce(new File("files/frankenstein_encrypted.txt"));	
		E09_FileDecryption decryption = new E09_FileDecryption(new File("files/frankenstein_encrypted.txt"));
		decryption.sample();
		decryption.bruteForce();
	}
}