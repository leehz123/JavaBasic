package myobj.rps�ǽ�����;

public class Players {
	
	private int win; 
	private int lose; 
	private int draw;
	private int roundCnt;

	
	public void win() {
		win++;
		roundCnt++;
	}
	public void lose() {
		lose++;
		roundCnt++;
	}
	public void draw() {
		draw++;
		roundCnt++;
	}
	
	@Override
	public String toString() {
		
		return "\n�÷��̾�'s ����\n" + "�� ���� ��\t:\t" + roundCnt +  "\n�̱� Ƚ��\t:\t" + win + "\n�� Ƚ��\t:\t" + lose + "\n��� Ƚ��\t:\t" + draw + "\n"; 
				
	}
}
