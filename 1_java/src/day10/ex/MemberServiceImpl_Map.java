package day10.ex;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl_Map implements MemberService {

	Map<String, Member> map;

	MemberServiceImpl_Map(){
		map=new HashMap<String, Member>();
	}

	@Override
	public void insertMember(Member member) {
//		System.out.println("MemberServiceImpl_Map 동작");
		map.put(member.getId(), member);
	}

	@Override
	public Member login(String id, String pw) throws NotExistIDException, WrongPasswordException {
		Member data = null;

		if (map.get(id) == null)
			throw new NotExistIDException();
		if (map.get(id).getPw().equals(pw)) {
			data = map.get(id);
		} else {
			throw new WrongPasswordException();
		}

		return data;
	}

}
