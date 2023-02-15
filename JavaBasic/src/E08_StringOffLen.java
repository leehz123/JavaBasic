
public class E08_StringOffLen {
	public static void main(String[] args) {
		char[] arr = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		System.out.println(new String(arr));
		System.out.println(new String(arr, 3, 2)); //3번째부터 2글자를 사용해 문자열 생성 	
		System.out.println(new String(arr, 3, 3)); //3번째부터 3글자
		System.out.println(new String(arr, 3, 4));
		System.out.println(new String(arr, 0, 5)); //0부터 5개의 글자 (0<= x <5)
	}
}
