package myobj.parking;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;


//테스트용 랜덤 차 만들기 클래스 
public class CarFactory {
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	
	static {
		limitNumMap.put(DayOfWeek.MONDAY	, "16");
		limitNumMap.put(DayOfWeek.TUESDAY	, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY	, "38");
		limitNumMap.put(DayOfWeek.THURSDAY	, "49");
		limitNumMap.put(DayOfWeek.FRIDAY	, "50"); //근데 이거 왜 ParkingSystem에도 있고 CarFactory에도 있는겨? ▲▲▲▲▲▲ 아 알겟다 요일별 제한번호 모아놓은 Map 이 여기서도 쓰이고 저기서도 쓰이는데 private라서 공유할 수 없구나  그럼 중복이라도 따로 선언해주는 수밖에 
		
		
	}
	
	
	//이건 랜텀차량 만들 때 Cartype을 랜덤으로 고르기 위한 목록인 거지 
	static CarType[] types = {Car.babyRide, Car.disabled, Car.lightCar, Car.normal, Car.normal, Car.normal, Car.normal, Car.normal, Car.normal, Car.normal};
	
	
	
	//일부러 끝자리 일치하는 금지차량 만들어서 테스트 하기 위한 메서드 (차종도 아무거나 랜덤)
	public static Car getLimitedTestCar() { 
		String carNum = "12금123";
		DayOfWeek dow = LocalDate.now().getDayOfWeek(); //dow에 오늘 요일 저장
		
		String limitNum = limitNumMap.get(dow); //그럼 이제 limitNumMap에서 dow(오늘요일)에 해당하는 제한번호를 가져오것지 
			
		//주말일 경우 
		if(limitNum == null) {// 토, 일 을 limitNumMap 에 만들어놓지 않아서 오늘이 주말일 경우 limitNumMap.get(dow)에서 null이 반환됨 
			System.out.println("오늘은 금지차량을 만들 수 없어서 랜덤 차량을 생성합니다. "); 
			return getRandomTestCar();	//그래서 랜테카 로 넘어가는 거쥐		
		}
		
		//Car(String carNum, CarType carType) 생성자로 정보 넘겨서 만든 Car클래스의 인스턴스 반환
		return new Car(  
				carNum + (limitNum.charAt((int)(Math.random() * 2))), //차번호의 마지막 번호로 금지 번호 2 개 중에 암거나 
				types[(int)(Math.random() * types.length)]); // types에 저장해둔 Cartype 중에서 랜덤으로 하나 뽑아서 매개변수로 넘겨 

	}
	
	
	//12태123 뒤에 한 자리 랜덤으로 0~9 골라서 랜덤 차량번호 만든 다음에 차종도 아무거나 랜덤
	public static Car getRandomTestCar() { 
		String carNum = "12태123";
		return new Car( carNum + (int)(Math.random() * 10) , types[(int)(Math.random() * types.length)] );
				
	}	
	
}
