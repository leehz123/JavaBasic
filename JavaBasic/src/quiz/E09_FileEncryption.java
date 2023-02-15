package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
# ���� ��ȣ 
- ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� ġȯ�ϴ� ��ȣ
- Ű ����ŭ ���ĺ��� ���������� �о��ָ� ��ȣȭ�� �ǰ� ��ȣ������ Ű����ŭ �������� �о��ָ� ��ȣȭ�� �ȴ�. 


ABCDEFGHIJKLMNOPQRSTUVWXYZ 
hello --- key�� 3�� �� ---> khoor
�ٽ� hello�� ���ƿ����� �������� 3ĭ �����̸� �ǰ���

���࿡ Y�� ���� ������ 3ĭ �̴µ� �ٽ� A�� ���ƿ;߰���

files/frankenstein.txt�� ���ϴ� Ű������ ��ȣȭ�� ������ frankenstein_encrypted.txt�� �����غ����� 
(���ĺ��� ��ȣȭ �ž� �ϰ� �� ���� ��� ���ڵ��� ���� _ Ư�����ڵ� �ϰ� ������ �ص� ��)
 */

public class E09_FileEncryption {

	static File book = new File("files/frankenstein.txt");

	static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static final String lower = "abcdefghijklmnopqrstuvwxyz";

	public static File encryptedFile(File book, String newName) {

		String path = book.getPath();

		int index2 = path.indexOf(".txt");
		int index1 = path.indexOf('\\');

		String before = path.substring(0, index1);
		String middle = newName;
		String after = path.substring(index2);

		File f = new File(before + '/' + middle + after);

		if (!f.exists()) {
			try {
				System.out.println(f.createNewFile() ? "���� ����" : "���� ����");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return f;
	}

	
	
	
	public static void encrypt(File book, int num, File encryptedFile) {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			
			in = new FileInputStream(book);
			out = new FileOutputStream(encryptedFile);

			int ch = -1;
			while ((ch = in.read()) != -1) {
				char originCh = (char) ch;

				if (num >= 0) {
					out.write(moveRight(originCh, num));
				} else {
					out.write(moveLeft(originCh, num));
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	
	
	public static char moveRight(char ch, int num) {
		
		int originIndex;
		int movedIndex;

		if ((ch >= 'a') && (ch <= 'z')) {
			
			originIndex = lower.indexOf(ch);
			movedIndex = originIndex + num;

			if (movedIndex > lower.length() - 1) {
				movedIndex = movedIndex - lower.length();
			}
			return lower.charAt(movedIndex);

		} else if ((ch >= 'A') && (ch <= 'Z')) {
			
			originIndex = upper.indexOf(ch);
			movedIndex = originIndex + num;

			if (movedIndex > upper.length() - 1) {
				movedIndex = movedIndex - lower.length();
			}
			return  upper.charAt(movedIndex);
		}
		return ch;
	}

	
	public static char moveLeft(char ch, int num) {

		int originIndex;
		int movedIndex;

		if ((ch >= 'a') && (ch <= 'z')) {
			
			originIndex = lower.indexOf(ch);
			movedIndex = originIndex + num;

			if (movedIndex < 0) {
				movedIndex = upper.length() + movedIndex;
			}
			return lower.charAt(movedIndex);

		} else if ((ch >= 'A') && (ch <= 'Z')) {
			
			originIndex = upper.indexOf(ch);
			movedIndex = originIndex + num;

			if (movedIndex < 0) {
				movedIndex = upper.length() + movedIndex;
			} 

			return upper.charAt(movedIndex);
		}
		return ch;
	}

	
	
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		File encryptedFile = encryptedFile(book, "frankenstein_encrypted");
		
		encrypt(book, 3, encryptedFile);
		
		System.out.println("�ɸ� �ð� : " + (System.currentTimeMillis() - start) + "ms");
		
		
		
		
		//��ȣȭ
//		File f = new File("files/frankenstein_decrypted.txt");
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		encrypt(encryptedFile, -3, f);
		

	}
}
