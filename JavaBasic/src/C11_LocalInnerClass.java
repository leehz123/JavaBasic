import myobj.Person;

public class C11_LocalInnerClass {
	
/*
# 지역 내부 클래스
메서드 내부에 정의한 클래스
해당 메서드가 끝나면 수명이 다하는 클래스. 
해당 메서드 바깥에서는 접근할 수가 없다. 
 */

	public static void main(String[] args) {
		int defaultPrice = 1000;
		char defaultGrade = 'B';
		
		Apple a = new Apple(); 
		//얘는(default Package)에 있는 Apple 클래스 
		//(아래 만들어질 Apple지역내부클래스와 비교하기 위해 일부러 만듦)
		
		
		//지역내부클래스 (메서드 내부의 클래스)
		class Apple {
			int price;
			int grade;
		
			public Apple() {
				price = defaultPrice;
				grade = defaultGrade;
			}
			
			@Override
			public String toString() {
				return "price : " + price + " grade : " + grade;
			}
		}
		
		//아래의 Apple인스턴스는 바로 위의 지역내부클래스 Apple의 인스턴스
		Apple apple = new Apple();
		System.out.println(apple);
		
//▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
		
		// # 익명지역 내부 클래스 
		/*
		지금 아래를 보면 main메서드 내에 Person p = new Person() { ~~~~~~}; 가 들어와 있지? 
		메서드 내부에서 클래스를 직접 수정하며 사용하는 방식 (생성과 동시에 상속)
		-- 상속한다는 것 >> 부모 클래스의 멤버들을 가져다 쓸 수 있다는 것!  
		이름이 없기 때문에 새로운 메서드를 추가해도 사용할 수 없다. (punch())
		(왜 안 되냐고? 생각을 해봐 
		static메서드의 경우 클래스가 메모리에 올라가면서 static요소가 생성이 될 텐데 이름이 없는 익명 클래스이니 메모리에 올라갈 수 없겠지
		그리고 인스턴스 메서드도 일단 클래스(설계도)가 있어야 인스턴스를 만들텐데 클래스가 익명이자늠 그래서 안 되는 거)
		기존의 메서드를 오버라이드해 사용하는 것은 가능하다. 
		일종의 일회용 상속. 두 번 쓸 수 없음. 
		 */
		
		//이번엔 다른 패키지(my obj)의 Person클래스를 가져와 보겠음
		Person p = new Person() {
		//이건 좀 특이한 형태지? 

			{//초기화블록. 인스턴스가 생성될 떄 실행됨. 
				name = "둘리";
				age = 15;
				//자식의 이름과 나이 지정
			}
			
			void punch() { // 이렇게 추가해도 사용할 수 없다는 얘긴디 
				System.out.println(name + "는 앞에 있는 사람에게 주먹을 날렸습니다.");
			}
			/*
			Person을 생성하는 동시에 이런 메서드를 추가했다는 건
			Person클래스에 기존에 존재했던 내용을 물려받고 punch()를 추가했다는 것
			근데 이렇게 상속을 했지만 부모인 Person으로 들어감. == 업캐스팅
			근데 대체 자식이 누구여 이름이 없잖음 << 그래서 이걸 바로 익명 내부클래스라고 부르는 것
			 */
			
			//익명 지역 내부 클래스 내에 기존의 메서드를 오버라이드한 것 (사용 가능) 
			@Override
			public void sayHi() {
				System.out.println("익명클래스의 sayHi()입니다.");
				punch(); //인사 대신 냅다 펀치 날림;; 
				//▲근데 punch()는 새로 추가한 메서드라 사용할 수 없어야 하지 않음?
			}
			
		};
		
		//p.punch();
		p.sayHi();
		//아니 헷갈리네 
		/*
		익명내부클은 내부에 새로운 메서드를 추가해도 사용할 수 없다며
		근데 부모클에 존재하는 기존 메서드는 오버라이드 가능해서 sayHi()를 쓸 수 있다는 건 알겠음
		그러면 sayHi()로 punch()에 간접접근하는 건 가능한 건가? 
		아니 그나까 새로 추가한 메서드인 punch()는 일회용이라 익명내부클래스의 블럭을 벗어나면 사용할 수 없는데
		익명 내부클 내부의 sayHi() 내부에서는 사용할 수 있는 거라 가능한 건가?
		익명 내부클 바깥에선 어차피 punch()를 호출하는 게 아니라 sayHi()를 호출한 거고
		익명 내부클 내부의 sayHi()메서드 내부에서 punch()가 쓰이는 거니까?
		 */

	}
}
