package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Test04_select {
	public static void main(String[] args) {
		String sql="SELECT * FROM users WHERE id = ? and password = ?";	// select insert update delete
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con=JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);	
			// 치환함수 ? 에 값 세팅
			//오라클은 1부터
			ps.setString(1, JOptionPane.showInputDialog("ID"));
			ps.setString(2, JOptionPane.showInputDialog("PW"));
			
			//실행할 준비가 되면 실행
			rs = ps.executeQuery();	// select
			
			while (rs.next()) {
				System.out.println("===========로그인 정보===========");
				System.out.printf("%s ",rs.getString("id"));
				System.out.printf("%s%n",rs.getString("name"));
			}
			System.out.println("=======================================");
			//결과값 핸들링
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
	}
}
