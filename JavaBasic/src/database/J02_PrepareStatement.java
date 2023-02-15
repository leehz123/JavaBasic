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
import quiz.D13_ParkingSystem_����Ǯ��;

public class J02_PrepareStatement {
	
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	public static String user = "hr";
	public static String password = "1234";
	
	
	public static void main(String[] args) {
		
		
		//int a = 2000; // int b= 3000;
		
		//SQL INjection ����
		//String b = "0; DELETE FROM employees; --"; //�̷��� �ϸ� ��� ���� ����������. �������� 
			// 0; �̰� ����?
		
		
		//Sql Injection �� ����� ���ڿ� + ������ �̿��� �������� ����� ���� ���Ȼ� �ſ� ����ϴ�. 
		//String sql1 = "SELECT * FROM employees WHERE salary BETWEEN " + a + " AND " + b;
		
		
		//�׷��� PrepareStatement�� ? ����� �̿��� ������ ä��� ���� �����ϴ�. 
		String sql2 = "SELECT * FROM employees WHERE salary BETWEEN ? AND ?";
		//����ǥ �ڸ��� a�� b������ ������ ä������ �� ����
		
		
		try (
				Connection conn = DriverManager.getConnection(url, user, password); //����̹� ���� ����	
				PreparedStatement pstmt = conn.prepareStatement(sql2);	
		){

			Class.forName(driverName); //jdbc����̹� �ε� 
			
			pstmt.setInt(1, 2000);
			pstmt.setInt(2, 3000);
						
			
			try( ResultSet rs = pstmt.executeQuery(); ) { //rs�� ���⼭ ����Ŭ���� ����� ��. pstmt�� �ְ� �װ� ä���� ����ؾ� �ϴϱ�
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








