package day08;

import java.util.Scanner;

public class Prob8_최동식2 {
	public static void main(String[] args) {
		System.out.println("회원가입");
		System.out.println("아이디를 입력하시오: ");
		Scanner scan_ID = new Scanner(System.in);
		String input_ID = scan_ID.nextLine();

		System.out.println("비밀번호를 입력하시오: ");
		Scanner scan_PW = new Scanner(System.in);
		String input_PW = scan_PW.nextLine();

		System.out.println();

		System.out.println("로그인");
		System.out.println("아이디를 입력하시오: ");
		Scanner scan_new_ID = new Scanner(System.in);
		String new_ID = scan_new_ID.nextLine();

		System.out.println("비밀번호를 입력하시오: ");
		Scanner scan_new_PW = new Scanner(System.in);
		String new_PW = scan_new_PW.nextLine();

//		String login = (new_ID.equals(input_ID) && new_PW.equals(input_PW) ? "로그인 성공" : "로그인 실패");
//		System.out.println(login);
		
		if(new_ID.equals(input_ID))
			if(new_PW.equals(input_PW))
				System.out.println("로그인 성공");

		if (scan_ID != null)
			scan_ID.close();
		scan_ID = null;
		if (scan_PW != null)
			scan_PW.close();
		scan_PW = null;
		if (scan_new_ID != null)
			scan_new_ID.close();
		scan_new_ID = null;
		if (scan_new_PW != null)
			scan_new_PW.close();
		scan_new_PW = null;
	}
}