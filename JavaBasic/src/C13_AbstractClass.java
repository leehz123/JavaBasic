import myobj.AB;
import myobj.BloodType;

//인터페이스의 기초가 되는 녀석이래

public class C13_AbstractClass {
/*
#추상 클래스 abstract class
메서드의 형태만 선언해놓고, 헤당 메서드의 완성은 자식클래스에게 미루는 클래스
추상 메서드를 포함한 클래스 (핵심은 추상 메서드)
자식 클래스는 추상 클래스를 상속받으면 반드시 추상 메서드를 오버라이드 해야 한다.

# 추상 메서드 abstract method
선언만 되어 있고 몸통은 없는 메서드.
앞에 abstract가 붙어 있는 메서드는 body를 직접 추가할 수 없다. 
반드시 상속 받은 후 자식 클래스에서 오버라이드하여 구현해야 한다. 
abstract 메서드를 구현하지 않은 클래스는 인스턴스를 생성할 수 없다. 
ㄴabstract 메서드명(); 이게 들어가 있는 클래스로 인스턴스화 못 한다는 것. 
 */
	
	public static void main(String[] args) {
		
		//내가 만든거 (망) BloodType클래스랑 AB클래스 
		BloodType b1 = new AB();
		//abstract 메서드를 구현하지 않은 클래스는 인스턴스를 생성할 수 없다. 
		// == abstract메서드가 있는 클래스는 인스턴스를 생성할 수 없다? 
		
		// 아 BloodType클래스 안에 abstract void character();가 있고 그게 구현을 자손클래스로 미뤄서 인스턴스 생성이 안 되는 거였음
		//그래서 형은 그대로 두는 대신 인스턴스를 그 중 자식 클래스인 AB로 만들기로 했는데 
		//일단 사용하려면 public지정 해줘야 하는데 한 파일 당 public클래스는 하나만 존재할 수 있고, 이름도 파일명과 같아야 함
		//그래서 AB클래스를 따로 분리해준 것 !
		
		//그리고 AB클래스는 BloodType을 상속했으므로 업캐스팅이 가능. 앞에 타입형이 BloodType이 될 수 있는 이유. 
		//(그리고 업캐스팅 하면 부모의 멤버 쓸 수 있음)
		//그니까 AB로 간접적으로 인스턴스를 만든다고 하면 되나 ㅋ
		
		
		unitAttack(new SwordMan());
		unitAttack(new Archer());
		unitAttack(new Mage());
		//unitAttack(); 엥 머지 
		
//		SwordMan unit1 = new SwordMan();
//		Archer unit2 = new Archer();
		
		
//		unit1.slash();
//		unit2.shot();
		

		//unit1.attack();
		//unit2.attack(); //오버라이드 된 내용대로 출력됨. 
		
		/*
		Unit unit1 = new SwordMan();
		Unit unit2 = new Archer(); 
		unit1.slash();
		unit2.shot();
		//이렇게 업캐스팅 했을 때 공격들을 사용할 수 없음
		
		unitAttack(new SwordMan());
		unitAttack(new Archer());
		//이렇게도 불가 
		 */
		

	}
	
		public static void unitAttack(Unit unit) {
			unit.attack();
		}
		
//		public static void unitAttack(SwordMan sword) {
//			sword.slash();
//		}
		
//		public static void unitAttack(Archer archer) {
//			archer.shot();
//		}
	
	
}


	
	
abstract class Unit { //추상메서드를 가졌으니 클래스도 abstract로 
	int attack;
	int hp;
	
	//자식 클래스는 반드시 이 메서드를 구현해야 한다. 
	//너는 이 기능을 반드시 덮어 써야 해 라고 빨간 줄로 알려줌 ( 오버라이딩 까먹는 것을 방지)
	abstract void attack();  //추상메서드 등장 두둥
	
//	void attack() {
//		//System.out.println("모든 유닛은 각자의 방식으로 공격을 해야 합니다. ");	이거 없애도 문제 없음
//	}
	
}


class Mage extends Unit {
	public Mage() {
		attack = 30;
		hp = 20;
	}

	@Override
	void attack() {
		System.out.println("마법사가 공격헀다 어쩌고~~~~~~");
		
	}
}


class SwordMan extends Unit {
	public SwordMan() {
		attack = 10;
		hp = 50;
	}
	
	@Override  //attack이 있는데 또 써주기 싫으면 오버라이드 해주면 됨
	void attack() {
		slash();
	}
	
	void slash() {
		System.out.println("칼을 휘둘렀습니다. 데미지 : " + attack);
	}
}

class Archer extends Unit {
	double accuracy;  //명중률 
	public Archer() {
		attack = 8;
		hp = 30;
		accuracy = 0.88;
	}
	
	@Override
	void attack() {
		shot();
	}
	
	void shot() {
		if (Math.random() < accuracy) {
			System.out.println("명중했습니다." + "데미지 : " + attack); 	
		} else {
			System.out.println("활이 빗나갔습니다. . . ");
		}
		
	}
}

