import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class D12_Calendar {

	
/*
#java.util.Calendar
달력을 구현한 클래스
날짜 및 시간을 쉽게 계산할 수 있는 다양한 기능들이 모여 있다. 
생성자 대신 getInstance()라는 static메서드를 사용한다. 
			Date클래스는 Date now = new Date(); System.out.println("now : " + now); 이렇게 생성자로 인스턴스 생성해서 사용했었음. 
타임존을 설정하면 다른 국가의 시간도 알 수 있다. 
 */

	
	
	public static void main(String[] args) {
		
		//Calendar now = new Calendar(); //캘린더는 뉴 캘린더가 안 된다 생성자로 인스턴스 생성 못 함.
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		//getInstance()를 호출한 시점의 유닉스타임 time=1652671887717 이 기본적으로 들어가 있음 
		
		
		
		
		
		//get(field) : 해당 인스턴스에서 원하는 필드의 값을 꺼낼 수 있다. 
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1 + "월"); //★ 월은 0이 1월이다... ★ 헷갈려!
		System.out.println(now.get(Calendar.DATE)); 
		//Hour는 12시 기준, HOUR_OF_DAY는 24시 기준 
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MILLISECOND));
		//DAY_OF_WEEK : 요일. (1~7이고 일요일이 1) 
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); //일요일이 1. 
		
		
		
		
		
		//add(field, value) : 해당 필드에 값을 더할 수 있다.(음수 입력시 감소). 반환타입이 void임 주의 
		now.add(Calendar.HOUR_OF_DAY, 24); //20시간을 더해도 날짜는 변하지 않음. 
		System.out.println("2022/06/12에 24시간 더한 결과 : " + now.get(Calendar.DATE));
		
		now.add(Calendar.DATE, -300); //300일을 빼면 년이 변하겠지 
		System.out.println("2022/06/12에서 365일 뺀 결과 : " + now.get(Calendar.YEAR));

		
		
		
		//set(field, value) : 해당 필드값 수정
		now.set(Calendar.MONTH, 0); //0은 1월 
		now.set(Calendar.MONTH, -3); //1년이 빼지고 1월 기준에서 빼서 10월이 되넹 
		
		
		
		//Date에 있던 after, before가 여기도 있넹
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 6, 50, 13, 50, 55);
		System.out.println("now가 cal보다 뒤의 시간입니까? " + now.after(cal));
		System.out.println("now가 cal보다 앞의 시간입니까? " + now.before(cal));
		//놀라지마 여기 now값을 2020년 10월 21일 9:59:16로 바꿔나서 결과가 이상하게 나오는겨
		
		
		
		//나머지 메서드는 알아서 잘 찾아보고 활용하세용 넹넹넹
			
		
		
		
		
		
		// SimpleDateFormat ____________________________________________________
		
		
		System.out.printf("%d년 %d월 %d일 %d:%d:%d\n",
						now.get(Calendar.YEAR),
						now.get(Calendar.MONTH) + 1,
						now.get(Calendar.DATE),
						now.get(Calendar.HOUR),
						now.get(Calendar.MINUTE),
						now.get(Calendar.SECOND));
		
		//이런 식을로 printf의 서식문자를 이용해 날짜를 서식에 맞게 출력하는 방법도 있지만
		//SimpleDateFormat이라는 클래스를 이용하여 날짜시간서식을 만들어놓으면 편하게 사용 가능 
			
		
		
		
		/*
		
		SimpleDateFormat
		: Date를 쉽게 출력하기 위한 클래스 
		
		언어를 지정하면 요일 등을 해당 언어로 표현할 수 있다. (Locale클래스 이용)
		SimpleDateFormat my DateFormat = 
			new SimpleDateFormat("yyyy년 MM월 dd일 D일째 a HH:mm:ss EEEE" , Locale.CANADA);
		
		
		 SimpleDateFormat 의 서식문자들
		y : 년
		M : 월
		d : 일 			 D : 365일 중 몇 일째인지(ex.136일째) 
		h : 12시간 ver 	 H : 24시간 ver
		m : 분
		s : 초			 S : 밀리초 		 
		E : 요일
		a : 오전 / 오후

		*/
		
		
		
		SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 D일째 a HH:mm:ss EEEE", Locale.US);

		//Locale.getDefault() : 우리가 사용하는 시스템상의 위치 
		SimpleDateFormat myDateFormat1 = new SimpleDateFormat("yyyy년 MM월 dd일 D일쨰 a HH:mm:ss EEEE", Locale.getDefault());


		
		
		
		//심데포 사용하기 
		String formatResult_getTimeVer = myDateFormat.format(Calendar.getInstance().getTime());
		String formatResult_getTimeInMillisVer = myDateFormat.format(Calendar.getInstance().getTimeInMillis());
		
		System.out.println("심데포 결과 (formatResult_getTimeInMillisVer) : " + formatResult_getTimeInMillisVer);
		System.out.println("심데포 결과 (formatResult_getTimeVer) : " + formatResult_getTimeVer);
		
		//SimpleDateFormat은 Date타입 또는 유닉스 타임을 전달해야 한다. 
		//Calendar.getTime() 또는 Calendar.getTimeInMillis()를 전달해도 됨.

		 
		
		
		//TimeZone클래스 
		//타임존을 설정하면 원하는 국가의 시간으로 출력할 수 있다. 
		
		
		
		myDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Dublin"));
		System.out.println("탐존적용한 심데포 적용한 날짜 (유럽 더블린의 날짜와 시간이 출력됨) : " + myDateFormat.format(Calendar.getInstance().getTime()));
		//이런 식으로 심데포에 타임존을 적용해서 사용할 수도 있고 
		
		
		//캘린더 인스턴스 생성하면서 바로 유럽 더블린의 날짜와 시간을 적용할 수도 있다. 
		Calendar noww = Calendar.getInstance(TimeZone.getTimeZone("Europe/Dublin"));
		System.out.println("더블린의 날짜 : " + noww.get(Calendar.DATE));
		System.out.println("더블린의 시간 : " + noww.get(Calendar.HOUR_OF_DAY));

		
		
		
		
		//TimeZone의 지역 ID 목을 뽑아보자  
		for(String id : TimeZone.getAvailableIDs()) {
			System.out.println(id);
		}  
	
	}
}
