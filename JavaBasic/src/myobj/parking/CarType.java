package myobj.parking;
//Car클래스의 내부클래스로 안 만들고 걍 밖으로 뺌 
public class CarType { //아놔 이거 클래스 public으로 안 해줘서 다른클에서 데이터타입으로 쓰려는 데 렉떴었음 
	private int value;
	private String name; 
//-------------------------사실상 내용은 이게 다네---------------------------
	
	
	public CarType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() { //혹시 몰라서 만들었는데 쓸 일이 없대 
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	
}