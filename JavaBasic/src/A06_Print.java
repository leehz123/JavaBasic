
public class A06_Print {
	/*
	 # 콘솔에 출력하는 함수들 
	 1. println() 
	 -() 안에 전달한 데이터를 콘솔에 출력하면서 줄을 자동으로 바꿔준다. 출력 + \n
	  
	 2. print() 
	 -() 안에 전달한 데이터를 콘솔에 출력한다.
	 
	 3. printf() 
	 -서식을 이용해 원하는 출력 형태를 미리 만들어 놓을 수 있는 함수 
	 -서식문자 자리에 값을 순서대로 채워서 사용한다.
	 -\n이 자동으로 추가되지 않으므로 주의해야 한다.
	 
	 ※ 서식문자의 종류 
	 %d : 해당 자리에 전달한 정수값을 10진수로 출력 (decimal) 
	 %x : 해당 자리에 전달한 정수값을 16진수로 출력(hexadecimal) 
	 %X : 해당 자리에 전달한 정수값을 16진수로 출력(hexadecimal_대문자) 
	 %o : 해당 자리에 전달한 정수값을 8진수로 출력 (octal)
	 %b : boolean 
	 이진수는 없음. 만약에 이진법으로 출력하고 싶으면 Integer.toString(10진수, 어느 진법으로 변환할 건지 숫자)
	 %c : 문자 
	 %s : 문자열
	 %f : 실수 float/double 다 됨 
	 %% : 그냥 %를 출력하고 싶을 때
	 
	 ※서식문자 옵션 
	 -서식문자의 %와 문자 사이에 넣어서 사용한다. 
	 1. %숫자d	자릿수를 숫자만큼 확보하면서 출력한다. 
	 2. %-숫자d	자릿수를 숫자만큼 확보하여 왼쪽 정렬하여 출력한다. 
	 3. %0숫자d	자릿수를 숫자만큼 확보하여 빈칸에 0을 채워 출력한다. 
	 4. %.숫자f	실수의 소수점 아래 자릿수를 설정할 수 있다. 소숫점 아래는 숫자만큼 출력해서 반올림!
	 5. %+-숫자d	%d에 들어오는 숫자가 음수면 앞에-, 양수면 앞에 +를 붙여준다. (부호를 붙아갰단 얘기)
	 */

	public static void main(String[] args) {

		System.out.print("Hello, world!\n");

		System.out.printf("오늘은 %d월 %d입니다.\n", 4, 13);

		int year = 2022;
		int month = 4;
		int date = 13;
		int hour = 14;
		int minute = 24;
		int second = 55;

		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일이고, " + "현재 시간은 " + hour + "시 " + minute
				+ "분 " + second + "초 입니다.");
		System.out.printf("오늘은 %d년 %d월 %d일이고, 현재 시간은 %d시 %d분 %d초 입니다.\n", year, month, date, hour, minute, second);

		System.out.printf("30(10) : %d\n", 30);
		System.out.printf("30(16) : %x\n", 30);
		System.out.printf("30(2) : %s\n", Integer.toString(30, 2));

		System.out.printf("오늘은 '%s'입니다.\n", "목요일");
		System.out.printf("오늘은 '%c요일'입니다.\n", '金');

		System.out.printf("오늘의 온도 : %.1f℃\n", 27.8);
		System.out.printf("오늘의 온도 : %.2f℃\n", 27.8);
		// 소수점 2자리 중 빈칸은 0으로 채워짐 -> 27.80℃
		System.out.printf("오늘의 온도 : %.3f℃\n", 27.8);
		System.out.printf("오늘의 온도 : %.30f℃\n", 27.8);

		System.out.printf("%5d\n", 1234);
		System.out.printf("%10d\n", 1234);
		System.out.printf("%15d\n", 1234);

		System.out.printf("%-10s: 10\n", "score");

		System.out.printf("%010d\n", 15);
		System.out.printf("%010d\n", 3);

		// 서식문자 옵션들은 조합해서 사용할 수 있다.
		System.out.printf("%010.3f", 123.555555);
		// 소수점 아래는 자릿수만큼 출력하고 마지막자릿수로 반올림
	}
}
