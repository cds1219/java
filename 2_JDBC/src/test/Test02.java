package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.JDBCUtil;

public class Test02 {
	public static void main(String[] args) {
		String sql="SELECT * FROM emp";
//				"SELECT a.ename 사원이름, b.ename 상사이름 from emp a, emp b where a.mgr = b.empno";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {			
			//2.DB로 연결
			con=JDBCUtil.getConnection();
			
			//3.SQL 구문을 관리해주는 Statement 객체생성
			st=con.createStatement();
			
			//4.SQL 구문 실행
			rs=st.executeQuery(sql);
			System.out.println("****************** 결과값 보 기 ******************");
		
			while(rs.next()) {
				System.out.printf("%-10s | ",rs.getString("ename"));
				System.out.printf("%-10s | ",rs.getString("job"));
				System.out.printf("%s | ",rs.getDate("hiredate"));
//				System.out.printf("%-10s | ",rs.getString("사원이름"));
//				System.out.printf("%-10s | ",rs.getString("상사이름"));
				System.out.println();
			}
			
			System.out.println("**********************************************");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, st, rs);
		}
		
	}
}
