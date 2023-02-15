package quiz;

import java.util.Arrays;
import java.util.Random;

public class B16����ver����_Array2Quiz {
	public static void main(String[] args) {
		Random ran = new Random();

		int[][] numArr = new int[][] { { 1, 1, 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1 },
				{ 1, 1, 1, 1 } };

		// 1. numArr �� ��� ���� 0~100 ������ ���� ������ �ٲٱ�
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] = ran.nextInt(101); // ran.nextInt(����=boundary) + ���۰�
			}
			System.out.println(Arrays.toString(numArr[i]));
		}

		// 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ����� ���
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		int size = 0; // ��հ� ���ϱ� ���� ũ��

		for (int i = 0; i < numArr.length; ++i) {
			int len = numArr[i].length;
			size += len;
			for (int j = 0; j < numArr[i].length; ++j) {
				sum += numArr[i][j];
			}
		}
		System.out.printf("���� : %d , ��� : %.2f\n", sum, sum / (double) size); // double�� Ÿ��ĳ���� �ؼ� ������� �Ǽ��� ��������~~

		// 3. numArr�� �� ��row �� ���� ���ؼ� ����ϱ�
		System.out.println("#####�ະ ����#####");
		int maxColumnSize = 0; // numArr�� ��� �� ���� ���̰� �� �迭�� ���̰�

		for (int i = 0; i < numArr.length; ++i) {
			int len = numArr[i].length;
			maxColumnSize = len > maxColumnSize ? len : maxColumnSize;
			// maxColumnSize = Math.max(len, maxColumnSize);
			// ���� �� �� ������ ���� ����! ���� �����ڵ��� ����

			int row_sum = 0; // �̰� ���⼭ ������ �ָ� fori�� ���������� ���� row_sum = 0; �� ���� �ʿ䰡 ����
			for (int j = 0; j < numArr[i].length; ++j) {
				row_sum += numArr[i][j];
			}
			System.out.printf("%d���� ���� : %d\n", i, row_sum);
		}

		// 4. numArr�� �� ��column�� ���� ���ؼ� ����ϱ� �ڡڡڡڡ� ���� ��� �򰥷��� �� �Ǵ� �� 
		
		System.out.println("#####���� ����####");
/*		//ver1. ������̷��� �귯���� ���
		//���η� �����ϴ� ���� ������ �ٺ��ʹ� ����ִ� ���� ����
		//��� �ִ� ���� ��� �Ƴ�
		System.out.println(maxColumnSize);
		for (int col = 0; col < maxColumnSize; ++col) {     //i j�� ���� ���� �������� �ٲ����ν� ȥ���� ���� �� �ִ�. 
			int colSum = 0;
			for(int row = 0; row < numArr.length; ++row) {
				//System.out.printf("i : %d , j : %d \n", i, j);
				if(col < numArr[row].length) {
					colSum += numArr[row][col];
					System.out.printf("col : %d, row : %d �� ���� ���߽��ϴ� .\n", col, row);
				} else {
					System.out.printf("col : %d, row : %d ���� ���� �������� �ʽ��ϴ�...\n", col, row);
				}
			}
			System.out.printf("%d���� �� : %d\n", col, colSum);
		}
	
		
*/		
		
		//���� ���� ��� �ڡڡڡڡڡڡڡڡڡ� �迭�� �̿�
		//ver2. ---->�������� �귯��
		int[] colSum = new int[maxColumnSize];
		
		for(int row = 0; row < numArr.length; ++row) {
			for(int col = 0; col < numArr[row].length; ++col) {
				colSum[col] += numArr[row][col]; //0�ϋ��� 0���濡 ���� 1�� ���� 1���濡 ��� ���� 
			}
		}
		System.out.println(Arrays.toString(colSum));
		//���� �ݺ����� ������� ���� �����
		//�ٵ� ���� �� �̰� �⺻ ���̵�.. �� ���߹�?.. �� ���� �� ���;� ��
		//��ȸ�� ���� �߻�� �䱸
		//���׺� �� �ƴϸ� �������� �ǵ� ��� ���� ���� 
	}
}
