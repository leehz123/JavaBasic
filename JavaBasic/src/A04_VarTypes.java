
public class A04_VarTypes {
	/*
	 # 정수 타입 
	 -byte (1byte) 8bit byte타입은 -128 ~ 127까지의 정수를 표현할 수 있다. 0000 0000 2^8 = 255개의 값을 저장할 수 있음.
	 0000 0001 1 
	 0000 0010 2 
	 ... 
	 0111 1111 127 
	 1000 0000 -128 
	 ... 
	 1111 1111 -1
	 10000 0000 0 
	  0000 0001 1
	  
	 -short (2byte, 16bit) short타입은 -32768~32767까지의 정수를 표현할 수 있다. 
	 0000 0000 0000 0000 : 0 ... 
	 0111 1111 1111 1111 : 32767 
	 1000 0000 0000 0000 : -32768 ...
	 1111 1111 1111 1111 : -1 
	 0000 0000 0000 0000 : 0
	  
	 -character 
	 (2byte, 16bit인데 short랑 다름. 부호비트를 사용하지 않기 때문에) 
	 0000 0000 0000 0000
	 0000: 0 ... 
	 0111 1111 1111 1111 : 32767 
	 1000 0000 0000 0000 : 32768 ...
	 1111 1111 1111 1111 : 65535
	 char 타입은 0 ~ 65535까지 양의 정수를 표현할 수 있다. 
	 문자코드를 저장할 때 사용하는 타입이다.
	 
	 -int (4byte) 약 (2^32)43억개의 정수를 표현할 수 있다.
	  
	 -long (8byte) 아주 많은 정수(2^64)를 표현할 수 있다.
	  
	 # 실수 타입 
	 -float(4byte) 
	 -double(8byte)
	  
	 # 참/거짓 타입 - boolean 1bit?
	  
	 # 참조형 타입(클래스) 
	 -String 
	 -그 외 대문자로 시작(클래스라서)하는 모든 타입
	 */

	public static void main(String[] args) {
		// 각 타입의 크기에 따라 최소, 최대 값이 정해져 있다.
		byte num1 = 100;
		byte b1, b2, b3;
		char c1, c2;
		// 그냥 소수는 기본적으로 double타입이기 때문에 f를 붙여야 float타입 리터럴이 된다.
		// double 은 8byte고 float은 4byte이기 때문에 8byte값을 4byte에 넣으면 에러발생.
		float f1 = 123.1234f;
		double d1 = 123.1234;

		b1 = 127;
		b2 = -128;
		// b3 = 128;

		short s1, s2, s3;
		s1 = 32767;
		s2 = -32768;
		// s3 = -32769;

		// char타입에는 정수값을 저장하지만 출력할 때는 문자로 출력한다.
		c1 = 65;
		c2 = 'a';
		System.out.println(c1);
		System.out.println(c2);

		// 그냥 정수는 기본적으로 int타입 리터럴이다. 뒤에 l을 붙여야 long타입 리터럴이 된다.
		// int의 범위를 벗어나는 아주 크거나 아주 작은 리터럴을 사용하고 싶을 때는 l을 붙여야 한다.
		// L이나 l 상관 없음.
		int i1 = 1_000_000_000;
		long l1 = 1_000_000_000L;

		// boolean에는 true/false만 저장할 수 있다.
		boolean programer = true;
		boolean ateLunch = false;
		boolean wearGlasses = true;

		String message = "환영합니다.";
		System.out.println(message);
	}
}
