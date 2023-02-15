import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class D08_String_���ڵ��������� {
/*

 */

	
	public static void main(String[] args) {
		String fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		
		//split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�. 
		String[] split = fruits.split("/"); //���� ���� ���� �̸��� �ϳ��� �迭�� �� ����
		System.out.println(Arrays.toString(split));
		
		
		//join(delimiter, CharacterSequence... ) : �ڿ� ������ ���ڸ� delimiter�� �����ڷ� ��� �����Ѵ�. 
		//join(delimiter, iterable) : �迭(�Ǵ� ����Ʈ ��)�� ���� ���ڿ��� �����Ѵ�. 
		//iterable : for-each�� ���� �� �ִ� �͵� 
		//for-each�� ����Ϸ��� iterable�� ������ Ŭ�������� �ؼ� �׷�.
		String join = String.join("," ,"tiger", "lion", "bear", "hawk", "panda");
		System.out.println(join);
		
		join =String.join("/", split);
		System.out.println(join);  // "/"�� �߶��� �� �ٽ� "/"�� ���� �� 
		
		
		// CharacterSequence�� seq�� �ٿ��� �θ����� 
		//contains(seq) : ���ڿ��� �ش� ���ڰ� ���ԵǾ� �ִ����� �˻�.   
		System.out.println("orange? : " + fruits.contains("orange"));
		System.out.println("peach? : " + fruits.contains("peach"));
	
		//startsWith(seq) : �ش� ���ڷ� �����ϴ��� �˻�
		String url = "http://www.naver.com";
		System.out.println("www�� �����ϳ���? : " + url.startsWith("www"));
		System.out.println("http�� �����ϳ���? : " + url.startsWith("http"));
		System.out.println("https�� �����ϳ���? : " + url.startsWith("https"));
		
		//endsWith() : �ش� ���ڷ� �������� �˻�. 
		String fileName = "screenshot.pdf";
		System.out.println(".pdf�ΰ���? : " + fileName.endsWith(".pdf"));
		System.out.println(".jpg�ΰ���? : " + fileName.endsWith(".jpg"));
		System.out.println(".gif�ΰ���? : " + fileName.endsWith(".gif"));
		
		
		//replace(old, new) : ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�Ѵ�. 
		String email = "billgates@microsoft.com";
		email.replace("microsoft.com", "naver.com");
		System.out.println(email); //�̷��� �ϸ� �������״�� ����. �ڡڼ����� ���ڿ��� �������ִ� ���� �� ������ �����Ѵٴ°� �ƴ� ����!
		
		String replaced = email.replace("microsoft.com", "naver.com");
		System.out.println(replaced); //�̷��� �ٸ� ���� ��Ƽ� ����ϸ� ��	
		
		//substring(start) : ���ڿ��� ���� ��ġ���� �ڸ� ����� ��ȯ. �ڡ��̰͵� ������ �ٲٴ� �� �ƴ϶� �ٱ� ����� ��ȯ�ϴ� ��! 
		System.out.println(email.substring(5));
		//substring(start, end) :���ڿ��� start���� end�̸����� �ڸ� ����� ��ȯ
		System.out.println(email.substring(5, 10)); //5,6,7,8,9���� ������ ��
		
		//�ڴٸ� �޼ҵ�鵵 �׻� ������ �����̰� ���� �̸����� ���� �� ����. Math.random()�� �׷��� RandomŬ������ .nextInt()�� �׷�
		
		//toUppercase() : ���ڿ��� ���ĺ��� ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� �ڡڹ�ȯ�Ѵ�. 
		System.out.println(email.toUpperCase());
		System.out.println("���� : " + email);
		//toLowercase() : ���ڿ��� ���ĺ��� ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� �ڡڹ�ȯ�Ѵ�. 
		System.out.println(email.toLowerCase());
		System.out.println(email.toLowerCase().toUpperCase().toLowerCase().toUpperCase()); //�̷��� �峭ġ�� �͵� ���� 
		System.out.println("���� : " + email);
		//���� �������� ������ ��ġ�� �ʴ´�. 
		
		
		//# �޼���ü�̴�
		char[] arr = email.substring(10).toUpperCase().toCharArray(); //�̷��� ���� �޼��带 �ѹ��� ó���ϴ� �͵� ����. ����� �� ��� ����� �� ���...
		System.out.println(arr);
		
		
		
		
		
		//indexOf(seq) : ���ϴ� ���ڿ��� ���° �ε����� �ִ��� ��ȯ�Ѵ�. 
		System.out.println("@�� ��ġ : " + email.indexOf("@"));
		System.out.println(email.substring(email.indexOf("@"))); //�̷��� �ص� �ǁٱ�
	
		//�׸��� �ε��� ã���ִ°� �ѱ��� �ƴϾ �������ڷε� �� �� �� ���� �׷��� ù������ �ε����� ��ȯ�ϰ��� 
		System.out.println("m�� ��ġ : " + email.indexOf("microsoft"));
		
		
		//���ڿ�.indexOf(int ch) 
        // ����(char) �� ������ �����ڵ�(ex. a �� 97) �� �ش� ���ڿ��� ���° �ε����� �ִ��� ��ȯ. 
		System.out.println("@�� ��ġ : " + email.indexOf('@'));
		String alph = "abcd";
		System.out.println(alph.indexOf(99));
		
		
		//indexOf(seq, from) : from���� ���ϴ� ���ڿ��� ���° �ε����� �ִ��� ��ȯ�Ѵ�.
		String test = "apple@naver.com, abc@yahoo.com, ddd@hanmail.net";
		System.out.println(test.indexOf('@', 6));
				
		
		
		
		
		//String.format(format, args...) : ���ϴ� ���ڿ��� ������ �̿��� ���� ����.
		
		
		
		
//��������............................................................................................
		
		
		// ��� "apple"�� �ε����� ã�� ����غ�����. (pineapple�� apple�� ���;� ��)
		
		fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		
		

//���� Ǯ��

		int index = -1, i = 0;
		while((index = fruits.indexOf("apple", index + 1)) != -1) {
			System.out.printf("%d��° apple�� ��ġ : %d\n", i++, index);
		}
	

		

//������ ������ �� Ǯ��
		
//		int index = fruits.indexOf("apple");
//		System.out.println(index);
//		while(index != -1) {
//			index = fruits.indexOf("apple", index+1);
//			System.out.println(index);			
//		}

		
		
		
		
		/* �� ó�� �� �ڵ�... �� ��� 
		 ArrayList<Integer> list = new ArrayList<>();
		int deadIndex = 0;
		while(fruits.indexOf("apple", deadIndex) != -1) {
			int appleIndex = fruits.indexOf("apple", deadIndex); //�̷��� �ϸ� �Ƿ��� 
			if(appleIndex != -1 ) {
				list.add(appleIndex);
				deadIndex = appleIndex + 1;
			}	
		}
		System.out.println(list);
		 */
		
		
		
	}
}
