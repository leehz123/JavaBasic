package myobj;

public class Fruit {	
	int price;
	double sweet;
	
	public Fruit(int price, double sweet) {
		this.price = price;
		this.sweet = sweet;
	}
}

//자식 클래스는 반드시 부모의 생성자를 가장 첫줄에 호출해야 한다. 
//부모클래스에 기본 생성자가 없다면 super()를 반드시 명시해야 한다. 
class Peach extends Fruit {
	Peach() {
		super(1500, 9.9); //자식 생성자에서는 기본으로 부모 생성자를 호출해줘야 하는데 값이 없으니 너가 직접 넣아줘라 1500, 9.9
	}
}