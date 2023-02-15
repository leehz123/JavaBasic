package myobj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.OjdbcConnection;

class Test {

	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	
	public static String user = "hr";
	public static String password = "1234";
	
	
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver Name Error : " + driverName);
		}
	}

	
	//원래는 Connection conn = DriverManager.getConnection(url, user, password); 
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}	
	//Connection conn = OjdbcConnection.getConnection(); 이렇게 받아서 사용하면 되겠지 
	
	
	
	
	public static void main(String[] args) {
		String sql = "UPDATE coffeeFour SET cid=cid+1 WHERE eng_name = ?";
		
		try (
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			
			pstmt.setString(1, "latte");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}