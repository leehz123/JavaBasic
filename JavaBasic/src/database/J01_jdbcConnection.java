package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_jdbcConnection {
	/*
	
		# JDBC ; Java Database Connectivity
	DB�� �������� ������ ������ �� ����� �޾ƿ� �� �ִ� Java API
	�پ��� ������ DB�� ����� �� �ֵ��� ����Ǿ� �ִ�. 
	Java�� �ҽ��ڵ�� � �ڵ��� DB�� �����ϴ��� �׻� �����ϴ�. ������ �����ó�� ����� �� �ִ�. ǥ��ȭ�� �԰����� (like 220v)
	
	
		
		# OJDBC 
	����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� �������� ���̺귯�� 
	����Ŭ �����ͺ��̽��� ��ġ�� ������ ���ԵǾ� �ִ�. 
	SQLDeveloper ���ο��� ���ԵǾ� �ִ�. ���� �ϳ��� ���� ����ϸ� ��
	
	 */
	
	
	
	/*
	<���̺귯�� �����>
	JavaBasic - ���콺 ���� - Build Path - Configure Build Path... 
	- Libraries - ClassPath - AddExternal JARs... - (JavaAWS - database - sqldeveloper - jdbc - ojdbc8 Ŭ��)
	- Classpath �ؿ� ojdbc8.jar - C:\JavaAWS\..��¼�� ��� �߸� �� ���� - Apply and Close
	JavaBasic ������ Referenced Libraries - ojdbc8.jar - C:\JavaAWS\.. ���� �� Ȯ��
	 */
	
	
	public static void main(String[] args) {
		
		// 1. Class.forName() ���� jdbc����̹��� �ε��ؾ� �Ѵ�.
		try {				//oracle.jdbc.driver.OracleDriver�� �޴��� �� Ŭ���� ����϶�� �� �־ ���� ���� �ŷ� 
			Class.forName("oracle.jdbc.driver.OracleDriver"); //�ѹ� �̷��� ����� ����� ����̺� �ε��� �ȴ�.
			System.out.println("����̹� �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			// 
			e.printStackTrace();
			System.out.println("����̹� �ε� �� ���� �߻�");
		}  
		
		

		// 2. DriverManagerŬ������ ���� DB�� ����
		try { //java.sql.Connection�������̽� 
			Connection conn = 		
			DriverManager.getConnection( //jdbc:oracle:thin:@localhost:1521:XE�� sqldeveloper���� ����������� �������� �Ʒ��ʿ� �Է� �� �ִ� ������
					"jdbc:oracle:thin:@localhost:1521:XE",	//@ �ڿ��� �������ּ� �Է��ص� ��.  
					"hr", "1234");  //������ �� ���̵�� ����� �Է�
			System.out.println("���� ���� �Ϸ� " + conn);
			//���� ���� �Ϸ� oracle.jdbc.driver.T4CConnection@3c9754d8
			
		//3. ������ ������ ���� ������ ���� ����
			//3-1 : ���� �غ��ϱ� 
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees"
						+ " INNER JOIN departments USING (department_id) ORDER BY employee_id"
					); // INNER JOIN �տ� ���� �ϳ� �� �θ� ������ ���� �����
			
			//3-2 : �غ�� ���� �����ϱ� 
			ResultSet rs = pstmt.executeQuery();
			
		//4. �޾ƿ� ����� ���
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
			
		//5. �� ����� ������ �ݾ���� �Ѵ�. ���� ���߿� ������ ������� �ݾ���� �� 
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
		
		/*
		@ �ڿ� �������ּ� �Է��ϴ� �� ���� ����
		�ڱ��� ������ �ּ� ���� ��. cmd�� ipconfig�� ������ �ּ� ���� �ؼ� �׷��� �ĳ־ ��. �� IPv4�ּҴ� 192.168.0.18  		
		127.0.0.1�Է��ص� �ȴٴµ� �̰� ����?
		����~ localhost(����ȣ��Ʈ)�� ��ǻ�� ��Ʈ��ũ���� ����ϴ� ������ ȣ��Ʈ������, �ڽ��� ��ǻ�͸� �ǹ��Ѵ�. IPv4������ IP �ּҴ� 127.0.0.1
		 */
		
		
	}
}
