package myutil;

//public을 앞에 붙이면 다른 패키지에서도 가져다 쓸 수 있게 된다. 
public class Range {
	int start;
	int end;
	int incre;   //유용하게 사용할 준비를 하는 것
	
	int length;
	public int[] range;
	
	
	
	public Range(int end) { // 안에 일일이 로직 다 짜지 말고 물시계마냥 낙수효과~~~ 타고 내려가요 내려가요~~
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
		
		int[] range() { //얘도 매개변수 써줄 필요 없음 이미 알고 있으니까!!!!!!!!!!!!!!!!!!!!!!!    ??????

			int[] arr = new int[length];
			
			for(int i = 0; i < length; ++i) {
				arr[i] = start + incre * i;
			}
			return arr;
 	}
	
	
}

