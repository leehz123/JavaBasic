


public class C09_AccessModifier extends myobj.C09_PublicClass{
	
	public C09_AccessModifier() {
		super.m1();
		super.m2();
		//상속 받은 클래스에서는 다른 패키지의 자원이더라도 proteced까지 사용할 수 있다. 
	}
/*
# 접근제어자 Access Modifier
다른 클레스에서 해당 자원을 사용하려고 할 ㄸ대 허용범위를 설정한다. 

# 종류
public		: 다른 패키지에서도 자유롭게 접근할 수 있는 자원  
protected	: 다른 패키지에서는 상속받은 클래스 에서만 접근할 수 있는 자원
default		: 같은 패키지에서는 자유롭게 접근할 수 있는 자원 (말 그대로 디폴트. 아무것도 안 붙인 것! 아 그래서 void만 붙였던 거구나)
private		: 같은 클래스 내부에서만 접근할 수 있는 자원 
*/
	public static void main(String[] args) {
		/*
		 
					일단 C09_PublicClass는 다른 패키지(myobj)에 존재. 
					그리고 현클래스(default package.C09_AccessModifier)는 myobj.C09_PublicClass를 상속받음
					
					myobj.C09_PublicClass 는 말 그대로 앞에 접근제어자 public이 붙었고
					 myobj.DefaultClass는 말 그대로 아무것도 안 붙은 default클래스임
					 
					 그리고 C09_PublicClass는 default package에도 존재하고 myobj에도 존재한다. 
		 */
		
		//같은 패키지 에 있는 클래스의 자원은 public, protected, default 까지 사용 가능
		C09_PublicClass instance1 = new C09_PublicClass();	
		DefaultClass instance2 = new DefaultClass(); //아무 접근제어자도 붙어 있지 않은 클래스에도 같은 패키지 내면 사용 가능 
		
		//private의 직접 접근은 안 되지만 다른 메서드를 통한 간접적인 사용은 가능하다. 
		//private는 접근을 아예 막는 건 아니고 직접 접근을 막는 것. 간접적으로 사용 가능 (m1, m2, m3을 통해 m4에 접근 가능)
		instance1.m1();
		instance1.m2();
		instance1.m3();
		//instance1.m4();
		
		instance2.m1();
		instance2.m2();
		instance2.m3();
		
		//다른 패키지에 있는 클래스의 자원은 기본적으로 public이 붙은 것만 사용할 수 있다.
		myobj.C09_PublicClass  instance3 = new myobj.C09_PublicClass(); //C09_PublicClass는 default package에도 존재하고 myobj에도 존재한다.
		// myobj.DefaultClass instance4 = new myobj.DefaultClass(); Public은 어디에서나, Default는 같은 패키지 내에서만!
	
		instance3.m1();
	
	
	
	}
}
