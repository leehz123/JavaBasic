package myobj.parking;
//CarŬ������ ����Ŭ������ �� ����� �� ������ �� 
public class CarType { //�Ƴ� �̰� Ŭ���� public���� �� ���༭ �ٸ�Ŭ���� ������Ÿ������ ������ �� �������� 
	private int value;
	private String name; 
//-------------------------��ǻ� ������ �̰� �ٳ�---------------------------
	
	
	public CarType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() { //Ȥ�� ���� ������µ� �� ���� ���� 
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	
}