package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Location {
	
	private Integer location_id;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	
	
	public Location(int location_id, String street_address, String postal_code, String city, String state_province, String country_id) {
		this.location_id = location_id;
		this.street_address = street_address;
		this.postal_code = postal_code;
		this.city = city;
		this.state_province = state_province;
		this.country_id = country_id;
	}
	
	
	public Location(ResultSet rs ) throws SQLException {
		location_id = rs.getInt("location_id");
		street_address = rs.getString("street_address");
		postal_code = rs.getString("postal_code");
		city = rs.getString("city");
		state_province = rs.getString("state_province");
		country_id = rs.getString("country_id");
	}
	
	
	
	//¿ìÅ¬¸¯ - Source - Generate Getters and Setters - Select All - Generate 
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public String getPostal_codel() {
		return postal_code;
	}
	public void setPostal_codel(String postal_codel) {
		this.postal_code = postal_codel;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState_province() {
		return state_province;
	}
	public void setState_province(String state_province) {
		this.state_province = state_province;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%s(%s), %s", street_address, postal_code, city);
	}
	
	
	public static boolean add(Connection conn, Location location) {
		
		String sql = "INSERT INTO Locations2 VALUES(?, ?, ?, ?, ?, ?)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setInt(1, location.location_id);
			pstmt.setString(2, location.street_address);
			pstmt.setString(3, location.postal_code);
			pstmt.setString(4, location.city);
			pstmt.setString(5, location.state_province);
			pstmt.setString(6, location.country_id);
			
			return pstmt.executeUpdate() > 0;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} 
	}
	
	
}
