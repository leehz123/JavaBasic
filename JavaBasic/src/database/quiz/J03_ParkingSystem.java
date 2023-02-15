package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

import database.OjdbcConnection;
import myobj.parking.Car;
import myobj.parking.CarFactory;
import myobj.parking.CarType;

/*
차량이 진입하면 차량5부제를 적용하여 주차여부를 판별한 후 DB에 기록해보세요. 
*/

public class J03_ParkingSystem {

	public static void main(String[] args) {
		String sql = "INSERT INTO carRecord VALUES(record_id_seq.nextval, ?, ?, ?)";
		ParkingSystem sys = new ParkingSystem();
		
		try (
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			
			for(int i = 0; i < 10; ++i) {
				myobj.parking.Car car = CarFactory.getRandomTestCar();	//랜덤차 생성
				
				System.out.println(car.getCarNum());
				System.out.println(sys.check(car)[0]);
				System.out.println(sys.check(car)[1]);
				//랜덤차번호
				pstmt.setString(1, car.getCarNum());
							
				//주차가능여부
				pstmt.setString(2, sys.check(car)[0]);		
				
				//이유
				pstmt.setString(3, sys.check(car)[1]);
				
				
				pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}




class ParkingSystem {
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>(); //각 요일별 제한번호가 담긴 해시맵
	private static HashSet<CarType> allowedCarType = new HashSet<>();
	

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
					 
	public String[] check(myobj.parking.Car car) {
		DayOfWeek todaysDow = LocalDate.now().getDayOfWeek();
		String limitNum = limitNumMap.get(todaysDow);  
		String[] result = new String[2];
		
		if(limitNum == null) {
			result[0] = "o";
			result[1] = "주말";
			return result;
		}
		
		if(allowedCarType.contains(car.getCarType())) {
			result[0] = "o";
			result[1] = "장애인, 경차, 유아동승";
			return result;
		} else if (limitNum.contains(car.getLastNum())) {
			result[0] = "x";
			result[1] = "차량5부제대상";
			return result;
		} else {
			result[0] = "o";
			result[1] = "차량5부제대상아님";
			return result;
		}
	}
}







