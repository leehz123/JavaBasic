package myobj.rps�ǽ�����;

public abstract class Fingers {
	protected final int SCISSOR = 1;
	protected final int ROCK = 2;
	protected final int PAPER = 3;
	//���� �̰͵��� �����ٰ� �ٸ� �ɷε� �� �ſ����� �������̽��� ����°� ���� 
	//(�������̽��� ���߿� �ٸ� Ŭ�������� �� �� �� ���� ��ɿ�!)
	
	protected int randomFingers;

	abstract public int randomFingers();
}
