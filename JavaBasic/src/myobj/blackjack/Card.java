package myobj.blackjack;

abstract public class Card {
	
	
	protected boolean visible = true;
	
	
//	public void reverse() {
//		 visible = !visible; 
//	}//ī�带 ������ �� �ִ� �޼���� ���� �פ���� �Ѵ�. blackjackCard�� �ƴ϶�
//	�ƴ� �۽�Ʈ��Ʈ�� �ϵ簡 
	abstract public void reverse();
	
	
	abstract public int getValue(); //�������
	
	abstract public String getCardShape(); //ī�� ��� ����� �� ���
	//���� �̷��� abstract�� Ʋ�� ¥����
	
	//���� abstract�޼������ �ڽ�Ŭ���� BlackjackCard���� ������ ��
	
	//���߿� �̰� �� �ϼ� �ɰŴϱ� �ϴ� �� �ϰ� ��~ ���� �� �� 
	
}
