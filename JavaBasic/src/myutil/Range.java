package myutil;

//public�� �տ� ���̸� �ٸ� ��Ű�������� ������ �� �� �ְ� �ȴ�. 
public class Range {
	int start;
	int end;
	int incre;   //�����ϰ� ����� �غ� �ϴ� ��
	
	int length;
	public int[] range;
	
	
	
	public Range(int end) { // �ȿ� ������ ���� �� ¥�� ���� ���ð踶�� ����ȿ��~~~ Ÿ�� �������� ��������~~
		this (0, end, end < 0 ? -1 : 1);
	}

	public Range(int start, int end) {
		this(start, end, start > end ? -1: 1);	
		}
	public Range(int start, int end, int incre) {
		this.start = start;
		this.end = end;
		this.incre = incre;
		
		this.length = length();
		this.range = range();
	}
		int length() {
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
		
		int[] range() { //�굵 �Ű����� ���� �ʿ� ���� �̹� �˰� �����ϱ�!!!!!!!!!!!!!!!!!!!!!!!    ??????

			int[] arr = new int[length];
			
			for(int i = 0; i < length; ++i) {
				arr[i] = start + incre * i;
			}
			return arr;
 	}
	
	
}

