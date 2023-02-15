import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class D08_String_내코드좀줄이자 {
/*

 */

	
	public static void main(String[] args) {
		String fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		
		//split(delimiter) : 문자열을 원하는 기준으로 자른 문자열 배열을 반환한다. 
		String[] split = fruits.split("/"); //보기 좋게 과일 이름이 하나씩 배열로 들어가 잇음
		System.out.println(Arrays.toString(split));
		
		
		//join(delimiter, CharacterSequence... ) : 뒤에 나열한 문자를 delimiter를 구분자로 모두 연결한다. 
		//join(delimiter, iterable) : 배열(또는 리스트 등)의 여러 문자열을 연결한다. 
		//iterable : for-each로 돌릴 수 있는 것들 
		//for-each를 사용하려면 iterable이 구현된 클래스여야 해서 그럼.
		String join = String.join("," ,"tiger", "lion", "bear", "hawk", "panda");
		System.out.println(join);
		
		join =String.join("/", split);
		System.out.println(join);  // "/"로 잘랐던 걸 다시 "/"로 붙인 것 
		
		
		// CharacterSequence를 seq로 줄여서 부르겠음 
		//contains(seq) : 문자열에 해당 문자가 포함되어 있는지를 검사.   
		System.out.println("orange? : " + fruits.contains("orange"));
		System.out.println("peach? : " + fruits.contains("peach"));
	
		//startsWith(seq) : 해당 문자로 시작하는지 검사
		String url = "http://www.naver.com";
		System.out.println("www로 시작하나요? : " + url.startsWith("www"));
		System.out.println("http로 시작하나요? : " + url.startsWith("http"));
		System.out.println("https로 시작하나요? : " + url.startsWith("https"));
		
		//endsWith() : 해당 문자로 끝나는지 검사. 
		String fileName = "screenshot.pdf";
		System.out.println(".pdf인가요? : " + fileName.endsWith(".pdf"));
		System.out.println(".jpg인가요? : " + fileName.endsWith(".jpg"));
		System.out.println(".gif인가요? : " + fileName.endsWith(".gif"));
		
		
		//replace(old, new) : 문자열을 교체한 새로운 문자열을 반환한다. 
		String email = "billgates@microsoft.com";
		email.replace("microsoft.com", "naver.com");
		System.out.println(email); //이렇게 하면 원본은그대로 있음. ★★수정된 문자열을 리턴해주는 것일 뿐 원본을 수정한다는게 아님 주의!
		
		String replaced = email.replace("microsoft.com", "naver.com");
		System.out.println(replaced); //이렇게 다른 곳에 담아서 출력하면 됨	
		
		//substring(start) : 문자열을 시작 위치부터 자른 결과를 반환. ★★이것도 원본을 바꾸는 게 아니라 바군 결과를 반환하는 것! 
		System.out.println(email.substring(5));
		//substring(start, end) :문자열을 start부터 end미만까지 자른 결과를 반환
		System.out.println(email.substring(5, 10)); //5,6,7,8,9까지 나오는 거
		
		//★다른 메소드들도 항상 시작은 포함이고 끝은 미만으로 설계 돼 있음. Math.random()도 그렇고 Random클래스의 .nextInt()도 그럼
		
		//toUppercase() : 문자열의 알파벳을 모두 대문자로 변환한 인스턴스를 ★★반환한다. 
		System.out.println(email.toUpperCase());
		System.out.println("원본 : " + email);
		//toLowercase() : 문자열의 알파벳을 모두 소문자로 변환한 인스턴스를 ★★반환한다. 
		System.out.println(email.toLowerCase());
		System.out.println(email.toLowerCase().toUpperCase().toLowerCase().toUpperCase()); //이렇게 장난치는 것도 가능 
		System.out.println("원본 : " + email);
		//역시 원본에는 영향을 끼치지 않는다. 
		
		
		//# 메서드체이닝
		char[] arr = email.substring(10).toUpperCase().toCharArray(); //이렇게 여러 메서드를 한번에 처리하는 것도 가능. 결과에 점 찍고 결과에 점 찍고...
		System.out.println(arr);
		
		
		
		
		
		//indexOf(seq) : 원하는 문자열이 몇번째 인덱스에 있는지 반환한다. 
		System.out.println("@의 위치 : " + email.indexOf("@"));
		System.out.println(email.substring(email.indexOf("@"))); //이렇게 해도 되곘군
	
		//그리고 인덱스 찾아주는게 한글자 아니어도 여러글자로도 할 수 도 있음 그럴땐 첫글자의 인덱스를 반환하겠지 
		System.out.println("m의 위치 : " + email.indexOf("microsoft"));
		
		
		//문자열.indexOf(int ch) 
        // 문자(char) 나 문자의 유니코드(ex. a → 97) 가 해당 문자열의 몇번째 인덱스에 있는지 반환. 
		System.out.println("@의 위치 : " + email.indexOf('@'));
		String alph = "abcd";
		System.out.println(alph.indexOf(99));
		
		
		//indexOf(seq, from) : from부터 원하는 문자열이 몇번째 인덱스에 있는지 반환한다.
		String test = "apple@naver.com, abc@yahoo.com, ddd@hanmail.net";
		System.out.println(test.indexOf('@', 6));
				
		
		
		
		
		//String.format(format, args...) : 원하는 문자열을 서식을 이용해 생성 가능.
		
		
		
		
//연습문제............................................................................................
		
		
		// 모든 "apple"의 인덱스를 찾아 출력해보세요. (pineapple의 apple도 나와야 함)
		
		fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		
		

//정답 풀이

		int index = -1, i = 0;
		while((index = fruits.indexOf("apple", index + 1)) != -1) {
			System.out.printf("%d번째 apple의 위치 : %d\n", i++, index);
		}
	

		

//존나뤼 허접한 내 풀이
		
//		int index = fruits.indexOf("apple");
//		System.out.println(index);
//		while(index != -1) {
//			index = fruits.indexOf("apple", index+1);
//			System.out.println(index);			
//		}

		
		
		
		
		/* 맨 처음 내 코드... 넘 길다 
		 ArrayList<Integer> list = new ArrayList<>();
		int deadIndex = 0;
		while(fruits.indexOf("apple", deadIndex) != -1) {
			int appleIndex = fruits.indexOf("apple", deadIndex); //이렇게 하면 되려나 
			if(appleIndex != -1 ) {
				list.add(appleIndex);
				deadIndex = appleIndex + 1;
			}	
		}
		System.out.println(list);
		 */
		
		
		
	}
}
