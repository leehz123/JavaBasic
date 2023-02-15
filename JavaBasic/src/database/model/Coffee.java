package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;


//테이블과 똑같이 생긴 데이터 클래스
//데이터 모델 클래스(데이터 클래스) Coffee
public class Coffee {
	
	//데이터 클래스의 한 인스턴스가 DB의 한 행을 담을 수 있다.	(행이 100개면 인스턴스가 100개 나오겠지) 
	
	
	
	// # 데이터 클래스 규칙 1 : 필드의 접근 제어자는 private로 설정한다.
	private Integer cid;	//Integer로 하는 이유는 DB에서는 언제든지 null 값이 나올 수 있기 때문에 그에 대응하기 위해
	private String kor_name;
	private String eng_name;
	private Integer location_id;
	private Date expiry;	//java.util.Date
	
	// # 데이터 클래스 규칙 2 : 접근이 필요한 필드는 getter메서드를 달고, 수정이 필요한 필드는 setter메서드를 달아준다. 
	//ctrl + space 하고 get, set치면 getter, setter자동 생성됨  (get만 만들고 이 필드는 니가 수정할 수 없다 이런 식으로 권한을 나눌 수 있겠지) 
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
	//set은 회원정보 수정하고 싶을 때 . (근데 이거 this.cid = cid한다고 DB까지 수정되는 건 아니겠지?)
	
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

	
	//add()메서드에 들어갈 coffee인스턴스를 만들기 위한 생성자
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
	
	
	
	//매개변수 5개를 다 쓰느냐 아니면 Coffee객체를 쓰느냐의 문제였음
	//매개변수로 다 전달하는 게 아니라 coffee객체 하나로 묶어서 전달하면 되겠지
	public static boolean add(Connection conn, Coffee coffee) { //boolean 은 add를 성공했냐 안했냐 
		String sql = "INSERT INTO coffeeFour VALUES(?, ?, ?, ?, ?)";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, coffee.cid);
			pstmt.setString(2, coffee.kor_name);
			pstmt.setString(3, coffee.eng_name);
			pstmt.setInt(4, coffee.location_id);
			
			
			//▲▲▲▲▲▲java.util.Date를 java.sql.Date로 변환하여 전달해야 함.▲▲▲▲▲▲▲
			pstmt.setDate(5, new java.sql.Date(coffee.expiry.getTime()));  // setDate에는 setSQL데이터를 전달해야 한다.
			//getTime()은 밀리세컨드 의미 

			
			//LocalDate를 java.sql.Date로 변환 해야 하는 경우 
			//java.sql.Date.valueOf(LocalDate.now());
			//근데 젤 좋은건 밀리세컨드로 전달하는게 좋을듯. LocalDate는 날짜만 나와있음. 밀리세컨드는 날짜랑 시간 다룸
			
			return pstmt.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
		
	
		
	

	
	
	
}
