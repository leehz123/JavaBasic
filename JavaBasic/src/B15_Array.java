
public class B15_Array {
/*	
# �迭 (Array)
���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ����. 
���� �̸����� ������ ������ ������ �Ŀ� �ε����� ������ �� �ִ�. 
�迭�� ����� ���ÿ� ũ�⸦ ���ؾ� �Ѵ�. 
ũ�Ⱑ �������� ���� ũ�⸦ ������ �� ����. 
�迭�� ���ȣ(�ε���)�� 0���� ��ü ���� -1 ���� �ִ�. 
Java�� �迭�� ������ ���ÿ� ��� ���� �ʱ�ȭ �Ǿ� �ִ�.
���� : 0 / �Ǽ� : 0.0 / boolean : false / ������ : null

#�迭 ���� ���
1. Ÿ��[] ������ = new Ÿ��[ũ��];
2. Ÿ��[] ������ = {��1, ��2, ��3, ��4, ...};
3. Ÿ��[] ������ = new Ÿ��[] {��1, ��2, ��3, ��4, ...};

*/	
	public static void main(String[] args) {
		
		//�迭�� ���̰� 3�� �� �� ��ȣ�� 2������. 
		int[] score = new int[5];
		score[0] = 99;
		score[1] = 80;
		score[2] = 70;
		//score[3] = 60; ������. 
		System.out.println("score�� ���� : " + score.length);  //�迭�� ���̸� �� �� .length�� ��ȣ �� ����
		// str.length();   array.length;
		System.out.println(score[3]);
		System.out.println(score[4]);
		//�迭�� �ʱ�ȭ ���� �ʾƵ� ��� ����. (�ʱⰪ 0)
		
		//intŸ�� ���� 1000�� ������ �Ͱ� ����
		int[] num = new int[1000];
		num[0] = 5;
		num[1] = 3;
		num[2] = 4;
		
		//char[]�� �ڹٿ��� ���� ���ڿ� ��� ����. ���ڿ��̳� �ٸ� ����. 
		char[] text = new char[100];
		text[0] = 'h';
		text[1] = 'e';
		text[2] = 'l';
		text[3] = 'l';
		text[4] = 'o';
		
		boolean[] complete = new boolean[5];
		for (int i = 0; i < complete.length; ++i) {		
			System.out.printf("complete[%d] : %b \n", i, complete[i]);
		}
		
		
		//�迭 �����ϱ� 
		short[] eye_power = new short[10];
		long[] money = {123L, 234L, 5, 6, 789L}; 
		// long Ÿ�Ը� ���� �� �ִ� �� �ƴ�. 
		// int���� �����ڳ�. �ڿ������� Ÿ��ĳ����(�������ȯ?)
	
		String[] name = new String[] {"��ö��", "��ö��", "��ö��", "��ö��"};
		
		//�� ����
		name[3] = "������"; //��ö�� ������ ������ �� 
		//�迭�� ���� ���� ����ϱ� 
		for(int i = 0; i < name.length; ++i ) {
			System.out.println(name[i]);
		}
		
		//String Ÿ���� char[]Ÿ������ ��ȯ�Ͽ� ��� ����
		String welcomeMessage = "Hello, world!!";
		char [] msg = welcomeMessage.toCharArray();
		System.out.println(msg[0]);
		System.out.println(msg[msg.length - 1]); //����������
		System.out.println(msg[msg.length - 2]); //�ڿ��� �� ��° ����
		System.out.println(msg[msg.length - 3]); //�ڿ��� �� ��° ����
		System.out.println(msg[msg.length - 4]);
		System.out.println(msg[msg.length - 5]);
		
		//�ڡ�String�� ���� �ϳ��� ������ ������ �� �ִ� ����� ����.
		//�ٵ� String[]�迭�� �װ� �����ϴٴ� ����~~~~~!!!
		
	}
}
