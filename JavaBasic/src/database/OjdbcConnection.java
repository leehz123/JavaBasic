package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//�Ź� ���ֱ� �������ϱ� ������ ���� �͵� or �ѹ��� ���� �Ǵ� �͵� ������ �޼���ȭ ������ 

public class OjdbcConnection {
	//����̹����� �� private�س�����?
	public static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	
	private static String user = "hr";
	private static String password = "1234"; 
	//�̷��� �ϸ� �Ž�����? ��������ڴ�. ���Ͽ� ��ȣȭ�ؼ� ������ ������ ���� �� ��ȣȭ�ؼ� ��¼�� 
	//��ȣȭ�� ��� �ϰھ� ���뵵�� ��ȣ�˰���(���� ����) ����ؾ��� 
	//Object�������� ����� ������ Object�������� ������ ����ϸ� �ǰ���
	//ȯ�漳������ ���� Object���� ������ ���� ������ ���� �͵� ������ 
	//�� ���Ϳ� ��� �ִ� ������ �ִ°� ���� . 
	//C: ���� ������ �ִ°� Ȯ���ϰ�? �ռҸ���
	
	
	
	
	//static�ʱ�ȭ ������� ����̹� �ε� �س����� ������ ����̹� �� ������ �ε� ���� �ʿ� ������! 
	//�ڽ���ƽ ������ ������ �޸𸮿� �Ǿ���� ���� �ƴ϶� �ش� Ŭ������ ���ʷ� ���Ǵ� ������ �޸𸮿� �Ǹ��� �ȴ�.��
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver Name Error : " + driverName);
		}
	}
	
	
	//������ Connection conn = DriverManager.getConnection(url, user, password);
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}//Connection conn = OjdbcConnection.getConnection(); �̷��� �޾Ƽ� ����ϸ� �ǰ���
}
