package quiz;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
reporters.txt�� ����� ���ڵ��� ������ ���� ��
�� ���ڵ��� ������ ��� �ִ� files/reporters/�̸�_�Ź���(�о�).rep ���Ϸ� �籸���غ�����
�׷� ������ 900���� �������� 
 */
public class E10_Reporters {

	static File file = new File("files/reporters.txt");
	
	
	public static void main(String[] args) {
		read(file);
	}
	
	
	
	
	//���� ����� 
	public static void getFile(File file, String name, String company, String specialty) {
		//String[] path = file.getPath().split("\\.");
		
		String newPathDir = "files/reporters/";
		String newPathFile = String.format("%s_%s(%s).rep", name, company, specialty).replace("/", "#");
		File reporterFile =  new File(newPathDir + newPathFile);
		
		reporterFile.getParentFile().mkdirs();		
		try {
			reporterFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//�ϴ� �о���̴� �ź��� 
	public static void read(File file) {
		try (
				FileInputStream fin = new FileInputStream(file);
				DataInputStream in = new DataInputStream(fin);
		) {
			String[] reporters = new String(in.readAllBytes()).split("\n");
			
			for(String reporter : reporters) {
				String[] infos  = reporter.split("\t");
				getFile(file, infos[2], infos[0], infos[1]);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
