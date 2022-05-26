import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {

	public static void main(String[] args) {
		// 데이터 베이스 연결하는 객체 생성
		Connection con = null;
		
		// 1. JDBC Driver Class
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// 2. 데이터베이스에 연결하기 위한 정보 입력
		String url = "jdbc:mysql://localhost:3306/solodb";
		String user = "root";
		String pw = "0000";
		
		try {
			// 1. JDBC 드라이버 로딩
			Class.forName(driver);
			
			// 2. Connection 생성
			con = DriverManager.getConnection(url, user, pw);
			
			System.out.println("[Database 연결 성공]");
		} catch (SQLException e) {
			System.out.println("[SQL Error : " + e.getMessage() + "]");
		} catch (ClassNotFoundException e1) {
			System.out.println("[JDBC Connector Driver Error : " + e1.getMessage() + "]");
		} finally {
			// Connection 사용후 Close
			if(con != null) {
				try {
					con.close();
				}catch (Exception e) {
					
				}
			}
		}
	}
}
