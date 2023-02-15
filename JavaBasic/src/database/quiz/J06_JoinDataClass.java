package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import database.OjdbcConnection;
import database.model.CoffeeDetail;
import database.model.Coffee_locations2;

public class J06_JoinDataClass {

	
	/*
	 
	 coffeeFour 테이블과 locations2 테이블의 조인 결과의 모든 행을 데이터클래스에 담아 출력해보세요. 
	 좀 더 객체지향적으로 가져오는 법을 고민해보쟈
	 */
	
	
	public static void main(String[] args) {

		
		try(
				Connection conn = OjdbcConnection.getConnection()
		) {
			List<CoffeeDetail> coffeeDetails = CoffeeDetail.getAll(conn);
			for(CoffeeDetail detail : coffeeDetails) {
				System.out.println(detail);
			} 
		} catch(SQLException e) {
			e.printStackTrace();
	}
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		 String sql = "SELECT * FROM coffeeFour INNER JOIN locations2 USING(location_id)";
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			
			ResultSetMetaData meta = rs.getMetaData();	
			
			while(rs.next()) {
				System.out.println(new Coffee_locations2_이거는내풀이(rs));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

		 
		 
		 */
		
	}	
		

}
