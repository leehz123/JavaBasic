package quiz;

import java.util.Scanner;
	//문자열로 푸는 법.
	//아 의외로 간단.. 난 무슨 헛짓거리를 하ㄴ고 있었던 거 
public class B11_Count369_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자만 입력>>");
		int num = sc.nextInt();
		int clap = 0;
		
		for(int i = 1; i <= num ; ++i) {
			System.out.printf("%d : ", i);
			
			//i에 들어 있는 숫자를 문자열로 변환해서 문자열 변수 numStr에 넣어주기
			String numStr = "" + i; //해당 숫자를 하나씩 문자열로 바꿔주기. (문자열 + 숫자 = 문자열)
			
			//문자열변수에 든 숫자 numStr를 한 글자씩 꺼내서 charAt(i)와 비교
			for(int j= 0; j < numStr.length(); ++j) {
				char ch = numStr .charAt(j);
				if(ch == '3' || ch == '6' || ch == '9') {
					System.out.print("짝");
					++clap;
				} 
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
