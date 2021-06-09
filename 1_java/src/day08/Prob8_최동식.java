 ㅑㅐ0package day08;

import javax.swing.JOptionPane;

public class Prob8_최동식 {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Member m = new Member();
		String msg = JOptionPane.showInputDialog("1.로그인 | 2.회원가입 | 3.종료");

		switch (msg) {
		case "1":
//			String id = JOptionPane.showInputDialog("ID 입력");
			break;
		case "2":
			String id = JOptionPane.showInputDialog("생성할 ID 입력");
			ms.push(id);
			break;
		case "3":
			break;
		default:
			System.out.println("1 2 3 중 하나를 입력하세요");
			break;
		}
		
		System.out.println(m.getId());
	}
}

class Member1 {
	String[] mId;
	String pw, name;

	public Member1() {
		super();
	}

	public Member1(String[] id, String pw, String name) {
		super();
		this.mId = id;
		this.pw = pw;
		this.name = name;
	}

	public String[] getId() {
		return mId;
	}

	public void setId(String[] id) {
		this.mId = id;
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

}

class MemberService2{
	Member m = new Member();
	String[] msID;
	int count = 0;
	
	MemberService2(){
		msID = new  String[10];
	}
	public void push(String id) {
		
	}
	public MemberService2(int size) {
		msID = new String[ size > 0 ? size : 10 ];
	}
	public boolean isFull() {
		return count == msID.length ? true : false;
	}
	
	public void push(String[] data) {
		if(isFull()) {
			String[] temp = new String[msID.length * 2];
			System.arraycopy(msID, 0, temp, 0, msID.length);
			msID = temp;
			temp = null;
		}else {
			msID[count++] = data[count++];
			m.setId(data);
		}
	}
	
}

class WrongPasswordException1 extends Exception {

	public WrongPasswordException1() {
		super("비밀번호가 틀렸습니다");
	}

	public WrongPasswordException1(String msg1) {
		super(msg1);
	}
}

class NotExistIDException1 extends Exception {

	public NotExistIDException1() {
		super("존재하지 않는 ID입니다");
	}

	public NotExistIDException1(String msg1) {
		super(msg1);
	}
}