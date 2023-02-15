
import java.util.Scanner;

/*
# if문 
-() 안의 값이 t면 {} 안의 내용을 실행하는 방법
-() 안의 값이 false면 {}안의 내용 무시
 
# else if문
-위의 if문이 실행되지 않았다면 if문처럼 동작한다. (위의 조건을 만족하면 else if 동작하지 x)
-else if는 여러번 사용할 수 있다. (추가적인 조건들 등록)
-else if는 단독으로 사용할 수 없다. 

#else문 
-위의 조건이 모두 아니라면 {} 안의 내용을 ★무조건★ 실행한다. 그래서 조건식 필요 없음
-if문 바로 다음에 사용할 수 있음. 
-단독으로 사용할 수 없다. 
-else가 붙어있는 if절은 ★최소한 한 번은 실행된다.★ 
 
 */
public class B03_If {
	public static void main(String[] args) {
		if (true) {
			System.out.println("if문이 true일 때 실행되는 명령어1");
			System.out.println("if문이 true일 때 실행되는 명령어2");
			System.out.println("if문이 true일 때 실행되는 명령어3");
		}

		int a = 7;
		if (a % 2 == 0) {
			System.out.println("a의 값이 짝수일 때만 출력되는 문장");
		} else if (a % 3 == 0) {
			System.out.println("a의 값이 짝수가 아니면서 3의 배수임");
		} else if (a % 5 == 0) {
			System.out.println("2의 배수가 아니고 3의 배수도 아닌 5의 배수");
		} else {
			System.out.println("위의 조건이 모두 아닙니다.");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("구매하실 사과의 개수>>");
		int apple = sc.nextInt();
		String size;

		if (apple > 10) {
			size = "대용량 종이백";
		} else if (apple > 5) {
			size = "중형 종이백";
		}
		System.out.println(size);
		// ★이렇게 쓰면 size밑에 계속 빨간 줄이 뜨는데 apple<=5일 때의 옵션이 남아있기 때문!
		// 그래서 else { size = "소형 종이백";}을 추가해줘야 됨.

	}
}
