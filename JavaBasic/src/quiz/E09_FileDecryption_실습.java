package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/** 
# 암호화된 frankenstein_encrypted.txt를 사용해 다음을 구현하시오
1. 암호문 파일의 처음 10줄을 1~25까지의 키로 모두 복화한 결과를 사용자에게 출력 
2. 사용자는 해당 결과를 보고 알맞은 키를 선택하여 복호화를 진행할 수 있음
3. 복호화 결과는 frankenstein_decrypted.txt에 저장
*/



public class E09_FileDecryption_실습 {
	
	static File originFile = new File("files/frankenstein_encrypted.txt");
	
	static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	
	
	static FileReader fin = null;
	static BufferedReader in = null;
	static FileWriter fout = null;
	static BufferedWriter out = null;
	
	
	
	//복호화한 데이터가 담길 파일을 만드는 메서드 
	public static File getDecryptFile() {
		String path = originFile.getPath();
		int index = path.indexOf('_');
		String before = path.substring(0, index);
		File decryptFile = new File(before + "_decrypted.txt");
		if(!decryptFile.exists()) {
			try {
				decryptFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return decryptFile;
	}
	



	//BufferedReader, BufferedWriter 이용해서 복호화한 데이터를 새 파일로 옮기는 메서드 
	public static void ReadWrite(File decryptFile, int key) {
		
		try {
			fin = new FileReader(originFile);
			in = new BufferedReader(fin);
			fout = new FileWriter(decryptFile);
			out = new BufferedWriter(fout);
			
			String line;	
			while((line = in.readLine()) != null) {
				out.write(decrypt(line, key));
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				fout.close();
				in.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	//복호화 메서드 
	public static String decrypt(String line, int key) {	
		char[] chs=  line.toCharArray();
		StringBuilder builder = new StringBuilder();
		int index;
		
		for(char ch : chs) {
			
			if(Character.isUpperCase(ch)) {
				index = ch - 'A';
				if((index - key) < 0) {
					builder.append(UPPERCASE.charAt(26 + (index - key)));
				} else {
					builder.append(UPPERCASE.charAt(index - key));
				}	
			
			} else if(Character.isLowerCase(ch)) {
				index = ch - 'a';
				if((index - key) < 0) {
					builder.append(LOWERCASE.charAt(26 + (index - key)));
				} else {
					builder.append(LOWERCASE.charAt(index - key));
				}
				
			} else {
				builder.append(ch);
			}
		}
		builder.append('\n');  
		return builder.toString();
	}	
	
	
	
	
	//10줄만 추출하는 메서드 
	public static String firstLine(File originFile) {
		try {
			fin = new FileReader(originFile);
			in = new BufferedReader(fin);
			
			StringBuilder builder = new StringBuilder();
			
			for(int i = 0; i < 10; ++i) {
				builder.append(in.readLine());
				builder.append('\n');
			}
			
			return builder.toString();
			
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
		
		
	
		
	public static void main(String[] args) {
		
		
		//한줄씩 샘플 출력
		String firstLine = firstLine(originFile);
		for(int i = 1; i <= 25; ++i) {
			System.out.println(i + " : " + decrypt(firstLine, i));
		}
		
		
		
		//원하는 key로 설정해서 files/frankenstein_decrypt.txt에 저장
		File decryptFile = getDecryptFile();
		ReadWrite(decryptFile, 3);
		

	}
}