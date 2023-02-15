package database.model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;

public class Coffee_locations2 {  //�̰Ŵ� �� Ǯ�� Ŭ���� 
	
	/*
	private Integer cid;	//Integer�� �ϴ� ������ DB������ �������� null ���� ���� �� �ֱ� ������ �׿� �����ϱ� ����
	private String kor_name;
	private String eng_name;
	private Location location_id;  //�̷��� �ϸ� ���� : Coffee�� �θ� ������ Location �� �θ��� ������ �޸� ����
	private Date expiry;	//java.util.Date
	
	 */

	
	private Integer location_id;
	private Integer cid;
	private String kor_name;
	private String eng_name;
	private Date expiry;
	private String street_address;
	private String postal_code; 
	private String city;
	private String state_province;
	private String country_id;
	
	ResultSetMetaData meta;
	
	public Coffee_locations2(ResultSet rs) throws SQLException {
		this.location_id = rs.getInt(1);
		this.cid = rs.getInt(2);
		this.kor_name = rs.getString(3);
		this.eng_name = rs.getString(4);
		this.expiry = rs.getDate(5);
		this.street_address = rs.getString(6);
		this.postal_code = rs.getString(7);
		this.city = rs.getString(8);
		this.state_province = rs.getString(9);
		this.country_id = rs.getString(10);
	}
	
	
	@Override
	public String toString() {
		
		return String.format("%-10d%-10d%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s", location_id, cid, kor_name, eng_name, 
				expiry, street_address, postal_code, city, state_province, country_id);
	}
	
	
	
}
