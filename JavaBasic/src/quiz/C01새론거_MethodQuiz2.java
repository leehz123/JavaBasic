package quiz;

import java.util.Arrays;
import java.util.Random;

public class C01���а�_MethodQuiz2 {

	// 1. ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �����ϴ� �޼���
	public static int getBasketCount(int apple, int basketSize) {
		//������ ��쵵 ���!!
		if (apple == 0) { //����� �߸����� ��� 
			return -2;
		} else if (apple < 0 || basketSize <= 0) {   //�ٱ��ϰ� �߸����� ���
			return -1; 
		} else if (apple % basketSize == 0) {
			return apple / basketSize;
		} else {
			return apple / basketSize + 1;
		}
	}
	// 2. ���ڿ��� �����ϸ� �ش� ���ڿ��� �������� �ڼ��� ����� ��ȯ�ϴ� �޼���
	//��� �̰� ó������ ��Ʈ�������� ����־ ������ Ǫ�°� �� ��ȿ�����̶� �׳� ver1�� Ǯ�� ��
	
	public static String strShuffle(String str) {		
		//���ڿ����� char�� �ٲٱ�
		Random ran = new Random();
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < 100; ++i) {
			int ran_index = ran.nextInt(arr.length);
			
			char temp = arr[0];
			arr[0] = arr[ran_index];
			arr[ran_index] = temp;
		}
		
		//�� ���� ���� char�迭�� ���ڿ��� ��ȯ�Ͽ� ����
		return new String(arr);		
	
	}
	
	//���ο� ���!!!!!!! ���� �����鼭 ã�ƺ��� �ܡܡܡܡܡܡܡܡܡܡܡܡ�
	public static String builderShuffle(String str) {
		StringBuilder builder = new StringBuilder(str);
		Random ran = new Random();
		for(int i = 0; i < 100; ++i) {
			int random_index = ran.nextInt(builder.length());
			char temp = builder.charAt(0);     //�� 0����??�� �ϴ� ù���� ������ �ھƳ��°ű��� 
			//�ش� �ε����� ���ڸ� �ϳ� ������
			builder.setCharAt(0, builder.charAt(random_index));
			builder.setCharAt(random_index, temp);
			//bulder.setCharAt(index, char) : �ش� �ε����� ������ ���ڷ� �����Ѵ�. 
			//������ ������µ� �� ����� ���ڸ� temp�� �������ϱ� �ٽ� �������� �� 
			
		}
		return builder.toString();
	}
	
	// 3. ���ڿ��� �����ϸ� �ش� ���ڿ��� �Ųٷ��� ���ڿ��� ��ȯ�ϴ� �޼���
	public static String strReverse(String str) {
		StringBuilder builder = new StringBuilder(str);
		return builder.reverse().toString();
	}
	public static String strReverse_re(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); ++i) {
			builder.insert(0, str.charAt(i));  //�� �´� �μ�Ʈ ���� ����!!!!
		}
		return builder.toString();
	}
	
	// 4. �޼��带 ȣ���ϸ� 1~45 ������ �ߺ� ���� ���� 8 ���� �̷���� �迭�� ��ȯ�ϴ� �޼���
	public static int[] getNum() {	
		Random ran = new Random();
		int[] lotto = new int[8];
		
		for(int i = 0; i < lotto.length; ++i) {
			 int ranNum = ran.nextInt(45) +1;
			 lotto[i] = ranNum;
			 
			 for(int j = 0; j < i; ++j) {
				 if (lotto[j] == ranNum) {
					 --i;
					 break;
				 }
			 }
		}
		return lotto;
	
	}
	
	
	public static void main(String[] args) {
		//1.
		int basketCount = getBasketCount(21, 8);
		//�޼����� ����� ������ ��Ƽ� Ȱ���ϴ� �ͱ��� �����ϱ�!!!
		switch (basketCount) {
		case -2:
			System.out.println("����� ������ �̻��մϴ�.");
		case -1:
			System.out.println("�ٱ����� ������ �̻��մϴ�.");
			break;
		default:
			System.out.println("�ʿ��� �ٱ��ϴ� " + basketCount + "�Դϴ�.");
		}
	
		System.out.println(getBasketCount(21, 8));
		//2.
		System.out.println(strShuffle("�ܹ���"));
		System.out.println(builderShuffle("����ŷ"));
		//3.
		System.out.println(strReverse("��⸸��"));
		//4.
		System.out.println(Arrays.toString(getNum()));
	}
}
