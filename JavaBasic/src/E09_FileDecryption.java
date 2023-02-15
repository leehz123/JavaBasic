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
	//��� �̰� ������ �ʴµ� �޸𸮿� ��� �Ǿ���� �ű⶧���� ������. ���� ���� �ƴ����� �� �ϰ��� 
	
	final static char[] UPPERCASE = ALPHABET.toCharArray();
	final static char[] LOWERCASE = ALPHABET.toLowerCase().toCharArray();
	
	
	public E09_FileDecryption (File crypto) {
		this.crypto = crypto;
		//file�� �޾��� ��� sampleLength �� �⺻���� 10���� ����� 
	}
	
	
	public E09_FileDecryption (File crypto, int sampleLength) {
		this.crypto = crypto;
		this.sampleLength = sampleLength;
	}
	
	
	
	//��ȣȭ ����
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
		// AutoClose�������̽��� ������ Ŭ�������� try()���� ����� �� �ִ�. 
		// try ���� ()�� ������ ��ü���� try���� �����鼭 �ڵ����� close()�� �����Ѵ�. 
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
			//�� ��ĭ�� �� ������ �� �߳� 
		
		}
	}
	
	
	//�ʹ� ����ƽ�� �ϴϱ� �� �� �ν��Ͻ��� �غ��� �ν��Ͻ��� �ϸ� �Ű������� ������ �ʿ䰡 ������
	public void bruteForce() {
		//10�پ� �����ֱ�
		sample();
		
		//��� ���� �����ϱ� (BufferedReader �� �̿��� �ַܼκ��� �Է¹ޱ�)
		//��ǲ��Ʈ���� ����ƮŸ������ �����Ͱ� �Ѿ�� �ٷ�� ���Ϸ��� ���ڿ��� ��ȯ�ϴ°� ������
		//����ƮŸ������ �Ѱܹ��� �����͸� char�ΰ����ִ� InputSreamReader	
		try (
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr); //�� ������ �ޱ� ���� ���۵帮�� �߰�				
/*
# InputStreamReader : byte������ InputStream�� char������ Reader�� �������ϴ� Ŭ���� 
 */
		) {
			
			while(true) {
				try {
					System.out.print("���Ͻô� Ű�� �����Ͻʽÿ� > ");	
					String userInput = in.readLine();
					int key = Integer.parseInt(userInput); //���� �Ľ���Ʈ�� ���� �� ������ ��ȯ�� �� ���� �����Ͱ� �Ѿ�Դٸ� ������ �Էµ� ������ �Է¹޴� 
					
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
		
		//���� �̸� ����� ���� ����  
		String[] path = crypto.getPath().split("\\_"); 		
		
		File decryptedFile = new File(path[0] + "_decrypted.txt");
		
		
		
		try(
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(decryptedFile);
				BufferedWriter bout= new BufferedWriter(fout);
				PrintWriter out = new PrintWriter(bout); //�ڡڡڡڡڡڡڡڡڡ�
		) {
			String line;
			while((line = in.readLine() ) != null ) {
				//out.write(decrypt(line, key) + "\n");
				out.println(decrypt(line, key)); 
				//�̷��� �ϸ� ���Ͽ� ������ println�� �� �� �� �ڡڡڡڡ�
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