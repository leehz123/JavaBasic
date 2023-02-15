package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEncryption_���� {
	//�����������������������������
	static class NotCaesarKeyException extends RuntimeException { //�̷��� ����ó���� ���ְ� 
		public NotCaesarKeyException(String msg) {
			super(msg);
		}
	}
	
	//String ���ٰ� char[]�� �ٲ�. ������ {'A', 'B', ...}�Ѷ��Ѷ� ����� 
	final static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	final static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
	
	public static String encryption(String str, int key) {
		
		StringBuilder builder = new StringBuilder();
		char[] chs = str.toCharArray();
		for(char ch : chs) {
			if (Character.isUpperCase(ch)) {
				int index = ch - 'A';  // 'B' - 'A' = 1 '9' - '0' = 9
				builder.append(UPPERCASE[(index + key) % 26]);
			} else if (Character.isLowerCase(ch)) {
				int index = ch - 'a';
				builder.append(LOWERCASE[(index + key) % 26]);
			} else {
				builder.append(ch);
			}
		}
		builder.append('\n'); //�̰� �� ���ָ� ���η� ��� ����. (�ֿܼ� ������ ���η� �� ���� ��Ŭ ���� ���� ���� ����)
		return builder.toString();
	}
	
	
	
	public static void encryptFile(File text, int key) {
		if(key < 0 || key > 26) {
			throw new NotCaesarKeyException("Caesar key must be within the range 1 <= key < 26");
		}
		
		//.�� �������� �ڸ� ������ _encrypted�� �ٿ��ֱ� 
		String[] path = text.getPath().split("\\."); //split(String regex)
		path[0] = path[0] + "_encrypted";
		
		File crypto = new File(String.join(".", path));
		System.out.println("��ȣ�� ��� : " + crypto);

		
		FileReader fin = null;
		BufferedReader in = null;
		FileWriter fout = null;
		BufferedWriter out = null;
		
		try {
			
			fin = new FileReader(text);
			in = new BufferedReader(fin);
			
			fout = new FileWriter(crypto);
			out = new BufferedWriter(fout);
			
			String line;
			while((line = in.readLine()) != null) {
				out.write(encryption(line, key));
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
	
	public static void main(String[] args) {
		encryptFile(new File("files/frankenstein.txt"), 3);
		
	}
}
