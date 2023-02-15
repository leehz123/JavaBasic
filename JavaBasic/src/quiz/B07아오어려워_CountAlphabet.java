package quiz;

import java.util.Scanner;

public class B07�ƿ������_CountAlphabet {
	/*
	 ����ڰ� ����� �˻��ϰ� ���� ���ĺ��� �Է��ϸ�
	 �ش� ���ĺ��� �� ȸ �����ϴ��� �˷��ִ� ���α׷��� ��������. 
	 	(��/�ҹ��� ��� ����� �մϴ�.)__ ��ҹ��� ���� ���� e �Է��ϸ� e�� E �� ã����� ��. 
	 */
	/*
	 ���⼭ ������ ��
	 .charAt()�� ���� �� ""���� ���� ''�� �־ ���ڷ� ���� ��
	 next()�� nextLine()�� �Է¹��� ���� ���ڿ��� �ޱ� ������ String alph = sc.next(); �̷��� Char���� �ƴ϶� String���� �޾ƾ� ��. 
	 */
	/*
	 Ǯ�� ����. (������ �̿��ؼ� ��>��, ��>��� �ٲ� ���� �����ϰ� �� ���� �ε��� ������� ��)
	 1. �Է��� �񱳰��� ���ڿ� ���� query�� �޴´�. (�� ��������, next()�� ����� String���� ��ȯ�Ǳ� ������)
	 2. char�� ���� q1�� query.charAt(0)���� ��´�.
	 3. q1�� ���� ���� �빮�ڸ� �ҹ��ڷ� ��ȯ�ؼ� q2�� ���, q1�� ���� ���� �빮�ڸ� �ҹ��ڷ� ��ȯ�ؼ� q2�� ��´�. 
	 4. for�� �ȿ��� index�� 1�� ������Ű�鼭 str.length(index) == q1 �̰ų� str.length(index) == q1�� cnt�� ī��Ʈ. 
	 5. cnt�� �̿��� ��� ���. 
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//str: ����, query:�˻���, cnt: ���� Ƚ�� ī��Ʈ	
		String str, query; 
		int cnt = 0; 
		
		System.out.println("������ �Է��ϼ���>>");
		str = sc.nextLine();
		
		System.out.println("�˻�� �Է��ϼ���>>");
		query = sc.next();
		
		System.out.println("���� : " + str + ", �˻���: " + query);
		
		if(query.length()>1) {
			System.out.println("�˻���� �� ���ڸ� �Է��ؾ� �մϴ�... ���α׷��� ���� ���� �˴ϴ�.");
			return;
		}
		
		//q1���� �˻���� �Է¹��� ���ڰ� �� ���̰� 
		//q2���� q1�� �빮��/�ҹ��ڷ� ��ȯ�� ���ڰ� �� ��.
		char q1 = query.charAt(0); 
		char q2 = query.charAt(0);
		
		if (q1 >='a' && q1 <= 'z') {
			q2 = (char)(q1 - Math.abs('A'-'a'));
			//�ҹ���q1���� �빮�ڿ� �ҹ����� �Ÿ� Math.abs('A'-'a') -> 32�� ���ָ� �빮�ڷ� ��ȯ��. �� ����� q2�� �ִ´�.  	
		} else if (q1 >='A' && q1 <= 'Z') {
			q2 = (char)(q1 + Math.abs('A'-'a'));
			//q1�� ��� �ִ� �빮�ڿ��� �ҹ��ڷ� ��ȯ�ؼ� �� ����� q2�� �ִ´�. 
		} else {
			System.out.println("�˻���� ��� �����մϴ�.. ���α׷��� �����մϴ�.");
			return;
		}
		
		
		for(int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if(ch == q1 || ch == q2) {
			//��ҹ��� �����ϰ� �񱳸� �ؼ� ���ٸ� cnt�� ī��Ʈ. 
				++cnt;
			}
		}
		System.out.printf("%s���� %c �Ǵ� %c�� %dȸ �����մϴ�. \n", str, q1, q2, cnt);
	}
}
