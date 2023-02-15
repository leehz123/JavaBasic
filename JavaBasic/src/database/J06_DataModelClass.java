package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.Coffee;



public class J06_DataModelClass {	
	
	//DB���� ������ �����ʹ� ���̺��� ��� ������ �ٷ� �� �ִ� ������ �� Ŭ����(������ Ŭ����)�� �־�δ� ���� ����.
	//database.mode.CoffeeŬ���� �� ������ �� Ŭ���� ������ ��
	
	public static void main(String[] args) {
	
		String sql = "SELECT * FROM coffeeFour";
		
		
		//�𵨿� ���� �����͸� �÷��ǿ� �־ ���ϰ� ��� ����.
		ArrayList<Coffee> coffees = new ArrayList<>();
		//�̷��� ��� �ٴ� ���� �ִ°� ���� ū ������. 
		
		
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
	

		//coffees ��� ��� 
		System.out.println(coffees);
		
		
	}
}
