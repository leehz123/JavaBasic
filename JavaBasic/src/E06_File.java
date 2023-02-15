import java.io.File;
import java.io.IOException;

public class E06_File {
/*
# java.io.File
���� �ý��ۿ� ����� ���� �Ǵ� ���丮�� ������ ���� �� �ִ� Ŭ����
���� ���ؼ� ���ϰ� ���丮�� �ٷ� �� �ִ� Ŭ����
������ ���� File�ν��Ͻ��� �����Ѵٰ� �����̳� ���丮�� �����Ǵ� ���� �ƴ϶�� ��!!!!!
(�� �̰� ���� ��� ����� ���ߤ�������)
�ν��Ͻ��� ��� �ִ� ������ �������� ���� �ý����� ���� ������ �� �ִ�. 
(���Ͽ� ���� = �ϵ��ũ�� ����. ������ ��ǻ� �ϵ�� �ǹ�) 
(���Ͻý����� �ϵ��ũ�� ���ϰ� �ٷ�� ���� �ý���)
 */
	public static void main(String[] args) {
		
		File f1 = new File("files");
		File f2 = new File("files/abc.txt");
		File f3 = new File("notExistFile.abcd"); //�������� �ʴ� ���Ͽ� ���� ���ϵ� ���� ��ü�� ���� �� ������ 
		
		
		System.out.println("f1�� ���� ��� (���� ��ġ) : " + f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f3.getAbsolutePath()); //��� ���� ������ �������� �ʴµ��� �� ���� ��� ã���ֳ� 
		//������ ������ �ֳ� ���� ������ �� ���� �� �ǰ��� 
		
		//canRead(), canWrite(), canExecute() : �ش� ������ ������ Ȯ���� �� �ִ�. 
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite()); 
		System.out.println(f1.canExecute());

		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		System.out.println(f2.canExecute());

		System.out.println(f3.canRead());
		System.out.println(f3.canWrite());
		System.out.println(f3.canExecute());
		
		//�ش� ��ΰ� ���� ������� Ȯ���ϴ� �޼���
		File f4 = new File("C:\\JavaAWS\\java-workspace\\JavaBasic\\files");
		System.out.println("f1�� ���� ��δ�? : " + f1.isAbsolute());
		System.out.println("f4�� ���� ��δ�? : " + f4.isAbsolute());
		
		//���丮����, ��������, �����ϴ��� Ȯ�� �޼��� 
		System.out.println("f1�� ���丮(����)��? : " + f1.isDirectory());
		System.out.println("f2�� ���丮(����)��? : " + f2.isDirectory());
		
		System.out.println("f1�� �����ΰ���? : " + f1.isFile());
		System.out.println("f2�� �����ΰ���? : " + f2.isFile());
		System.out.println("f3�� �����ΰ���? : " +f3.isFile());
		System.out.println("f4�� �����ΰ���? : " +f4.isFile());
		
		System.out.println("f1 �����ϴ� ? : " + f1.exists());
		System.out.println("f3 �����ϴ� ? : " + f3.exists());
		
		//mkdir() : �ش� ��θ� ���� ���͸��� ���� �����ϴ� �� (���� ���丮�� �������� ������ ���� �Ұ���)>> �� �׷��� copy���� Ǯ �� 
		//���γ������� ������ �� getParentfiles().mkdirs()���ᱸ����
		File dir1 = new File("files2");
		System.out.println(dir1.mkdir() ? 
				"files2���͸� ������ ����" : "files2 ���͸� ������ ����"); //���͸� ����µ� �����ϸ� Ʈ�� 
		//f11�ϰ� ��Ű������â���� ����� ���콺 ���� refresh �ϵ簡 f5���ΰ�ħ��
		
		//�ڷ��⼭ ¤�� �Ѿ �� File�ν��Ͻ��� �����Ѵٰ� �Ű������� ������ �����̳� ���͸��� �����Ǵ� �� �ƴϴ�. 
		//���ش� �ν��Ͻ��� �̿��ؼ� ������ createNewFile(), ���丮�� mkdir()�� ��������� �Ѵ�. 
		
		//mkdirs() : �������丮�� �������� �ʾƵ� ��λ� �ʿ��� ��� ���丮�� �������� (���������� true. mkdir�� ��������)
//		File dir2 = new File("test/test/dir2");
//		System.out.println(dir1.mkdir() ? 
//				"dir2���͸� ������ ����" : "dir2 ���͸� ������ ����");  //mkdir�ϸ� ������
		
		File dir2 = new File("test/test/dir2");
		System.out.println(dir2.mkdirs() ? 
				"dir2���͸� ������ ����" : "dir2 ���͸� ������ ����"); 
		
		
		// createNewFile() : ���� ���� (���� �߰��� �t�t)
		File f5 = new File("files2/abc.txt");
		try {
			f5.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// ���͸�.getparent() : �������͸������ ���ڿ��� ǥ��. �Ʒ� ������ ��� "files/Image"�� ��ȯ
		File innerdir = new File("files/Image/Animal");
		String parents = innerdir.getParent();
		System.out.println(parents);

		
		
		
		
		
	}
}
