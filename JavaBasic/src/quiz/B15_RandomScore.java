package quiz;

public class B15_RandomScore {

	public static void main(String[] args) {
		//1. �л� 100���� ����(0~100)�� �������� �����Ͽ� �迭�� ����. 
		int[] score = new int[100];
		for (int i = 0; i < score.length; ++i) {
			score[i] = (int)(Math.random() * 101);
		}
		System.out.println();
		System.out.println("___________________");
		
		//2. �迭�� ����� ���� ���� ���� ���·� ���
		for (int i = 0 ; i < score.length; ++i) {
			System.out.println("��������������");
			System.out.printf ("�� %3d ��\n", score[i]);
			System.out.println("��������������");
			
			if(i % 10 == 9 && i != 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("___________________");
		// 3. ��� �л����� ��� ������ ��� (�Ҽ� ��° �ڸ����� ���)
		int sum = 0;
		for (int i = 0; i < 100; ++i) {
			sum += score[i];
		}
		
		System.out.printf("���� : %d, ��� : %.2f \n", sum, sum / 100.0);
		//�� ������ �� �ٷ� sum/100.0�ٷ� printf()�� ���ᱸ��
		
		System.out.println();
		System.out.println("___________________");
		
		// 4. �迭�� ����� ���� �� ���� ���� ������ ���� ���� ������ ���
		int min = score[0];
		int max = score[0];
	
		//���� temp_min�̶� temp_max ���� ���� ���� ��µ� ���� ���� �ʿ� ������!	
		for(int i = 0; i<score.length; ++i) {	
			min = min <= score[i] ? min : score[i];
			max = max >= score[i] ? max : score[i];
			/*
			 if������ �غ���
			 if (best < score[i]) {
			 	best = score[i];
			 } �̷��� 100�� �ݺ��ϸ� ������ ���� ���� �ְ� ���� ���� ��. 
			 >> �̰� �������� ������
			 best = best < score[i] ? score[i] : best;
			 
			 if (worst > score[i]) {
			 	worst = score[i];
			 }
			 >> �̰� �������� ������
			 worst = worst > score[i] ? score[i] : worst;
			 
			 �׷��� ���⼭�� int worst�� 0���� �ʱ�ȭ �ϸ� ���� �̻��ϰ� ����. 0���� ���� ������ �����ϱ�!
			 �׷��� int worst = 100;���� ó���� 100���� �ʱ�ȭ ����� ��. 
			 int best = 0; 
			 int worst = 100; �̷���
			 */
			
		}
		
		System.out.printf("�ּҰ� : %d , �ִ밪 : %d\n", min, max);
		
		System.out.println();

		
		
	}
}
