package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

import myobj.parking.CarFactory;
import myobj.parking.CarType;
import myobj.parking.Car;

public class D13_ParkingSystem_정답풀이 {
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>(); //각 요일별 제한번호가 담긴 해시맵
	private static HashSet<CarType> allowedCarType = new HashSet<>(); //무조건 통과인 차 목록이 담긴 해시셋
	

	static { //static변수는 static{}초기화 블럭을 통해. 제한번호목록맵과 늘허용되는차종(유아동승, 장애인, 경차)목록셋을 초기화 해준다 
		limitNumMap.put(DayOfWeek.MONDAY	, "16");
		limitNumMap.put(DayOfWeek.TUESDAY	, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY	, "38");
		limitNumMap.put(DayOfWeek.THURSDAY	, "49");
		limitNumMap.put(DayOfWeek.FRIDAY	, "50");
		
		allowedCarType.add(Car.babyRide);
		allowedCarType.add(Car.disabled);
		allowedCarType.add(Car.lightCar);
		
	}
	
	//매개변수로 받은 차가 차량5부제에 걸리는지 아닌지 검사하는 메서드 
					//아니 quiz팩토리에 Car클이 어딘가에 또 있나봄 얘 떄문에 헤매다가 스텝 꼬임 
	public void check(myobj.parking.Car car) {
		DayOfWeek todaysDow = LocalDate.now().getDayOfWeek(); //오늘 요일 todaysdow에 저장하고 
		
		String limitNum = limitNumMap.get(todaysDow); //todaysdow가 key값인 value 금지번호를 반환. 
		
		// 오늘이 주말이라서 limitNum에 담기는 제한번호 String이 없을 때 (null) 
		if(limitNum == null) { 
			System.out.println("오늘은 주말이므로 차량 5부제를 시행하지 않습니다. ");
			return;
		}
		
		
		System.out.printf("오늘은 %s이므로 끝번호 %c번, %c번이 출입이 제한됩니다. ", 
							todaysDow.getDisplayName(TextStyle.FULL, Locale.KOREA) //이러이러하게 꾸며서 요일을 표시하라 (반환값 String) 
							, limitNum.charAt(0), limitNum.charAt(1));

		
		//매배견수로 넘겨받은 car가 allowedCarType셋에 포함돼 있을 경우  
		if(allowedCarType.contains(car.getCarType())) {
			System.out.println("장애인, 경차, 유아동승 차량은 차량 5부제의 대상이 아닙니다. ");
			car.setState(1); //주차가능
		} else if (limitNum.contains(car.getLastNum())) {
			car.setState(2); //진입금지
			System.out.println("차량 5부제의 대상이므로 출입이 제한됩니다. ");
		} else {
			System.out.println("차량 5부제의 대상이 아닙니다. ");
			car.setState(1); //주차가능
		}
		
		
//		if(limitNum.contains(car.getLastNum())) {  //차량번호의 끝번호가 금지번호중에 해당하면
//			car.setState(2);
//		} else {
//			car.setState(1);
//		}
	
	}
	
	
	
	public static void main(String[] args) {
		
		D13_ParkingSystem_정답풀이 sys = new D13_ParkingSystem_정답풀이();
		
		for(int i = 0; i < 100; i++) {
			//myobj.parking.Car car = CarFactory.getLimitedTestCar(); //이렇게 하면 차량 끝번호가 금지번호 2개 중에서만 랜덤으로 바뀌고 차종도 랜덤 
			myobj.parking.Car car = CarFactory.getRandomTestCar(); //이렇게 하면 차량 끝번호가 0~9까지 랜덤이고 차종도 랜덤
			System.out.println(car);
			sys.check(car);
			System.out.println(car);
			System.out.println("______________________________________");
		}

	}
}
