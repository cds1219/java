package day10.ex;

public class MemberServiceImpl_Array implements MemberService{

	Member[] members;
	int count = 0;
	
	MemberServiceImpl_Array(){
		members = new Member[100];
	}
	MemberServiceImpl_Array(int size){
		members = new Member[size > 0? size:100];
	}
	
	@Override
	public void insertMember(Member member) {
//		System.out.println("MemberServiceImpl_Array 동작");
		
		if(members.length == count) {
			Member[] temp = new Member[members.length * 2];
			System.arraycopy(members, 0, temp, 0, members.length);
			members = temp;
			temp = null;
		}
		members[count++] = member;
	}

	@Override
	public Member login(String id, String pw) throws NotExistIDException, WrongPasswordException {
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
