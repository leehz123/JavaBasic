package quiz;

import java.util.Scanner;

public class B07아오어려워_CountAlphabet {
	/*
	 사용자가 문장과 검색하고 싶은 알파벳을 입력하면
	 해당 알파벳이 몇 회 등장하는지 알려주는 프로그램을 만들어보세요. 
	 	(대/소문자 모두 세어야 합니다.)__ 대소문자 구분 없이 e 입력하면 e랑 E 다 찾아줘야 함. 
	 */
	/*
	 여기서 주의할 건
	 .charAt()과 비교할 때 ""넣지 말고 ''에 넣어서 문자로 비교할 것
	 next()와 nextLine()은 입력받은 값을 문자열로 받기 때문에 String alph = sc.next(); 이렇게 Char형이 아니라 String형에 받아야 함. 
	 */
	/*
	 풀이 과정. (변수를 이용해서 대>소, 소>대로 바꾼 문자 저장하고 그 둘을 인덱스 순서대로 비교)
	 1. 입력한 비교값을 문자열 변수 query로 받는다. (한 글자지만, next()의 결과는 String으로 반환되기 때문에)
	 2. char형 변수 q1에 query.charAt(0)으로 담는다.
	 3. q1에 담은 값이 대문자면 소문자로 변환해서 q2에 담고, q1에 담은 값이 대문자면 소문자로 변환해서 q2에 담는다. 
	 4. for문 안에서 index를 1씩 증가시키면서 str.length(index) == q1 이거나 str.length(index) == q1면 cnt에 카운트. 
	 5. cnt를 이용해 결과 출력. 
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//str: 문장, query:검색어, cnt: 등장 횟수 카운트	
		String str, query; 
		int cnt = 0; 
		
		System.out.println("문장을 입력하세요>>");
		str = sc.nextLine();
		
		System.out.println("검색어를 입력하세요>>");
		query = sc.next();
		
		System.out.println("문장 : " + str + ", 검색어: " + query);
		
		if(query.length()>1) {
			System.out.println("검색어는 한 글자만 입력해야 합니다... 프로그램이 강제 종료 됩니다.");
			return;
		}
		
		//q1에는 검색어로 입력받은 글자가 들어갈 것이고 
		//q2에는 q1을 대문자/소문자로 변환한 글자가 들어갈 것.
		char q1 = query.charAt(0); 
		char q2 = query.charAt(0);
		
		if (q1 >='a' && q1 <= 'z') {
			q2 = (char)(q1 - Math.abs('A'-'a'));
			//소문자q1에서 대문자와 소문자의 거리 Math.abs('A'-'a') -> 32를 빼주면 대문자로 변환됨. 그 결과를 q2에 넣는다.  	
		} else if (q1 >='A' && q1 <= 'Z') {
			q2 = (char)(q1 + Math.abs('A'-'a'));
			//q1에 들어 있는 대문자에서 소문자로 변환해서 그 결과를 q2에 넣는다. 
		} else {
			System.out.println("검색어는 영어만 가능합니다.. 프로그램을 종료합니다.");
			return;
		}
		
		
		for(int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if(ch == q1 || ch == q2) {
			//대소문자 무시하고 비교를 해서 같다면 cnt에 카운트. 
				++cnt;
			}
		}
		System.out.printf("%s에서 %c 또는 %c는 %d회 등장합니다. \n", str, q1, q2, cnt);
	}
}
