
public class B11_While {
	/*
	# While문
	for문과 사용법이 약간 다른 반복문
	초기값과 증가값의 위치가 자유롭다
	()안의 내용이 참인 동안 {} 안의 내용을 반복해서 실행한다. 
	증가값의 위치에 따라서 프로그램 실행 결과가 달라질 수 있다. 
	*/
	public static void main(String[] args) {
		
		System.out.println("0~9");
		int i = 0;
		while (i<10) {
			System.out.print(i++ + "\t");  
		}
		System.out.println();
		
		System.out.println("1~10");
		i = 0;
		while (i<10) {
			System.out.print(++i + "\t");
		}
		System.out.println();
		
		System.out.println("1~10"); 
		//만약 while (++i<10) { 라면 비교연산이 끝난 다음에 비교 1부터 9까지 출력됨. 
		i = 0;
		while (i++<10) {
			System.out.print(i + "\t"); //연산자 우선순위에 따라 증감연산이 끝난 다음에 비교. 1부터 10까지 출력됨. 
		}	
		System.out.println();
		
		System.out.println("1~9"); 
		i = 0;
		while (++i<10) {
			System.out.print(i + "\t"); //연산자 우선순위에 따라 증감연산이 끝난 다음에 비교. 1부터 10까지 출력됨.
		}
		System.out.println();
		
		System.out.println("1~10"); 	
		i = 0;
		while (i++<10) {
			System.out.print(i + "\t"); 
		}
		System.out.println();
		
		
		
		
		
	}

}
