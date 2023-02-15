package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/*
어떤 가게에서 할인 행사를 홀수번째 목요일에만 진행한다고 한다. 첫째주, 셋째주 목요일?
1) 년도와 월을 입력하면 해당 월의 모든 할인 날짜를 출력해주는 메서드 
2) 년도를 입력하면 해당 년의 모든 할인 날짜를 출력해주는 메서드 
*/


public class D12_DiscountDay {
	
	public static void printYearEventDays(int year) {  //그냥 로직으로 찍어누르는 법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, 0, 1, 0, 0, 0); //초기화
		
		int thurCnt = 1;
		while(cal.get(Calendar.YEAR) == year) { //내가 입력한 year과 같은 동안. 
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) { //Calendar.THURSDAY라는 상수 있음 . 5를 의미
				if(thurCnt % 2 == 1) {
					System.out.println(
							sdf.format(cal.getTime()) + ": " + thurCnt + "번쨰 목요일이므로 이벤트날이다.");
				}
				thurCnt++;
			}
			int month = cal.get(Calendar.MONTH);
			cal.add(Calendar.DATE, 1); //데이트를 1씩 증가시키자
			if (month != cal.get(Calendar.MONTH)) {
				thurCnt = 1; //달이 바뀔 때마다 1로 초기화 
			}
		}
	}
	
	public static void printMonthEventDays(int year, int month) { //메서드 찾아보고 하는 법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		//1. 년월일 설정 
		cal.set(year, month-1, 1); //데이트까지 무조건 설정해야 됨
		//2. 요일 설정
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		//3. 몇번째 요일인지 설정 //Calendar.DAY_OF_WEEK_IN_MONTH : 얘가 몇번째 요일이냐
							//getActualMaximum() : 현재 상태에서 해당 필드의 최대값을 구해준다. 
		int maxDowim = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		for(int dowim = 1; dowim <= maxDowim; dowim += 2) {
			cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowim);
			System.out.println(sdf.format(cal.getTime()) + "는 이벤트날입니다. ");
		}
	}
	
	
	public static void main(String[] args) {
		//printYearEventDays(2022);
		printMonthEventDays(2022, 7);
	}
	
	

	/*
	 내풀이.
	static Calendar now = Calendar.getInstance();
	static SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
	
	static void setYnM(int year, int month) {
		//now.set(Calendar.YEAR, year);
		//now.set(Calendar.MONTH, month - 1);
		now.set(year, month - 1, 0, 0, 0, 0); //이렇게 줄일 수 있겠네 
		
		for(int i = 1, cnt = 0; i <= now.getActualMaximum(Calendar.DAY_OF_MONTH); ++i, ++cnt) {
			now.set(Calendar.DATE, i);	
			if(now.get(Calendar.DAY_OF_WEEK) == 5 && cnt % 2 == 1) {
				printAll(now);
			}	
		}
	}

	static void setY(int year) {
		now.set(Calendar.YEAR, year);
		//혹은 now.set(year, 0, 0, 0, 0, 0);
		for(int i = 0; i < 12; ++i) {
			now.set(Calendar.MONTH, i);	
			for(int j = 1, cnt = 0; j <= now.getActualMaximum(Calendar.DAY_OF_MONTH); ++j, ++cnt) {
				now.set(Calendar.DATE, j);	
				if(now.get(Calendar.DAY_OF_WEEK) == 5 && cnt % 2 == 1) {
					printAll(now);	
				}	
			}
		}
	}
	
	public static void printAll(Calendar now) {
		String formatResult = myDateFormat.format(now.getTime());
		System.out.println(formatResult);	
	}
	
	public static void main(String[] args) {
		System.out.println("2022년 6월의 할인일 : ");
		setYnM(2022, 6);
		
		System.out.println();
		
		System.out.println("2023년의 할인일 : ");
		setY(2023);

		
		
		
		
		//삽질한거 ★★★
		//System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
		//요일을 보고 싶을 때 그냥 Calendar.DAY_OF_WEEK 하면 안 되고 get(Calendar.DAY_OF_WEEK) 라고 해야 함
	}
	 */
}
