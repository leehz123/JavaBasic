package quiz;

import java.util.Scanner;

public class B15����2��ƴٺ���_ShuffleText {
	/*
	 ����ڷκ��� ������ �Է¹����� �ش� ������ �������� �ڼ��� Ǯ���ϴ� ���α׷��� ��������. 
	 */
	public static void main(String[] args) {

/* 		//�� Ǯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ� �����̳� �Է��Ͻÿ�.>> ");
		String input = sc.nextLine();
		//���� ���ڿ� input�� char�� �迭 sentence�� ����ֱ�. 
		char[] sentence = new char[input.length()];
		
		for (int i = 0; i < input.length(); ++i) {
			sentence[i] = input.charAt(i);
		}
		
		//System.out.println("�Էµ� ������ : " + sentence);
		//�������̷��� �ϸ� sentence�迭�� �̻��ϰ� ��µ�. �ذ�å�� �Ʒ��� new String()�� �̿����ִ� ��. 
		System.out.println("�Էµ� ������ : " + new String(sentence));
		// new String �� new Scanner ó�� ��ü�� ���� ������ִµ�, �� �ȿ� ���� char�� �迭�� �� �� ����. 
		
		//���� ����
		char[] tmp = new char[1]; //�̰� ���� �迭�� ���� �ʿ� ���� �Ʒ� ����Ǯ�� ���� 
		//sentence�迭 �ȿ��� �ڼ��� 
		//(��ȯ���!!!!_�ȿ� �ִ� ���ڵ��� �������ֱ� ����. ���ڰ� �ߺ� �����ϰų� ������ų� �׷� ��츦 ����)
		//�� ��ġ�� ���ڸ� ������ �Ǵµ� �� ��ġ ��� ������ġ�� ��ĥ �� �ְ���. �ϳ��� ��ġ�� �����̸� ��. 
		//�ϳ��� �� tmp[0]���� ����
		for (int i = 0; i < 100; ++i) {	//���� �迭 ���̸�ŭ ���� �ʿ� ����. 	
				int random_index = (int)(Math.random() * sentence.length);
				tmp[0] = sentence[i];
				sentence[i] = sentence[random_index];
				sentence[random_index] = tmp[0];
		}
		
		System.out.print("��� : " + new String(sentence));	
*/		
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		//Ǯ�� ���� 1. tmp�� �ΰ� �ٲٱ�(��ȯ)
		char[] shuffled_text = text.toCharArray();//����Ÿ�� �迭�� �ٲٱ�ڡڡڡڡڡڡڡڡڡڡڡڡ� 
		
		for(int i =0; i < 100; ++i) {
			int x = (int)(Math.random() * shuffled_text.length);
			//int y = (int)(Math.random() * shuffled_text.length);
			
			
			
			//shuffled_text[x] = shuffled_text[y];
			//shuffled_text[y] = shuffled_text[x]; //�� ���ڸ� �ٲ� �� �̷��� �ϸ� �� ��.
			
			
			char temp = shuffled_text[x];
			shuffled_text[x] = shuffled_text[0];
			shuffled_text[0] = temp;
			//�̷��� char temp �� shuffled_text[x]�� �Űܳ��� �ٲٸ� ��. 
			//�� �� ������ �ʿ�� ����. �ϳ��� �� ���������൵ ��.�� 
		}
		System.out.println(shuffled_text);
		//�Ƹ����� ���� ����� ��Ÿ��. �ߺ��ǰ�~~ ������		
		
		//Ǯ�� ���� 2. �̾Ҵ� �� �� �̴� ��
		//shuffled_text = text.toCharArray();//���󺹱�
		//System.out.println(shuffled_text);
		
		//1. �Է� ���� ������ char�迭�� ��ȯ
		char[] original_text = text.toCharArray();
		
		//2. ������ ���̸�ŭ boolean�迭�� ����
		//�迭�� �뵵 : �̾Ҵ� ���ڴ� �ٽ� ���� �ʱ� ���� ǥ���س��� �뵵.
		boolean[] pick = new boolean[original_text.length];
		
		//3. ���ڿ��� ����� ���� ���� ��Ʈ������
		StringBuilder shuffled_text_builder = new StringBuilder("");  //() �³�?? ("") �̷��� �ؾ� �ϴ� �� �ƴ�???
		//System.out.println(shuffled_text_builder.length()); // ������ �������
		
		//4. ������ ���̰� 0���� �����ϸ鼭 .append()�� �� ���ھ� �߰��ϹǷ� 
		//   ���� ����� ���̰� �������� ��� ���ڸ� �߰��ϴ� ���� �Ϸ�.
		while(shuffled_text_builder.length() != original_text.length) {
			//5. ���� ��ġ(�ε���)�� �ϳ� ����
			int random_index = (int)(Math.random() * original_text.length);
			//6. �ش� �ε����� �̾Ҵ� ���� ������ �߰����� ����. 
			if(!pick[random_index]) { 
				//�̾Ҵ� ���� ������ false��. false�� �����. -> pick[random_index] ���� ����ǥ ! �̰� (false) �� ��� ����Ǵ� �Ŵϱ�.
				//���� ��� 10�� ó������ random_index�� �̾Ҵµ� pick�� 10�� ���� falses��.
				//�׸��� pick[random_index] = true;�� ���� 10�� true�� ��. 
				//�� �Ŀ� ���࿡ 10�� �ѹ� �� ������ true�̹Ƿ� if�� ���� ���๮�� ������� ����.  
				shuffled_text_builder.append(original_text[random_index]);
				pick[random_index] = true;
				}
		}
		System.out.println(shuffled_text_builder);
		
		
		
		
	}
}
