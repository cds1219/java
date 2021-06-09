package day08;

import java.util.Scanner;

public class Prob8_최동식3 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.print("로그인 : ");
				break;
			case 2:
				System.out.print("회원가입 : ");
				break;
			case 3:
				run = false;
				break;
			default:
			}
			System.out.println();
		}

		System.out.println("프로그램 종료");

		if (scanner != null)
			scanner.close();
		scanner = null;
	}
}

class Member {
	String loginId;
	String loginPw;
	int id;
}

class MemberService {
	Member[] members;
	Scanner scanner;
	int memberLastIndex=-1;

	public MemberService() {
		super();
	}

	void getSignUp() {
		Member1 member = new Member1();
		Member1 lastMember = null;

		if (memberLastIndex >= 0)
			lastMember = members[memberLastIndex];

		int newId;

		if (lastMember == null)
			newId = 1;
		else
			newId = lastMember.id + 1;
		
		member.id =newId;

		System.out.println("==회원가입==");
		System.out.println("ID : ");
		member.loginId = scanner.nextLine();
		System.out.println("Password : ");
		member.loginPw = scanner.nextLine();
		
		int memberNewIndex = memberLastIndex+1;
		members[memberNewIndex]=member;
		System.out.printf("%s 회원가입 됐습니다",member.loginId);
		memberLastIndex++;
	}

}
