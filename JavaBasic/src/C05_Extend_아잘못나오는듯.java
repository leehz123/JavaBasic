import myobj.Person;
import myobj.Police;
import myobj.Programmer;
//이걸 해줘야 다른 패키지의 Person클래스로 접근 가능
/*
# 클래스 상속
이미 만들어져 있는 클래스를 물려 받아서 사용하는 것
자식 클래스는 부모 클래스의 모든 자원을 그대로 사용할 수 있다.
자식클래스는 부모 클래스에 없던 기능을 새로 추가해서 사용할 수 있다!

자식클래스는 부모에게서 물려받은 메서드를 마음대로 고쳐서 사용할 수 있다. (오버라이드_짓밟다_부모클래스가 원래 갖고 있던 메서드를 짓밟고 사용)
오버라이딩은 매개변수 타입, 개수도 완벽히 같아야 함!! 이름만 같고 매개변수에 관한 것이 다르면 오버라이딩!

▒▒자식 클래스는 가장 먼저 !반드시! 부모의 생성자를 호출해야 한다.▒▒
근데 이게 무슨 말이냐 나는 생성자 슨 적이 없는데?
이게 다 자동으로 됩니다. 

#super
자식클래스로 생성된 인스턴스는 두 가지로 분류된다. 
this는 현재 인스턴스 중 자식 클래스의 부분을 뜻한다. 
super는 현재 인스턴스 중 부모 클래스의 부분을 뜻한다. 
this가 현재 클래스의 생성자를 의미하듯이 super는 부모클래스의 생성자를 의미한다. 


*/

/*
연습문제. myobj패키지에 상속 관계에 있는 클래스들을 정의해보세요.
부모 클래스, 자식 클래스, 오버라이드를 사용할 것. 
주제 자유. >> 나는  

 */
public class C05_Extend_아잘못나오는듯 {
	public static void main(String[] args) {
	
		// <<	부모클래스: Person / 자식 클래스: Programmer	>>
		
		Person dooly = new Person();
		dooly.name = "둘리";
		dooly.age = 7;
		//p1.salary = 100; 에러. 자식의 내용이 부모한테 올라가진 않음.
		//dooly.sayHi();
		
		Person cheolsu = new Person();
		cheolsu.name = "철수";
		cheolsu.age = 23;
		
		//______________________________________객체의 다형성__________________________________________
		//Person파일의 public void sayHi(Person p) { 이용. 
		//이 예시를 들기 위해 일단 먼저 Programmer과 Police의 sayHi()? 의 @Override를 주석처리 해놓기.
		dooly.sayHi(cheolsu);  //둘리가 철수에게 인사
		cheolsu.sayHi(dooly);  //철수가 둘리에게 인사
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		Police popo1 = new Police();
		popo1.setName("김포포");
		popo1.setAge(18);
		System.out.println("↓ 둘리가 popo1에게 인사");
		dooly.sayHi(popo1);//매개변수로 Person을 받게 해놨는데 Police도 들어가네? Police가 Person을 상속받았으니까!!! 경찰도 사람이뉙까
		
		
		Programmer coder = new Programmer();
		coder.name = "리코더";
		coder.age = 25;
		System.out.println("↓ 코더가 철수에게 인사");
		coder.sayHi(cheolsu);
		// ★★ Person을 요구하는 (매개변수) 자리에 자식 클래스인 Police와 Programmer등이 들어갈 수 있다. << ★★상속의 중요한 특징!★★ 
		//이를 '객체의 다형성' 이라고 한다. : 어떤 객체는 다양한 형태를 가질 수 있다. 
		//___________________________________________________________________________________________
		
		Programmer p2 = new Programmer();  //이렇게 다른 패키지의 클래스를 인스턴스화할 때마다 임포트 꼭 해주기!
		p2.name = "김노예";
		p2.age = 23;
		System.out.println("↓김노예 자기소개");
		p2.sayHi();
		//Programmer클래스에 아무것도 안 적혀 있을 때도 됨. 이게 바로 상속~
		
		System.out.println("↓김노예 자기소개 업글버전");
		p2.salary = 700;	//Person에 없는 기능을 Programmer에 새로 추가해서 쓴 예1.
		p2.sayHi(); //Program클래스에서 오버라이드한 메소드 sayHi()로 실행됨.
		p2.program("온라인 교육 사이트");	//Person에 없는 기능을 Programmer에 새로 추가해서 쓴 예2.
		//Person에 없는 기능을 Programmer에 새로 추가해서 쓴 예.
		
		
		//Person의 name, age와 Police의 name, age를 모두 갖고 있음
		Police p3 = new Police(); //import 잊지 말구
		p3.name = "김형사"; //Police의 this.name 에 들어감. 
		p3.age = 20;
		p3.sayHi();	
		//이렇게 하면 name, age에 null 어쩌고 이상하게 나옴
		p3.setName("이형사"); //Police의 super.name에 들어감. 
		p3.setAge(55);
		//▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲
		p3.sayHi(); //엥 이거 왜 김형사도 나오고 이형사도 나오냐 아 p3에 김형사도 있고 이형사도 있어서?
		
		
		
		
		
	}
	
}
