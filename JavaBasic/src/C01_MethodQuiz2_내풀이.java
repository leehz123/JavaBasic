

import java.util.Arrays;
import java.util.Random;

public class C01_MethodQuiz2_��Ǯ�� {
	//	1. ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �����ϴ� �޼���
	public static int appleBasket(int apple, int basketSize) {
		return apple % basketSize == 0 ? apple / basketSize : apple / basketSize + 1;	
	}

	//	2. ���ڿ��� �����ϸ� �ش� ���ڿ��� �������� �ڼ��� ����� ��ȯ�ϴ� �޼���
	public static String shuffleText(String str) {
		char[] strArr = str.toCharArray();//���ڿ��� ���ڹ迭��
		boolean[] strIndexArr = new boolean[strArr.length]; //���ڹ迭�� �ε����� �����ϴ� �Ҹ���迭
		StringBuilder builder = new StringBuilder(); //�������� ���� ���� �ϳ��� append�� ��Ʈ������
		
		Random ran = new Random();
		
		while(builder.length() != strArr.length) {  // for�� index�� 0~strArr�迭�� ��������ұ����� �ϸ� �� ��.  
			int randomIndex = ran.nextInt(strArr.length);//���ڹ迭�� �ε��� �߿��� �����ε��� �̱�
			
			if(strIndexArr[randomIndex]==false) {
				builder.append(strArr[randomIndex]);
				strIndexArr[randomIndex] = true;
			}	
		}
		
		return builder.toString();
	}
	
	//	3. ���ڿ��� �����ϸ� �ش� ���ڿ��� �Ųٷ��� ���ڿ��� ��ȯ�ϴ� �޼��� 
	public static String stringReverse(String str) {
		StringBuilder reverse = new StringBuilder();
		char[] sentence = str.toCharArray();
		for(int index = sentence.length-1; index >=0; --index) {
			reverse.append(sentence[index]); 
		}
		return reverse.toString();
	}
	
	//	4. �޼��带 ȣ���ϸ� 1~45 ������ �ߺ� ���� ���� 8 ���� �̷���� �迭�� ��ȯ�ϴ� �޼��� 
	public static String lotto() {
		Random ran = new Random();
		
		int[] lotto = new int[8];
			
		for(int index = 0; index < lotto.length; ++index) {
			int newNum = ran.nextInt(46) + 1; //1~45���� ���� (������ 46���� ����!)
			lotto[index] = newNum;
			for(int chk = 0; chk < index; ++chk) {
				if(lotto[index] == lotto[chk]) {
					--index;
					break;
				}
			}
		}
		return Arrays.toString(lotto);
	}
 	
	public static void main(String[] args) {
		System.out.println(appleBasket(18, 10));
		System.out.println(shuffleText("chicken"));
		System.out.println(stringReverse("���ġŲ"));
		System.out.println(lotto());
	
	
	}
	
}
