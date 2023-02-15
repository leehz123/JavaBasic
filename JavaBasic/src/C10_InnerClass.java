

public class C10_InnerClass {
	
	//참조형 변수 타입의 초기값은 null
	private String s1, s2, s3;
	private Apple a1, a2, a3;  //같은 패키지 내에 Apple이라는 클래스가 어딘가에 있음
	
	//기본형 변수타입의 초기값은 0 , 0.0, false
	private int a, b, c; // C10_InnerClass클래스의 인스턴스를 생성해줘야 접근/사용 가능 
	private static int d, e, f; //인스턴스 생성 없이도 접근/사용 가능
	
	// 1. static 내부 클래스
	static class Orange {
		int price;
		int sweet;	
		public Orange() {
			//price = a;
			//sweet = b;  //에러남   
			//얘네가 오류 뜨는 이유 : 내부클래스는 외부클래스의 인스턴스를 생성해야 사용 가능
			//근데 내부클래스라도 static이 붙은 내부 클래스는 인스턴스를 생성하기 전에도 존재하는 클래스일 거 아니야
			//그니까 a와 b가 존재하지 않는 시점에도 Orange클래스를 사용할 수 있다는 뜻인데 
			//static메서드가 인스턴스 멤버를 갖다 쓸 수 없듯이 static내부클래스도 외부클래스의 인스턴스 멤버를 갖다 쓸수 없기 때문에 오류가 나는 것 
			
			//서로 같은 static이라 가능!
			price = d;
			sweet = e;  
			//인스턴스의 생성 이전부터 존재하는 외부클래스의 static멤버들은 static 내부클래스에서 맘대로 갖다 쓸 수 있지
			//static이 붙은 것은 인스턴스를 생성하기 전에도 존재하고 있다는 사실을 기억할 것 
			
			/*
			정리.
			인스턴스 메서드는 인스턴스 변수를 사용. 
			인스턴스 변수는 인스턴스를 생성해야 만들어짐. 
			인턴변수를 사용하는 인턴메서드 역시 인턴을 생성해야 호출이 가능한 것.
			
			반면 인스턴스와 관계 없는 메서드를 static메서드 (= 클래스메서드) 라고 정의.
			static이 붙은 변수(= 클래스 변수)는 클래스기 메모리에 올라갈 때 자동적으로 생성됨
			인스턴스를 생성하지 않아도 사용 가능하단 뜻. 
			-----------------------------여기까지가 지난 내용 복습------------------------------
			
			내부클래스는 인스턴스 변수와 메서드처럼 외부클래스의 인스턴스를 생성해야 접근/사용할 수 있다.
			근데 static이 붙은 내부클래스는 외부클래스의 인스턴스를 생성하지 않아도 미리 존재하고 있다. 
			그래서 static 내부클래스는 외부클래스의 인스턴스 변수를 사용할 수 없다. 
			안스턴스를 생성하지 않아도 미리 존재하고 있는 static요소가 
			인스턴스를 생성한 후에야 존재하기 시작하는 인스턴스 요소를 가져다 쓸 수 없기 때문이다. 
			
			그러나 같은 static 요소끼리는 사용이 가능하듯이 (같은 시점에 존재하기 시작하니까)
			static내부클래스에선 외부클래스의 인스턴스를 생성하지 않아도 외부클래스의 static변수를 가져다 쓸 수 있다. 
			 */
			
			
		}
		@Override
		public String toString() {
			
			return "가격 : " + price + "당도 : " + sweet; 
		}
		
	}
	
	
	
	// 2. 걍 일반 내부 클래스
	class Sagwa {
		int price;
		int sweet;
		
		//클래스 내부의 클래스에서는 바깥 클래스의 자원들을 자유롭게 사용할 수 있다. 
		//외부클래스가 private여도 당빠 가능! (클래스 내부에 있는 거니까)
		public Sagwa() {
			price = a;
			sweet = b;
		}
		
		@Override
		public String toString() {
			return "가격 : " + price + "당도 : " + sweet;
		}
	}
	
	
	
	
	
	/*
	내부클래스 사용하기 
	내부클래스는 외부클래스의 인스턴스가 존재해야 사용할 수 있다. 
	 */
	public static void main(String[] args) {
		//이 main()메서드도 사실 C10_InnerClass의 인스턴스를 생성하지 않고도 사용할 수 있지? 
		//그래서 static 이 붙어 있던 것ㅋㅋ!
		
		
		C10_InnerClass instance = new C10_InnerClass(); 
		//일단 다른 클래스의 멤버변수에 접근하려면 인스턴스화 해줘야 함.
		
		System.out.println(instance.s1);
		System.out.println(instance.s2);
		System.out.println(instance.s3);
		
		System.out.println(instance.a1);
		System.out.println(instance.a2);
		System.out.println(instance.a3); //아직 값을 안 넣어줬기 때문에 다 쫙 null 나옴
		
		
		
		
		
		
		// 1. static내부클래스 Orange 다루기 
		
		//static변수는 인스턴스 없이 클래스.static변수 의 형태로 호출할 수 있다 그랬쥐 
		C10_InnerClass.d = 10000; 
		//혹은 현재 이미 같은 클래스 내에 있으니까 굳이 클래스명을 지정해주지 않아도 됨.
		d = 1000;  
		//아니면 인스턴스로도 당연히 접근 가능 (static은 인스턴스 생성 전에도 존재)
		instance.e = 999999; 
		
		//static변수는 클래스.static변수 의 형태로 호출할 수 있다 그랬자나
		//static내부클래스도 외부클래스.static내부클래스 로 호출 가능한 것
		//★★인스턴스를 생성할 때도 그런 형태로 내부클래스를 명명해주는 것 
		C10_InnerClass.Orange orange = new C10_InnerClass.Orange(); //얘는 스태틱이라 외부클래스의 instance없이 생성 가능 
		System.out.println(orange);
		
		C10_InnerClass.d = 50;
		C10_InnerClass.e = 60;  
		//얘네가 어느 시점에 만들어졌냐에 따라 다름 여기서 d와 e를 바꿔줬다 해서 위에 d와 e값도 변하는 게 아니란 말
		C10_InnerClass.Orange orange2 = new C10_InnerClass.Orange();
		System.out.println(orange2);
		
		
		
		
		
		
		
		// 2. 일반 내부클래스 Sagwa 다루기 
		
		instance.a = 100;
		instance.b = 200;

		
		//★이게 바로 외부클래스의 인스턴스를 사용해서 내부클래스의 인스턴스를 생성하는 방법이다.
		Sagwa apple = instance.new Sagwa();  
		//사실 Sagwa보다 정확 이름은 C10_InnerClass.Sagwa 
		System.out.println(apple); 
		//★toString()으로 오버라이딩 해놓은 상태라서 주소값 대신 입력해놓은 서식대로 뜸
		
		
		instance.a = 300;
		instance.b = 400;
		C10_InnerClass.Sagwa apple2 = instance.new Sagwa(); //가격: 300 당도: 400 출력됨. 
		System.out.println(apple2);
		//a와 b값이 변경된 대로 가격에 반영됨. 바깥인스턴스의 영향을 계속 받고 있다는 뜻!
	
	
	
	}
}
