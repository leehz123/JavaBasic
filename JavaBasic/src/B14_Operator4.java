
public class B14_Operator4 {
/*
 # 삼항연산자
 비교 ? 예 : 아니오;
 비교의 결과가 true이면 왼쪽의 값을 사용한다.
 비교의 결과가 false라면 오른쪽의 값을 사용한다. 
 
 */
	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println(ch>= 'a' && ch <= 'z' ? "소문자입니다.": "대문자입니다." );
		
		int apple =11;
		int basket = apple % 10 == 0 ? apple % 10 : apple % 10 + 1;
		System.out.printf("필요한 바구니의 개수는 %d 개 입니다.\n", basket);
	}

}
