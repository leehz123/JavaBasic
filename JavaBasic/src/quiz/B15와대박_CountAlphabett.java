package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B15와대박_CountAlphabett {
	/*
	 사용자로부터 문장을 입력받으면 
	 해당 문장에 각 알파벳이 등장한 횟수를 배열에 저장한 후  
	 1회 이상 등장한 알파벳만 몇 회 등장했는지 출력해보세요. 
	 (대소문자는 따로 저장해야 함)
	 */

 	public static void main(String[] args) {
 	
 		System.out.println("문장 >>");
 		String text = new Scanner(System.in).nextLine();
 		
 		int[] lower = new int[26];//소문자의 개수를 저장할 배열
 		int[] upper = new int[26];//대문자 "
 		
 		for(int i = 0; i < text.length(); ++i) {
 			char ch = text.charAt(i);
 			
 			if(ch>= 'a' && ch <= 'z') {
 				lower[ch - 'a']++;
 			} else if(ch >= 'A' && ch <= 'Z') {
 				upper[ch - 'A']++;
 			}
 		}
		for(int i = 0; i < 26; ++i) {
			if (lower[i] != 0) {
				System.out.printf("%c : %d \n", i + 'a', lower[i]);
			}
			if (upper[i] != 0) {
				System.out.println("");
				System.out.printf("%c : %d \n", i + 'A', upper[i]);
			}
		}
		
		
		
	}
}
