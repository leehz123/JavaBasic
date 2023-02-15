package myobj.rps;

public class Shape {
	
	//번호가 아무거나 막 들어가는 걸 막는 방법
	final public static Shape ROCK = new Shape(0);
	final public static Shape SCISSORS = new Shape(1);
	final public static Shape PAPER = new Shape(2); 
	//②이렇게 실제로 생성될 수 있는 인스턴스는 3개다 라고 못박아놨으니 다른 데서 new로 인스턴스 생성 불가 
	
//	final public static int ROCK = 0;
//	final public static int SCISSORS = 1;
//	final public static int PAPER = 2;

	final private static String[] names = {"묵", "찌", "빠"};
	final private static Shape[] shapes = {ROCK, SCISSORS, PAPER};
	
	private int shape;
	
	private Shape(int shape) { // ①여기서 프라이빗 해놓고 
		this.shape = shape;
	}
	
	
//	public Shape() {
//		shape = (int)(Math.random() * 3);
//	}
//	
//	public Shape(int userSelect) {
//		shape = userSelect;

	
	
	public static Shape random() {
		return shapes[(int)(Math.random() * shapes.length)];
	}
	
	
	//인스턴스와 관계 없이 static
	/**
	 왼쪽이 이기면1, 오른쪽이 이기면 -1, 비기면 0을 리턴
	 */
	public static int versus(Shape a, Shape b) {
		int left = a.getValue(); //걍 a.finger로 해줘도 될듯????
		// 왜냐면 이 메서드를 외부클래스에 선언했다면 getValue()를 해줘야 했겠지만 (내생각. 정상작동 함)
		// 어차피 같은 클래스 내인데 private는 같은 클래스 내에선 직접 접근 가능하자늠 그래서 finger해도 될듯 
		int right = b.getValue();
		
		//바위 0, 가위1, 보 2
		if(left == right) {
			return 0;
		} else if((left + 1) % 3 == right) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public int getValue() {
		return shape;
	}
	
	public String getName() {
		return names[shape];
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
}
