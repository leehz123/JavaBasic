package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class D04_IsJavaVariable {

	public static Set<String> keywords = new HashSet<>();
	
	static { //위에 static Set은 static 초기화블록으로 초기화해주는 수밖에 없지 
		keywords.add("int");
		keywords.add("assert");
		keywords.add("break");
		keywords.add("continue");
		keywords.add("byte");
		keywords.add("if");
		keywords.add("case");
		keywords.add("switch");
		keywords.add("public");
	} //이건 ㄹㅇ 이 방법밖에 없대 
	
	
	
//문자열을 전달하면 해당 문자열이 자바의 변수로서 사용될 수 있는지 판별해주는 메서드를 정의해보세요.
	public static boolean isJavaVar(String word) {
	
		// 배열.asList 이건 좀 복잡?해서 그냥 for문으로 뺀댔음
		ArrayList<Character> list = new ArrayList<>();
		for(char ch : word.toCharArray()) {
			list.add(ch);
		}
		
		//예약어 검사
		if(keywords.contains(word)) {
			System.out.printf("%s는 등록된 예약어이므로 변수가 될 수 없습니다. \n", word);
			return false;
		}
		
		//첫번째 글자 검사 
		if(!Character.isJavaIdentifierStart(list.get(0))) {
			System.out.printf("%s는 첫번째 글자가 %c 이므로 변수가 될 수 없습니다. \n" , word, list.get(0));
			return false;
		}
		
		//나머지 글자 검사
		for(int i = 1; i < list.size(); ++i) {
			char ch = list.get(i);
			
			if(!Character.isJavaIdentifierPart(ch)) {
				System.out.printf("%s는 index %d번의 글자가 %c 이므로 변수가 될 수 업습니다. \n", word, i, list.get(i));
				return false;
			}
		}
		
	
		return true;
	}

	public static void main(String[] args) {
		isJavaVar("break");
		isJavaVar("abc123");
		isJavaVar("123abc");
		isJavaVar("a23#abc");
	
	}
}		
		


/* 
		내가 짠 거 (굳이 불리언 배열에 체크할 필요 없음. 어제 하다가 자꾸 렉걸려서 대체 뭐가 문제인지 알고 싶었음)
		 	static boolean possible(String str) {
		
		Boolean[] chkArr = new Boolean[str.length()];
		
		//첫줄 따로 체크
		chkArr[0] = Character.isJavaIdentifierStart(str.charAt(0));
		
		for (int i = 1; i < str.length(); ++i) {
			chkArr[i] = Character.isJavaIdentifierPart(str.charAt(i));
		}
		System.out.println(Arrays.toString(chkArr));

		List<Boolean> chkList = Arrays.asList(chkArr);

		return !chkList.contains(false);
		
		
		
		public static void main(String[] args) {

		String str = "5adi$rd_bl _7dABd_";
		System.out.println("[" + str + "] → 변수 이름으로 가능? : " + possible(str));
	}
	}
		 */
		
		
		
		
		
		
		
		/*
				// 아 String은 애초에 WrapperClass에도 String으로 존재하니까 일반 배열 선언할 때도 String으로 해도 되는데
		
				String[] strArr = { "만두", "찐빵" };
				List<String> strList = Arrays.asList(strArr);
				System.out.println(strList);
		
				// boolean이랑 Integer는 리스트로 변환해주려면 애초에 배열부터 Boolean[]이랑 Integer[]로 해줘야 하나봄
		
				// boolean[] booleanArr = {true, true, true, false, false};이렇게 하면 에러남
				Boolean[] booleanArr = { true, true, true, false, false };
				List<Boolean> booleanList = Arrays.asList(booleanArr);
				System.out.println(booleanList);
		
				// int[] IntegerArr = {1, 2, 3, 4, 5}; 이렇게 하면 에러남
				Integer[] IntegerArr = { 1, 2, 3, 4, 5 };
				List<Integer> IntegerList = Arrays.asList(IntegerArr);
				System.out.println(IntegerList);
		 */


