package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookTest {
//	public static Connection getConnection() {
//		Connection con = null;
//
//		String driver="oracle.jdbc.OracleDriver";
//		String url ="jdbc:oracle:thin:@localhost:1521:xe";
//		String user="SCOTT";
//		String pw="TIGER";
//		
//		try {
//			
//			// 1.드라이버 로딩
//			Class.forName(driver);
//			// 2.DB로 연결
//			con = DriverManager.getConnection(url, user, pw);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return con;
//
//	}
//
//	public static void close(Connection con, Statement st, ResultSet rs) {
//		try {
//			if (rs != null)
//				rs.close();
//			if (st != null)
//				st.close();
//			if (con != null)
//				con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void insertBook(BookDTO book) {
//		String sql = "INSERT INTO book VALUES (?, ?, ?, ?, ?, ?)";
//		Connection con = null;
////		Connection con;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		int row = 0;
//
//		try {
//			con = getConnection();
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, book.getIsbn());
//			ps.setString(2, book.getTitle());
//			ps.setString(3, book.getAuthor());
//			ps.setString(4, book.getPublisher());
//			ps.setInt(5, book.getPrice());
//			ps.setString(6, book.getDes());
//
//			row = ps.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			close(con, ps, rs);
//		}
//	}
//
//	public void printAllBooks() {
//		String sql = "select * from book";
//
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
////		int row = 0;
//
//		try {
//			con = getConnection();
//			ps = con.prepareStatement(sql);
//			rs = ps.executeQuery(); // select
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			close(con, ps, rs);
//		}
//	}

	
	//JDBCUtil 사용
	public void insertBook(BookDTO book) {
		String sql = "INSERT INTO book VALUES (?, ?, ?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, book.getIsbn());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getPublisher());
			ps.setInt(5, book.getPrice());
			ps.setString(6, book.getDes());

			row = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

	public void printAllBooks() {
		String sql = "select * from book";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				BookDTO BookDTO = new BookDTO();
				BookDTO.setIsbn(rs.getInt(1));
				BookDTO.setTitle(rs.getString(2));
				BookDTO.setAuthor(rs.getString(3));
				BookDTO.setPublisher(rs.getString(4));
				BookDTO.setPrice(rs.getInt(5));
				BookDTO.setDes(rs.getString(6));
				System.out.println(BookDTO.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}
