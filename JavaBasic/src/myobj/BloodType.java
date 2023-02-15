package myobj;
/*
C13_AbstractClass 실습
myobj패키지에 다형성을 활용할 수 있는 abstract클래스를 하나 정의해보세요
 */


//굳이 이런 메서드가 있어야 할까
//그닥 합리적이진 않다. 걍 연습용

public abstract class BloodType {
	String bloodType;
	
	abstract void character();
}

class A extends BloodType {
	A() {
		bloodType = "A";
	}
	@Override
	void character() {
		System.out.println("꼼꼼하고 신중하다. ");	
	}
	
	@Override
	public String toString() {
		return "혈액형 : " + bloodType;
	}
}

class B extends BloodType {
	B() {
		bloodType = "B";
	}
	@Override
	void character() {
		System.out.println("사교적이다. ");
		
	}
	@Override
	public String toString() {
		return "혈액형 : " + bloodType;
	}
	
}

class O extends BloodType {
	O() {
		bloodType = "O";
	}
	@Override
	void character() {
		System.out.println("열정적이다. ");
		
	}
	@Override
	public String toString() {
		return "혈액형 : " + bloodType;
	}
	
}

