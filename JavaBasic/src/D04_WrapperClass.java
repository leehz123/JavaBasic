
public class D04_WrapperClass {

/*
# Wrapper Class
기본 타입들을 참조형 타입으로 사용하기 위해 감싸놓은 클래스 
각 기본 타입들에 대한 유용한 기능들이 들어 있다.

기본형
byte, short, char, int, long, float, double, boolean

참조형
Byte, Short, Character, Integer, Long, Float, Double, Boolean 

 */
	
/*

Integer.parseInt() : "12345" →  12345	문자열에서 숫자로 
Integer.toString() :  12345  → "12345"	숫자에서 문자열로 
	
 */
	
	
	public static void main(String[] args) {
		/*
		# Parsing
		문자열을 해당 타입 값으로 변환하는 것
		각 Wrapper클래스에 알맞은 메서드가 존재한다. 
		
		근데 해당 값으로 바꾸는 것도 타입이 맞아야 가능하지 숫자가 아닌 걸 숫자로 파싱 불가. 
		int num = Integer.parseInt("ABCD1234");
		당연히 안됨 ABCD1234는 숫자가 아니자나 
		 */
		
//parseInt_________________________________________________________		
		
		//문자열 타입이긴 하지만 본질은 숫자라서 int로 파싱 가능
		int num = Integer.parseInt("1234");
		System.out.println(num);
		
	//Tip. 만약 char에 담긴 숫자라면 '0'을 빼주면 더 간단하긴 함
		num = '1' - '0';
		System.out.println(num);
		//int num2 = "1" - "0"; 문자열은 안 됨
	
	//몇번째 알파벳인지 아는 법도 char에서 '0' 뺴주면 됨 	
		int alphNum = 'D' - 'A';
		System.out.println("D는 몇 번째 문자? : " + alphNum);
		
		
		//parseInt 의 오버라이드 1. radix(진법) 설정 가능
		num = Integer.parseInt("10", 8);  
		System.out.println(num);
		//parseInt의 오버라이드 2. beginIndex, endIndex, radix설정 가능
		num = Integer.parseInt("김철수/1000101010/A+", 4, 14, 10); 
		System.out.println(num);
		
		
//parseFloat______________________________________________________
		
		float value = Float.parseFloat("123.12345678");
		System.out.println(value);

		
//parseBoolean______________________________________________________		
		
		boolean isPrime = Boolean.parseBoolean("true"); 
		//parseBoolean() 은 무조건 "True" "true" 아니면 다 false임 
		

		
//toString__________________________________________________________		
		
		
		/*
		# toString
		모든 래퍼클래스 안에는 투스트링이 있다. ☆☆
		각 타입의 값을 문자열로 변환하는 기능
		*/

		
		String data = Integer.toString(12345678);
		System.out.println(data);
		
		//Integer.toString()도 radix설정 가능
		data = Integer.toString(12345678, 2); //2진법으로 . 문자열로.
		System.out.println(data);
		data = Integer.toString(12345678, 16);
		System.out.println(data);
		
		
//각 타입에 존재하는 상수들___________________________________________________
		
		
		//int의 최대값, 최소값
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
		
		//int의 사이즈
		System.out.println("사이즈?" + Integer.SIZE); //32비트가 나옴 
		System.out.println(Integer.SIZE / 8 + "bytes"); //32비트는 4바이트 
		
		
//Character_____________________________________________________________		
		
		//여기서부터 유용

		// Character.isDigit() : 숫자인지 아닌지 가려주는 메서드
		System.out.println("0은 숫자인가요? " + Character.isDigit('0')); //이게 숫자니
		System.out.println("A은 숫자인가요? " + Character.isDigit('A'));
		
		
		//★ Character.isAlphabetic() : 알파벳인지 가려주는게 아니라 문자인지 가려주는 메서드. 외쿡인 입장에서는 alphabet이 글자것지 그래 
		System.out.println("김 이 문자니? : " + Character.isAlphabetic('김')); //맞음
		System.out.println("A 가 문자니? : " + Character.isAlphabetic('A')); //맞음
		System.out.println(Character.isAlphabetic('3'));	//아님
		System.out.println(Character.isAlphabetic('_'));	//아님
		
		// Character.isLetter() : 문자인지 아닌지 가려줌.
		System.out.println("김 이 문자니? : " + Character.isLetter('김'));
		System.out.println("A 가 문자니? : " + Character.isLetter('A'));
		System.out.println("a 가 문자니? : " + Character.isLetter('a'));
		System.out.println("3 이 문자니? : " + Character.isLetter('3'));
		System.out.println("  이 문자니? : " + Character.isLetter(' '));
		System.out.println("! 이 문자니? : " + Character.isLetter('!'));
		// 엥 alphabetic이랑 letter랑 결과 똑같음 ;;
		
		
		
		// Character.isSpaceChar() : 스페이스 인 경우에만 true
		System.out.println(Character.isSpaceChar(' ')); 

		// Character.isUpperCase(), isLowerCase() : 대문자인지 소문자인지 가려주는 메서드 
		System.out.println(" A 는 대문자 입니까? : " + Character.isUpperCase('A')); 
		System.out.println(" a 는 소문자 입니까? : " + Character.isLowerCase('a')); 
		
		
		// Character.isJavaIdentifierStart() : 자바의 변수명 첫 글자로 사용 가능한 문자냐 
		// 변수명 첫글자 조건 : 숫자/공백 x, 특문은 $ 랑 _ 만 가능
		System.out.println(Character.isJavaIdentifierStart('$'));  
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isJavaIdentifierStart(' ')); //공백이나 숫자는 안 됨
		System.out.println(Character.isJavaIdentifierStart('3'));
		
		
		
		

		
		
		
		
		//여기부터는  쓸 데 없는 메서드들________________________________________________________________
		System.out.println("Character.MAX_CODE_POINT : " + Character.MAX_CODE_POINT);
		System.out.println("Character.MAX_VALUE : " + Character.MAX_VALUE);
		System.out.println("Character.MIN_VALUE : " + Character.MIN_VALUE);
		System.out.println("Character.SIZE : " + Character.SIZE / 8 + "bytes");
		System.out.println("Character.MAX_RADIX : " + Character.MAX_RADIX); 
		//System.out.println(Character.digit('A', 10)); //▲이거 걍 -'0'하는 거랑 같다는데 왜 계속 -1 나옴? 
		
		System.out.println("매직넘버? ############################# 필요 없긴 하대 ");
		System.out.println(Character.getType('_')); //매직넘버로 나오넹 Character의 23번 타입 
		System.out.println(Character.CONNECTOR_PUNCTUATION); //위에게 이거다
		
		System.out.println(Character.getType('A')); //Character의 1번 타입
		System.out.println(Character.UPPERCASE_LETTER); //위에건 이거다
	}
}
