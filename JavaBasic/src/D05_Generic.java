import java.util.ArrayList;

public class D05_Generic {
/*
 
 
# 제네릭
클래스 내부 자원의 타입을 외부에서 나중에 지정할 수 있게 하는 문법
☆☆ 제네릭에는 기본 타입을 사용할 수 없기 때문에 Wrapper 클래스를 사용해야 한다. ☆☆


# static Generic
스태틱 메서드에 제네릭을 사용할 때는 리턴타입 앞에 제네릭을 추가해준다. 
잘 쓰이지 않음

 
 */


	
	public static void main(String[] args) {
					
					//★★★인스턴스화를 할 때 제네릭의 타입 결정!★★★
		GenericTest<String, Integer, Double> test = new GenericTest(); 
		
		
		// 그럼 static메서드는 인스턴스화를 안 하는데 어쩐대? 
		
		// static 제네릭 메서드 타입 선언 방법 = 갖다 쓰는 동시에 타입 선언
		// 클래스명.<T>메서드명();
		GenericTest.<Apple>staticMethod1(); 
		//이렇게 (다른클래스라서)점을 찍고 사용할 수 있다. (같은 클래스 내의 static메서드는 점 안 찍고 바로 쓸 수 있지)
		
	}
	
}

class GenericTest<A, B, C> { //Generic클래스 안에서 A, B, C 제네릭 타입이 사용될 거란 예고 
	
	A var1;
	A var2;
	B var3;
	C var4;
	
	
	//메서드 타입도 제네릭으로 가능
	public A method1() {   // A가 반환타입
		return null; //참조형의 기본값 null. A에는 무조건 참조형 타입만 들어올 수 있으니까 
	}
	
	
	
	//잘 쓰지 않음 과연 이걸로 뭘 할 수 있을까
	static <MyType> int staticMethod1() { 
	//★★★여기서 또 다른게 <MyType> 은 반환타입을 지정한 게 아니라 staticMethod1() 내부에 MyType 타입이 사용될 거란 예고임.  
		
		
		ArrayList<MyType> list = new ArrayList<>();
		MyType a  = list.get(0);
		
		
		//★★★★★★★★★★★★★★★★★
		//제네릭 A, B, C는 인스턴스 생성시 정해지기 때문에 static 메서드에서는 사용 불가.(static과 인스턴스 생성 시점을 잘 생각해보셈) 
		//A v1 = null;
				
		
		return 1;
	}
	
	/*
	static 키워드는 인스턴스 생성과 별도로 클래스가 사용되는 시점에 메모리가 올라간다. 
	그런데 그런 static으로 선언된 메소드에 인스턴스가 생성되는 시점에서 결정되는 제네릭 타이블 매개변수로 받을 수는 없다.
	반면에 제네릭으로 시그니처 된 메소드는 호출되는 시점에 타입이 결정되기 때문에 컴파일 에러가 발생하지 않는다.
	 */
	
}





/*


//제네릭엔 모든 참조형 타입 들어갈 수 ㅇ
		//우리가 직접 만든 클래스도 컬렉션의 제네릭에 사용할 수 있다. 임포트 하기 싫으면 myobj.써주공 
		ArrayList<myobj.Police> polices = new ArrayList<>();
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		System.out.println(polices);
		//Police클래스에서 toString오버라이드 안 해서 주소값 나옴
		


*/


