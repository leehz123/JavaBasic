
import java.util.Scanner;

/*
# if�� 
-() ���� ���� t�� {} ���� ������ �����ϴ� ���
-() ���� ���� false�� {}���� ���� ����
 
# else if��
-���� if���� ������� �ʾҴٸ� if��ó�� �����Ѵ�. (���� ������ �����ϸ� else if �������� x)
-else if�� ������ ����� �� �ִ�. (�߰����� ���ǵ� ���)
-else if�� �ܵ����� ����� �� ����. 

#else�� 
-���� ������ ��� �ƴ϶�� {} ���� ������ �ڹ����ǡ� �����Ѵ�. �׷��� ���ǽ� �ʿ� ����
-if�� �ٷ� ������ ����� �� ����. 
-�ܵ����� ����� �� ����. 
-else�� �پ��ִ� if���� ���ּ��� �� ���� ����ȴ�.�� 
 
 */
public class B03_If {
	public static void main(String[] args) {
		if (true) {
			System.out.println("if���� true�� �� ����Ǵ� ��ɾ�1");
			System.out.println("if���� true�� �� ����Ǵ� ��ɾ�2");
			System.out.println("if���� true�� �� ����Ǵ� ��ɾ�3");
		}

		int a = 7;
		if (a % 2 == 0) {
			System.out.println("a�� ���� ¦���� ���� ��µǴ� ����");
		} else if (a % 3 == 0) {
			System.out.println("a�� ���� ¦���� �ƴϸ鼭 3�� �����");
		} else if (a % 5 == 0) {
			System.out.println("2�� ����� �ƴϰ� 3�� ����� �ƴ� 5�� ���");
		} else {
			System.out.println("���� ������ ��� �ƴմϴ�.");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻ� ����� ����>>");
		int apple = sc.nextInt();
		String size;

		if (apple > 10) {
			size = "��뷮 ���̹�";
		} else if (apple > 5) {
			size = "���� ���̹�";
		}
		System.out.println(size);
		// ���̷��� ���� size�ؿ� ��� ���� ���� �ߴµ� apple<=5�� ���� �ɼ��� �����ֱ� ����!
		// �׷��� else { size = "���� ���̹�";}�� �߰������ ��.

	}
}
