import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
#����ǥ���� (Regular Expression)
���ڿ��� �������� �˻��� �� �ִ� ǥ����
Ư�� ���α׷��� ���� �ִ� �� �ƴ� ������ ��Ģ(��κ��� ���α׷��� ���� ����ǥ������ ���)
������ ����ǥ���� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�.

#Java�� ����ǥ���� Ŭ����
-Pattern
-Matcher
*/



public class D09_Regex {
	public static void main(String[] args) {
		//Pattern.matches(regex, input) : input�� regex�� �ش��ϴ� ���ڿ����� �˻��ϴ� �޼���.
						//��ǥ��  �˻��ϴ� ���ڿ�
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش���ġ�� �� ���ڿ� �� �� �ִ� ���ڵ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lhk]eep", "sleep"));
		//�� ��° �ڸ����� l || h || k�� �� �� �ִٴ� ��
		
		System.out.println(Pattern.matches("s[lhk]eep", "sheep"));
		System.out.println(Pattern.matches("s[lhk]eep", "skeep"));
		System.out.println(Pattern.matches("s[lhk]eep", "sdeep")); //false
		
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleek"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleez"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleepkz")); //false
		System.out.println("�ڡڡ�" + Pattern.matches("s[lhk]ee[pkz\\\\]", "slee\\"));
		System.out.println("�ڡڡ�" + Pattern.matches("aaa[pkz\\\\]aaa", "aaa\\aaa"));
		
		System.out.println("aaa\\aaa"); 
		
		// \�� ���ڿ� �ȿ��� escape������ �ϴ� ��ó�� ����ǥ���� �ȿ����� ���������� ������ ����� ����.  
		// \�� ����ǥ���Ŀ����� Ư�� �������� ���Ǳ� ������ \\�� ����� �׳� �������ø� �ǹ� 
		
		// �������� ���� ��Ģ : ��°�� �� ���ڿ� �� ����ǥ�������� ������ \�� ������ ��� �þ. ( \ �� \\ �� \\\\)
		
		
		
		
		
		
		//����(space)
		System.out.println("���鵵 �ɱ�? : " + Pattern.matches("s[l k]eep", "s eep"));
		
		
		
		
		/*
		[abc] : a�Ǵ� b�Ǵ� c�� ��� ���
		[a-z] : a���� z���� ��� ���
		[A-Z] : A���� Z���� ��� ���
		[a-e&&c-g] : a-e�� c-g�� ��� ������Ű�� ���ڸ� ���
		('�Ǵ�'�� �׳� ������ ��. [a-cd-f]�̷��� �ϸ� �ɶ�?)
		*/
		
		
		System.out.println(Pattern.matches("s[c-k]eep", "sleep"));
		//�빮�� D�� ����, �Ǳ��� ����Ϸ���
		System.out.println(Pattern.matches("s[c-kC-k \t]eep", "s 	eep"));
		
		/*
		�ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		. : ��� ����. �׳� .��  [.] ��� ���� ��. 
		\d : ��� ����
		\D : ���ڸ� ������ ��� ��
		\s : ��� ���� (\t, \n, , \r)
		\S : ������ ������ ��� ��
		\w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		\W : \w�� ������ ��� ���� ���
		 */
		
		System.out.println(Pattern.matches("s.eep", "s*eep"));
		System.out.println(Pattern.matches("s.eep", "s2eep"));
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));
		System.out.println(Pattern.matches("s\\.eep", "s.eep")); //�̷��� �ᵵ ��
		//genex���� �������ô� \\�� ��� �� �׷��� ��������+���� \\.
		
		System.out.println(Pattern.matches("\\d\\d\\d", "123"));
		System.out.println(Pattern.matches("\\d\\s\\d", "1 3"));
		//�� ������˻�⵵ ��ǥ������ �ϸ� ¿�ڳ� �׷��� �� 
		System.out.println("1�Ǥ� : " + Pattern.matches("\\d..", "1�Ǥ�"));
		
		
		//��ǥ���� �� �� ���̰� ���üũ, �Ƶ�üũ, �̰� �̸��ΰ�, �̰� �����ΰ� �˻��� �� ��. �ѹ� �ϰ� ���� �� ���� ���� �ǳ� ��Դ´�.
		//��� �ܿ�°� �ƴ϶� ��α� ���ã�⸦ �س����� 
		
		
		/*
		#�ش� ������ ����� ������ ������ �����ϴ� ���
		System.out.println(Pattern.matches("\\d\\d\\d", "123")); �̷��� ���ڿ� 3���� �ϰ� �ʹ�
		{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�.
		{n,m} : {}���� ������ �ּ� n�� �̻� �ִ�m�� ���� ��ġ�ؾ� �Ѵ�. (�̰Ŵ� �̻�̸� �ƴ� ����) 
		{n,} : {}���� ������ n�� �̻� ��ġ�ؾ� �Ѵ�.  
		?  : ? ���� ������ 0�Ǵ�1�� ���;� �Ѵ�. 
		+  : + ���� ������ �ּ� 1�� �̻� ���;� �Ѵ�. 
		*  : * ���� ������ 0�� �̻� ���;� �Ѵ�. �̰� �� �� ������ ���� ��� ���ٴ°��ڳ� ������ �������� ��� ����.
		      �׷��� �갡 �߰��� ������ �򰥸��� �ŷ� �ٵ� �տ� ���°� ������ false����
		 */
		System.out.println(Pattern.matches("\\d{5}", "12345"));
		System.out.println(Pattern.matches("\\d{5}", "12a45"));
		System.out.println(Pattern.matches("\\d{2,5}", "12"));
		System.out.println(Pattern.matches("\\d{5,}", "1234567777777"));
		System.out.println(Pattern.matches("abc\\d?", "7"));
		System.out.println(Pattern.matches("abc[jqk]?", "abc")); //0�Ǵ� 1�̴ϱ� 0���� true
		System.out.println(Pattern.matches("abc[jqk]+", "abc")); //�ƿ� �� ������ false
		System.out.println(Pattern.matches("abc[jqk]*", "abc"));
		System.out.println(Pattern.matches("abc[jqk]*\\d*", "abcqj12"));
		
		
		
		
		
		
		//����1: �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������.
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "010-123-1234"));
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "011-123-1234"));
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "01A-123-1234"));
		
		
		//����2: �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ����� ��������.
		String email = "abc@test";
													//(\\.[a-zA-Z]+)* �̷��� ��ȣ ���ָ� ������ ���� ��� ���� ��� 									
		System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]+(\\.[a-zA-Z]+)*", email));
		
		
		// ���� -  6���� �̻�, ����(a-z), ����(0-9), ��ħǥ�� �Է�
		System.out.println("����");
		System.out.println(Pattern.matches("[a-z\\d[.]]{6,}@gmail[.]com", "abc123@gmail.com"));
		
		// ���� - 3���� �̻�, ���̵�� ���� �ҹ���, ����, ����(-), ����(_), ��ħǥ �� ���
		// ��, ��ħǥ�� ó���� ���� �Ǵ� �������� ��� �Ұ� (?) 
		//�� {0}���� �Ƿ���????!
		System.out.println("īī��");
		System.out.println(Pattern.matches(
									"[a-z\\d-_]{1}[a-z\\d-_[.]]+[a-z\\d-_]{1}@kakao[.]com*"
									, ".a_c.1-3@kakao.com"));
		System.out.println(Pattern.matches(
									"[a-z\\d-_]{1}[a-z\\d-_[.]]+[a-z\\d-_]{1}@kakao[.]com*"
									, "a_c.1-3.@kakao.com"));
		System.out.println(Pattern.matches(
									"[a-z\\d-_]{1}[a-z\\d-_[.]]+[a-z\\d-_]{1}@kakao[.]com*"
									, "whhhh.hhhy@kakao.com"));


		// ���̹� : 5-20������ ���� �ҹ���, ���ڿ� Ư�� ��ȣ(_), (-)�� ��� ����
		System.out.println("���̹�");
		System.out.println(Pattern.matches("[a-z\\d_-]{5,20}@naver[.]com", "abf_-51@naver.com"));

		
	
		
		
//________________________________________________________________________________________________________________		
		
		
		
		
		//Matcher Ŭ���� ����ϱ� 
		//�̰͵� �� ���°� �ƴ϶� ���߿� ����� ���� �� �س��� 
		
		
		String text = "apple/banana/orange/kiwi/pineapple/grape/grapeapple/mango";
		//apple�̶�� �� ã�ƺ��� ��ǥ���� �̿��ؼ� 
		
		//1. ����ǥ������ ������ �Ͽ� ���� �ν��Ͻ��� ����
		// group(1) group(2)
		Pattern applePattern = Pattern.compile("(\\w+)(apple)"); 
												//�׳� apple�� �� ã������ pineapple, grapeapple�� ã�������� 
		//2. �ش������ν��Ͻ��� ���ڿ��� �˻� 
		Matcher matchResult = applePattern.matcher(text);
		
		//3. ��ġ����� �ݺ����� Ȱ���� ��� Ž���� �� �ִ�. 
		//matchResult.find() : ã���� ������ true ������ false
		while(matchResult.find()) {   
			System.out.println("##############################################");
			System.out.println("Group 0 (��ü) ________________");
			System.out.println("ã�� �� : " + matchResult.group());
			System.out.println("ã�� �� : " + matchResult.group(0));
			System.out.println("���� �ε��� : " + matchResult.start());
			System.out.println("������ �ε��� : " + matchResult.end());
			
			//�̷��� �Ű������� ���ڸ� �������� ���� ���� �� 
			System.out.println("Group 1 (���� ǥ������ ù ��° ��ȣ) ________________");
			System.out.println("ã�� ����� ù ��° ��ȣ : " + matchResult.group(1));
			System.out.println("���� �ε��� : " + matchResult.start(1));
			System.out.println("������ �ε��� : " + matchResult.end(1));
			
			System.out.println("Group2 (���� ǥ������ �� ��° ��ȣ) ________________");
			System.out.println("ã�� ����� �� ��° ��ȣ : " + matchResult.group(2));
			System.out.println("���� �ε��� : " + matchResult.start(2));
			System.out.println("������ �ε��� : " + matchResult.end(2));
		}
	}
}
