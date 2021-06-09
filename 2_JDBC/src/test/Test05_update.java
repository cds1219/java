package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Test05_update {
	public static void main(String[] args) {
		String sql="UPDATE users SET password = ? WHERE id = ?";	// select insert update delete
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con=JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);	// 치환함수
			ps.setString(2, JOptionPane.showInputDialog("ID"));
			ps.setString(1, JOptionPane.showInputDialog("PW"));
			
			//실행할 준비가 되면 실행
			row = ps.executeUpdate();	// insert update delete
			
			//결과값 핸들링
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
	}
}
