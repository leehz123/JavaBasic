package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J04_Transaction {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sql = "INSERT INTO coffeeFour VALUES(?, ?, ?, null, sysdate+15)";
		
		System.out.print("몇 개 추가하시겠습니까 ? : ");
		
		int num = sc.nextInt();
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = 	conn.prepareStatement(sql);				
		) {
			
			//Connection객체의 Auto Commit 을 해제한 이후에 트랜잭션을 직접 관리할 수 있디. 
			conn.setAutoCommit(false);
			
			for(int i = 0; i < num; ++i) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "커피" + i);
				pstmt.setString(3, "coffee" + i);
				System.out.printf("%d행이 추가되었습니다. \n" ,pstmt.executeUpdate());
			}
			
			System.out.println("저장하시겠습니까? 예 (1) / 아니오 (0)");
			switch(sc.nextInt()) {
			case 0: 
				conn.rollback();  //rollback()중에 savepoint 넘길 수 있는 메서드도 있음 
				break;
			case 1:
				conn.commit();
				break;
			}
			//커밋과 롤백이 자바쪽에서 이뤄지는 모습 . 트잭관리를 자바에서 할 수 있다. 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		//트잭을 어디다 쓰나? 
		//예외처리에 rollback걸어놓는 것도 괘안태
		
		

	}
}
