
public class A03_Variable {

/*
# 변수 
-프로그래밍 언어에서 데이터를 저장해둘 수 있는 공간이다. 
-자바에서 변수는 반드시 선언한 뒤에 사용해야 한다. 
-같은 중괄호{} 내부에서 같은 이름의 변수를 다시 선언할 수 없다. 
-값을 한번도 대입한 적 없는 변수는 사용하면 에러가 발생한다.
-초기화(initialize) 하지 않은 변수는 사용할 수 없다.

# 변수의 선언 (declare)
	타입 변수명;
-타입: 해당 변수에 저장할 데이터의 타입 (String 문자열, int 정수,...) 
-변수명: 사용하고 싶은 변수의 이름을 지정한다.

# 대입 연산 
-원래 알고 있던 =의 의미: 왼쪽 과 오른쪽의 값이 같다. 
-프로그래밍 언어에서 =의 의미 : 왼쪽의 변수에 오른쪽의 값을 넣어라.
*/

	public static void main(String[] args) {
		// 선언과 동시에 값을 대입
		String hobby = "배드민턴";
		String movie = "라라랜드";
		int age = 10;
		/*
		선언 후에 값을 대입 
		int age; 
		age = 10;
		 */

		// int hobby=123;
		// 타입이 다르지만 이름이 같아서 duplicated declare오류 뜸

		// 그러면 중괄호를 또 만들면 됨. {}내부에서 선언한 변수는 해당 중괄호를 벗어나면서 사라지게 된다.
		{
			// String hobby = "드라이빙";
			// 얘는 왜 그러냐면 중괄호는 다르긴 한데 바깥의 hobby가 살아있기 때문에.

			int apple = 300;
			int orange = 800;
			System.out.println(apple);
			System.out.println(orange);
		}

		// 원래는 같은 이름의 변수를 사용할 수 없지만 다른 중괄호{}이므로 사용 가능.
		String apple = "사과";
		String orange = "오렌지";

		System.out.println("당신이 가장 좋아하는 영화: " + movie);
		System.out.println("당신의 취미: " + hobby);
		System.out.println("당신의 나이 : " + age);

		// 초기화하지 않은 변수
		int price = 0;
		System.out.println("가격: " + price);

	}
}
