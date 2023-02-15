

import java.util.Arrays;
import java.util.Random;

public class C01_MethodQuiz2_내풀이 {
	//	1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	public static int appleBasket(int apple, int basketSize) {
		return apple % basketSize == 0 ? apple / basketSize : apple / basketSize + 1;	
	}

	//	2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
	public static String shuffleText(String str) {
		char[] strArr = str.toCharArray();//문자열을 문자배열로
		boolean[] strIndexArr = new boolean[strArr.length]; //문자배열의 인덱스에 대응하는 불리언배열
		StringBuilder builder = new StringBuilder(); //랜덤으로 뽑은 값을 하나씩 append할 스트링빌더
		
		Random ran = new Random();
		
		while(builder.length() != strArr.length) {  // for문 index가 0~strArr배열의 마지막요소까지로 하면 안 됨.  
			int randomIndex = ran.nextInt(strArr.length);//문자배열의 인덱스 중에서 랜덤인덱스 뽑기
			
			if(strIndexArr[randomIndex]==false) {
				builder.append(strArr[randomIndex]);
				strIndexArr[randomIndex] = true;
			}	
		}
		
		return builder.toString();
	}
	
	//	3. 문자열을 전달하면 해당 문자열을 거꾸로한 문자열을 반환하는 메서드 
	public static String stringReverse(String str) {
		StringBuilder reverse = new StringBuilder();
		char[] sentence = str.toCharArray();
		for(int index = sentence.length-1; index >=0; --index) {
			reverse.append(sentence[index]); 
		}
		return reverse.toString();
	}
	
	//	4. 메서드를 호출하면 1~45 사이의 중복 없는 숫자 8 개로 이루어진 배열을 반환하는 메서드 
	public static String lotto() {
		Random ran = new Random();
		
		int[] lotto = new int[8];
			
		for(int index = 0; index < lotto.length; ++index) {
			int newNum = ran.nextInt(46) + 1; //1~45까지 랜덤 (범위값 46으로 쓰기!)
			lotto[index] = newNum;
			for(int chk = 0; chk < index; ++chk) {
				if(lotto[index] == lotto[chk]) {
					--index;
					break;
				}
			}
		}
		return Arrays.toString(lotto);
	}
 	
	public static void main(String[] args) {
		System.out.println(appleBasket(18, 10));
		System.out.println(shuffleText("chicken"));
		System.out.println(stringReverse("양념치킨"));
		System.out.println(lotto());
	
	
	}
	
}
