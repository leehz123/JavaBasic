/*
# 클래스의 생성자 (Constructor)
클래스의 이름과 똑같은 이름을 가진 메서드
메서드이지만 리턴타입을 지정하지 않는다.
새로운 인스턴스를 생성할 떄 new와 함께 생성자를 호출한다. Orange o1 = new Orange();
내부에 생성자를 하나도 정의하지 않은 클래스는 보이지 않는 자동기본생성자가 존재한다.★
	(Apple에 아무것도 생성하지 않았는데 Apple a1 = new Apple(); 이렇게 Apple()을 호출할 수 있었던 것처럼.)
	자동 기본생성자는 아무것도 하지 않고 인스턴스만 생성한다.
생성자는 인스턴스 호출시 가장 먼저 호출되는 메서드이기 때문에 주로 인스턴스 초기화에 많이 사용된다. 
					
					
 */

public class C03_Constructor {
	public static void main(String[] args) {
		Orange o1 = new Orange();
		o1.print();
		
		Orange o2 = new Orange(9999); //9999 가 o2오렌쥐의 가격이 될 예정
		o2.print();
		
		Orange o3 = new Orange(9999, 19.8888);
		o3.print();
		
		
		//기본생성자의 사용을 막아놓은 클래스
		Mango m1 = new Mango();   //망고에 가본생성자가 없다는 오류가 뜸
									//자동기본생성자는 내부에 생성자를 하나도 정의하지 않았을 떄 생성되므로!
		Mango m = new Mango(3333, 123);
		
	}
}
//_______________________________________main 메서드 끝__________________________________________										
//_____________________________________________________________________________________________


class Orange {
	int price;
	double sweet;
	
	//기본생성자(매개변수가 없는 생성자)
	Orange() {
		//생성자의 첫번째 줄에서는 다른 생성자를 호출하는 것이 가능. 다른 줄에서는 불가능. ★
		this (800, 8.0);
		//Orange(800, 8.0);과 같은 뜻
		//this(800);도 가능
		
		/*price = 800;
		sweet = 8.0;*/ //위에 this로 다른생성자를 호출해줘서 필요없어짐
		//인스턴스 생성 시 (new와 함께 생성자 호출) 기본생성자의 내용대로 값이 초기화되어 제공됨 
	}
	//매개변수가 있는 생성자
	Orange(int price) {
		this.price = price;  //어제 OOP에서 배운 내용 ㄱ나g?ㅋ
		sweet = 9.9999999999;
	}
	Orange(int price, double sweet) {
		this.price = price;
		this.sweet = sweet; 
	}
	
 	
	void print() {  //리턴값이 없는 메서드는 void로 선언
		System.out.println("price : " + price);
		System.out.println("sweet : " + sweet);
	}
	
}
//_____________________________________________________________________________________________

class Mango {
	//매개변수가 있는 생성자만 정의한 클래스 
	int price;
	int sweet;
	
	
	//내부에 생성자가 있기 때문에 자동기본생성자가 자동으로 생성되지 않는다!	
	Mango(int price, int sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	//이렇게 함으로써 price와 sweet을 안 넣고 생성되는 인스턴스를 저지한다. (기본생성자를 막아놓음)
	
	//근데 굳이 기본생성자를 쓰고 싶다면 내가 직접 정의하면 됨!
	Mango() {
		price = 10;
		sweet = 5;
	}
}
