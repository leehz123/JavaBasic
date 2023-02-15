package quiz;

public class B12우욱_TempPassword {
	//많이 쓰이는 방법!!!★★★★★
	public static void main(String[] args) {
/*
6자리의 랜덤 임시 비밀번호를 생성하는 프로그램을 만들어 보세요. 
(비밀번호를 구성하는 문자 = 영어, 숫자, 특문)
사용 가능한 특수문자
! " # $ & ' ( ) ... ~ \

 */
		//(int)(Math.random() * ? + ? );
		
//		System.out.println((int)'A');
//		int n = 92 - 32;
//		System.out.println(n);
		//A-Z = 65 ~ 90
/*	
		//내 풀이....망한듯
		char u_letter = (char)( Math.random() * 26 + 65 );
		char l_letter = (char)( Math.random() * 27 + 97 );
		char s_letter = (char) (Math.random() * 60 + 33 );
		
		for(int i = 0; i <6 ; i++) {
			int randomV = (int)(Math.random() * 3 + 1);
			switch(randomV) {
			case 1: 
				System.out.println(u_letter);
				break;
			case 2:
				System.out.println(l_letter);
				break;
			case 3:
				System.out.println(s_letter);
				break;
			}
		}		
*/		
	
		//아스키 코드 표 보고 풀던데 생각보다 간단한 문제랭..
		String symbols = "abcdefghijklmnopqrstuvwxyz"
						+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
						+ "0123456789"
						+ "!\"#$%^&'()+,-./:;<=>@[]^_'{|}~\\";
		//이렇게까지 노가다 한다고? 싶지만 오히려 깔끔
							
		System.out.println(symbols);
		System.out.println(symbols.length()); //총 93개의 문자
		
		String temp_password = "";
		
		//temp_password의 0~5까지 하나하나 랜덤문자를 뽑아서 넣어줄 거임. 
		for(int i = 0; i < 6; ++i) {
			int random_index = (int)(Math.random() * symbols.length()); 
			//인덱스는 0부터 시작이니까 굳이 뭐 더해줄 필요 없음. 
			char random_char = symbols.charAt(random_index);
			//위에서 구한 랜덤 인덱스로 랜덤 char 구해서 
			temp_password += random_char;
			//템프차에 추가 추가 추가 추가 ..6번
			
		}
		
		System.out.println("생성된 임시 비밀번호 : " + temp_password);
	}
}
