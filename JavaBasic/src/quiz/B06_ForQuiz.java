package quiz;

public class B06_ForQuiz {
	public static void main(String[] args) {
		/*
		 //1. 100���� 300������ ���� 
		 int sum = 0; 
		 for(int i=100;i<301;i++) { 
		 sum += i; 
		 }
		 System.out.println(sum);
		 
		 //2. 1���� 2000������ 7�� ����� ����غ�����. 
		 for (int i=1;i<2001;i++) { if(i%7==0) {
		 System.out.println(i); } }
		 
		 //3. 1000���� 1500������ 10�� ����� �� �ٿ� 10���� ��µǵ��� ��������. 
		 int count = 0; 
		 for (int i=1000; i<1501; i+=10) { 
		 count += 1; System.out.print(i+" ");
			if((count+1)>10) { 
			System.out.println(); count = 0; 
			//�����ο��� i+=10�ϴ� �� ���� ����. �ֳĸ� i �� 98���� ������ �� ��������. 
			} 
		}
		 */

		// 1. 100���� 300������ ����
		int sum = 0;

		for (int num = 100; num <= 300; ++num) {
			sum += num;
		}
		System.out.println(sum); // 40200
		
		// 2. 1���� 2000������ 7�� ����� ����غ�����.
		for (int num = 1; num <= 2000; ++num) {
			if (num % 7 == 0) {
				System.out.println(num);
			}
		}
		for (int num = 1, cnt = 1; num <= 2000; ++num) {
			if (num % 7 == 0) {
				System.out.printf("%d��° 7�� ����� %d�Դϴ�.", cnt++, num);
				// �̷��� �ϸ� ����� �� ������ cnt�� ������. ������ �� �����Ŀ��� �������Ѿ� �ϴ� �� �ƴ�.
				// ������ ������Ű�� ���� ������ ����~
			}
		}
		
		// 3. 1000���� 1500������ 10�� ����� �� �ٿ� 10���� ��µǵ��� ��������.
		for (int num = 1000, cnt = 0; num <= 1500; ++num) {
			if (num % 10 == 0) {
				System.out.printf("%-6d", num);
				if (cnt++ % 10 == 9) {
					// cnt�� 0�϶����� ���� cnt�� 9�� �Ǿ��� �� %10�� �غ��� 9�� ���� �ٲٰڴ�.
					System.out.println();
				}
			}
		}

		
	}
}
