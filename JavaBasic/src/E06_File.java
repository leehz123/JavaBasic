import java.io.File;
import java.io.IOException;

public class E06_File {
/*
# java.io.File
파일 시스템에 저장된 파일 또는 디렉토리의 정보를 담을 수 있는 클래스
쉽게 말해서 파일과 디렉토리를 다룰 수 있는 클래스
주의할 것은 File인스턴스를 생성한다고 파일이나 디렉토리가 형성되는 것이 아니라는 것!!!!!
(난 이걸 몰라서 계속 헤맸지 뭐야ㅎㅎㅎㅎ)
인스턴스에 담겨 있는 정보를 바탕으로 파일 시스템을 직접 수정할 수 있다. 
(파일에 쓴다 = 하드디스크에 쓴다. 파일은 사실살 하드디를 의미) 
(파일시스템은 하드디스크를 편리하게 다루기 위한 시스템)
 */
	public static void main(String[] args) {
		
		File f1 = new File("files");
		File f2 = new File("files/abc.txt");
		File f3 = new File("notExistFile.abcd"); //존재하지 않는 파일에 대한 파일도 파일 객체로 만들 수 있음★ 
		
		
		System.out.println("f1의 절대 경로 (실제 위치) : " + f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f3.getAbsolutePath()); //얘는 실제 파일이 존재하지 않는데도 걍 냅다 경로 찾아주네 
		//파일이 실제로 있냐 없냐 가리는 데 쓰면 안 되겠음 
		
		//canRead(), canWrite(), canExecute() : 해당 파일의 권한을 확인할 수 있다. 
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite()); 
		System.out.println(f1.canExecute());

		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		System.out.println(f2.canExecute());

		System.out.println(f3.canRead());
		System.out.println(f3.canWrite());
		System.out.println(f3.canExecute());
		
		//해당 경로가 절대 경로인지 확인하는 메서드
		File f4 = new File("C:\\JavaAWS\\java-workspace\\JavaBasic\\files");
		System.out.println("f1은 절대 경로니? : " + f1.isAbsolute());
		System.out.println("f4는 절대 경로니? : " + f4.isAbsolute());
		
		//디렉토리인지, 파일인지, 존재하는지 확인 메서드 
		System.out.println("f1은 디렉토리(폴더)니? : " + f1.isDirectory());
		System.out.println("f2는 디렉토리(폴더)니? : " + f2.isDirectory());
		
		System.out.println("f1은 파일인가요? : " + f1.isFile());
		System.out.println("f2은 파일인가요? : " + f2.isFile());
		System.out.println("f3은 파일인가요? : " +f3.isFile());
		System.out.println("f4은 파일인가요? : " +f4.isFile());
		
		System.out.println("f1 존재하니 ? : " + f1.exists());
		System.out.println("f3 존재하니 ? : " + f3.exists());
		
		//mkdir() : 해당 경로를 가진 디렉터리를 새로 생성하는 것 (상위 디렉토리가 존재하지 않으면 생성 불가능)>> 아 그래서 copy문제 풀 때 
		//내부내부파일 형성할 때 getParentfiles().mkdirs()해줬구나ㅋ
		File dir1 = new File("files2");
		System.out.println(dir1.mkdir() ? 
				"files2디렉터리 생성에 성공" : "files2 디렉터리 생성에 실패"); //디렉터리 만드는데 성공하면 트루 
		//f11하고 패키지익플창에서 빈공간 마우스 오른 refresh 하든가 f5새로고침ㄴ
		
		//★려기서 짚고 넘어갈 것 File인스턴스를 생성한다고 매개변수로 전달한 파일이나 디렉터리가 생성되는 건 아니다. 
		//★해당 인스턴스를 이용해서 파일은 createNewFile(), 디렉토리는 mkdir()로 생성해줘야 한다. 
		
		//mkdirs() : 상위디렉토리가 존재하지 않아도 경로상 필요한 모든 디렉토리를 생성해줌 (생성성공시 true. mkdir도 마찬가지)
//		File dir2 = new File("test/test/dir2");
//		System.out.println(dir1.mkdir() ? 
//				"dir2디렉터리 생성에 성공" : "dir2 디렉터리 생성에 실패");  //mkdir하면 실패함
		
		File dir2 = new File("test/test/dir2");
		System.out.println(dir2.mkdirs() ? 
				"dir2디렉터리 생성에 성공" : "dir2 디렉터리 생성에 실패"); 
		
		
		// createNewFile() : 파일 생성 (내가 추가함 햠햠)
		File f5 = new File("files2/abc.txt");
		try {
			f5.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 디렉터리.getparent() : 상위디렉터리목록을 문자열로 표현. 아래 예시의 경우 "files/Image"를 반환
		File innerdir = new File("files/Image/Animal");
		String parents = innerdir.getParent();
		System.out.println(parents);

		
		
		
		
		
	}
}
