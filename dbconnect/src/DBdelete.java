import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBdelete {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// 1. JDBC Driver Class - com.mysql.cj.jdbc.Driver
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// 2. 데이터베이스에 연결하기 위한 정보
		String url = "jdbc:mysql://localhost:3306/solodb";
		String user = "root";
		String pw = "0000";
		
		String SQL = "delete from usertable where id=?";
		
		try {
			// 1. JDBC 드라이버 로딩 
			Class.forName(driver);
			
			// 2. Connection 생성
			con = DriverManager.getConnection(url, user, pw);
			
			// 3. PreParedaStatement 객체 생성, 객체 생성시 SQL 문장 저장
			pstmt = con.prepareStatement(SQL);
			
			// 4. pstmt.set<데이터타입>(? 순서, 값)
			pstmt.setString(1, "JSI");
						
			// 5. SQL 문장을 실행하고 결과를 리턴 - SQL 문장 실행 후, 변경된 row 수 int type 리턴
			int r = pstmt.executeUpdate();
			
			// pstmt.executeQuery() : SELECT
			// pstmt.executeUpdate() : INSERT, UPDATE, DELETE ...
			
			System.out.println("변경된 row : " + r);
			
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");		
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();	
				}catch (SQLException e) {
					e.printStackTrace();				
			    }
			}
			
			if (con != null) {
				try {
					con.close();	
				}catch (SQLException e) {
					e.printStackTrace();				
			    }
			}
		}
	}
}