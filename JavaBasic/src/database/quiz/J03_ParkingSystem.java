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
������ �����ϸ� ����5������ �����Ͽ� �������θ� �Ǻ��� �� DB�� ����غ�����. 
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
				myobj.parking.Car car = CarFactory.getRandomTestCar();	//������ ����
				
				System.out.println(car.getCarNum());
				System.out.println(sys.check(car)[0]);
				System.out.println(sys.check(car)[1]);
				//��������ȣ
				pstmt.setString(1, car.getCarNum());
							
				//�������ɿ���
				pstmt.setString(2, sys.check(car)[0]);		
				
				//����
				pstmt.setString(3, sys.check(car)[1]);
				
				
				pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}




class ParkingSystem {
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>(); //�� ���Ϻ� ���ѹ�ȣ�� ��� �ؽø�
	private static HashSet<CarType> allowedCarType = new HashSet<>();
	

	static { //static������ static{}�ʱ�ȭ ���� ����. ���ѹ�ȣ��ϸʰ� �����Ǵ�����(���Ƶ���, �����, ����)��ϼ��� �ʱ�ȭ ���ش� 
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
			result[1] = "�ָ�";
			return result;
		}
		
		if(allowedCarType.contains(car.getCarType())) {
			result[0] = "o";
			result[1] = "�����, ����, ���Ƶ���";
			return result;
		} else if (limitNum.contains(car.getLastNum())) {
			result[0] = "x";
			result[1] = "����5�������";
			return result;
		} else {
			result[0] = "o";
			result[1] = "����5�������ƴ�";
			return result;
		}
	}
}







