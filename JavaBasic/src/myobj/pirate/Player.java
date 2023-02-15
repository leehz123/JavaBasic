package myobj.pirate;

public class Player {
	
	int win;
	int lose; //�̱�� ���� Ƚ��
	//Ŭ������ �迭ó�� �ƹ��͵� �ʱ�ȭ���� ������ �˾Ƽ� 0���� �ʱ�ȭ��. 
	
//�÷��̾��� ����(�̱�� ���� �޼���) + ���� (�·�)
	
	public double winRate() {
		if(win + lose == 0) {
			return 0.0;
		}
		return (double) win / (win + lose) * 100;
	}
	
	public void win() {
		win++;
	}
	
	public void lose() {
		lose++;
	}
	
	public void print() {
		System.out.printf("Win : %d , Lose : %d, Rade: %.2f\n" , win, lose, winRate());
	}
	
}
