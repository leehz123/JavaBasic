package myobj;

public class Programmer extends Person {
	//Programmer클래스가 Person클래스를 상속받게 됨.
	//	Programmer 가 자식 / Person이 부모
	
	//모든 사람은 월급이 없을 수 있겠지만 프로그래머는 있어야지 ㅋ
	public int salary;
	//다른 클래스(Extend)에서 쓸 수 있도록 public 써주기
	
	//메소드오버라이딩
	//@Override //이렇게 표시해줄 수도 있음. 
	//@붙이는 걸 Annotation(주석) 이라고 함.  
	//어노테이션을 붙여놓으면 오버라이드가 성립하지 않을 떄 에러를 발생시켜준다.  
	public void sayHi () {   //왼쪾에 세모 : 부모클래스를 오버라이드 햇다는 표시
		//근데 안에 int a 매개변수를 추가해주면 오버라이딩이 아니라 오버로딩이 됨. 
		System.out.println("안녕하세요. 저는 " + salary + " 받고 일하는 " + name + "입니다.");
	}
	
	public void program(String toProgram) {
		//프로구램 만드는 행위에 대한 메서드 (toProgram = 만들 프로그램)
		if (salary < 500) {
			System.out.println(name + "씨는 \"" + toProgram + "\"을를 대충 만들기로 했습니다.");
		} else {
			System.out.println(name + "씨는 \"" + toProgram + "\"을/를 아주 열심히 만들기로 했습니다.");
		}
		//name은 부모클래스 Person에서 받은 거고, ~~~~~~~~~
	
	}
	
	
	
}
