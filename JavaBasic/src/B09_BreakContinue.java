
public class B09_BreakContinue {
/*
# Break
switch-case문에서 사용하면 해당 case를 탈출한다. 
반복문 내에서 사용하면 해당 반복문을 탈출한다. 

# Continue
반복문 내부에서 사용하면 그 즉시 다음 반복으로 넘어간다. 
continue를 만난 이후, 아래에 남은 코드는 모두 무시한다. 

 
 */
	public static void main(String[] args) {
		for(int i=0; i<100; ++i) {
			System.out.println(i);
			if(i==66) {
				break;	
			}
		}
		System.out.println("반복문 끝");	
		
		for (int i=0; i<1000; i++) {
			
			if(i%10==0) {
				continue;
				//i=0일 떄도 안 나옴 주의 0~999까지 0, 10, 20, 30,... 990빼고 다 나옴. 
			}	
			System.out.println(i);
		}
	
		
		
		
	}		
}
