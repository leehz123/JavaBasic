package quiz;

import java.util.Scanner;

public class B11_31Game {
	/*
	 �轺Ų��� ��Ƽ�� ��
	 1. ó�� ���α׷��� �����ϸ� �� ������ ������ �� �����Ѵ�.(�ο��� �ּ� 2�� �̻�) 
	 2. ���� �÷��̾ �����ư��鼭 ���ڸ� �����Ѵ�. 
	 	���ڴ� 123�� ������ �� �ִ�. 
	 3. ������ ���ڰ� 31�̻��� �� �� ����� �й��Ѵ�. 
	 */
	//�� Ǯ��. 
	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		int people = 0;
		
		while(true) {
			System.out.println("�÷��̾� ���� �Է��Ͻÿ�.");
			people = sc.nextInt();
			if(people >= 2) {
				System.out.println("�ο� ����. ���� ����.");
				System.out.println("####################GAME START#######################");
				System.out.println();
				break;
			}
			System.out.println("2 �� �̻��̾�� ������ ������ �� �ֽ��ϴ�. �ٽ� �Է�.");
		}
		
		int i = 1;
		int cnt = 0;
		int pNum = 0;
		
		while (i <= 31) {
			
			while(true) {
				++pNum;
				System.out.println("���÷��̾� "+ pNum + "�� : ���� ���ڿ��� �� �� ������ �� ���Ͻÿ�. (3 �� ���Ϸ� ����)");
				System.out.println("���� ���� : " + cnt);
				int num = sc.nextInt();
				if(num >0 && num <= 3) {
					System.out.println(num + "�� �����մϴ�.");
					cnt += num;
					System.out.println("���: " + cnt);
					System.out.println("____________________________________________");
					System.out.println();
					if(pNum >= people) {
						pNum = 0;
					}
					break;
				}
				System.out.println("��� 3 ������ ����� �Է� ����. ���");
				--pNum;
				System.out.println("___________________________________________");
				System.out.println();
			
			}
			
			if(cnt >= 31) {
				System.out.println("���÷��̾�" + pNum + "�� ��/�� �����ϴ�.");
				System.out.println("#####################GAME OVER########################");
				break;
			}
			
			++i;
		}
*/
			
			//���� Ǯ��. 
			Scanner sc = new Scanner(System.in);
	
			//�ùٸ� max_player(�÷��̾��)�� �Է¹ޱ� ���� ���ѷ���
			int max_player;
			while (true) {	
				System.out.println("�� ��?");
				max_player = sc.nextInt();
				
				if (max_player > 2) {
					break;
				}
				System.out.println("�ٽ� �����");
			}
			
			System.out.println("�÷��̾�� " + max_player + "�� �Դϴ�.");
	
			
			
			int num = 0;  //31���� ���� ���� ����
			int current_player = 0; //���� �÷��̾ �� ������ ǥ���ϱ� ���� ����
			
			//num�� 31�� �� �� ���� ������ �ݺ��ϱ� ���� ���ѷ���
			while(true) {
				
				//�ùٸ� user_num(1~3)�� �Է¹ޱ� ���� ���ѷ���
				int user_num = 0;
				while (user_num < 1 || user_num > 3) {
					System.out.printf("�÷��̾� %d�� ���ڸ� �Է��ϼ���>>", current_player + 1);
					user_num = sc.nextInt();
				}
				//�÷��̾ 1~3 �߿� �ϳ��� ���� �Է��ϸ� �� ���� num�� ����.
				num += user_num;
				
				//���ӹݺ� ���ѷ��� ��� ���� (31�� �ѱ�� ���� ��)
				//num�� ������ ���� 31�� �ѱ� �� GAME OVER�� �˸��� ������ ��ȣ current_player(+1)�� ���� ����.
				if(num >= 31) {
					System.out.printf("�÷��̾� %d�� �й�.", current_player + 1);
					break;
				}
				
				//num�� ���� 31�� �������� ���ؼ� ���� if���� �ɸ��� �ʾҰ� ������ ������� ����.
				//������ ����Ǵ� ���̰�, ������� ������ ���ڿ� ���� �÷��̾�� �Ѿ�� ���� current_player�� +1�� ���ش�.
				//�׸��� current_player�� 1�� ��� �������ٵ� �̰� max_player(�ο�)�� ������ ��ȯ��Ű�� ���� %�̿�!
				System.out.println("���� ���ڴ� " + num + "�Դϴ�.");
				current_player = (current_player + 1) % max_player; 
				//3���̼� �����ϰ� �� ó�� current_player�� ���� 0���� �������� �� (0+1) % 3 �ϸ�
				//current_player�� 1�� ��ܼ� ���ӹݺ� ���ѷ����� ���� ȸ���� ���۵ǰ� 
				//�ֿܼ� ǥ�õ� �� current_player�� ��� �� 1 + 1 -> 2 �� �Ǿ� �÷��̾� 2�� ..��¼�� ǥ�õ�. 
				
			}
			
			System.out.println("num�� 31�� �Ѿ while���� ������ϴ�.");
			
			
				
		
			
			
	
	
	
	
	
	}
}
