package quiz;

import java.util.Arrays;
//�迭 ���� �ߴµ� �����Ÿ� ��
public class B15�ܿ�ǯ_��������ϱ�_Lotto {
	public static void main(String[] args) {
		/*
				//1.	1~45 �ߺ� ���� �������� 7���� �����Ͽ� ��÷ ��ȣ�� ��������.
				
				int[] winning_number = new int[7];
				for(int i = 0; i < 7; ++i) {
				int random_num = (int)(Math.random() * 45 + 1);	
				winning_number[i] = random_num;
				}
				System.out.print("��÷��ȣ : ");
				for(int i = 0; i < winning_number.length; ++i) {
					System.out.print(winning_number[i]);
					System.out.print(" / ");
				}
				
				
				
			//2.  ��÷ �� ������ ���� ��ȣ�� ������ �Ŀ� �� ȸ���� ��÷�ƴ��� ����غ�����.  (���� �޶� ��)
				//�� �׷� �迭 �̿��ϸ� �ǰڳ�!!!!!!!
				StringBuilder 
				while(true) {
					int random_num = (int)(Math.random() * 45 + 1);
					if(winning_number[0] == random_num) {
						while(true) {
							int random_num = (int)(Math.random() * 45 + 1);
							if(winning_number[1] == random_num) {
								
							}
						}
					}	
				}	
		*/
		// ����Ǯ��
		// 1. �ߺ� ���� ���� �����
		/*		int[] win = new int[7];
				for (int i = 0; i < win.length ; ++i) {
					win[i] = (int)(Math.random()*45+1);	
				}
				System.out.println(win);
				//int�� ����� �״�� ����ϸ� �̻��ϰ� ����  >> [I@69222c14
				//Arrays.toString(arr); ������ �迭�� ���� ���� ���ڿ��� ����� ��ȯ. 
				System.out.println(Arrays.toString(win));
				//�ٵ� �̷��� �ϸ� �ߺ��� ���� �� ���� ..
			
			//�׷� �ߺ� ���Ÿ� ��� �ϴ���
		*/ // ���ڸ� �̰� �տ� �ִ� ���ڸ� �ϳ��� �� �񱳸� �غ���

		// �Ʒ�ó�� �غ���(�������� �̾Ƽ� ������� ä��µ� �ߺ� �߰��ϸ� �����ϸ鼭 ä��� ���)
		int[] win = new int[7];

		// win�� i��°�� �������ڸ� ����ֱ� ���� for��
		for (int i = 0; i < win.length; ++i) {

			int newNum = (int) (Math.random() * 45 + 1);
			System.out.printf("�̹��� ���� ���� ��ȣ�� %d�Դϴ�.\n", newNum);
			System.out.printf("%d��° ���ڸ� �̴� �� �Դϴ�.\n", i);
			win[i] = newNum;
			// ���� i��°�� ���� ���ڿ� ������ ���� ���� �߿� ��ġ�°� �ִ��� �����ϴ� for��
			for (int j = 0; j < i; ++j) {
				System.out.printf("������ ���ڵ��� �������Դϴ�. win[%d] : %d\n", j, win[j]);
				// ���� �߿� �ߺ��� �߰��ϸ� �ߺ��� ã������ �˸��� ���並 �ߴ��� �� ���� i�� �Ѿ��.
				if (newNum == win[j]) {
					System.out.println("�ߺ��� ã�Ҵ�!");
					--i; // i��° ���ڸ� �ٽ� �̱� ���ء�
					break;
				}
			}
		}
		System.out.println("��÷��ȣ : " + Arrays.toString(win));

		// 2. ��÷ �� ������ ���� ��ȣ�� ������ �Ŀ� �� ȸ���� ��÷�ƴ��� ����غ�����. (���� �޶� ��)
		System.out.println("~~~~~~~~~~~��÷��ȣ�� �����غ��ô�~~~~~~~~~~");

		/*		
				int[] predict = new int[7]; 
				int cnt = 0;
				int hit_cnt = 0;
				while(true) {
					for (int k = 0; k < predict.length; ++k) {
						int newNum = (int) (Math.random() * 45 + 1);
						predict[k] = newNum;
						for(int l = 0; l < k; ++l) {
							if (predict[l] == predict[k]) {
								--k;
								break;
							}
						}
					}
					//������ ��� ���� ��ġ ã�� �ڵ�
					for(int m = 0; m < win.length; ++m) {
						++cnt;
						for(int n = 0; n < predict.length; ++n) {
							if (predict[m] == win[n]) {
								++hit_cnt;
							}
						}
						if(hit_cnt == 7) {
							System.out.printf("%d���� �ζ� ��ȣ ���� ���� ��÷��ȣ�� ������ϴ�.", cnt);
							System.out.println("������ ��÷��ȣ�� : " + Arrays.toString(predict));
							return;
						}
					}
					
					hit_cnt = 0;
				}
		
		*/

		while (true) {
			//������ȣ �迭 �����
			int auto_cnt = 0;
			int[] auto = new int[7];
			
			for (int i = 0; i < auto.length; ++i) {
				int newNum = (int) (Math.random() * 45 + 1);
				auto[i] = newNum;
				for (int j = 0; j < i; ++j) {
					if (newNum == auto[j]) {
						--i;
						break;
					}
				}
			}
			++auto_cnt;

			// ��ġ�ϴ� ��ȣ ���� ����
			int cnt = 0;
			for (int i = 0; i < auto.length; ++i) {
				for (int j = 0; j < win.length; ++j) {
					if (auto[i] == win[j]) {
						++cnt;
						break;
					}
				}	
			}
			if (cnt >= 7) {
				System.out.printf("1�� ��÷ (%dȸ �õ���)\n", auto_cnt);
				System.out.println("��÷��ȣ : " + Arrays.toString(auto));
				return;
			} //else if (cnt >= 6) {
//				System.out.printf("2�� ��÷(%dȸ �õ���)\n", auto_cnt);
//				System.out.println("��÷��ȣ : " + Arrays.toString(auto)); //�� win�ƴ��� �ʳ�?
//				return;
//			}
		}

		
		
		
		
		
	}
}
