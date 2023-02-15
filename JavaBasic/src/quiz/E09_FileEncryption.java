package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
# 시저 암호 
- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 치환하는 암호
- 키 값만큼 알파벳을 오른쪽으로 밀어주면 암호화가 되고 암호문에서 키값만큼 왼쪽으로 밀어주면 복호화가 된다. 


ABCDEFGHIJKLMNOPQRSTUVWXYZ 
hello --- key가 3일 때 ---> khoor
다시 hello로 돌아오려면 왼쪽으로 3칸 움직이면 되것지

만약에 Y가 들어가면 옆으로 3칸 미는데 다시 A로 돌아와야겠지

files/frankenstein.txt를 원하는 키값으로 암호화한 파일을 frankenstein_encrypted.txt로 생성해보세요 
(알파벳만 암호화 돼야 하고 그 외의 모든 문자들은 무시 _ 특수문자도 하고 싶으면 해도 됨)
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
				System.out.println(f.createNewFile() ? "생성 성공" : "생성 실패");
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
		
		System.out.println("걸린 시간 : " + (System.currentTimeMillis() - start) + "ms");
		
		
		
		
		//복호화
//		File f = new File("files/frankenstein_decrypted.txt");
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		encrypt(encryptedFile, -3, f);
		

	}
}
