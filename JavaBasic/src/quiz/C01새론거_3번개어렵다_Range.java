package quiz;

import java.util.Arrays;

/*
#메서드 오버로딩 Method Overloading
자바에서는 같은 이름의 메서드를 여러 개 선언할 수 있다.
이름이 같은 메서드여도 매개변수의 타입 또는 개수가 다르다면 다른 메서드로 인식된다.  
(아까 했던 것도 생성자 오버로딩)
 
 */

public class C01새론거_3번개어렵다_Range {
	public static void main(String[] args) {
		//1. 최대값을 매개변수로 전달받으면 0~최대값 미만인 모든 값을 포함하는 int배열을 생성하는 range메서드를 만들어보세요.
		//ex. range(10) >> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(Arrays.toString(range(10)));
	
		//베열로 받으면 편리한 점이 
		for(int i : range(10)) {  //배열의 값들을 하나씩 순서대로 꺼내면서 응용을 할 수 있음.
			System.out.println("i : " + i);
		}
		//forEach 문 : 순서가 있는 것들을 하나씩 차례대로 꺼내며 반복하는 문법
		//순서가 없는 것들도 꺼낼 수 있긴 한데 그러면 나열된 것들이라 바꾸쟝
		//forEach 문 : 나열된 것들을 하나씩 차례대로 꺼내며 반복하는 문법
		//근데 String은 안 되네 그러면 StringBuilder도 안 되려나
		for (char c : "ABCD".toCharArray()) {
			System.out.println("c : " + c);
		}
		
		//2. 최소값과 최대값을 매개변수로 전달받으면 최소값부터 최대값 미만의 모든 값을 포함하는 int배열을 생성하여 반환하는 range메서드를 만들어 보세요.
			//range(10, 15) >> [10, 11, 12, 13, 14]
			// ★ range(15, 10)의 결과 >> [15, 14, 13, 12, 11]
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		
		//3. 최소값과 최대값과 증가값을 매개변수로 전달받으면 최소값부터 최대값미만까지 증가값만큼 증가하는 int배열을 생성하여 반환하는 range메서드를 만들어보세요.
			// range(30, 40, 3) >> [30, 33, 35, 39]
			// range(40, 45, 5) >> [40]
			// range(40, 30, -2) >> [40, 38, 36, 34, 32]
		System.out.println(Arrays.toString(range(30, 40, 3)));
		
		
		
		System.out.println(Arrays.toString(range(10, 18, 2)));
		System.out.println(Arrays.toString(range(10, 19, 2)));
		System.out.println(Arrays.toString(range(19, 10, 2))); //여긴 null이 나옴
		System.out.println(Arrays.toString(range(20, 10, -2)));
		
		
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//■■■■■ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠmyutill활용한 문제ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ■■■■■■■
		myutil.Range r = new myutil.Range(10, 20);
		//만약에 myutil 안 치고 싶으면 import해주면 됨!
		myutil.Range r2 = new myutil.Range(10, 20);
		myutil.Range r3 = new myutil.Range(-5);
		
		System.out.println(Arrays.toString(r.range));
		System.out.println(Arrays.toString(r2.range));
		System.out.println(Arrays.toString(r3.range));
		//생성자를 만드는 동시에 계싼이 다 돼버린 것
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	}
	
	
	//1.
	public static int[] range(int end) {
		int[] arr = new int[end];
		for (int num = 0; num < arr.length; ++num) {
			arr[num] = num;
		}
		return arr;
	}
	
	//2.  ◆◆◆◆◆◆◆◆◆◆◆◆ 정답코드 참고하쟈 ◆◆◆◆◆◆◆◆◆◆◆◆◆
	public static int[] range(int start, int end) {
		int[] arr = new int[Math.abs(start-end)];

			//start값이 작으면 1씩 증가하고 , start 값이 높으면 1씩 감소하도록 
			int incre = start < end ? 1 : -1;
			
			for (int i = start, index = 0; i != end; i +=incre) {
				//초기값에 두개 이상 지정할 수 있다 그랬자나!! 오오오오오오오오오오오오
				arr[index++] = i;
				//그리고 인덱스를 여기서 증가시켜주는구나 나 이런 형태 자꾸 낯설어서 안 쓰는 것 같음
			}
		return arr;
	}
	
	//3. ■■■■■■■■■■■■■■■■■■■■■■으아아아아아아아ㅏ아아아아■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//일단 배열의 길이부터 구해줘야 하므로 배열의 길이 구하는 메서드 만들기 
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
		//이건 또 엄청 쉽게 풀리넹................
		//배열 길이 필요해서 length2함수 만듦. 
		int len = length(start, end, incre);
		int[] arr = new int[len];
		
		for(int i = 0; i < len; ++i) {
			arr[i] = start + incre * i;
		}
		return arr;
	}
	
	
	
	
}


	

	
	

	