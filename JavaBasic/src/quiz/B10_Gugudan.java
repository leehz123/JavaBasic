package quiz;

public class B10_Gugudan {
	
	public static void main(String[] args) {
		
		// ���α�����
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d��: ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%d * %d = %-2d ", dan, gop, dan * gop);
			}
			System.out.println();
		}
		System.out.println("_______________________________");
		System.out.println();

		// ���α�����
		//���̸� �ֱ�
		for (int danNum = 2; danNum <= 9; danNum++) {
			System.out.print(danNum + "��\t\t");
		}
		
		System.out.println(); // -�� -�� -�� �� ������ǥ ���̿� �ٹٲ�
		
		for (int gop = 1; gop <= 9; ++gop) {
			for (int dan = 2; dan <= 9; ++dan) {
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);
			}
			System.out.println();
		}
		// �Ͻ������� �����Ǵ� ���� �ϳ� ���ϰ� (2���� 2, 3���� 3,...) �װ� �ٱ��� �����ֱ� 
		//�ٱ��� �ݺ����� �� ���� �ǹ��ϰ� ���� �ݺ����� �� �ȿ����� �ݺ��� �ǹ�
		
		
		//2. ���� Ǯ��(����� ��� ��..)
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		for (int gop = 0; gop <= 9; ++gop) { //���ʱ�ȭ �κп��� gop�� 0�־�� -1 �־�� ���� ���� �� �پ� �þ. ��
			
			for (int dan = 2; dan <= 9; ++dan) {
				if(gop ==0 ) {
				System.out.printf("%d��\t\t", dan);	
				}	else {
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);
				}
				
			}
			System.out.println();
		}
		
	}
}
