

/*
# 인터페이스 Interface
자바의 클래스는 상속을 한번에 여러 개 받을 수 없다. 
 
해당클래스에 여러가지 형태를 부여하기 위해선 인터페이스를 사용해야 한다. 
(해당클래스에 여러가지 형태(캐스팅)를 부여하기 위해선 (다형성) 부모가 여럿이어야 하는데 abstract클래스로는 그렇게 할 수 없음.)
인터페이스 내부에 선언하는 모든 메서드는 자동으로 abstract public이 된다.
인터페이스 내부의 변수는 final static이 된다. 
인터페이스는 인스턴스화 할 수 없다. 
인터페이스 내부의 메서드 앞에 default를 붙이면 오버라이드 하지 않았을 때의 기본 동작을 정의 할 수 있다. 
상속은 몸뚱이까지 물려받는거고 인터페이스는 몸뚱이는 저리 치우고 메서드를 물려받는 것 

 */

//abstract class Runner {
//	abstract void run();
//}
//
//
//abstract class Swimmer {
//	abstract void swim();
//}
//
//class Human extends Swimmer {
//	@Override
//	void swim() {
//	
//	}
//}

//class Human extends Swimmer, Runner { //상속은 하나밖에 못 받음
//	@Override
//	void swim() {
//	
//	}
//}


public class C14_Interface {
	public static void main(String[] args) {
//		Runner r1 = new Human();
//		Swimmer s1 = new Human();  //인페는 인스턴스화 불가 
		
		Human h1 = new Human();
		
		//업캐
		Runner r1 = h1;
		Swimmer s1 = h1;
		
		h1.run(); 
		h1.swim();
		//h1이 Runner로도 업캐스팅 되고 
		r1.run();
		s1.swim();
	}
}


interface Breedable { //이걸 사람한테 붙이면 난리남. 곰한테 붙여야지. 그러면 휴먼은 Breedable로 업캐스팅 불가. 곰은 Breedable로 업캐스팅 가능
	void feed();
	void sit();
	void standup();
}


interface Swimmer { 
	//default를 구현하지 않는 경우 반드시 구현해야 하는 abstract메서드가 된다. 
	//abstract의 장점을 극대화. 오버라이드를 여러 개 할 수 있음.
	void swim();
}


interface Runner { 
	//abstract void run(); //인터페이스 내부에 선언하는 모든 메서드는 자동으로 abstract public이 된다.
	int a = 10;
//	void run();
	default void run() {
		System.out.println("run() 미구현");
	}
}

class Human implements Swimmer, Runner {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	} 
	
}

class Bear implements Runner, Swimmer, Breedable {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		
	}
	
	
	

	@Override
	public void standup() {
		// TODO Auto-generated method stub
		
	}
	
}


class Shark implements Swimmer {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}
//휴먼 베어 샤크는 스위머로 업캐스팅 될 수 있음



