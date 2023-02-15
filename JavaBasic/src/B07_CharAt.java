
public class B07_CharAt {
	/*
	 # "문자열".characterAt(index); 
	 해당 문자열에서 원하는 인덱스의 문자를 char타입으로 꺼내는 함수
	 
	 # "문자열".length; 
	 해당 문자열이 몇 개의 문자로 이루어졌는지 int타입으로 반환하는 함수 문자열의 마지막 인덱스는
	 '길이-1'이다.
	 */

	public static void main(String[] args) {
		String msg = "My name is sausage";
		System.out.println(msg.charAt(5)); // 공백 포함해서 글자수를 셈. 결과는 m

		System.out.println("msg의 길이:" + msg.length());
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}
}
