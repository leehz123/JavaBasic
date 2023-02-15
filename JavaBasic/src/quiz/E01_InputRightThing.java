package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 ����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹��� ������ ��� �Է¹޴� ���α׷��� ��������.
 �ٸ� Ÿ�԰��� �ԷµǴ��� �������� ���� �ʰ� ����ؼ� �Է��� �޾ƾ� �Ѵ�.
 
 */
public class E01_InputRightThing {

	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("iput int > ");
				return sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine(); //��ĳ�ʿ� �����ִ� �߸� �Էµ� �ܾ ������� �Ѵ�. (��ǲ��Ʈ���� ����������� ���� �־ ��� ó���� ���� ���� �ν��ؼ� ���ѷ��� ��)
			}	
		}
	}
	
	
	public static void main(String[] args) {
		int a = inputInt();
		int b = inputInt();
	}
}
