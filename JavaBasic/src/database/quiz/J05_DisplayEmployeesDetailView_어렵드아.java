package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbcConnection;

//메타데이터 실습.
// emp_details_view(employees 관련된 모든 테이블들을 조인해놓은 것) 를 자바 콘솔에 보기 좋게 출력해보세요. 
	

public class J05_DisplayEmployeesDetailView_어렵드아 {
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM emp_details_view";
		
		try (
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){

			ResultSetMetaData meta = rs.getMetaData();
			
			ArrayList<Integer> columnDisplaySize = new ArrayList<>();
			ArrayList<String> columnLabel = new ArrayList<>(); 
			
			
			int columnSize = meta.getColumnCount();
			for(int i = 1; i <= columnSize; ++i) {	
				
				int size = meta.getColumnDisplaySize(i);  //컬럼의 최대 길이? 리턴해주는듯. Indicates the designated column's normal maximum width in characters.
				String label = meta.getColumnLabel(i);
				
				size = size > label.length() ? size : label.length(); //컬럼 내용 길이와 제목 길이 사이의 간극을 메워주라는 것 같음 
				
				columnLabel.add(label);				
				
				//★★★★★★★★★★★★★★★★★★★★★★★★우왕 새로운 기술 ^^ String.format을 printf의 서식으로 쓸 수 있겠구나!★★★★★★★★★★★★★★★★★★★★★★★★★★★★ 
				String format = String.format("%%-%ds (%%2d) | ", meta.getColumnDisplaySize(i));	
				System.out.printf(format, meta.getColumnLabel(i), meta.getColumnDisplaySize(i));
				
				columnDisplaySize.add(size + 8);  // " ( 7) " 이 공간을 8로 더해주는 것 같음
				
			}													
			System.out.println();
			
			
			
			
			for(int i = 0; i < columnSize; ++i) {
				int displaySize = columnDisplaySize.get(i);
				int lastIndex = displaySize - 1;
				
				
				for(int j = 0; j < displaySize; ++j) {
					if (j == lastIndex - 1) {
						System.out.print('┴');
					} else {
						System.out.print('─');
					}					
				}
			}
			System.out.println();
		
		
			
			while(rs.next()) {
				for(int i = 0; i < columnSize; ++i) {
					int size = columnDisplaySize.get(i);  //어레리라 0번부터 꺼내야함 주의!
					String label = columnLabel.get(i);		
					String format = String.format("%%-%ds", size);
					
					System.out.printf(format, rs.getObject(label)); //라벨 전달해도 됨 
				}
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}	
}



















//내 코드...


/*
 
 public class Test {
	public static void main(String[] args) {
		String sql = "SELECT * FROM emp_details_view";
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			
			ResultSetMetaData meta = rs.getMetaData();
			
			//메타로 행개수 구하기 
			int colCnt = meta.getColumnCount();
			
			//제목출력
			for(int i = 1; i <= colCnt; ++i) {
				if(i<12) {
					System.out.printf("%-18s" , meta.getColumnLabel(i));					
				} else {
					System.out.printf("%-35s" , meta.getColumnLabel(i));					
				}				
			}
			System.out.println();
			
			System.out.println("=======================================================================================================================================================================================================================================================================================================================================================================");
			
			//행출력
			while(rs.next()) {
				for(int i = 1; i <= colCnt ; ++i) {
					if(i<12) {
						System.out.printf("%-18s", rs.getObject(i));						
					} else {
						System.out.printf("%-35s", rs.getObject(i));						
					}
				}
				System.out.println();
			}
			
						
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}

 
 
 
 
 
 */
