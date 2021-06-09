package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Test03_insert {
	public static void main(String[] args) {
																//치환변수	?
		String sql="INSERT INTO users (id,password,name) VALUES (?,?,?)";	// select insert update delete
		
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
			ps.setString(3, JOptionPane.showInputDialog("NAME"));
			
			//실행할 준비가 되면 실행
			row = ps.executeUpdate();	// insert update delete	-- auto commit
			
			//결과값 핸들링
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
	}
}
