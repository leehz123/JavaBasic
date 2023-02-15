package quiz;

import java.util.Scanner;

public class B15버전2어렵다복습_ShuffleText {
	/*
	 사용자로부터 문장을 입력받으면 해당 문장을 랜덤으로 뒤섞어 풀력하는 프로그램을 만들어보세요. 
	 */
	public static void main(String[] args) {

/* 		//내 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 문장이나 입력하시오.>> ");
		String input = sc.nextLine();
		//받은 문자열 input을 char형 배열 sentence에 집어넣기. 
		char[] sentence = new char[input.length()];
		
		for (int i = 0; i < input.length(); ++i) {
			sentence[i] = input.charAt(i);
		}
		
		//System.out.println("입력된 문장은 : " + sentence);
		//▼▼▼▼▼이렇게 하면 sentence배열이 이상하게 출력됨. 해결책은 아래에 new String()을 이용해주는 것. 
		System.out.println("입력된 문장은 : " + new String(sentence));
		// new String 은 new Scanner 처럼 객체를 새로 만들어주는데, 그 안에 재료로 char형 배열도 들어갈 수 있음. 
		
		//빈컵 역할
		char[] tmp = new char[1]; //이거 굳이 배열로 해줄 필요 없음 아래 정답풀이 보기 
		//sentence배열 안에서 뒤섞기 
		//(교환방식!!!!_안에 있는 글자들을 유지해주기 위해. 글자가 중복 등장하거나 사라지거나 그런 경우를 예방)
		//두 위치의 글자를 섞으면 되는데 두 위치 모두 랜덤위치면 겹칠 수 있겠지. 하나의 위치만 랜덤이면 됨. 
		//하나는 걍 tmp[0]으로 고정
		for (int i = 0; i < 100; ++i) {	//굳이 배열 길이만큼 돌릴 필요 없음. 	
				int random_index = (int)(Math.random() * sentence.length);
				tmp[0] = sentence[i];
				sentence[i] = sentence[random_index];
				sentence[random_index] = tmp[0];
		}
		
		System.out.print("결과 : " + new String(sentence));	
*/		
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		//풀이 버전 1. tmp를 두고 바꾸기(교환)
		char[] shuffled_text = text.toCharArray();//문자타입 배열로 바꾸기★★★★★★★★★★★★★ 
		
		for(int i =0; i < 100; ++i) {
			int x = (int)(Math.random() * shuffled_text.length);
			//int y = (int)(Math.random() * shuffled_text.length);
			
			
			
			//shuffled_text[x] = shuffled_text[y];
			//shuffled_text[y] = shuffled_text[x]; //두 문자를 바꿀 떄 이렇게 하면 안 됨.
			
			
			char temp = shuffled_text[x];
			shuffled_text[x] = shuffled_text[0];
			shuffled_text[0] = temp;
			//이렇게 char temp 에 shuffled_text[x]를 옮겨놓고 바꾸면 됨. 
			//둘 다 랜덤일 필요는 없다. 하나는 걍 고정시켜줘도 됨.★ 
		}
		System.out.println(shuffled_text);
		//아름답지 못한 결과가 나타남. 중복되고~~ 난리남		
		
		//풀이 버전 2. 뽑았던 거 안 뽑는 법
		//shuffled_text = text.toCharArray();//원상복구
		//System.out.println(shuffled_text);
		
		//1. 입력 받은 문장을 char배열로 변환
		char[] original_text = text.toCharArray();
		
		//2. 문장의 길이만큼 boolean배열을 생성
		//배열의 용도 : 뽑았던 문자는 다시 뽑지 않기 위해 표시해놓는 용도.
		boolean[] pick = new boolean[original_text.length];
		
		//3. 문자열을 만들기 위한 도구 스트링빌더
		StringBuilder shuffled_text_builder = new StringBuilder("");  //() 맞나?? ("") 이렇게 해야 하는 거 아님???
		//System.out.println(shuffled_text_builder.length()); // 빌더는 비어있음
		
		//4. 빌더는 길이가 0으로 시작하면서 .append()로 한 문자씩 추가하므로 
		//   원래 문장과 길이가 같아지면 모든 문자를 추가하는 것을 완료.
		while(shuffled_text_builder.length() != original_text.length) {
			//5. 랜덤 위치(인덱스)를 하나 선택
			int random_index = (int)(Math.random() * original_text.length);
			//6. 해당 인덱스가 뽑았던 적이 있으면 추가하지 않음. 
			if(!pick[random_index]) { 
				//뽑았던 적이 없으면 false임. false면 실행됨. -> pick[random_index] 앞의 느낌표 ! 이게 (false) 일 경우 실행되는 거니까.
				//예를 들어 10을 처음으로 random_index로 뽑았는데 pick에 10이 들어가면 falses임.
				//그리고 pick[random_index] = true;을 통해 10이 true가 됨. 
				//그 후에 만약에 10을 한번 더 뽑으면 true이므로 if문 안의 실행문이 실행되지 않음.  
				shuffled_text_builder.append(original_text[random_index]);
				pick[random_index] = true;
				}
		}
		System.out.println(shuffled_text_builder);
		
		
		
		
	}
}
