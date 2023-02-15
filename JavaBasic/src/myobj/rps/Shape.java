package myobj.rps;

public class Shape {
	
	//��ȣ�� �ƹ��ų� �� ���� �� ���� ���
	final public static Shape ROCK = new Shape(0);
	final public static Shape SCISSORS = new Shape(1);
	final public static Shape PAPER = new Shape(2); 
	//���̷��� ������ ������ �� �ִ� �ν��Ͻ��� 3���� ��� ���ھƳ����� �ٸ� ���� new�� �ν��Ͻ� ���� �Ұ� 
	
//	final public static int ROCK = 0;
//	final public static int SCISSORS = 1;
//	final public static int PAPER = 2;

	final private static String[] names = {"��", "��", "��"};
	final private static Shape[] shapes = {ROCK, SCISSORS, PAPER};
	
	private int shape;
	
	private Shape(int shape) { // �翩�⼭ �����̺� �س��� 
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
	
	
	//�ν��Ͻ��� ���� ���� static
	/**
	 ������ �̱��1, �������� �̱�� -1, ���� 0�� ����
	 */
	public static int versus(Shape a, Shape b) {
		int left = a.getValue(); //�� a.finger�� ���൵ �ɵ�????
		// �ֳĸ� �� �޼��带 �ܺ�Ŭ������ �����ߴٸ� getValue()�� ����� �߰����� (������. �����۵� ��)
		// ������ ���� Ŭ���� ���ε� private�� ���� Ŭ���� ������ ���� ���� �������ڴ� �׷��� finger�ص� �ɵ� 
		int right = b.getValue();
		
		//���� 0, ����1, �� 2
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
