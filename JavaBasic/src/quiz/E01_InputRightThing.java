package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을 때까지 계속 입력받는 프로그램을 만들어보세요.
 다른 타입값이 입력되더라도 강제종료 되지 않고 계속해서 입력을 받아야 한다.
 
 */
public class E01_InputRightThing {

	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("iput int > ");
				return sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine(); //스캐너에 남아있던 잘못 입력된 단어를 버려줘야 한다. (인풋스트림에 가비지밸류가 남아 있어서 계속 처음에 넣은 문자 인식해서 무한루프 돎)
			}	
		}
	}
	
	
	public static void main(String[] args) {
		int a = inputInt();
		int b = inputInt();
	}
}
