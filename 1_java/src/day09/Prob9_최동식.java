package day09;

import java.util.HashMap;
import java.util.Map;

public class Prob9_최동식 {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		service.insertMember(new Member("red", "1234", "홍길동"));
		service.insertMember(new Member("blue", "1234", "박길동"));
		service.insertMember(new Member("white", "1234", "고길동"));
		service.insertMember(new Member("yellow", "1234", "노길동"));
		
		Member login = null;
		
		try {
			login = service.login("yellow", "124");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}//or로
		
		if(login != null) {
			System.out.println("로그인 정보");
			System.out.println(login);
		}else {
			System.out.println(" 로그인 실패 ");
		}
		
		System.out.println("종료 ..");
	}
}

class MemberService{
	Map<String,Member> map;
	
	MemberService(){
		map=new HashMap<String, Member>();
	}
	
	void insertMember(Member member) {
		map.put(member.getId(), member);
	}
	
	public Member login(String id , String pw) throws NotExistIDException , WrongPasswordException{
		Member data = null;
		
		if(map.get(id)==null) throw new NotExistIDException();
		if(map.get(id).getPw().equals(pw)) {
			data=map.get(id);
		}else {
			throw new WrongPasswordException();
		}
		
		return data;
	}
	
}

class Member{
	private String id ;
	private String pw ;
	private String name;
	
	public Member() {
		super();
	}
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
}

class WrongPasswordException extends Exception{
	public WrongPasswordException(){
		super("비밀번호를 확인해 주세요");
	}
	public WrongPasswordException(String msg){
		super(msg);
	}
}

class NotExistIDException extends Exception{
	public NotExistIDException(){
		super("ID를 확인해 주세요");
	}
	public NotExistIDException(String msg){
		super(msg);
	}
}


