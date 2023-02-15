
public class B10_InnerLoop {
	/*
	# 반복문 내부에 반복문 사용하기 
	
	
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) {
			System.out.println("==============================바깥 반복문" + i);
			for (int j = 0; j < 5; ++j) {
				System.out.printf("____________________안쪽 반복문%d-%d\n" , i,  j);
				for(int k = 0; k < 3; k++) {
					 System.out.printf("++++++++++제일 안쪽 반복문 %d-%d-%d\n", i, j, k);
				}
			}
		}
		
		//다중 반복문으로 구구단 출력하기 
		//구구단은 2단~9단 
		//각 단마다 *1~*9가 있음
		//바깥의 반복문이 2~9단을 1씩 증가시키고
		
		for(int dan=2; dan<=9; ++dan) {
			System.out.printf("####%d단####\n", dan);
			System.out.println();
			for(int gop = 1; gop <=9; ++gop) {
				System.out.printf("%d * %d = %d\n", dan, gop, dan*gop);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}