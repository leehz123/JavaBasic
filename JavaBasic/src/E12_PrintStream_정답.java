import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class E12_PrintStream_���� {
	static File randomList = new File("files/reporters/randomList");
	
	
	
	// ���ϸ��� �̸�, ȸ��, �о� ����
	// new Reporter(�̸�, ȸ��, �о�)�� ���� ��ȯ���ٱ�?
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
	
	
	
	// ������������ 10�� �̾Ƽ� File[]�迭�� ���� �� ���� 
	public static File[] randomReporter() {
		File reportersDir = new File("files/reporters");
		File[] reporters = reportersDir.listFiles();
	
		File[] randomReporters = new File[10];
		for(int i = 0; i < 10; ++i) {
			int randomIndex = (int)(Math.random() * reporters.length);
			randomReporters[i] = new File(reporters[randomIndex].getPath());
		}
		
		System.out.println("���� ���� ��� : " + Arrays.toString(randomReporters));
		System.out.println(); 
		
		return randomReporters;
	}
	
	
	
	public static void main(String[] args) {
//		 PrintStream out = System.out;
//		 out.println("/)/)");
//		 out.println("(  ..)");
//		 out.println("(   >#");
		
		
		// ���� : reporters���� ������ ���ڵ� �� �������� 10���� �����Ͽ� A01_Memberinfo ������ ���Ϸ� �������� (���հ�κ��� ����)
		// printf�� ���Ͽ� ����� �ϸ� �Ǵ� ����		
		

		
		//���� ���������� 10�� �̾Ƽ� randomReporter������ ���� 
		File[] randomReporter = randomReporter();
		 
		
		// �����͸� ������ "files/reporter/randomList" ����
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

			out.writeUTF("            ####���� ����####");
			out.writeUTF("===========================================");
			out.writeUTF("�̸�\t�Ҽ�\t�о�");
	
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

