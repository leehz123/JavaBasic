package quiz;

import java.util.Arrays;
import java.util.Random;

public class C01새론거_MethodQuiz2 {

	// 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	public static int getBasketCount(int apple, int basketSize) {
		//에러날 경우도 대비!!
		if (apple == 0) { //사과가 잘못됐을 경우 
			return -2;
		} else if (apple < 0 || basketSize <= 0) {   //바구니가 잘못됐을 경우
			return -1; 
		} else if (apple % basketSize == 0) {
			return apple / basketSize;
		} else {
			return apple / basketSize + 1;
		}
	}
	// 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
	//사실 이건 처음부터 스트링빌더로 집어넣어서 빌더로 푸는게 더 비효율적이라 그냥 ver1로 풀면 됨
	
	public static String strShuffle(String str) {		
		//문자열으르 char로 바꾸기
		Random ran = new Random();
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < 100; ++i) {
			int ran_index = ran.nextInt(arr.length);
			
			char temp = arr[0];
			arr[0] = arr[ran_index];
			arr[ran_index] = temp;
		}
		
		//다 섞은 다음 char배열을 문자열로 변환하여 리턴
		return new String(arr);		
	
	}
	
	//새로운 기술!!!!!!! 영어 읽으면서 찾아보기 ●●●●●●●●●●●●●
	public static String builderShuffle(String str) {
		StringBuilder builder = new StringBuilder(str);
		Random ran = new Random();
		for(int i = 0; i < 100; ++i) {
			int random_index = ran.nextInt(builder.length());
			char temp = builder.charAt(0);     //왜 0이지??아 일단 첫번쨰 값부터 박아놓는거구나 
			//해당 인덱스의 문자를 하나 꺼내옴
			builder.setCharAt(0, builder.charAt(random_index));
			builder.setCharAt(random_index, temp);
			//bulder.setCharAt(index, char) : 해당 인덱스를 전달한 문자로 수정한다. 
			//덮어씌우면 사라지는데 그 사라질 문자를 temp로 빠놨으니까 다시 가져오면 됨 
			
		}
		return builder.toString();
	}
	
	// 3. 문자열을 전달하면 해당 문자열을 거꾸로한 문자열을 반환하는 메서드
	public static String strReverse(String str) {
		StringBuilder builder = new StringBuilder(str);
		return builder.reverse().toString();
	}
	public static String strReverse_re(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); ++i) {
			builder.insert(0, str.charAt(i));  //아 맞다 인서트 쓰면 되지!!!!
		}
		return builder.toString();
	}
	
	// 4. 메서드를 호출하면 1~45 사이의 중복 없는 숫자 8 개로 이루어진 배열을 반환하는 메서드
	public static int[] getNum() {	
		Random ran = new Random();
		int[] lotto = new int[8];
		
		for(int i = 0; i < lotto.length; ++i) {
			 int ranNum = ran.nextInt(45) +1;
			 lotto[i] = ranNum;
			 
			 for(int j = 0; j < i; ++j) {
				 if (lotto[j] == ranNum) {
					 --i;
					 break;
				 }
			 }
		}
		return lotto;
	
	}
	
	
	public static void main(String[] args) {
		//1.
		int basketCount = getBasketCount(21, 8);
		//메서드의 결과를 변수에 담아서 활용하는 것까지 생각하기!!!
		switch (basketCount) {
		case -2:
			System.out.println("사과의 개수가 이상합니다.");
		case -1:
			System.out.println("바구니의 개수가 이상합니다.");
			break;
		default:
			System.out.println("필요한 바구니는 " + basketCount + "입니다.");
		}
	
		System.out.println(getBasketCount(21, 8));
		//2.
		System.out.println(strShuffle("햄버거"));
		System.out.println(builderShuffle("버거킹"));
		//3.
		System.out.println(strReverse("고기만두"));
		//4.
		System.out.println(Arrays.toString(getNum()));
	}
}
