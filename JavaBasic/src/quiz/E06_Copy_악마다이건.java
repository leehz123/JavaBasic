package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class E06_Copy_�Ǹ����̰� {
/*
files���� ������ ��� ������ files_copy������ �����غ�����.
 */
	
	//int depth; �̰� �ʿ� ���µ�
	
	
	HashMap<File, File> copyMap = new HashMap<>();
	
	public void copy(File src, File dst) {
		try {
			FileInputStream in = new FileInputStream(src); //�о��ִ� ���ÿ�
			FileOutputStream out = new FileOutputStream(dst); //������ �غ� ���ش� 
			
			byte[] buffer = new byte[1024]; //�̹����� in out�Ϸ��� char[]�� �ƴ϶� byte[]�� �о�� ��
			int len;
			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len); //���� new Strigng ���� �ʿ� ����
			}
			
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//copyAll ���...	
//	public void copyAll(String srcDir) {
//		String copyDir;
//		if (depth == 0 ) {
//			copyDir = srcDir + "_copy";
//		} else {
//			copyDir = srcDir;
//		}
//		
//		depth++;
//		
//		File src = new File(srcDir);
//		File dst = new File(copyDir);
//	
//		if (!dst.exists()) {
//			dst.mkdir();
//		}
//		
//		
//		//list() : �ش� ���� ������ ��� ���� �� ���丮 ����� ���ڿ� �迭�� ��ȯ�Ѵ�. 
//		//listFile() : �ش� ���� ������ ��� ���� �� ���丮 ����� ���� �迭�� ��ȯ�Ѵ�. 
//		for(String path : src.list()) { //src�� �̹� �����ϴ� ���ϵ��� ��θ� �� �� ����
//			File innerFile = new File(src, path); //dir, �θ��� ��ΰ� �����־ Image�� �����̶�� ���Ծ��� 
//			File copyPath = new File(dst, path);
//			
//			if(innerFile.isDirectory()) {
//				//System.out.println(innerFile + "�� ���丮��. ");
//				//System.out.println("���� ��δ� " + copyPath + "�Դϴ�. ");
//
//				copyAll(innerFile.getPath());
//				//System.out.println(innerFile + "�� ���丮�Դϴ�. - " + innerFile.getPath());
//				
//			} else {
//				//System.out.println(innerFile + "�� �����̴�. ");
//				//System.out.println("���� ��δ� " + copyPath + "�Դϴ�. ");
//				copy(innerFile, copyPath);
//				System.out.println(innerFile + "�� " + copyPath + "�� ����Ǿ����ϴ�. ");
//			}
//		}
//				
//	}
	
	public File getCopyFile(File src) {	
		String path = src.getPath();
		int sep = path.indexOf('\\');
		//path.indexOf(File.separator);
		String before = path.substring(0, sep) + "_copy";
		String after = path.substring(sep); //sep���� ������
		return new File(before + after);
	}
	
	public void addAllPathToMap(Map<File, File> map, File dir) {
		for(File f : dir.listFiles()) {
			if(f.isDirectory()) { 
				addAllPathToMap(map, f);
			} else if (f.isFile()) {
				map.put(f, getCopyFile(f));
			}
		}
	}
	
	public HashMap<File, File> findAllPath(File dir) { //��� ��θ� �� ã�ƺ���
		HashMap<File, File> copyMap = new HashMap<>(); //������ ������ �� ���� 
		//���丮�� �ƴϸ� �ϴ� ���⼭ �Ÿ�
		if(!dir.isDirectory()) {
			System.out.println("���丮�� Ž�� ����");
			return null;
		}
		
		addAllPathToMap(copyMap, dir); //��͸� addAllPathToMap()�޼��带 ���� �ļ� �ŵ� �Ű���� 
		//ó���� ���� findAllPath()�� ���ȣ���ϵ��� �� �־��� 
		//��͸� ���� �� ������ new HashMap<>()�� �ٽ� ���� �ʱ� ���ؼ�!
				
//				System.out.println("ã�� ��� : " + f);
//				//System.out.println("���� ��� : " + f.getPath().replace(("files","files_copy")); //�̰� ���ġ��
//				//files �ȿ� �����̸����� files�� ��� ���� ��츦 �����ؾ� ��.
//				//	replace("files", "fies_copy") �� files�� ���ڴ� filesCopy�� �� �ٲ�����ڴ� �� 
//				System.out.println("___________________________________");
//				//�ذ�å�� ��ο��� �� �տ� �ִ� �༮�� ���� _copy�� �ٿ��ָ� ��
//				System.out.println("���� ��� : " + getCopyFile(f));
		return copyMap;
	}
	
	
	public void copyAll(File dir) {
		HashMap<File, File> foundMap = findAllPath(dir);
		for(File src : foundMap.keySet()) {
			//copy(src, foundMap.get(src));
			//�̹� �� ã�����ϱ� ���⼱ ���縸 ���ָ� �ȴ�. 
			
			
			File dst = foundMap.get(src);
			
			if(!dst.getParentFile().exists()) {
				dst.getParentFile().mkdirs();
			}
			
//			System.out.println(dst);
//			System.out.println(dst.getParent());
//			
//			if(dst.getParentFile().exists()) {
//				dst.getParentFile().mkdirs();
//			}
			
			
			copy(src, dst);
		}
	}
	
	public static void main(String[] args) {
		E06_Copy copy = new E06_Copy();
		
		//copy.findAllPath(new File("files"));
		
		//System.out.println(copy.copyMap);
		copy.copyAll(new File("files"));
		copy.copyAll(new File("myfiles")); 
		//�̷��� �� ���� ��� myCopy�� ������ ���� ��� ���� �����Ͱ� ���� �ؽøʿ� ���� �ֱ� ������  
		

		
		
		
		
//		//������ �о �ٸ� ���Ͽ� �״�� ���� �װ� ������
//		
//		
//		File src = new File("files/rps.log"); //�� ������ ����� ���̴�. (������ �ִ� ���������� new File�� ��ü�� ����ִ�?)
//		
//		File dir = new File("files_copy");
//		File dst = new File(dir, "rps.log"); //�տ��� ���丮�� , �ڿ��� ��θ� �ٿ��ִ� �������̵� ��� ���� �ڡڡڡڡ�
//		
//		System.out.println(dst);
//		System.out.println(dst.getAbsolutePath());
//		
//		if(!dir.exists()) {
//			dir.mkdir();
//		}
//		
//		//copy("files/rps.log", "files_copy/rps.log");
//		//�� ��ΰ��� �������ָ� �� 
		
	}	
}




