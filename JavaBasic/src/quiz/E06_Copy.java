package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//깔끔 ver. 
public class E06_Copy {
	
	public void copy(File src, File dst) {
		try {
			FileInputStream in = new FileInputStream(src); 
			FileOutputStream out = new FileOutputStream(dst);  
			
			byte[] buffer = new byte[1024]; 
			int len;
			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len); 
			}
			
			//가장 최근에 열엇던 순서대로 닫아줘야 하나 봄! (순서 주의!★★★)
			out.close();
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public File getCopyFile(File src) {	
		String path = src.getPath();
		int sep = path.indexOf('\\');
		String before = path.substring(0, sep) + "_copy";
		String after = path.substring(sep); 
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
	
	public HashMap<File, File> findAllPath(File dir) { 
		HashMap<File, File> copyMap = new HashMap<>();
		
		if(!dir.isDirectory()) {
			System.out.println("디렉토리만 탐색 가능");
			return null;
		}
		
		addAllPathToMap(copyMap, dir);  
				
		return copyMap;
	}
	
	
	public void copyAll(File dir) {
		HashMap<File, File> foundMap = findAllPath(dir);
		for(File src : foundMap.keySet()) {
			
			File dst = foundMap.get(src);
			
			if(!dst.getParentFile().exists()) {
				dst.getParentFile().mkdirs();
			}		
	
			copy(src, dst);
		}
	}
	
	public static void main(String[] args) {
		E06_Copy copy = new E06_Copy();
		
		copy.copyAll(new File("files"));
		
		System.out.println("성공");
	}
	
}