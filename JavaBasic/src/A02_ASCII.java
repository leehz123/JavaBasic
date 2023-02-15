
public class A02_ASCII {
/*
# ASCII코드 
숫자 0~127 에 대응하는 문자
65 - 'A'
97 - 'a'
48 - '0' 
모든 데이터는 실제로 0과 1로 변환되어 저장된다. 
문자는 바로 0과 1로 변환할 수 없기 때문에 문자에 해당하는 숫자값이 존재한다. 
그 값들 중 0~127번까지를 정리해 놓은 표를 ASCII코드라고 한다. 
10 ------encoding------> 1010  
0-48 
A-65 ------encoding------> 0100 0001 
a-97 ------encoding------> 0100 0010 
0100 0001 ------decoding------> A-65 
0100 0010 ------decoding------> a-97 
이런 걸 '인코딩'이라고 부른다. = 숫자 코드화가 된다.
 */
	public static void main(String[] args) {
		
		System.out.println("ABCDEFG!!");
		System.out.println('0'); // 문자 '0': 실제로는 48이라는 값을 갖고 있음
		System.out.println(0); // 숫자 0: 실제로도 0
		// 문자타입 리터럴의 실제 값(코드값)을 보고 싶다면 앞에 (int)를 붙이면 됨
		System.out.println((int) '0'); // 48
		System.out.println('A'); // 65
		System.out.println('a');
		// 숫자타입 리터럴의 문자 형태를 보고 싶다면 앞에 (char)를 붙이면 된다.
		System.out.println((char) 97);
		System.out.println((char) 122);

		// 문자 타입 리터럴도 실제로는 숫자값(코드값)을 갖고 있기 때문에 계산이 가능.
		System.out.println('A' + 100); // 결과는 기본적으로 숫자다. 165
		System.out.println((char) ('A' + 20)); // A에서 20번째 뒤에 있는 문자 찾기
		System.out.println((char) ('Z' - 13)); // M Z에서 13번째 앞에 있는 문자 찾기
		System.out.println('A' - 'a'); // 대문자와 소문자의 거리 -32
		System.out.println((char)('k' +('A'-'a'))); // 소문자 k를 대문자 K로 변환
		System.out.println('L' - 'A'); // 몇번째 알파벳인지 알아낼 수 있다.
		System.out.println("A" + 10);
		// 문자열은 문자가 여러 개 저장될 수 있는 타입이기 때문에 숫자코드로 변환할 수 없다.
		// 따라서 결과는 A10

	}
}
