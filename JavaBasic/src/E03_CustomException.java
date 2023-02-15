
public class E03_CustomException {
/*
 # 원하는 예외 직접 만들어서 사용하기
 Exception 을 상속받으면 반드시 처리해야 하는 예외
 RuntimeException을 상속받으면 반드시 처리할 필요는 없는 예외 
 */
	public static void playCat(Cat cat) { //NotPlayableException이 익셉션을 상속받았다면 반드시 처리해야 하는 예외라고 알려줘야 함. throws NotPlayableException 추가  
		
		//A instanceof B : A가 B의 인스턴스인지 검사하는 비교연산자 
		if (cat instanceof russianBlueCat) { 
			//System.out.println("러시안블루는 노는 걸 싫어합니다. ");
			throw new NotPlayableCatException();
		} else {
			System.out.println("고양이와 놀아줬습니다. ");
		}
	}
	
	public static void main(String[] args) {
		playCat(new Cat());
		playCat(new PersianCat());
		playCat(new russianBlueCat());
	}
}


class Cat {}
class PersianCat extends Cat {}
class russianBlueCat extends Cat {}


class NotPlayableCatException extends RuntimeException { //extends Exception : 익셉션을 상속받으면 익셉션이 됨 
	public NotPlayableCatException() {
		System.out.println("놀 줄 모르는 고양이 익셉션");
	}
}
