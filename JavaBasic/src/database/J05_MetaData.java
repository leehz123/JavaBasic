package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class J05_MetaData {
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees";
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			
			//��� �÷��� ����ϰ��� 
			
			//ResultSetMetaDate : �ش� ���� ���� ����� ���� ���� ������ ��� �ִ� ������
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("�÷��� ���� : " + meta.getColumnCount() + " ��");
			 
			//����Ŭ�� 1���� ���� �� ��������. 1���� ���ۡ� 
			for(int i = 1; i <= meta.getColumnCount(); ++i) {
				System.out.printf("%d��° �÷��� �̸� : %s\n", i, meta.getColumnLabel(i));
				System.out.println("�÷��� Ÿ�� : " + meta.getColumnTypeName(i));
			}
			
			//���ϸ��� ������ �÷��� ������ �÷��� �̸� (getColumnCount() , getColumnLabel()) 
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
