package quiz;

public class B06_ForQuiz {
	public static void main(String[] args) {
		/*
		 //1. 100부터 300까지의 총합 
		 int sum = 0; 
		 for(int i=100;i<301;i++) { 
		 sum += i; 
		 }
		 System.out.println(sum);
		 
		 //2. 1부터 2000사이의 7의 배수만 출력해보세요. 
		 for (int i=1;i<2001;i++) { if(i%7==0) {
		 System.out.println(i); } }
		 
		 //3. 1000부터 1500까지의 10의 배수가 한 줄에 10개씩 출력되도록 만들어보세요. 
		 int count = 0; 
		 for (int i=1000; i<1501; i+=10) { 
		 count += 1; System.out.print(i+" ");
			if((count+1)>10) { 
			System.out.println(); count = 0; 
			//증가부에서 i+=10하는 건 좋지 않음. 왜냐면 i 가 98부터 시작할 땐 복잡해짐. 
			} 
		}
		 */

		// 1. 100부터 300까지의 총합
		int sum = 0;

		for (int num = 100; num <= 300; ++num) {
			sum += num;
		}
		System.out.println(sum); // 40200
		
		// 2. 1부터 2000사이의 7의 배수만 출력해보세요.
		for (int num = 1; num <= 2000; ++num) {
			if (num % 7 == 0) {
				System.out.println(num);
			}
		}
		for (int num = 1, cnt = 1; num <= 2000; ++num) {
			if (num % 7 == 0) {
				System.out.printf("%d번째 7의 배수는 %d입니다.", cnt++, num);
				// 이렇게 하면 출력을 할 때마다 cnt가 증가함. 개수를 꼭 증가식에서 증가시켜야 하는 건 아님.
				// 본인이 증가시키고 싶은 곳에서 증가~
			}
		}
		
		// 3. 1000부터 1500까지의 10의 배수가 한 줄에 10개씩 출력되도록 만들어보세요.
		for (int num = 1000, cnt = 0; num <= 1500; ++num) {
			if (num % 10 == 0) {
				System.out.printf("%-6d", num);
				if (cnt++ % 10 == 9) {
					// cnt가 0일때부터 시작 cnt가 9가 되었을 때 %10을 해보고 9면 줄을 바꾸겠다.
					System.out.println();
				}
			}
		}

		
	}
}
