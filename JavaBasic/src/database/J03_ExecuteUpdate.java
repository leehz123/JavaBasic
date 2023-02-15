package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
자바에서 쿼리문을 이용해 데베를 메모장처럼 사용 가능 
 */


/*

 
  # executeQuery() 
  
  : SELECT문 사용시 실행하는 메서드. 
  - ResultSet 으로 실행 결과를 받을 수 있음. 
  - ResultSet rs = pstmt.executeQuery();

  		
  # executeUpdate() 		
  
  : INSERT, UPDATE, DELETE문 사용시 실행하는 메서드. 
  - int 로 바뀐 행수를 받을 수 있음. 
    (sqldeveloper에서 "~행이 변경되었습니다." 뜨던거 생각하면 됨)


 */




//여기서는 왜 드라이버 로드 안 해줌? Class.forName(OjdbcConnection.driverName);
//아 OjdbcDriver클래스에 static{} 초기화 블럭 안에 Class.forName()으로 드라이버 로드 해놨구나 
//★스태틱 영역은 무조건 메모리에 실어놓는 것이 아니라 해당 클래스가 최초로 사용되는 시점에 메모리에 실리게 된다.★


public class J03_ExecuteUpdate {
	public static void main(String[] args) {		
		
		String sql = "UPDATE coffeeFour SET cid=cid+1 WHERE eng_name = ?";
		
		
		try
		(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, "latte"); // 1 머지? 아 첫번째 물음표 
	
			
			int row = pstmt.executeUpdate();
			System.out.println(row + " 행이 업데이트 되었습니다.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
