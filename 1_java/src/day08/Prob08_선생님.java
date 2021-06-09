package day08;

public class Prob08_선생님 {

	public static void main(String[] args)  {
		MemberService service = new MemberService(3);
		
		service.insertMember(new Member("red", "1234", "홍길동"));
		service.insertMember(new Member("blue", "1234", "박길동"));
		service.insertMember(new Member("white", "1234", "고길동"));
		service.insertMember(new Member("yellow", "1234", "노길동"));
		
		Member login = null;
		
		
		try {
			login = service.login("yellow", "134");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
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

//2. MemberService :Member[] 을 이용하여  Member회원들을 관리 하는 클래스로  , 회원등록 , 로그인처리 가능

class MemberService{
	Member[] members;
	int count = 0;
	MemberService(){
		members = new Member[100];
	}
	MemberService(int size){
		members = new Member[size > 0? size:100];
	}
	
	void insertMember(Member member) {
		if(members.length == count) {
			Member[] temp = new Member[members.length * 2];
			System.arraycopy(members, 0, temp, 0, members.length);
			members = temp;
			temp = null;
		}
		members[count++] = member;
	}
	
	public Member login(String id , String pw) throws NotExistIDException , WrongPasswordException{
		Member data = null;
		for(int i=0; i < count ;i++) {
			if(members[i].getId().equals(id)) {
				if(members[i].getPw().equals(pw)) {
					return members[i];
				}else {
					throw new WrongPasswordException();
				}
			}
			if(i==count-1) {
				throw new NotExistIDException();
			}
		}
		return data;
	}
	
}



//1. Member : 회원들의 정보 클래스 (id , pw , name 정보 )
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

//3. WrongPasswordException 클래스만든다
//4. NotExistIDException 클래스만든다.

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










