package day10.ex;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		//map 구조로 교체///////////////////////////////////////
		MemberService service=null;
//		MemberService service=new MemberServiceImpl_Map();
//		MemberService service=new MemberServiceImpl_Array();
//		MemberService service=new MemberServiceImpl_Oracle();
		
		String cmd=JOptionPane.showInputDialog("1.Array | 2.Map | 3.Oracle");
		
		switch (cmd) {
		case "1":
			service=new MemberServiceImpl_Array();
			break;
		case "2":
			service=new MemberServiceImpl_Map();
			break;
		case "3":
			service=new MemberServiceImpl_Oracle();
			break;
		default:
			service=new MemberServiceImpl_Oracle();
			break;
		}
		//////////////////////////////////////////////////////////
		service.insertMember(new Member("red", "1234", "홍길동"));
		service.insertMember(new Member("blue", "1234", "박길동"));
		service.insertMember(new Member("white", "1234", "고길동"));
		service.insertMember(new Member("yellow", "1234", "노길동"));
		
		Member login = null;
		
		try {
			login = service.login("yellow", "1234");
		} catch (NotExistIDException | WrongPasswordException e) {
			System.out.println(e.getMessage());
		}
		
		if(login != null) {
			System.out.println("로그인 정보");
			System.out.println(login);
		}else {
			System.out.println(" 로그인 실패 ");
		}
		
		System.out.println("종료 ..");
	}
}
