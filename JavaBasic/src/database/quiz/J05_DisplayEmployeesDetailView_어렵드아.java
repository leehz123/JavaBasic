package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbcConnection;

//��Ÿ������ �ǽ�.
// emp_details_view(employees ���õ� ��� ���̺���� �����س��� ��) �� �ڹ� �ֿܼ� ���� ���� ����غ�����. 
	

public class J05_DisplayEmployeesDetailView_��Ƶ�� {
	
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
				
				int size = meta.getColumnDisplaySize(i);  //�÷��� �ִ� ����? �������ִµ�. Indicates the designated column's normal maximum width in characters.
				String label = meta.getColumnLabel(i);
				
				size = size > label.length() ? size : label.length(); //�÷� ���� ���̿� ���� ���� ������ ������ �޿��ֶ�� �� ���� 
				
				columnLabel.add(label);				
				
				//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڿ�� ���ο� ��� ^^ String.format�� printf�� �������� �� �� �ְڱ���!�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� 
				String format = String.format("%%-%ds (%%2d) | ", meta.getColumnDisplaySize(i));	
				System.out.printf(format, meta.getColumnLabel(i), meta.getColumnDisplaySize(i));
				
				columnDisplaySize.add(size + 8);  // " ( 7) " �� ������ 8�� �����ִ� �� ����
				
			}													
			System.out.println();
			
			
			
			
			for(int i = 0; i < columnSize; ++i) {
				int displaySize = columnDisplaySize.get(i);
				int lastIndex = displaySize - 1;
				
				
				for(int j = 0; j < displaySize; ++j) {
					if (j == lastIndex - 1) {
						System.out.print('��');
					} else {
						System.out.print('��');
					}					
				}
			}
			System.out.println();
		
		
			
			while(rs.next()) {
				for(int i = 0; i < columnSize; ++i) {
					int size = columnDisplaySize.get(i);  //����� 0������ �������� ����!
					String label = columnLabel.get(i);		
					String format = String.format("%%-%ds", size);
					
					System.out.printf(format, rs.getObject(label)); //�� �����ص� �� 
				}
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}	
}



















//�� �ڵ�...


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
			
			//��Ÿ�� �ళ�� ���ϱ� 
			int colCnt = meta.getColumnCount();
			
			//�������
			for(int i = 1; i <= colCnt; ++i) {
				if(i<12) {
					System.out.printf("%-18s" , meta.getColumnLabel(i));					
				} else {
					System.out.printf("%-35s" , meta.getColumnLabel(i));					
				}				
			}
			System.out.println();
			
			System.out.println("=======================================================================================================================================================================================================================================================================================================================================================================");
			
			//�����
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
