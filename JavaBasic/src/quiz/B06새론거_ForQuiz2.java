package quiz;

import java.util.Scanner;

public class B06���а�_ForQuiz2 {
//1. ����ڷκ��� ���ڸ� �Է� ������ 1���� �ش���� ���̿� �ִ� 5�� ����� �� �ٿ� 7 ���� ��� ����غ�����. 
//	������ �Է¹޴� ��쿡�� �����ؾ� ��. 
	public static void main(String[] args) {
		/*
		 System.out.println("���ڸ� �Է��ϼ���."); 
		 Scanner sc = new Scanner(System.in); 
		 int num = sc.nextInt();
		 
		 if(num>=1) { 
		 	for(int i=1, cnt=0; i<=num;i++) { 
		 		if(i%5==0) { 
		 			System.out.printf("%-4d",i); 
		 				if(cnt++ %7 == 6) { 
		 					System.out.println(); 
		 				} 
		 			} 
		 		}
		  } else { 
		  		for(int i=1, cnt=0; i>=num;i--) { 
		  			if(i%5==0) {
		  				System.out.printf("%-4d",i); 
		  				if(cnt++ %7 == 6) { 
		  					System.out.println(); 
		  				} 
		  			} 
		  		}
		  	}
				 */

		Scanner sc = new Scanner(System.in);
		int userNum;
		System.out.println("���� >>");
		userNum = sc.nextInt();

		int startNum, endNum;
		// �ڡڡ� ����� ���� ���� ������ ���� ���� ���̴� ���� �ѹ��� ���ѹ��� �ٸ��ٴ� ��!�� �̿�
		if (userNum > 1) {
			startNum = 1;
			endNum = userNum;
		} else {
			startNum = userNum;
			endNum = 1;
		}
		//�̷��� startNum, endNum ������ ���Ͻ����� ������ for�������� �� ������ ���. ���� �� �������� 
		
		for (int num = startNum, cnt = 0; num < endNum; ++num) {
			if (num % 5 == 0) {
				System.out.printf("%+-8d", num); // "%+-8d"�� ��ȣ�� �ٿ��ְڴ� �Ҹ��ڡڡ�
				if (cnt++ % 7 == 6) {			//�ڡڡ�cnt�� 0~6����. �׷��� 7���� ����ϰ� ���� �ٳѱ�
					System.out.println();
				}
			}
		}

	}

}
