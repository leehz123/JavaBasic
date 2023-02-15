package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/** 
# ��ȣȭ�� frankenstein_encrypted.txt�� ����� ������ �����Ͻÿ�
1. ��ȣ�� ������ ó�� 10���� 1~25������ Ű�� ��� ��ȭ�� ����� ����ڿ��� ��� 
2. ����ڴ� �ش� ����� ���� �˸��� Ű�� �����Ͽ� ��ȣȭ�� ������ �� ����
3. ��ȣȭ ����� frankenstein_decrypted.txt�� ����
*/



public class E09_FileDecryption_�ǽ� {
	
	static File originFile = new File("files/frankenstein_encrypted.txt");
	
	static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	
	
	static FileReader fin = null;
	static BufferedReader in = null;
	static FileWriter fout = null;
	static BufferedWriter out = null;
	
	
	
	//��ȣȭ�� �����Ͱ� ��� ������ ����� �޼��� 
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
	



	//BufferedReader, BufferedWriter �̿��ؼ� ��ȣȭ�� �����͸� �� ���Ϸ� �ű�� �޼��� 
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
	
	
	
	//��ȣȭ �޼��� 
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
	
	
	
	
	//10�ٸ� �����ϴ� �޼��� 
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
		
		
		//���پ� ���� ���
		String firstLine = firstLine(originFile);
		for(int i = 1; i <= 25; ++i) {
			System.out.println(i + " : " + decrypt(firstLine, i));
		}
		
		
		
		//���ϴ� key�� �����ؼ� files/frankenstein_decrypt.txt�� ����
		File decryptFile = getDecryptFile();
		ReadWrite(decryptFile, 3);
		

	}
}