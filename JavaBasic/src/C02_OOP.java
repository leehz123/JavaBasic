import java.awt.geom.Arc2D;

public class C02_OOP {
	/*
	# 객체지향 프로그래밍(Object Oriented Programming)
	세상에 존재하는 모든 것들(객체)을 변수와 함수로 표현하려는 프로그래밍 방법론
	변수와 함수를 무분별하게 사용하는 것보다 현실에 존재하는 객체 단위로 묶어서 표현하는 것이 개발의 효율을 높인다. 
	해당 객체를 구성하는 변수를 멤버Member, 필드Field, 속성Attribute 등으로 부른다. 
	해당 객체의 필드를 변화시킬 수 있는 객체 내부의 함수들을 메서드라고 부른다. 
	ex: 사과 
	사과에 관한 변수(=필드 =멤버 =속성) : 색깔, 크기, 당도, 칼로리, 등급, 원산지 , ...
	사과에 관한 메서드 (변수를 변화시키는 것들) 
		사과를 먹는다 : 크기↓ 칼로리↓ 먹은 사람의 칼로리↑
		사과를 던진다 : 사과의 크기와 경도에 알맞는 데미지를 가한다. 
		냉장고에 보관한다. : '사과의 수명'이 천천히 감소한다. 
	
	# 클래스 (Class)
	현실의 객체를 프로그래밍 언어로 표현한 문법
	클래스는 해당 객체의 설계도 역할을 한다. 
	클래스는 정의한 시점에선 실체가 없다. (설계도가 있는 시점에서 아파트는 아직 존재하지 x)
	클래스를 이용해 찍어내는 실제 객체를 ★인스턴스★라고 부른다.
	클래스를 이용해 객체를 찍어내는 것은 '인스턴스화'라고 부른다. 
	클래스를 이용해 인스턴스를 생성할 때는 new를 사용한다. 
	Scanner라는 설계도가 미리 존재하고 new Scanner()는 실체를 만들겠단 소리!
	모든 클래스는 '참조형 변수' 타입이다. 독자적인 타입이란 것.
	(그래서 Apple타입 변수를 만들 수 있고 Apple인스턴스만 보관될 수 있음.) 
	(또 어쩌고 해서 null이 저장될 수 있음.)
	같은 패키지 내부에는 동일한 이름의 클래스를 정의할 수 없다.★★★
	(만약myobj패키지에 같은 이름의 Person패키지가 두 개 있는데
	import myobj.*; 이렇게 직접 써주지 않고 ctrl+shift+o 를 누르면 둘 중 하나만 import됨)
	 
	*/

	public static void main(String[] args) {
		// main치고 'ctrl+스페이스+엔터' 하면 자동완성됨~

		Apple a1 = new Apple();
		Apple a2 = new Apple(); // 같은 설계도로 찍어낸 다른 객체!!!!
		// 이 시점에서 사과의 실체가 생긴 것
		// 해당 인스턴스의 필드값을 사용할 수 있게 됨.
		// 어떻게? . 을 찍어서
		a1.size = 20;
		a1.color = "빨간색";
		a1.calorie = 200.0;
		a1.sweet = 8;

		for (int i = 0; i < 5; ++i) {
			a1.eat(); // a2거는 안 줄어듦.
		}

//		위에서 아래로 흐르는 건 main메서드 내부만!
//		그래서 클래스가 main아래 생성돼 있어도 상관 없음
		System.out.println("a1의 size : " + a1.size);
		System.out.println("a1의 당도 : " + a1.sweet);
		System.out.println("a2의 칼로리 : " + a2.calorie); // 얘는 걍 0

		a2.changeColor("Black"); // 이런경우 change보다는 setColor라고 많이 함.

		a1.info();
		a2.info(); // 인스턴스 메서드로 해당 인스턴스 변수를 활용하는 예.

		// ________________________________________________________________________________________________

		System.out.println();
		System.out.println("____________연습문제____________");
		Car c1 = new Car();
		c1.oil = 100; // 기름충전~~
		c1.accident();
		c1.drive();
		c1.drive();
		c1.drive();
		c1.drive();
		System.out.println("차에 이상이 있나요? :" + c1.flaw);
		System.out.println("차에 기름이 얼마나 남았나요? :" + c1.oil + "L");
		System.out.println("주행거리 : " + c1.mileage + "km");

		c1.info();

		// ___________________________________________________________________________________________

		Subway sub1 = new Subway();
		Subway sub2 = new Subway();

		sub1.line = 1;
		sub1.current_station = 3;

		sub2.line = 7;
		sub2.current_station = 0;

		sub1.info();
		sub2.info();

		for(int i = 0; i < 50; ++i) {
			sub1.next();
			sub1.info();
		}

	}

//_____________________________________main()끝______________________________________________________
//___________________________________________________________________________________________________
}
class Apple { // 이것이 클래스돠
	/*
	# 인스턴스 변수 (aka. 필드, 속성, 멤버, 상태, ...)
	클래스 내부에 선언한 변수
	각 인스턴스마다 다른 값을 가질 수 있는 변수
	 
	*/
	int size;
	int sweet;
	double calorie;
	String color;

	/*
	# 인스턴스 메서드
	클래스 내부에 선언한 메서드
	해당 인스턴스 변수를 활용하거나 변화시키는 역할을 한다. 
	
	# this
	현재 인스턴스 자기 자신을 가리키는 문법
	생략이 가능!
	근데	this를 꼭 써야 하는 경우도 있음 
	
	*/
	void eat() { // 먼 훗날 내게 실체(인스턴스)가 생기면 나의 것(속성)을 변화시키겠다. 라는 의미가 생략되어 있따.
		size--;
		// this.size--; this가 생략 돼 있는 것.
		calorie -= 5;
	}

	void changeColor(String color) { // this를 꼭 써야 하는 경우 예시 들기 위해 만듦.
		this.color = color;
		// 필드명과 매개변수명이 동일한 이름을 가질 땐 반드시 this로 구분해줘야 한다. (이런 경우 아주 많음)
	}

	void info() {
		System.out.println("__________이 사과의 정보__________");
		System.out.println("크기\t: " + size);
		System.out.println("당도\t: " + sweet);
		System.out.println("칼로리\t: " + calorie);
		System.out.println("색깔\t: " + color);
	}
}
//________________________________________________________________________________________________

//연습문제 : 현실에 존재하는 객체를 참고하여 클래스를 하나 생성한 후 인스턴스를 생성하고 정보를 출력하시오. 
//※ 인스턴스 변수 3개 이상, 인스턴스 메서드 2개 이상
class Car {
	int mileage;
	boolean flaw;
	int oil;

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
	}
}
//________________________________________________________________________________________________

class Subway {

	String[] SUBWAY_COLOR = { "남색", "녹색", "주황색", "하늘색", "보라색", "짙은 주황색", "탁한 녹색" };

	String[][] SUBWAY_MAP = { { "인천", "동인천", "제물포", "도화", "주안", "간석", "동암", "백운"}, // 1호선
			{ "까치산", "신정네거리", "양천구청", "도림천", "문래", "신도림" }, // 2호선
			{}, // 귀찮아서 걍 비움
			{}, {}, {}, { "보라매", "신대방삼거리", "장승배기", "상도", "숭실대입구", "남성" }, // 7호선
	};

	int line;
	int current_station;
	boolean direction = true;

	void next() {
		// 증가하는 방향일 때 맨 오른쪽 역이거나
		// 감소하는 방향일 때 맨 왼쪽 역이라면 방향을 바꾼다
		if ((direction && current_station + 1 == SUBWAY_MAP[line - 1].length) || (!direction && current_station == 0)) {
			direction = !direction;
		}

		// 역 마지막까지 갓을 때 다시 역행하잖아 그걸 표현하기 위해 '방향'이라는 개념 도입
		if (direction) {
			current_station++;
		} else {
			current_station--;
		}
		// System.out.println(info()); //???????????????????????next()호출했을 떄 info()출력까지
		// 마치고 싶다면 어떻게?
	}

	void info() {
		System.out.println("[차량 정보]");
		System.out.println("line : " + line + "호선");
		System.out.println("[색상 : " + SUBWAY_COLOR[line - 1]); // int color라는 인스턴스 메서드를 굳이 만들지 않아도 됨.
		System.out.println("현재 정차역 : " + SUBWAY_MAP[line - 1][current_station]);
	}

}

