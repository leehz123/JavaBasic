package myobj.pirate;

//������� ������ �Ϸ��� ���� �ʿ�����
public class Tong {
	boolean[] slot = new boolean[GAME_SIZE]; //������� �뿡�� ������ �շ� ����(��������� �Ӽ�) | �񷶴� �� �ٽ� �� ��� ���� �迭
	final static int GAME_SIZE = 20;
	int[] launch = new int[2]; //�߻� �ε���0���� 1���� �� �� �߿� ����ڰ� �Է��� ���� ������ ������ �߻�!
	
	public Tong() { 
		this.rewind();
	}
	
	//��÷ ��ȣ�� ���� �����ϱ� ���� ���� ���ŷ� �ٲ� �� ���ݾ�? ��÷��ȣ ���� ���� �״�� �߶�ٰ� rewind()�� ����� �ٿ��ֱ�. 
	//�� ���� ������ �� ������� �����ֱ� �޼���			
				//���ۿ� �̸��� �ٿ��� ����ȭ�ϴ°� ��ü����
	public void rewind() {  
		//���� �ʱ�ȭ
		slot = new boolean[GAME_SIZE];
		//��÷��ȣ ���� ����!
		launch[0] = (int)(Math.random() * GAME_SIZE);
		while(true) {
			launch[1] = (int)(Math.random() * GAME_SIZE);
			if(launch[0] != launch[1]) { //�Ȱ��� ��ȣ �� �ɸ��� �Ȱ��� ��ȣ �ƴ� ������ �̱� 
				break;
			}
		}
	}
	
	/**  �ڼ��� �ּ� _ �̷��� stab(�޼ҵ��)�� ���콺 �ø��� ���� ����!
	 @param slotIndex - ��� ���� ��ȣ�� �Ű������� �����ؾ� �մϴ�. 
	 @return 
	 ��÷��ȣ�� ������ ��� -1. �ùٸ��� ��� ��Ƴ��� ��� 1. 
	 �񷶴� ���� �ٽ� ��ų� ��ȿ���� ���� ��ȣ�� �Է��� ��� 0.
	 */
 	public int stab(int slotIndex) { //���� � �� ���� ��� �޼���
 		if (launch[0] == slotIndex || launch[1] == slotIndex) { //��������� �߻�Ǹ� -1 ����
 				return -1;
 		}	else if (slotIndex < 0 || slotIndex >= GAME_SIZE) {
 				return 0;
 		}	else if (!slot[slotIndex]) {
 				slot[slotIndex] = true;
 				return 1;
 		}	else {
 			return 0;
 		}
 	}
 	
 	
 	
 	public void print() {
 		for(int i = 0; i < GAME_SIZE; ++i) {
 			
 			if(!slot[i]) {
 				System.out.printf("%02d\t", i + 1);
 			} else {
 				System.out.println("[XX]\t");
 			}
 			if( i % 5 == 4) {
 				System.out.println();
 			}
 		}	
 	}
	
}
