import java.util.Arrays;

/*
# Object.toString() : 해당 클래스가 문자열로서 출력되어야 할 때 저절로 호출되는 메서드. 
	Object는 모든 타입의 부모이기 때문에 모든 클래스에 toString이 포함되어 있다. 
	오버라이드해서 사용하지 않으면 메모리 상의 주소값을 문자열로 반환한다. 
 	그래서 오버라이드를 통해 우리가 원하는 문자열을 리턴히주기
 */
class Pig{
	int gram_price;
	int gram;
	
	final static String type = "돼지";
	
	public Pig(int gram, int gram_price) {
		this.gram = gram;
		this.gram_price = gram_price;	
	}
	@Override
	public String toString() { 
		return String.format("종류\t: %s\n" 
							+ "g 당 가격\t: $d\n" 
							+ "총 무게 :\t" 
							+ "가격\t: %d", type , gram_price , gram , gram_price*gram);
	}
}


public class C08_ToString {
	public static void main(String[] args) {

		
		
		Pig meat = new Pig(150, 40);
		
		System.out.println(meat);
		

	}
}
