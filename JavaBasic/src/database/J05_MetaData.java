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
			
			//모든 컬럼을 출력하고파 
			
			//ResultSetMetaDate : 해당 쿼리 실행 결과에 대한 여러 정보를 담고 있는 데이터
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("컬럼의 개수 : " + meta.getColumnCount() + " 개");
			 
			//오라클은 1부터 세는 걸 좋아허지. 1부터 시작★ 
			for(int i = 1; i <= meta.getColumnCount(); ++i) {
				System.out.printf("%d번째 컬럼의 이름 : %s\n", i, meta.getColumnLabel(i));
				System.out.println("컬럼의 타입 : " + meta.getColumnTypeName(i));
			}
			
			//쓰일만한 정보는 컬럼의 개수랑 컬럼의 이름 (getColumnCount() , getColumnLabel()) 
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
