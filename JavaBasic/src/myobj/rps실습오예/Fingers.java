package myobj.rps실습오예;

public abstract class Fingers {
	protected final int SCISSOR = 1;
	protected final int ROCK = 2;
	protected final int PAPER = 3;
	//만약 이것들을 가져다가 다른 걸로도 쓸 거였으면 인터페이스로 만드는게 나음 
	//(인터페이스는 나중에 다른 클래스에서 또 쓸 것 같은 기능용!)
	
	protected int randomFingers;

	abstract public int randomFingers();
}
