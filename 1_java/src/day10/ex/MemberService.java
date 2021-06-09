package day10.ex;


public interface MemberService {

	void insertMember(Member member);
	public Member login(String id , String pw) throws NotExistIDException , WrongPasswordException;
	
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
