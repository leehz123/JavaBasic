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
	 
	 coffeeFour ���̺�� locations2 ���̺��� ���� ����� ��� ���� ������Ŭ������ ��� ����غ�����. 
	 �� �� ��ü���������� �������� ���� ����غ���
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
				System.out.println(new Coffee_locations2_�̰Ŵ³�Ǯ��(rs));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

		 
		 
		 */
		
	}	
		

}
