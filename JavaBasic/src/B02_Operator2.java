
public class B02_Operator2 {
	/*
	 # 비교 연산자 -두 값을 비교하는 연산 -비교 연산의 결과는 항상 참(true) 또는 거짓(false)이다. = 비교연산의 결과는
	 Boolean타입 -산술연산과 비교연산이 함께 있으면 산술연산을 먼저 계산한다.
	  
	 # 논리 연산자 -true와 false 두 boolean타입을 값으로 하는 연산 &&: 두 값이 모두 true일 때 true (and연산)
	 || : 둘 중 하나만 true여도 true (or연산) ! : true면 false, false면 true. 반전 (not 연산) 
	 */
	public static void main(String[] args) {
		int a = 10, b = 7;

		char ch1 = 'A';
		char ch2 = 'K'; // 문자의 코드값~!이 저장되지

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b); // 두 값이 같으면 true
		System.out.println(a != b);// 두 값이 다르면 true

		System.out.println(a + 15 == 15);
		// 여기서 산술연산부분에 괄호를 쳐주지 않아도 연산자 우선순위에 의해 a+15가 먼저 계산됨

		System.out.println(a % 3 != 0);

		System.out.println("#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("#### NOT ####");
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("##비교연산의 값도 boolean임을 활용##");
		a = 95;
		System.out.println(a < 100 && a % 5 == 0);

	}
}
