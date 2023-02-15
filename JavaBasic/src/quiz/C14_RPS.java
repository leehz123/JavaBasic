package quiz;

import java.util.Scanner;

import myobj.rps.Shape;

public class C14_RPS {
	
	
	public static void main(String[] args) {

/*		�׽�Ʈ �ڵ�
//		Shape com = new Shape();
//		//Shape user = new Shape(2); 
//		//0�� ����, 1�� ����. 2�� ���ڱ�  
//		// �̷� ���� �����ڰ� �ܿ��� �ϴ� ���� ���� �ѹ���� �Ѵ�. (���� �ƴ� ����. ���� �ʾ�)
//		// ���� �ѹ����� ������ ����ڸ� �˰� �ִ� �����̱� ������ �� ���� ���´� �ƴϴ�.  
//		Shape user = new Shape(Shape.PAPER); //�׷��� 2 ��� �̷��� ���ָ� ������
//		//�ٵ� �̷����� ���ڰ� ���� �� ���� �� ���� 

		Shape com = Shape.ROCK;
		Shape user = Shape.PAPER;
		
		//Shape user = Shape.random();
		
		System.out.println("com : " + com.getName());
		System.out.println("user : " + user.getName());
		
		
		int result = Shape.versus(com, user);
		System.out.println(result);
*/
		Scanner sc = new Scanner(System.in);
		while(true) {
			boolean error = false;
			Shape com = Shape.random();
			Shape user;
			System.out.println("����(0), ����(1), ��(2)�� �����ϼ���");
									//������ �޶� �Ű� ���� �ʾƵ� ��!
			switch(sc.nextInt()) {
			case 0:
				user = Shape.SCISSORS; //�̷��� ���� SCISSORS�� ���� �ٿ��ָ� �Ǵϱ�!
				break;
			case 1:
				user = Shape.ROCK;
				break;
			case 2:
				user = Shape.PAPER;
				break;
			default:
				System.out.println("�ٽ� �������ּ���!");
				user = null; //�̰� �����ϱ� Shape.versus(com, user);���⼭ ������ ��. ��? �� �İ� ���� ��� ���̴µ� user�� ���� �ƹ��͵� ���? 
				error = true;
				break;
			}
			if (error) {
				continue; //�ٽ� while���� �� ������ 
			}
			
			System.out.printf("com : %s\tuser: %s\n", com.getName(), user.getName());
			switch (Shape.versus(com, user)) { //�İ� ������ ���
			case 1:
				System.out.println("��ǻ�� ��!");
				break;
			case 0:
				System.out.println("���º�!");
				break;
			case -1: 
				System.out.println("���� ��!");
				break;
				
			}
			
		}
	
	}
}
