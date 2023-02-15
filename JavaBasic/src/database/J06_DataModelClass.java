package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.Coffee;



public class J06_DataModelClass {	
	
	//DB에서 꺼내온 데이터는 테이블의 모든 내용을 다룰 수 있는 데이터 모델 클래스(데이터 클래스)에 넣어두는 것이 좋다.
	//database.mode.Coffee클래스 가 데이터 모델 클래스 역할을 함
	
	public static void main(String[] args) {
	
		String sql = "SELECT * FROM coffeeFour";
		
		
		//모델에 넣은 데이터를 컬렉션에 넣어서 편리하게 사용 가능.
		ArrayList<Coffee> coffees = new ArrayList<>();
		//이렇게 묶어서 다닐 수도 있는게 가장 큰 장점임. 
		
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){			
			while(rs.next()) {
				System.out.println(new Coffee(rs));
				coffees.add(new Coffee(rs));
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	

		//coffees 어레리 출력 
		System.out.println(coffees);
		
		
	}
}
