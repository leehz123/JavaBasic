
public class B01_Operator1 {
	/*
	 # 연산자(Operator) 
	 - 계산할 때 사용. 
	 - +,-, *, /, %, >, =>, ...
	
	 # : 산술연산자, + : 더하기, - : 빼기, * : 곱하기, / : 나누기, % : 나머지	 
	 */
	public static void main(String[] args) {
		int a = 33, b = 8;
		double c = 33, d = 8;

		System.out.println("a + b : " + a + b);
		// 괄호를 안 쳐서 338
		System.out.println("a + b : " + (a + b));
		// 계산이 되려면 괄호를 쳐서 우선순위를 설정해줘야 한다.
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		// 정수 나누기 정수를 하면 정수부분의 몫만 구해진다. (소수점 뒷자리는 버림)
		System.out.println("a / b : " + a / b);

		// 정수와 실수를 나누기 연산 하면 결과는 실수이고, 소수점 뒷자리까지 정확한 값이 구해진다.
		System.out.println("c/b :" + c / b);
		System.out.println("a/d :" + a / d);
		System.out.println("c/d :" + c / d);
		// 나머지 연산
		System.out.println("a % b : " + a % b);

		// n으로 나눈 나머지는 0부터 n-1까지 밖에 나올 수 없다.
		System.out.println("19 % 10 : " + 19 % 10);
		System.out.println("20 % 10 : " + 20 % 10);
		System.out.println("21 % 10 : " + 21 % 10);
		System.out.println("22 % 10 : " + 22 % 10);
		// 나머지 연산은 값을 순환시킬 때 사용.

		// Math.pow(a,b) : a제곱 b를 반환한다.
		System.out.println(Math.pow(2, 10));

		System.out.println(2 ^ 10); 
		// 비트연산(그닥 안 중요)의 XOR연산 (Exclusive or). 이렇게 하면 2의 10승 안 나옴 주의.

		// Math.sqrt(a) : a의 제곱근을 구해서 반환한다.
		System.out.println(Math.sqrt(2));

		// Math.abs(a) : a의 절대값을 반환한다.
		System.out.println(Math.abs(11));
		System.out.println(Math.abs(-11));

		// Math.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다.

		System.out.println(Math.round(123.555));

		// '반환한다'?
		double result = Math.round(123.555); // Math.round()의 결과가 반환 됨.
		// double result = System.out.println("abc"); //println은 출력을 하지 반환을 해주지는 않음.

		// Math.round로 원하는 자릿수에서 반올림할 수 있다.
		double value = 123.77777777;
		System.out.println(value);
		// 다섯번째 자리에서 반올림 하고 싶을 때 다섯번째 자리를 소수 첫번째 자리로 만들어준다.
		System.out.println(Math.round(value * 10000) / 10000.0);
		//Math.round()는 값을 정수형으로 반환. 그래서 소수점 자리를 결과로 구하고 싶으면 마지막에 실수를 껴서 연산해주면 됨. 
		// 반올림하고 싶은 자리를 소수 첫번째 자리로 만들어서 Math.round()를 적용한 후 다시 나누기
		
	}
}
