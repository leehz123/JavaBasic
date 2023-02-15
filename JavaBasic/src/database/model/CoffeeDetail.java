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
		//DB����� ID���� ���޹����� Ư�� ���� ��ȸ�� �������ִ� �޼��� 
		//�ٵ� coffeeFour�� cid�� pk������ �� �� �־ ������ ���� ��. �ϴ� cid �߿��� �����ϰ� �����ϴ� ���ڰ����� �׽�Ʈ �غ��� �ɷ�.
	
		// _________________________ ���� ä������ ___________________________
		
		String sql = "SELECT * FROM coffeeFour INNNER JOIN locations2 USING (location_id) " + "WHERE cid = ?";
	
		CoffeeDetail coffeedetail = null;
		try( 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				//ResultSet rs = pstmt.executeQuery(); ����� ���� ����  �Ʒ����ٰ� 
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
		�Ʒ�ó�� �ϸ� �����͸� �� �Ǿ�� �ؼ� �޸� ����. �׷��� �������� �ƿ� �ٽ� ���� �ϴ� ��. WHERE�� Ȱ���ؼ�! 
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
			
			
			//�������� 1. ���ϴ� �� �ϳ��� ���
			System.out.println(get(conn, 4543));
			System.out.println(get(conn, 4321));
			
			
			//�������� 2. ���ϴ� ���� INSERT�ϱ�. ��ü���������� 
			//Coffee���̺� INSERT
			System.out.println(Coffee.add(conn, new Coffee(5, "Ŀ�ǿ���", "coffee milk", 2600, new Date())));
			//�������Ʈ�� java.util.Date��. 
			
			//Location���̺� INSERT
			System.out.println(Location.add(conn, new Location(1005, "Baker St", "221B", "London", null, "UK")));
			//�߰� �� ��
			
			
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
		
	
	//��� coffee�� ���� ���� ���� �ְ� � �� locations�� ���� ���� ���� �ְ����� �� Ŭ���� ���� �� �����ؾ߰���
	
	
	
	
	public static List<CoffeeDetail> getAll(Connection conn)  { 
		//DB���� ������ ���޹����� ��� Ŀ�� ����� ����� �����ϴ� �޼��� (��ü���������� ����� �� ��). ���߿� �ʿ��� �� getAll�� ���ָ� �ǰ��� 
		
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
			//coffee : �������� CoffeeŬ�������� toString() �������̵� �س��� ���� ������ 
			// location : �������� LocationŬ�������� toString()�������̵� �س��� ������ ����	
	}
	
	
	
}
