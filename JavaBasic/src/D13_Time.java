import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;


/*

# java.time.* (time패키지 아래 모든것)
Calendar의 여러가지 단점을 보완한 시간을 다루는 클래스 
Calendar는 set()을 통해 원본 인스턴스를 계속해서 변경하지만
java.time패키지의 클래스들은 원본은 유지하고 새로운 인스턴스를 반환한다. ★
LocalDate날짜만, LocalTime시간, LocalDateTime날짜와시간을 둘 다 다룰 때 

 */


public class D13_Time {	
	public static void main(String[] args) {
		
		//now : 현재 시간의 인스턴스를 반환하는 메서드
		System.out.println("시간만 : " + LocalTime.now());
		System.out.println("날짜와 시간 : " + LocalDateTime.now());
		System.out.println("날짜만 : " + LocalDate.now());
		
		
		//of : 원하는 해당 시점의 인스턴스를 반환하는 메서드
		System.out.println(LocalDate.of(2002, 5, 10)); //Calendar는 월을 0부터 시작했었는데 이거는 1부터 시작해서 편함
		System.out.println(LocalDate.of(2020, Month.FEBRUARY, 29));
		System.out.println(LocalTime.of(13, 30, 59, 999999999)); //나노세컨드까지 감. 
		
		//이런 식으로 섞어 쓰는 것도 가능
		System.out.println("섞어쓰기 : " + LocalDateTime.of(LocalDate.now(), LocalTime.of(12, 50)));  

		
		
		
		
		
		
		
		
		//그리고 Time패키지의 클래스들들은 원본은 유지하고 새 인스턴스를 반환한댔지? 
		//그 중 하나인 LocalTimeDate클래스도 사용할 때 주의할 점이 		
		LocalDateTime ldt = LocalDateTime.now();
		
		ldt.of(2022, Month.JANUARY, 2, 12, 3, 50, 99999999); //이렇게 변경해줬는데도 
		System.out.println(ldt); //ldt는 원본값 그대로이다! ★★★★
		
		System.out.println(ldt.of(2022, Month.JANUARY, 2, 12, 3, 50, 99999999));
		//변경된 값을 바로 출력하려면 이렇게 바로 print해줘야 한다는 것 !
		
		//그리고 변경된 값은 새 인스턴스로 생성되므로 새로운 변수를 파서 거기에 담으면 된다. 
		LocalDateTime newLdt = ldt.of(2022, Month.JANUARY, 2, 12, 3, 50, 99999999);
		
		
		
		
		
		
		
		
		
		
		//__________________________________________________
		//인스턴스로부터 변경된 인스턴스 생성하기
		LocalDate today = LocalDate.now();
		LocalDate nextYear = today.plusYears(1);
		LocalDate nextMonth = today.plusMonths(-5);
		LocalDate minusDays = today.minusDays(10);
		//LocalDate minusDays = today.minusDays(-10); //헷갈리게 선 넘는 거긴 한데 가능하긴 함ㅋ 
		
		
		
		//plusYear등의 메서드를 사용해도 원본은 변하지 않는다. 
		System.out.println("today: " + today);
		System.out.println("today.plus(10, ChronoUnit.MONTH)); : " + today.plus(10, ChronoUnit.MONTHS)); //월에 10더한 결과를 copy로 리턴
		System.out.println("today: " + today);
		System.out.println("nextYear : " + nextYear);
		System.out.println("nextMonth : " + nextMonth);
		System.out.println("minusDays : " + minusDays);
		
		
		
		
		
		
		//java.time.DateTimeFormatter 
		//Calendar의 SimpleDateFormat처럼 DateTimeFormatter가 있다. 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("데타포 : " + "yyyy년MM월 dd일 /EEEE");
		System.out.println(dtf.format(today));
		
		
		
		
		
		// .isAfter() .isBefore() .isEqual() 
		LocalDate chilrensDay = LocalDate.of(2022, 12, 25); 
		System.out.println("크리스마스가 지나갔니?  (다음날인가요 가 아니라 지났나요임!★) :" + today.isAfter(chilrensDay));
		System.out.println("크리스마스 아직 멀었나요? :" + today.isBefore(chilrensDay));
		System.out.println("오늘이 크리스마스니? : " + today.isEqual(chilrensDay));
		
		
		
		//특정 필드값 꺼내기
		DayOfWeek dow = today.getDayOfWeek();
		System.out.println("오늘의 요일 : " + dow.getValue());						
		System.out.println("오늘의 요일을 한국식으로 표기 : " + dow.getDisplayName(TextStyle.FULL, Locale.KOREA));
		System.out.println("오늘의 요일을 미국식으로 표기 : " + dow.getDisplayName(TextStyle.FULL, Locale.US)); 
		System.out.println("오늘의 요일을 미국식으로 짧게 표기 : " + dow.getDisplayName(TextStyle.SHORT, Locale.US)); //Locale.US : 언어
		
		
		//with()으로 날짜 세부 조정하기
		// -TemporalAdjusters에 날짜를 조정할 수 있는 편리한 Adjusters들 이 모여 있다. 
		System.out.println("이번달의 첫번째 날 : " + today.with(TemporalAdjusters.firstDayOfMonth()));//오늘을 기준으로 이번달의 첫번째 날짜로 조정
		System.out.println("이번달의 마지막 날짜 : " + today.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("이번달의 마지막 금요일 : " + today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY))); //요일을 인자로 전달
		System.out.println("다음달의 첫번째 날 : " + today.with(TemporalAdjusters.firstDayOfNextYear()));
		
		
		
		//이런식으로 꼬리에 꼬리를 물어 사용하는 것도 가능 
		System.out.println("다다다음주 수요일 : " + today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)) //다음주 수요일의 
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)) //다음주 수요일의 
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))); //다음주 수요일인가?		
		//__________________________________________________
		
		
	}
}
