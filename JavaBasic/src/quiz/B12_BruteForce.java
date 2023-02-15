package quiz;

public class B12_BruteForce {
	/*
	생성된 4자리 임시 비밀번호를 맞출 때까지 모든 비밀번호를 생성하고 대조하는 프로그램을 만들어 보세요. 
	 임시 비번 영, 숫, 특만 가능하자나
	 그럼 비번을 
	 0000
	 0001
	 0002
	 ...
	 이렇게 반복문에 넣어서 돌리면서 끝까지 대조.
	 */
//그니까 모든 경우의 수를 만드는 거자나... 4*3*2*1개의 경우의 수를...

	public static void main(String[] args) {
		String symbols = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789" +  "!\"#$%^&'()+,-./:;<=>@[]^_'{|}~\\";  //총 93개의 문자 _ 추가된듯
				//총 92개 
		
		//정답풀이. 
		//이게 일일이 출력을 하면 오래걸리지 그냥 출력 안 하고 찾기만 하면 좀만 기다리면 금방 나옴
		// 간단하네^^...
		//만약 비밀번호가 100자리면 메소드를 이용해서 재귀를 사용하기 좋은 문제 
		String  password = "[]a4";
		
		for(int i=0; i<symbols.length();++i) {
			String temp = "";  
			temp += symbols.charAt(i);
			//System.out.println(temp);
			for(int j = 0; j < symbols.length(); ++j) {
				String temp2 = temp + symbols.charAt(j);
				//System.out.println(temp2);
				for(int k = 0; k < symbols.length(); ++k) {
					String temp3 = temp2 + symbols.charAt(k);
					//System.out.println(temp3);
					for(int l = 0; l < symbols.length(); ++l) {
						String temp4 = temp3 + symbols.charAt(l);
						
						if (temp4.equals(password)) {	
							System.out.println("찾은 비밀번호는 " + temp4 + "입니다. ");
							return;
						}
					}
				}
			}	
		}


/*	번외. 비밀번호 100자리일 때 ver.  (이런 방법은 잘 안 쓰는데 for문 사용법 익히기 위해 for문으로 풀어봄)
	 	password	symbolindex	index
					(93진법인거)
		aaaa		0000		0
		aaab		0001		1
		aaaj		000(9)
		aaak		000(10)
		..
		aaa}		000(90)		90
		aaa~		000(91)		91
		aaa/		000(92)		92
		aaba		0010		93		1인걸 계산하려면 /93하면 됨
		aabb		0011		94
					001(32)		125      125%93 =32 32가 자리올림해서 세번째 자리에 가 있는 거 
					
		String  password = "[]a4";
		double max_index = Math.pow(symbols.length(),4); //788074896
		String brute_password = "";
		
		//369할 때 뒷자리 하나씩 분리하는 방법 이용하면 됨. 
		//왜 제곱을 쓰냐 1자리는 93번 반복 2자리는 93(바깥 for)*93반복(안쪽 for)
		for (int i = 0; i < max_index; ++i ) {
			//i가 0일 땐 0000 1일 땐 0001 ... 93일 땐 000(92) 0010 0011 0012 ... 001(92) 0021 ... 002(02)... 
			//첫번째 자리에는 머가 들어간다는 거? 
			int brute_index = i;
			
			for(int j = 0; j <4 ; ++j) {
				brute_password += symbols.charAt(brute_index % symbols.length());
				brute_index /= symbols.length();
			
			}
			System.out.println(brute_password);
		}
			//brute_password += symbols.charAt(i/symbols.length()/symbols.length()/symbols.length() % symbols.length());
			//brute_password += symbols.charAt(i/symbols.length()/symbols.length() % symbols.length());
			//brute_password += symbols.charAt(i/symbols.length() % symbols.length());
			//brute_password += symbols.charAt(i%symbols.length());
			
			
	
		//빈문자열을 만들어놓고 +=으로 문자열을 한 글자씩 완성시키는 건 매우 느리고 성능이 안 좋음. 
		 * 문자열을 한 글자씩 완성시키고 싶을 때는 String Builder(문자열을 만들기 위한 전문 클래스) 라는 클래스를 사용. 
		   (스캐너 만들때처럼 클래스 만들어서 사용)
		 * append() : += 로 문자를 한 글자 뒤에 추가하는 것과 같은 효과를 가진 메서드.
		 * StringBuilder를 만들었다는 건 빈문자열을 만든다는 것과 같고 append는 맨 뒤에 붙이는 것.
		 * 반대로 insert()는 해당 문자열을 맨 앞에 추가하는 메소드. 
		   
		 for(int j = 0; j <4 ; ++j) {
				StringBuilder brute_password_builder = new StringBuilder();
				brute_password.insert(0, symbols.charAt(brute_index % symbols.length()));
				brute_index /= symbols.length();
			}
			String brute_password = brute_password_builder.toString();
			Sytem.out.println(brute_password);
			
*/		
		
		
		

/*		내 풀이. 
 * //for문을 4중중첩으로 만들어야 하나..?
 		for(int first = 0; first < 92; first++) {
			tmp_pwd += symbols.charAt(first);
			//System.out.println(tmp_pwd);
			for(int second = 0; second < 92; second++) {
				tmp_pwd += symbols.charAt(second);
				
				for(int thrid = 0; thrid < 92; thrid++) {
					tmp_pwd += symbols.charAt(thrid);
					
					for(int fourth = 0; fourth < 92; fourth++) {
						String result = tmp_pwd + symbols.charAt(fourth);
						System.out.println(result);	
						
					}
				}
			}
		}
*/

			
	

		
		
	}
}
