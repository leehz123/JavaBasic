import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
#정규표현식 (Regular Expression)
문자열을 패턴으로 검사할 수 있는 표현식
특정 프로그래밍 언어에만 있는 게 아닌 공통의 규칙(대부분의 프로그래밍 언어에서 정규표현식을 사용)
정의한 정규표현식 패턴과 일치하는 문자열을 걸러낼 수 있다.

#Java의 정규표현식 클래스
-Pattern
-Matcher
*/



public class D09_Regex {
	public static void main(String[] args) {
		//Pattern.matches(regex, input) : input이 regex에 해당하는 문자열인지 검사하는 메서드.
						//정표식  검사하는 문자열
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : 해당위치의 한 글자에 올 수 있는 문자들을 정의하는 표현식
		System.out.println(Pattern.matches("s[lhk]eep", "sleep"));
		//두 번째 자리에는 l || h || k가 올 수 있다는 뜻
		
		System.out.println(Pattern.matches("s[lhk]eep", "sheep"));
		System.out.println(Pattern.matches("s[lhk]eep", "skeep"));
		System.out.println(Pattern.matches("s[lhk]eep", "sdeep")); //false
		
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleek"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleez"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleepkz")); //false
		System.out.println("★★★" + Pattern.matches("s[lhk]ee[pkz\\\\]", "slee\\"));
		System.out.println("★★★" + Pattern.matches("aaa[pkz\\\\]aaa", "aaa\\aaa"));
		
		System.out.println("aaa\\aaa"); 
		
		// \가 문자열 안에서 escape역할은 하는 것처럼 정규표현식 안에서도 마찬가지로 고유의 기능이 있음.  
		// \는 정규표현식에서도 특수 문법으로 사용되기 때문에 \\를 적어야 그냥 역슬래시를 의미 
		
		// 역슬래시 개수 규칙 : 출력결과 → 문자열 → 정규표현식으로 갈수록 \의 개수가 배로 늘어남. ( \ → \\ → \\\\)
		
		
		
		
		
		
		//공백(space)
		System.out.println("공백도 될까? : " + Pattern.matches("s[l k]eep", "s eep"));
		
		
		
		
		/*
		[abc] : a또는 b또는 c를 모두 허용
		[a-z] : a부터 z까지 모두 허용
		[A-Z] : A부터 Z까지 모두 허용
		[a-e&&c-g] : a-e와 c-g를 모두 만족시키는 문자를 허용
		('또는'은 그냥 적으면 됨. [a-cd-f]이렇게 하면 될라나?)
		*/
		
		
		System.out.println(Pattern.matches("s[c-k]eep", "sleep"));
		//대문자 D랑 공백, 탭까지 허용하려면
		System.out.println(Pattern.matches("s[c-kC-k \t]eep", "s 	eep"));
		
		/*
		하나로 여러 문자를 나타내는 것들
		. : 모든 문자. 그냥 .은  [.] 라고 쓰면 됨. 
		\d : 모든 숫자
		\D : 숫자를 제외한 모든 것
		\s : 모든 공백 (\t, \n, , \r)
		\S : 공백을 제외한 모든 것
		\w : 일반적인 문자들을 허용 [a-zA-Z0-9_]
		\W : \w를 제외한 모든 것을 허용
		 */
		
		System.out.println(Pattern.matches("s.eep", "s*eep"));
		System.out.println(Pattern.matches("s.eep", "s2eep"));
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));
		System.out.println(Pattern.matches("s\\.eep", "s.eep")); //이렇게 써도 됨
		//genex에서 역슬래시는 \\로 써야 함 그래서 역슬래시+점은 \\.
		
		System.out.println(Pattern.matches("\\d\\d\\d", "123"));
		System.out.println(Pattern.matches("\\d\\s\\d", "1 3"));
		//아 변수명검사기도 정표식으로 하면 쩔겠네 그렇네 와 
		System.out.println("1악ㅋ : " + Pattern.matches("\\d..", "1악ㅋ"));
		
		
		//정표식은 잘 안 쓰이고 비번체크, 아디체크, 이게 이멜인가, 이게 전번인가 검사할 때 씀. 한번 하고 오래 안 보기 땜에 맨날 까먹는댕.
		//얘는 외우는게 아니라 블로그 즐겨찾기를 해놓으래 
		
		
		/*
		#해당 패턴이 적용될 문자의 개수를 지정하는 방법
		System.out.println(Pattern.matches("\\d\\d\\d", "123")); 이렇게 문자열 3개를 하고 싶다
		{n} : {}앞의 패턴이 n개 일치해야 한다.
		{n,m} : {}앞의 패턴이 최소 n개 이상 최대m개 이하 일치해야 한다. (이거는 이상미만 아님 주의) 
		{n,} : {}앞의 패턴이 n개 이상 일치해야 한다.  
		?  : ? 앞의 패턴이 0또는1번 나와야 한다. 
		+  : + 앞의 패턴이 최소 1번 이상 나와야 한다. 
		*  : * 앞의 패턴이 0번 이상 나와야 한다. 이건 걍 뭐 나오든 말든 상관 없다는거자나 심지어 개수까지 상관 없네.
		      그래서 얘가 중간에 나오면 헷갈리는 거래 근데 앞에 없는게 나오면 false겠지
		 */
		System.out.println(Pattern.matches("\\d{5}", "12345"));
		System.out.println(Pattern.matches("\\d{5}", "12a45"));
		System.out.println(Pattern.matches("\\d{2,5}", "12"));
		System.out.println(Pattern.matches("\\d{5,}", "1234567777777"));
		System.out.println(Pattern.matches("abc\\d?", "7"));
		System.out.println(Pattern.matches("abc[jqk]?", "abc")); //0또는 1이니까 0번도 true
		System.out.println(Pattern.matches("abc[jqk]+", "abc")); //아예 안 나오면 false
		System.out.println(Pattern.matches("abc[jqk]*", "abc"));
		System.out.println(Pattern.matches("abc[jqk]*\\d*", "abcqj12"));
		
		
		
		
		
		
		//연습1: 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규표현식을 만들어보세요.
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "010-123-1234"));
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "011-123-1234"));
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "01A-123-1234"));
		
		
		//연습2: 해당 문자열이 이메일인지 검사할 수 있는 정규표헌식을 만들어보세요.
		String email = "abc@test";
													//(\\.[a-zA-Z]+)* 이렇게 괄호 쳐주면 나오든 말든 상관 없단 얘기 									
		System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]+(\\.[a-zA-Z]+)*", email));
		
		
		// 구글 -  6글자 이상, 글자(a-z), 숫자(0-9), 마침표만 입력
		System.out.println("구글");
		System.out.println(Pattern.matches("[a-z\\d[.]]{6,}@gmail[.]com", "abc123@gmail.com"));
		
		// 다음 - 3글자 이상, 아이디는 영문 소문자, 숫자, 빼기(-), 밑줄(_), 마침표 만 사용
		// 단, 마침표는 처음과 끝에 또는 연속으로 사용 불가 (?) 
		//아 {0}쓰면 되려나????!
		System.out.println("카카오");
		System.out.println(Pattern.matches(
									"[a-z\\d-_]{1}[a-z\\d-_[.]]+[a-z\\d-_]{1}@kakao[.]com*"
									, ".a_c.1-3@kakao.com"));
		System.out.println(Pattern.matches(
									"[a-z\\d-_]{1}[a-z\\d-_[.]]+[a-z\\d-_]{1}@kakao[.]com*"
									, "a_c.1-3.@kakao.com"));
		System.out.println(Pattern.matches(
									"[a-z\\d-_]{1}[a-z\\d-_[.]]+[a-z\\d-_]{1}@kakao[.]com*"
									, "whhhh.hhhy@kakao.com"));


		// 네이버 : 5-20글자의 영문 소문자, 숫자와 특수 기호(_), (-)만 사용 가능
		System.out.println("네이버");
		System.out.println(Pattern.matches("[a-z\\d_-]{5,20}@naver[.]com", "abf_-51@naver.com"));

		
	
		
		
//________________________________________________________________________________________________________________		
		
		
		
		
		//Matcher 클래스 사용하기 
		//이것도 잘 쓰는게 아니라 나중에 까먹음 정리 잘 해놓기 
		
		
		String text = "apple/banana/orange/kiwi/pineapple/grape/grapeapple/mango";
		//apple이라는 걸 찾아보자 정표식을 이용해서 
		
		//1. 정규표현식을 컴파일 하여 패턴 인스턴스를 생성
		// group(1) group(2)
		Pattern applePattern = Pattern.compile("(\\w+)(apple)"); 
												//그냥 apple은 안 찾아지고 pineapple, grapeapple이 찾아지겠지 
		//2. 해당패턴인스턴스로 문자열을 검사 
		Matcher matchResult = applePattern.matcher(text);
		
		//3. 매치결과를 반복문을 활용해 모두 탐색할 수 있다. 
		//matchResult.find() : 찾은게 있으면 true 없으면 false
		while(matchResult.find()) {   
			System.out.println("##############################################");
			System.out.println("Group 0 (전체) ________________");
			System.out.println("찾은 것 : " + matchResult.group());
			System.out.println("찾은 것 : " + matchResult.group(0));
			System.out.println("시작 인덱스 : " + matchResult.start());
			System.out.println("마지막 인덱스 : " + matchResult.end());
			
			//이렇게 매개변수로 숫자를 전달해줄 수도 있음 △ 
			System.out.println("Group 1 (정규 표현식의 첫 번째 괄호) ________________");
			System.out.println("찾은 결과의 첫 번째 괄호 : " + matchResult.group(1));
			System.out.println("시작 인덱스 : " + matchResult.start(1));
			System.out.println("마지막 인덱스 : " + matchResult.end(1));
			
			System.out.println("Group2 (정규 표현식의 두 번째 괄호) ________________");
			System.out.println("찾은 결과의 두 번째 괄호 : " + matchResult.group(2));
			System.out.println("시작 인덱스 : " + matchResult.start(2));
			System.out.println("마지막 인덱스 : " + matchResult.end(2));
		}
	}
}
