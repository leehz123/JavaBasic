import java.util.Date;

public class D11_Date {
	/*
	 # java.util.Date 클래스 
	 자바에서 시간 및 날짜를 다루는 클래스
	 지금은 오래되어서 메서드는 잘 사용하지 않는다. 
	 */
	public static void main(String[] args) {
		
		//System.currentTimeMillis() : 현재의 유닉스 타임을 구한다. 
		//유닉스 타임 : 1970 년 1월 1일 이후로 시간이 얼마나 흘렀는지 1/1000초로 센 것. 
		
		System.out.println("현재 시간: " + System.currentTimeMillis() + " ms");
		//길이가 기네 변수에 담으려면 long타입에 담아야겠지? 
		System.out.println("현재 시간: " + System.currentTimeMillis() / 1000 + " s");
		System.out.println("현재 시간: " + System.currentTimeMillis() / 1000 / 60 + " min");
		System.out.println("현재 시간: " + System.currentTimeMillis() / 1000 / 60 / 60 + " hour");
		System.out.println("현재 시간: " + System.currentTimeMillis() / 1000 / 60 / 60 /24 + " days");
		System.out.println("현재 시간: " + System.currentTimeMillis() / 1000 / 60 / 60 /24 /365 + " years");
		//근데 누가 이걸 계산하고 있겠음 누군가 만들어놓은 클래스가 있겠쥐
		
		//이걸 대체 어따 씀? 
		//보통 아래처럼 코드실행시간 측정에 사용된다. 
		long begin = System.currentTimeMillis();
		for(int i = 0; i >= 0; i+= 1000) { 
			System.out.println(i);
		}
		System.out.println("실행시간 : " +(System.currentTimeMillis() - begin) + "ms");

		
		
		
		
		Date now = new Date();  //java.util.Date임 
		System.out.println("now : " + now);
		
		//Date클래스의 많은 메서드들은 더 이상 자바가 지원하지 않는다. (줄이 그어지지)
		Date date = new Date(125, 0, 23); 
		//0이 1월. 2025년으로 하고 싶으면 125를 넣어야 함 아주귀찮 불편. 걍 외우지 마셈 어차피 만료된 메서드임
		System.out.println("date : "+ date); //아무튼 쓰지 말라는 데 이유가 있음.결과 이상학게 나옴
		System.out.println("현재 시간이 date에 저장된 시간보다 뒤 인가요? : " + now.after(date));
		System.out.println("현재 시간이 date에 저장된 시간보다 앞 인가요? : " + now.before(date));
		
		//이렇게 많은 메서드들이 쓰이지 않지만 값을 담아놓는 용도로는 쓰임
		//시간 및 날짜를 다룰 때 long타입을 요구하는 파라미터는 대부분 유닉스 타임을 의미한다.
		date.setTime(4324228333392L);
		System.out.println(date);


	}
}

