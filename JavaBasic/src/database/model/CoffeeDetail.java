package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import database.OjdbcConnection;

public class CoffeeDetail {

	
	Coffee coffee;
	Location location;

	public static CoffeeDetail get(Connection conn, int cid) {
		//DB연결과 ID값을 전달받으면 특정 행을 조회해 리턴해주는 메서드 
		//근데 coffeeFour는 cid가 pk설정이 안 돼 있어서 오류가 나긴 함. 일단 cid 중에서 유일하게 존재하는 숫자값으로 테스트 해보는 걸로.
	
		// _________________________ 직접 채워보기 ___________________________
		
		String sql = "SELECT * FROM coffeeFour INNNER JOIN locations2 USING (location_id) " + "WHERE cid = ?";
	
		CoffeeDetail coffeedetail = null;
		try( 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				//ResultSet rs = pstmt.executeQuery(); 여기다 하지 말고  아래에다가 
		) {					
			pstmt.setInt(1, cid);
	
			try(ResultSet rs = pstmt.executeQuery()) {
				rs.next();
				return new CoffeeDetail(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
		/*
		아래처럼 하면 데이터를 다 실어야 해서 메모리 터짐. 그래서 쿼리문을 아예 다시 만들어서 하는 거. WHERE절 활용해서! 
		List<CoffeeDetail> rows = getAll(conn);
		
		for(int i = 0; i < rows.size(); ++i) {
			if(rows.get(i).coffee.getCid() == cid) {
				return rows.get(i);
			}
		}
		return null;
		*/
	}
	
	
	
	
	public static void main(String[] args) {
		
		Connection conn;
		try {
			conn = OjdbcConnection.getConnection();
			System.out.println(getAll(conn));
			System.out.println(getAll(conn).get(1).toString());
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			
			//연습문제 1. 원하는 행 하나만 출력
			System.out.println(get(conn, 4543));
			System.out.println(get(conn, 4321));
			
			
			//연습문제 2. 원하는 값을 INSERT하기. 객체지향적으로 
			//Coffee테이블에 INSERT
			System.out.println(Coffee.add(conn, new Coffee(5, "커피우유", "coffee milk", 2600, new Date())));
			//▲▲임포트는 java.util.Date로. 
			
			//Location테이블에 INSERT
			System.out.println(Location.add(conn, new Location(1005, "Baker St", "221B", "London", null, "UK")));
			//추가 잘 됨
			
			
			conn.close();		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	/*
	//Coffee
	private Integer cid;	
	private String kor_name;
	private String eng_name;
	private Integer location_id;
	private Date expiry;
	

	//Location
	//private Integer location_id;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id; 
	 
	 */
		
	
	//어떨땐 coffee만 보고 싶을 떄가 있고 어떨 떈 locations만 보고 싶을 떄도 있겠으니 세 클래스 각각 다 존재해야것지
	
	
	
	
	public static List<CoffeeDetail> getAll(Connection conn)  { 
		//DB와의 연결을 전달받으면 모든 커피 목록을 만들어 리턴하는 메서드 (객체지향적으로 만들어 본 것). 나중에 필요할 때 getAll만 해주면 되것지 
		
		List<CoffeeDetail> list = new ArrayList<>();
		
		
		String sql = "SELECT * FROM coffeeFour INNER JOIN locations2 USING (location_id)";
		
		
		try(
				PreparedStatement pstmt = conn.prepareStatement(sql); 
				ResultSet rs = pstmt.executeQuery();		
		) {
			
			while(rs.next() ) {
				list.add(new CoffeeDetail(rs));
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return list;
	}
	
	
	
	
	private CoffeeDetail(ResultSet rs) throws SQLException {
		this.coffee = new Coffee(rs);
		this.location = new Location(rs);
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("coffee: %s, location: %s", coffee, location);
			//coffee : 다음에는 Coffee클래스에서 toString() 오버라이드 해놓은 내용 나오고 
			// location : 다음에는 Location클래스에서 toString()오버라이드 해놓은 내용이 나옴	
	}
	
	
	
}
