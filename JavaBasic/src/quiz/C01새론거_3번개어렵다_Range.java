package quiz;

import java.util.Arrays;

/*
#�޼��� �����ε� Method Overloading
�ڹٿ����� ���� �̸��� �޼��带 ���� �� ������ �� �ִ�.
�̸��� ���� �޼��忩�� �Ű������� Ÿ�� �Ǵ� ������ �ٸ��ٸ� �ٸ� �޼���� �νĵȴ�.  
(�Ʊ� �ߴ� �͵� ������ �����ε�)
 
 */

public class C01���а�_3������ƴ�_Range {
	public static void main(String[] args) {
		//1. �ִ밪�� �Ű������� ���޹����� 0~�ִ밪 �̸��� ��� ���� �����ϴ� int�迭�� �����ϴ� range�޼��带 ��������.
		//ex. range(10) >> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(Arrays.toString(range(10)));
	
		//������ ������ ���� ���� 
		for(int i : range(10)) {  //�迭�� ������ �ϳ��� ������� �����鼭 ������ �� �� ����.
			System.out.println("i : " + i);
		}
		//forEach �� : ������ �ִ� �͵��� �ϳ��� ���ʴ�� ������ �ݺ��ϴ� ����
		//������ ���� �͵鵵 ���� �� �ֱ� �ѵ� �׷��� ������ �͵��̶� �ٲ���
		//forEach �� : ������ �͵��� �ϳ��� ���ʴ�� ������ �ݺ��ϴ� ����
		//�ٵ� String�� �� �ǳ� �׷��� StringBuilder�� �� �Ƿ���
		for (char c : "ABCD".toCharArray()) {
			System.out.println("c : " + c);
		}
		
		//2. �ּҰ��� �ִ밪�� �Ű������� ���޹����� �ּҰ����� �ִ밪 �̸��� ��� ���� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� range�޼��带 ����� ������.
			//range(10, 15) >> [10, 11, 12, 13, 14]
			// �� range(15, 10)�� ��� >> [15, 14, 13, 12, 11]
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		
		//3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹����� �ּҰ����� �ִ밪�̸����� ��������ŭ �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� range�޼��带 ��������.
			// range(30, 40, 3) >> [30, 33, 35, 39]
			// range(40, 45, 5) >> [40]
			// range(40, 30, -2) >> [40, 38, 36, 34, 32]
		System.out.println(Arrays.toString(range(30, 40, 3)));
		
		
		
		System.out.println(Arrays.toString(range(10, 18, 2)));
		System.out.println(Arrays.toString(range(10, 19, 2)));
		System.out.println(Arrays.toString(range(19, 10, 2))); //���� null�� ����
		System.out.println(Arrays.toString(range(20, 10, -2)));
		
		
		//������������������������������������������������������������
		//������ФФФФФФФФФФ�myutillȰ���� �����ФФФФФФФФФФФС�������
		myutil.Range r = new myutil.Range(10, 20);
		//���࿡ myutil �� ġ�� ������ import���ָ� ��!
		myutil.Range r2 = new myutil.Range(10, 20);
		myutil.Range r3 = new myutil.Range(-5);
		
		System.out.println(Arrays.toString(r.range));
		System.out.println(Arrays.toString(r2.range));
		System.out.println(Arrays.toString(r3.range));
		//�����ڸ� ����� ���ÿ� ����� �� �Ź��� ��
		//������������������������������������������������������������
	}
	
	
	//1.
	public static int[] range(int end) {
		int[] arr = new int[end];
		for (int num = 0; num < arr.length; ++num) {
			arr[num] = num;
		}
		return arr;
	}
	
	//2.  �ߡߡߡߡߡߡߡߡߡߡߡ� �����ڵ� �������� �ߡߡߡߡߡߡߡߡߡߡߡߡ�
	public static int[] range(int start, int end) {
		int[] arr = new int[Math.abs(start-end)];

			//start���� ������ 1�� �����ϰ� , start ���� ������ 1�� �����ϵ��� 
			int incre = start < end ? 1 : -1;
			
			for (int i = start, index = 0; i != end; i +=incre) {
				//�ʱⰪ�� �ΰ� �̻� ������ �� �ִ� �׷��ڳ�!! ������������������������
				arr[index++] = i;
				//�׸��� �ε����� ���⼭ ���������ִ±��� �� �̷� ���� �ڲ� ����� �� ���� �� ����
			}
		return arr;
	}
	
	//3. ��������������������������ƾƾƾƾƾƾƤ��ƾƾƾơ����������������������������
	//�ϴ� �迭�� ���̺��� ������� �ϹǷ� �迭�� ���� ���ϴ� �޼��� ����� 
	public static int length(int start, int end, int incre) {
		int diff = end - start;
		//System.out.printf("start : %d, end : %d, incre : %d", start, end, incre);
		
		int length = diff / incre;
		if (length < 0) {
			return 0;	
		}
		length += diff % incre == 0 ? 0 : 1 ;
		//System.out.println("length : " + length);
		return length;
	}
	

	public static int[] range(int start, int end, int incre) {
		//�̰� �� ��û ���� Ǯ����................
		//�迭 ���� �ʿ��ؼ� length2�Լ� ����. 
		int len = length(start, end, incre);
		int[] arr = new int[len];
		
		for(int i = 0; i < len; ++i) {
			arr[i] = start + incre * i;
		}
		return arr;
	}
	
	
	
	
}


	

	
	

	