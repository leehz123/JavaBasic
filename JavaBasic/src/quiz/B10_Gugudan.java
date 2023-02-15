package quiz;

public class B10_Gugudan {
	
	public static void main(String[] args) {
		
		// 가로구구단
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단: ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%d * %d = %-2d ", dan, gop, dan * gop);
			}
			System.out.println();
		}
		System.out.println("_______________________________");
		System.out.println();

		// 세로구구단
		//단이름 넣기
		for (int danNum = 2; danNum <= 9; danNum++) {
			System.out.print(danNum + "단\t\t");
		}
		
		System.out.println(); // -단 -단 -단 과 구구단표 사이에 줄바꿈
		
		for (int gop = 1; gop <= 9; ++gop) {
			for (int dan = 2; dan <= 9; ++dan) {
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);
			}
			System.out.println();
		}
		// 일시적으록 고정되는 값을 하나 정하고 (2단의 2, 3단의 3,...) 그걸 바깥에 씌워주기 
		//바깥쪽 반복문은 한 줄을 의미하고 안쪽 반복문은 그 안에서의 반복을 의미
		
		
		//2. 정답 풀이(우아한 방법 와..)
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		for (int gop = 0; gop <= 9; ++gop) { //★초기화 부분에서 gop에 0넣어보고 -1 넣어보면 줄이 위로 한 줄씩 늘어남. ★
			
			for (int dan = 2; dan <= 9; ++dan) {
				if(gop ==0 ) {
				System.out.printf("%d단\t\t", dan);	
				}	else {
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);
				}
				
			}
			System.out.println();
		}
		
	}
}
