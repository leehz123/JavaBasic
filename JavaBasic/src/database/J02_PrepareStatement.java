package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

import myobj.parking.Car;
import myobj.parking.CarFactory;
import myobj.parking.CarType;
import quiz.D13_ParkingSystem_정답풀이;

public class J02_PrepareStatement {
	
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	public static String user = "hr";
	public static String password = "1234";
	
	
	public static void main(String[] args) {
		
		
		//int a = 2000; // int b= 3000;
		
		//SQL INjection 공격
		//String b = "0; DELETE FROM employees; --"; //이렇게 하면 디비가 아주 난리나것지. 디지버짐 
			// 0; 이건 머임?
		
		
		//Sql Injection 의 우려로 문자열 + 연산을 이용해 쿼리문을 만드는 것은 보안상 매우 취약하다. 
		//String sql1 = "SELECT * FROM employees WHERE salary BETWEEN " + a + " AND " + b;
		
		
		//그래서 PrepareStatement의 ? 기능을 이용해 변수를 채우는 것이 안전하다. 
		String sql2 = "SELECT * FROM employees WHERE salary BETWEEN ? AND ?";
		//물음표 자리에 a와 b변수를 차레로 채워넣을 수 있음
		
		
		try (
				Connection conn = DriverManager.getConnection(url, user, password); //드라이버 연결 생성	
				PreparedStatement pstmt = conn.prepareStatement(sql2);	
		){

			Class.forName(driverName); //jdbc드라이버 로드 
			
			pstmt.setInt(1, 2000);
			pstmt.setInt(2, 3000);
						
			
			try( ResultSet rs = pstmt.executeQuery(); ) { //rs는 여기서 오토클로즈 해줘야 함. pstmt가 있고 그걸 채워서 사용해야 하니까
				while(rs.next()) {
					System.out.printf("%-8d%15s%15s%10s%8d\n", 
							rs.getInt("employee_id"), 
							rs.getString("first_name"),
							rs.getString("last_name"),
							rs.getString("job_id"),
							rs.getInt("salary")
							);
				} 
								
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}








