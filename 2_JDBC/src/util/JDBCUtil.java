package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {

	public static Connection getConnection() {
		Connection con = null;

		try {
			Properties p = new Properties();
			p.load(new FileInputStream("dbinfo.txt"));

			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String pw = p.getProperty("pw");
			
			//1.드라이버 로딩
			Class.forName(driver);
			//2.DB로 연결
			con = DriverManager.getConnection(url, user, pw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void close(Connection con, Statement st, ResultSet rs) {
		try {
			if(rs!=null)rs.close();
			if(st!=null)st.close();
			if(con!=null)con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
