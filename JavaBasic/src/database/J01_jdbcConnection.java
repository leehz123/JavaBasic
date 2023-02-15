package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_jdbcConnection {
	/*
	
		# JDBC ; Java Database Connectivity
	DB에 쿼리문을 전달해 실행한 후 결과를 받아올 수 있는 Java API
	다양한 종류의 DB와 연결될 수 있도록 설계되어 있다. 
	Java쪽 소스코드는 어떤 코드의 DB와 연결하더라도 항상 동일하다. 일종의 어댑터처럼 사용할 수 있다. 표준화된 규격으로 (like 220v)
	
	
		
		# OJDBC 
	오라클 데이터베이스가 JDBC API와 소통하기 위해 만들어놓은 라이브러리 
	오라클 데이터베이스가 설치된 폴더에 포함되어 있다. 
	SQLDeveloper 내부에도 포함되어 있다. 둘중 하나에 가서 사용하면 댐
	
	 */
	
	
	
	/*
	<라이브러리 만들기>
	JavaBasic - 마우스 오른 - Build Path - Configure Build Path... 
	- Libraries - ClassPath - AddExternal JARs... - (JavaAWS - database - sqldeveloper - jdbc - ojdbc8 클릭)
	- Classpath 밑에 ojdbc8.jar - C:\JavaAWS\..어쩌고 길게 뜨면 된 거임 - Apply and Close
	JavaBasic 플젝에 Referenced Libraries - ojdbc8.jar - C:\JavaAWS\.. 생긴 거 확인
	 */
	
	
	public static void main(String[] args) {
		
		// 1. Class.forName() 으로 jdbc드라이버를 로드해야 한다.
		try {				//oracle.jdbc.driver.OracleDriver은 메뉴얼에 저 클래스 사용하라고 써 있어서 저거 쓰는 거래 
			Class.forName("oracle.jdbc.driver.OracleDriver"); //한번 이렇게 언급을 해줘야 드라이브 로딩이 된다.
			System.out.println("드라이버 로딩 완료");
		} catch (ClassNotFoundException e) {
			// 
			e.printStackTrace();
			System.out.println("드라이버 로딩 중 에러 발생");
		}  
		
		

		// 2. DriverManager클래스를 통해 DB에 연결
		try { //java.sql.Connection인터페이스 
			Connection conn = 		
			DriverManager.getConnection( //jdbc:oracle:thin:@localhost:1521:XE는 sqldeveloper들어가서 연결수동생성 눌러보면 아래쪽에 입력 돼 있는 내용임
					"jdbc:oracle:thin:@localhost:1521:XE",	//@ 뒤에는 아이피주소 입력해도 됨.  
					"hr", "1234");  //연결할 땐 아이디랑 비번도 입력
			System.out.println("연결 생성 완료 " + conn);
			//연결 생성 완료 oracle.jdbc.driver.T4CConnection@3c9754d8
			
		//3. 생성된 연결을 통해 쿼리문 전달 가능
			//3-1 : 구문 준비하기 
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees"
						+ " INNER JOIN departments USING (department_id) ORDER BY employee_id"
					); // INNER JOIN 앞에 공백 하나 안 두면 에러남 존나 웃기네
			
			//3-2 : 준비된 구문 실행하기 
			ResultSet rs = pstmt.executeQuery();
			
		//4. 받아온 결과를 사용
			while(rs.next()) {
				System.out.printf("%-8d%15s%15s%10s%20s%8d\n", 
						rs.getInt("employee_id"), 
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("job_id"),
						rs.getString("department_name"),
						rs.getInt("salary")
						);
			}
			
		//5. 다 사용한 연결은 닫아줘야 한다. 역시 나중에 생성한 순서대로 닫아줘야 함 
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결 생성 실패");
		}
		
		/*
		@ 뒤에 아이피주소 입력하는 거 관련 설명
		자기컴 아이피 주소 들어가도 됨. cmd로 ipconfig로 아이피 주소 보기 해서 그렇게 쳐넣어도 됨. 내 IPv4주소는 192.168.0.18  		
		127.0.0.1입력해도 된다는데 이건 머임?
		아하~ localhost(로컬호스트)는 컴퓨터 네트워크에서 사용하는 루프백 호스트명으로, 자신의 컴퓨터를 의미한다. IPv4에서의 IP 주소는 127.0.0.1
		 */
		
		
	}
}
