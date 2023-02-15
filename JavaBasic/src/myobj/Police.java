package myobj;

public class Police extends Person {
	
	public Police() {
		
	}
	

	public String name;
	public int age;
	
	public void hi() {  //메소드도 this hi()와 super sayHi() 가 다르겠쮜
		super.sayHi();
	} 
	//이 hi()메서드는 super.sayHi();면 부모클래스의 sayHi()를 이용하고
	//그냥 (this.)sayHi();면 Police클래스의 sayHi()(Programmer클래스의sayHi()를 오버라이딩한 sayHi())를 이용하게 된다. 
							//(아래 @Override)표시해둔 sayHi();) 
	//안에 뭘 채우느냐에 따라 다르게 작동
 	
	//@Override         Extend파일 Police popo1, Programmer coder 예시를 들기 위해 잠깐 주석처리 
	public void sayHi() {  //이것도 sayHi치고 ctrl + space해주면 override할 수 있는 목록이 나옴. 
		System.out.println("안녕하십니까 " + name + "입니다.");
		//this.name
		
		System.out.println("안녕하십니까 " + super.name + "입니다.");
	}
	
	
	public void setName(String name) {
		super.name = name;
	}
	
	public void setAge(int age) {
		super.age = age;
	}
	
	//super의 name과 age를 고치는 방법은 이렇게 메소드를 만들어서 super.name 과 super.age에 넣어주는 방법밖에 없음
	//아니면 애초에 걍 Police에 name과 age를 만들지 말든가 (그러면 Extend파일에서 p3.name p3.age에 값을 추가하면 바로 Person의 age, name에 가니까
	//그리고 Extend파일에서 super를 쓸 수 없는게 그 파일은 Person을 상속하고 있지 않으니까. 
	
	//아무튼 this가 있을 땐 기본적으로 this를 씀. 
}
