package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B15�ʹ��_CountAlphabett {
	/*
	 ����ڷκ��� ������ �Է¹����� 
	 �ش� ���忡 �� ���ĺ��� ������ Ƚ���� �迭�� ������ ��  
	 1ȸ �̻� ������ ���ĺ��� �� ȸ �����ߴ��� ����غ�����. 
	 (��ҹ��ڴ� ���� �����ؾ� ��)
	 */

 	public static void main(String[] args) {
 	
 		System.out.println("���� >>");
 		String text = new Scanner(System.in).nextLine();
 		
 		int[] lower = new int[26];//�ҹ����� ������ ������ �迭
 		int[] upper = new int[26];//�빮�� "
 		
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
