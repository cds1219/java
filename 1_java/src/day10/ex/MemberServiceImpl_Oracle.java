package day10.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class MemberServiceImpl_Oracle implements MemberService{

	//JDBC 연동
	String sql="";	// select insert update delete
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int row = 0;
	
	public MemberServiceImpl_Oracle() {
		super();
	}

	@Override
	public void insertMember(Member member) {
		try {
			con=JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// 치환함수 ? 에 값 세팅
				//오라클은 1부터
			ps.setString(1, "ID");
			ps.setString(2, "PW");
			ps.setString(3, "NAME");
			
			//실행할 준비가 되면 실행
			row = ps.executeUpdate();	// insert update delete	-- auto commit
			
			//결과값 핸들링
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}

	@Override
	public Member login(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

}
