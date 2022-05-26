import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBselect {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// 1. JDBC Driver Class - com.mysql.cj.jdbc.Driver
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// 2. 데이터베이스에 연결하기 위한 정보
		String url = "jdbc:mysql://localhost:3306/solodb";
		String user = "root";
		String pw = "0000";
		
		String SQL = "SELECT * FROM usertable";
		
		try {
			// 1. JDBC 드라이버 로딩
			Class.forName(driver);
			
			// 2. Connection 객체 생성
			con = DriverManager.getConnection(url, user, pw);
			
			// 3. Statement 객체 생성
			stmt = con.createStatement();
			
			// 4. SQL 문장을 실행하고 결과를 리턴
			rs = stmt.executeQuery(SQL);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String username = rs.getString("userName");
				String email = rs.getString("email");
				int birthYear = rs.getInt("birthYear");
				
				System.out.println(id + "  " + username + "  " + email + "  " + birthYear);
			}
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}