package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
�ڹٿ��� �������� �̿��� ������ �޸���ó�� ��� ���� 
 */


/*

 
  # executeQuery() 
  
  : SELECT�� ���� �����ϴ� �޼���. 
  - ResultSet ���� ���� ����� ���� �� ����. 
  - ResultSet rs = pstmt.executeQuery();

  		
  # executeUpdate() 		
  
  : INSERT, UPDATE, DELETE�� ���� �����ϴ� �޼���. 
  - int �� �ٲ� ����� ���� �� ����. 
    (sqldeveloper���� "~���� ����Ǿ����ϴ�." �ߴ��� �����ϸ� ��)


 */




//���⼭�� �� ����̹� �ε� �� ����? Class.forName(OjdbcConnection.driverName);
//�� OjdbcDriverŬ������ static{} �ʱ�ȭ �� �ȿ� Class.forName()���� ����̹� �ε� �س����� 
//�ڽ���ƽ ������ ������ �޸𸮿� �Ǿ���� ���� �ƴ϶� �ش� Ŭ������ ���ʷ� ���Ǵ� ������ �޸𸮿� �Ǹ��� �ȴ�.��


public class J03_ExecuteUpdate {
	public static void main(String[] args) {		
		
		String sql = "UPDATE coffeeFour SET cid=cid+1 WHERE eng_name = ?";
		
		
		try
		(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, "latte"); // 1 ����? �� ù��° ����ǥ 
	
			
			int row = pstmt.executeUpdate();
			System.out.println(row + " ���� ������Ʈ �Ǿ����ϴ�.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
