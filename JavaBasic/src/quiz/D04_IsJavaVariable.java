package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class D04_IsJavaVariable {

	public static Set<String> keywords = new HashSet<>();
	
	static { //���� static Set�� static �ʱ�ȭ������� �ʱ�ȭ���ִ� ���ۿ� ���� 
		keywords.add("int");
		keywords.add("assert");
		keywords.add("break");
		keywords.add("continue");
		keywords.add("byte");
		keywords.add("if");
		keywords.add("case");
		keywords.add("switch");
		keywords.add("public");
	} //�̰� ���� �� ����ۿ� ���� 
	
	
	
//���ڿ��� �����ϸ� �ش� ���ڿ��� �ڹ��� �����μ� ���� �� �ִ��� �Ǻ����ִ� �޼��带 �����غ�����.
	public static boolean isJavaVar(String word) {
	
		// �迭.asList �̰� �� ����?�ؼ� �׳� for������ ������
		ArrayList<Character> list = new ArrayList<>();
		for(char ch : word.toCharArray()) {
			list.add(ch);
		}
		
		//����� �˻�
		if(keywords.contains(word)) {
			System.out.printf("%s�� ��ϵ� ������̹Ƿ� ������ �� �� �����ϴ�. \n", word);
			return false;
		}
		
		//ù��° ���� �˻� 
		if(!Character.isJavaIdentifierStart(list.get(0))) {
			System.out.printf("%s�� ù��° ���ڰ� %c �̹Ƿ� ������ �� �� �����ϴ�. \n" , word, list.get(0));
			return false;
		}
		
		//������ ���� �˻�
		for(int i = 1; i < list.size(); ++i) {
			char ch = list.get(i);
			
			if(!Character.isJavaIdentifierPart(ch)) {
				System.out.printf("%s�� index %d���� ���ڰ� %c �̹Ƿ� ������ �� �� �����ϴ�. \n", word, i, list.get(i));
				return false;
			}
		}
		
	
		return true;
	}

	public static void main(String[] args) {
		isJavaVar("break");
		isJavaVar("abc123");
		isJavaVar("123abc");
		isJavaVar("a23#abc");
	
	}
}		
		


/* 
		���� § �� (���� �Ҹ��� �迭�� üũ�� �ʿ� ����. ���� �ϴٰ� �ڲ� ���ɷ��� ��ü ���� �������� �˰� �;���)
		 	static boolean possible(String str) {
		
		Boolean[] chkArr = new Boolean[str.length()];
		
		//ù�� ���� üũ
		chkArr[0] = Character.isJavaIdentifierStart(str.charAt(0));
		
		for (int i = 1; i < str.length(); ++i) {
			chkArr[i] = Character.isJavaIdentifierPart(str.charAt(i));
		}
		System.out.println(Arrays.toString(chkArr));

		List<Boolean> chkList = Arrays.asList(chkArr);

		return !chkList.contains(false);
		
		
		
		public static void main(String[] args) {

		String str = "5adi$rd_bl _7dABd_";
		System.out.println("[" + str + "] �� ���� �̸����� ����? : " + possible(str));
	}
	}
		 */
		
		
		
		
		
		
		
		/*
				// �� String�� ���ʿ� WrapperClass���� String���� �����ϴϱ� �Ϲ� �迭 ������ ���� String���� �ص� �Ǵµ�
		
				String[] strArr = { "����", "��" };
				List<String> strList = Arrays.asList(strArr);
				System.out.println(strList);
		
				// boolean�̶� Integer�� ����Ʈ�� ��ȯ���ַ��� ���ʿ� �迭���� Boolean[]�̶� Integer[]�� ����� �ϳ���
		
				// boolean[] booleanArr = {true, true, true, false, false};�̷��� �ϸ� ������
				Boolean[] booleanArr = { true, true, true, false, false };
				List<Boolean> booleanList = Arrays.asList(booleanArr);
				System.out.println(booleanList);
		
				// int[] IntegerArr = {1, 2, 3, 4, 5}; �̷��� �ϸ� ������
				Integer[] IntegerArr = { 1, 2, 3, 4, 5 };
				List<Integer> IntegerList = Arrays.asList(IntegerArr);
				System.out.println(IntegerList);
		 */


