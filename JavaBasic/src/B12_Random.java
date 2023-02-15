import java.util.Random;

public class B12_Random {
/*
# 무작위 숫자 생성하기 

1. Math.random()함수 사용하기
	0 <= x < 1 의 double타입 랜덤 실수를 생성하는 함수 
	이 랜덤 함수를 활용하여 원하는 범위의 숫자를 만들어 사용할 수 있다. 
	
	※원하는 범위의 정수를 만드는 절차. 
	1) 생성된 랜덤 실수에 원하는 숫자의 개수를 곱한다. 
		(ex: 30~39는 숫자가 10개이므로 10을 곱한다.) 
		30~39는 10개니까  10을 곱해준다. 
		0.0 * 10 <= x < 1.0 * 10 
		0.0 <= x < 10.0 
	2) 1)의 결과에 원하는 숫자 범위 중 가장 작은 숫자를 더한다. 
		0 + 30 <= x < 10 +30
		30.0 <= x < 40.0
	3) 소수점 아래를 삭제한다. 
		(ex: 39.999999도 소수점 아래를 삭제하면 39가 된다)
		(int)로 타입캐스팅 해버리면 됨. 
		(int)(Math.random() * 10 + 30);
	
2. Random클래스 사용하기
	java.util.Random;
	

 */
	public static void main(String[] args) {
	
	//새로운 랜덤 시드 생성. 프로그램 다시 실행할 때마다 계속 바뀜.
	Random ran = new Random();
	
	//next타입()으로 랜덤값을 하나씩 꺼낼 수 있다. 정수 랜덤값을 뽑아올 수 있음. 
	//주의할 점은 음수값도 뽑아주므로 양수값만 필요한 경우 따로 처리가 필요하다. 
	ran.nextInt();
	
	//출력 예시
	System.out.println(ran.nextInt()); 

	
	
	
	
	//30~39의 랜덤 정수를 10 개 출력
	for(int i = 0; i < 10 ; ++i ) {	
		System.out.println((int)(Math.random() * 10 + 30));
	}
	
	//연습문제. 1~45의 랜덤 정수를 10 개 출력해보시오
	for(int i = 0; i < 10 ; ++i ) {	
		System.out.println((int)(Math.random()*45 + 1));
	}
	
	
		
		
		
		
		
		
		
		
	}
}
