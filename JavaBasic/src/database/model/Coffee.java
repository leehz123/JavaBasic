package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;


//���̺�� �Ȱ��� ���� ������ Ŭ����
//������ �� Ŭ����(������ Ŭ����) Coffee
public class Coffee {
	
	//������ Ŭ������ �� �ν��Ͻ��� DB�� �� ���� ���� �� �ִ�.	(���� 100���� �ν��Ͻ��� 100�� ��������) 
	
	
	
	// # ������ Ŭ���� ��Ģ 1 : �ʵ��� ���� �����ڴ� private�� �����Ѵ�.
	private Integer cid;	//Integer�� �ϴ� ������ DB������ �������� null ���� ���� �� �ֱ� ������ �׿� �����ϱ� ����
	private String kor_name;
	private String eng_name;
	private Integer location_id;
	private Date expiry;	//java.util.Date
	
	// # ������ Ŭ���� ��Ģ 2 : ������ �ʿ��� �ʵ�� getter�޼��带 �ް�, ������ �ʿ��� �ʵ�� setter�޼��带 �޾��ش�. 
	//ctrl + space �ϰ� get, setġ�� getter, setter�ڵ� ������  (get�� ����� �� �ʵ�� �ϰ� ������ �� ���� �̷� ������ ������ ���� �� �ְ���) 
	public Integer getCid() {
		return cid;
	}	
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	public String getKor_name() {
		return kor_name;
	}
	public void setKor_name(String kor_name) {
		this.kor_name = kor_name;
	}
	//set�� ȸ������ �����ϰ� ���� �� . (�ٵ� �̰� this.cid = cid�Ѵٰ� DB���� �����Ǵ� �� �ƴϰ���?)
	
	public String getEng_name() {
		return eng_name;
	}
	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	
	
	public Coffee(ResultSet rs) throws SQLException {
		cid = rs.getInt("cid");
		kor_name = rs.getString("kor_name");
		eng_name = rs.getString("eng_name");
		location_id = rs.getInt("location_id");
		expiry = rs.getDate("expiry");
	}

	
	//add()�޼��忡 �� coffee�ν��Ͻ��� ����� ���� ������
	public Coffee(int cid, String kor_name, String eng_name, int location_id, Date expiry) {	
		this.cid = cid;
		this.kor_name = kor_name;
		this.eng_name = eng_name;
		this.location_id = location_id;
		this.expiry = expiry;
	}


	@Override
	public String toString() {
		return String.format("%s(%s)", kor_name, eng_name);
	}
	
	
	
	//�Ű����� 5���� �� ������ �ƴϸ� Coffee��ü�� �������� ��������
	//�Ű������� �� �����ϴ� �� �ƴ϶� coffee��ü �ϳ��� ��� �����ϸ� �ǰ���
	public static boolean add(Connection conn, Coffee coffee) { //boolean �� add�� �����߳� ���߳� 
		String sql = "INSERT INTO coffeeFour VALUES(?, ?, ?, ?, ?)";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, coffee.cid);
			pstmt.setString(2, coffee.kor_name);
			pstmt.setString(3, coffee.eng_name);
			pstmt.setInt(4, coffee.location_id);
			
			
			//�������java.util.Date�� java.sql.Date�� ��ȯ�Ͽ� �����ؾ� ��.��������
			pstmt.setDate(5, new java.sql.Date(coffee.expiry.getTime()));  // setDate���� setSQL�����͸� �����ؾ� �Ѵ�.
			//getTime()�� �и������� �ǹ� 

			
			//LocalDate�� java.sql.Date�� ��ȯ �ؾ� �ϴ� ��� 
			//java.sql.Date.valueOf(LocalDate.now());
			//�ٵ� �� ������ �и�������� �����ϴ°� ������. LocalDate�� ��¥�� ��������. �и�������� ��¥�� �ð� �ٷ�
			
			return pstmt.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
		
	
		
	

	
	
	
}
