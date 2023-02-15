package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class E06_Copy_악마다이건 {
/*
files폴더 내부의 모든 내용을 files_copy폴더로 복사해보세요.
 */
	
	//int depth; 이거 필요 없는듯
	
	
	HashMap<File, File> copyMap = new HashMap<>();
	
	public void copy(File src, File dst) {
		try {
			FileInputStream in = new FileInputStream(src); //읽어주는 동시에
			FileOutputStream out = new FileOutputStream(dst); //내보낼 준비도 해준다 
			
			byte[] buffer = new byte[1024]; //이미지도 in out하려면 char[]이 아니라 byte[]로 읽어야 함
			int len;
			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len); //굳이 new Strigng 해줄 필요 없음
			}
			
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//copyAll 폐기...	
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
//		//list() : 해당 파일 내부의 모든 파일 및 디렉토리 목록을 문자열 배열로 반환한다. 
//		//listFile() : 해당 파일 내부의 모든 파일 및 디렉토리 목록을 파일 배열로 반환한다. 
//		for(String path : src.list()) { //src에 이미 존재하는 파일들의 경로를 볼 수 있음
//			File innerFile = new File(src, path); //dir, 부모의 경로가 빠져있어서 Image가 파일이라고 나왔었음 
//			File copyPath = new File(dst, path);
//			
//			if(innerFile.isDirectory()) {
//				//System.out.println(innerFile + "은 디렉토리다. ");
//				//System.out.println("복사 경로는 " + copyPath + "입니다. ");
//
//				copyAll(innerFile.getPath());
//				//System.out.println(innerFile + "은 디렉토리입니다. - " + innerFile.getPath());
//				
//			} else {
//				//System.out.println(innerFile + "은 파일이다. ");
//				//System.out.println("복사 경로는 " + copyPath + "입니다. ");
//				copy(innerFile, copyPath);
//				System.out.println(innerFile + "는 " + copyPath + "로 복사되었습니다. ");
//			}
//		}
//				
//	}
	
	public File getCopyFile(File src) {	
		String path = src.getPath();
		int sep = path.indexOf('\\');
		//path.indexOf(File.separator);
		String before = path.substring(0, sep) + "_copy";
		String after = path.substring(sep); //sep부터 끝까지
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
	
	public HashMap<File, File> findAllPath(File dir) { //모든 경로를 함 찾아봐자
		HashMap<File, File> copyMap = new HashMap<>(); //전역에 있으면 안 좋음 
		//디렉토리가 아니면 일단 여기서 거름
		if(!dir.isDirectory()) {
			System.out.println("디렉토리만 탐색 가능");
			return null;
		}
		
		addAllPathToMap(copyMap, dir); //재귀를 addAllPathToMap()메서드를 따로 파서 거따 옮겨줬대 
		//처음엔 원래 findAllPath()를 재귀호출하도록 돼 있었음 
		//재귀를 따로 뺀 이유는 new HashMap<>()을 다시 하지 않기 위해서!
				
//				System.out.println("찾은 경로 : " + f);
//				//System.out.println("복사 경로 : " + f.getPath().replace(("files","files_copy")); //이건 양아치짓
//				//files 안에 파일이름으로 files가 들어 있을 경우를 생각해야 됨.
//				//	replace("files", "fies_copy") 는 files란 글자는 filesCopy로 다 바꿔버리겠단 뜻 
//				System.out.println("___________________________________");
//				//해결책은 경로에서 맨 앞에 있는 녀석만 떼서 _copy를 붙여주면 됨
//				System.out.println("복사 경로 : " + getCopyFile(f));
		return copyMap;
	}
	
	
	public void copyAll(File dir) {
		HashMap<File, File> foundMap = findAllPath(dir);
		for(File src : foundMap.keySet()) {
			//copy(src, foundMap.get(src));
			//이미 다 찾았으니까 여기선 복사만 해주면 된다. 
			
			
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
		//이렇게 또 해줄 경우 myCopy가 전역에 있을 경우 원래 데이터가 전역 해시맵에 남아 있기 때문에  
		

		
		
		
		
//		//파일을 읽어서 다른 파일에 그대로 쓰면 그게 복사지
//		
//		
//		File src = new File("files/rps.log"); //이 파일을 사용할 것이다. (기존에 있는 파일이지만 new File로 객체에 담아주는?)
//		
//		File dir = new File("files_copy");
//		File dst = new File(dir, "rps.log"); //앞에는 디렉토리를 , 뒤에는 경로를 붙여주는 오버라이딩 사용 가능 ★★★★★
//		
//		System.out.println(dst);
//		System.out.println(dst.getAbsolutePath());
//		
//		if(!dir.exists()) {
//			dir.mkdir();
//		}
//		
//		//copy("files/rps.log", "files_copy/rps.log");
//		//두 경로값만 전달해주면 됨 
		
	}	
}




