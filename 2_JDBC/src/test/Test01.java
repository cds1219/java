package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("************** JDBC Test **************");
		String driver="oracle.jdbc.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user="SCOTT";
		String pw="TIGER";
		
		String sql="SELECT * FROM dept";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			
			//2.DB로 연결
			con=DriverManager.getConnection(url, user, pw);
			
			//3.SQL 구문을 관리해주는 Statement 객체생성
			st=con.createStatement();
			
			//4.SQL 구문 실행
			rs=st.executeQuery(sql);
			System.out.println("**********결과값 보기**********");
			
			while(rs.next()) {
				System.out.printf("%-15s | ",rs.getString("dname"));
				System.out.printf("%-15s | ",rs.getString("loc"));
				System.out.printf("%s | ",rs.getString("deptno"));
				System.out.println();
			}
			
			System.out.println("***************************");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(st!=null)st.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
