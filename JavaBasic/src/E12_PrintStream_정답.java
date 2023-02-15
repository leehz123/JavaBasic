import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class E12_PrintStream_정답 {
	static File randomList = new File("files/reporters/randomList");
	
	
	
	// 파일명에서 이름, 회사, 분야 추출
	// new Reporter(이름, 회사, 분야)를 만들어서 반환해줄까?
	public static Reporters getReporterInstance(File[] file, int i) {
		
		String path = file[i].getPath();
	
		int index1 = path.indexOf("\\", path.indexOf("\\") + 1);
		int index2 = path.indexOf("_");
		int index3 = path.indexOf("(");
		int index4 = path.indexOf(")");
		
		String name = path.substring(index1 + 1, index2);
		String company = path.substring(index2 + 1, index3);
		String specialty = path.substring(index3 + 1, index4);
		
		
		return new Reporters(name , company, specialty);
	}
	
	
	
	// 랜덤기자파일 10개 뽑아서 File[]배열애 넣은 거 리턴 
	public static File[] randomReporter() {
		File reportersDir = new File("files/reporters");
		File[] reporters = reportersDir.listFiles();
	
		File[] randomReporters = new File[10];
		for(int i = 0; i < 10; ++i) {
			int randomIndex = (int)(Math.random() * reporters.length);
			randomReporters[i] = new File(reporters[randomIndex].getPath());
		}
		
		System.out.println("랜덤 기자 목록 : " + Arrays.toString(randomReporters));
		System.out.println(); 
		
		return randomReporters;
	}
	
	
	
	public static void main(String[] args) {
//		 PrintStream out = System.out;
//		 out.println("/)/)");
//		 out.println("(  ..)");
//		 out.println("(   >#");
		
		
		// 연습 : reporters폴더 내부의 기자들 중 랜덤으로 10명을 선택하여 A01_Memberinfo 형식의 파일로 만들어보세요 (총합계부분은 빼래)
		// printf로 파일에 출력을 하면 되는 문제		
		

		
		//랜덤 리포터파일 10개 뽑아서 randomReporter변수에 저장 
		File[] randomReporter = randomReporter();
		 
		
		// 데이터를 내보낼 "files/reporter/randomList" 생성
		try {
			randomList.createNewFile();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		//out
		try (
				FileOutputStream fout = new FileOutputStream(randomList);
				ObjectOutputStream out = new ObjectOutputStream(fout);	
		){

			out.writeUTF("            ####기자 정보####");
			out.writeUTF("===========================================");
			out.writeUTF("이름\t소속\t분야");
	
			for(int i = 0; i < 10; ++i) {
				out.writeObject(getReporterInstance(randomReporter, i));
			}
			out.writeUTF("===========================================");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	
		
		
		
		//__________________________________________________________________
		
		
		
		//in 
		try( 
				FileInputStream fin = new FileInputStream(randomList);
				ObjectInputStream in = new ObjectInputStream(fin);
		) {
			
			System.out.println(in.readUTF());
			System.out.println(in.readUTF());
			System.out.println(in.readUTF());
			for(int i = 0; i < 10; ++i) {
				System.out.println(in.readObject());
			}
			System.out.println(in.readUTF());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}

 

class Reporters implements Serializable {

	private static final long serialVersionUID = 14321432432L;

	String name; 
	String company;
	String specialty;
	
	
	public Reporters(String name, String company, String specialty){
		this.name = name;
		this.company = company;
		this.specialty = specialty;
	}
	
	@Override
	public String toString() {
		return 	String.format("%s\t%s\t%s\t", name, company, specialty);
	}
}

