
public class C03_Constructor_생성자만들기 {
	public static void main(String[] args) {
		Car1 c = new Car1();
		System.out.println(c.color);
	}
}

//같은 패키지에 이름이 같은 클래스가 존재하면 안된다!!!!
class Car1 {
	int mileage;
	boolean flaw;
	int oil;
	String color;
	
	Car1() {
		this("pink");
	}

	Car1(String color) {  //메서드 오버로딩의 형태 
		this.color = color;
	}
	
	void drive() {
		mileage += 1;
		oil -= 10;
	}

	void accident() {
		flaw = true;
	}

	void info() {
		System.out.println("######차량 정보#######");
		System.out.println("주행거리 : " + mileage + "km");
		System.out.println("사고여부 : " + flaw);
		System.out.println("기름 잔여량 : " + oil + "L");
		System.out.println("차량 색상 : " + color);
	}
}