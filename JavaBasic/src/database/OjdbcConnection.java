package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//매번 써주기 귀찮으니까 여러번 쓰는 것들 or 한번만 스면 되는 것들 변수와 메서드화 해주자 

public class OjdbcConnection {
	//드라이버네임 왜 private해놨었음?
	public static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	
	private static String user = "hr";
	private static String password = "1234"; 
	//이렇게 하면 거슬리지? 노출돼있자늠. 파일에 암호화해서 저장한 다음에 꺼낼 땐 복호화해서 어쩌고 
	//암호화는 어떻게 하겠어 제대도된 암호알고리즘(시저 말고) 사용해야지 
	//Object형식으로 써놓은 파일을 Object형식으로 꺼내서 사용하면 되겟지
	//환경설정으로 들어가서 Object파일 생성한 다음 가져다 쓰는 것도 괜찮고 
	//울 컴터에 깔려 있는 데베가 있는가 보고 . 
	//C: 가서 데베가 있는가 확인하고? 먼소리임
	
	
	
	
	//static초기화 블록으로 드라이버 로드 해놓으면 앞으로 드라이버 쓸 때마다 로드 해줄 필요 없겠지! 
	//★스태틱 영역은 무조건 메모리에 실어놓는 것이 아니라 해당 클래스가 최초로 사용되는 시점에 메모리에 실리게 된다.★
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver Name Error : " + driverName);
		}
	}
	
	
	//원래는 Connection conn = DriverManager.getConnection(url, user, password);
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}//Connection conn = OjdbcConnection.getConnection(); 이렇게 받아서 사용하면 되겠지
}
