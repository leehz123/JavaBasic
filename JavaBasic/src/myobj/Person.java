package myobj;

public class Person {
		public String name;
		public int age;		
		
		public Person() {
			
		}
		//다른패키지라 퍼블릭을 붙이지 않으면 접근 불가
		public Person(String name, int age) {
			this.name = name;
			this.age = age;	
		}
		
/*
						// 인사를 한다는 건 일단 어떤 사람을 만났다는 거잖음. 
						//위에서 선언한 Person클래스(설계도)과 이 매개변수 Person(인스턴스)은 다른 것 김철수 김맹구 박짱구 아무나 들어올 수 있음.
		public void sayHi(Person p) {
			if (p.age < 10) {
				System.out.println("안녕 내 이름은 " + name + "(이)야. 나이는 " + age + "살 이야.");
				//										this.name 인데 this가 생략 돼 있음. (Extend파일 Police p3설명)
			}	else if (p.age < 20) {
				System.out.println("안녕하세요 제 이름은 " + name + "(이)에요. 나이는 " + age + "세 입니다. ");
			}	else if (p.age < 30) {
				System.out.println("안녕하십니까 제 이름은 " + name + "입니다. 나이는 " + age + "세 입니다. ");
			}
			
			//Police와 Programmer의 sayHi()의 @Override를 잠깐 주석처리 해놓겠음. 
			
		}
*/		
		
		//업/다운캐스팅을 위해 전달 받은 나이가 아닌 내 나이대로 출력하도록 해보겠음. 
		public void sayHi() {
			if (age < 10) {
				System.out.println("안녕 내 이름은 " + name + "(이)야. 나이는 " + age + "살 이야.");									
			}	else if (age < 20) {
				System.out.println("안녕하세요 제 이름은 " + name + "(이)에요. 나이는 " + age + "세 입니다. ");
			}	else if (age < 30) {
				System.out.println("안녕하십니까 제 이름은 " + name + "입니다. 나이는 " + age + "세 입니다. ");
			}
			
			
			
		}

		
}
