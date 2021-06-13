package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.JDBCUtil;
import vo.UserVO_Encapsulation;

public class UserDAO {
	public ArrayList<UserVO_Encapsulation> selectUsers() {
		String sql="select * from users";	// select insert update delete
		
		Connection con = null;
		PreparedStatement ps = null;//보안, 사용성, 성능
		ResultSet rs = null;
		int row = 0;
		
		try {
			con=JDBCUtil.getConnection();//1.드라이버 등록, 2.연결
			ps = con.prepareStatement(sql);	//3.Statement생성 - 치환함수
			
			//4.실행할 준비가 되면 실행
			rs = ps.executeQuery();	// select
			//row = ps.executeUpdate();	// insert update delete
			
			ArrayList<UserVO_Encapsulation> list=new ArrayList();
			//꺼낼때 속도가 향상
			
			//5.결과값 핸들링
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("password");
				String name = rs.getString("name");
				String role = rs.getString("role");
				
				//System.out.println(id+" : "+pw+" : "+name+" : "+role);
				UserVO_Encapsulation user=new UserVO_Encapsulation(id,pw,name,role);
				list.add(user);
			}
			
			return list;//void->ArrayList<UserVO>
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;//void->ArrayList<UserVO>
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
	}
}
