package quiz;

import java.util.Scanner;

import myobj.rps.Shape;

public class C14_RPS {
	
	
	public static void main(String[] args) {

/*		테스트 코드
//		Shape com = new Shape();
//		//Shape user = new Shape(2); 
//		//0은 바위, 1은 가위. 2는 보자기  
//		// 이런 것을 개발자가 외워야 하는 것을 매직 넘버라고 한다. (지만 아는 숫자. 좋지 않아)
//		// 매직 넘버들은 개발한 당사자만 알고 있는 숫자이기 때문에 썩 좋은 형태는 아니다.  
//		Shape user = new Shape(Shape.PAPER); //그래서 2 대신 이렇게 써주면 좋겠지
//		//근데 이럼에도 숫자가 들어가는 걸 막을 수 없음 

		Shape com = Shape.ROCK;
		Shape user = Shape.PAPER;
		
		//Shape user = Shape.random();
		
		System.out.println("com : " + com.getName());
		System.out.println("user : " + user.getName());
		
		
		int result = Shape.versus(com, user);
		System.out.println(result);
*/
		Scanner sc = new Scanner(System.in);
		while(true) {
			boolean error = false;
			Shape com = Shape.random();
			Shape user;
			System.out.println("가위(0), 바위(1), 보(2)를 선택하세요");
									//순서가 달라도 신경 쓰지 않아도 됨!
			switch(sc.nextInt()) {
			case 0:
				user = Shape.SCISSORS; //이렇게 직접 SCISSORS를 갖다 붙여주면 되니까!
				break;
			case 1:
				user = Shape.ROCK;
				break;
			case 2:
				user = Shape.PAPER;
				break;
			default:
				System.out.println("다시 선택해주세요!");
				user = null; //이게 없으니까 Shape.versus(com, user);여기서 빨간줄 뜸. 왜? 아 컴과 유저 대결 붙이는데 user에 값이 아무것도 없어서? 
				error = true;
				break;
			}
			if (error) {
				continue; //다시 while문의 맨 꼭대기로 
			}
			
			System.out.printf("com : %s\tuser: %s\n", com.getName(), user.getName());
			switch (Shape.versus(com, user)) { //컴과 유저의 대결
			case 1:
				System.out.println("컴퓨터 승!");
				break;
			case 0:
				System.out.println("무승부!");
				break;
			case -1: 
				System.out.println("유저 승!");
				break;
				
			}
			
		}
	
	}
}
