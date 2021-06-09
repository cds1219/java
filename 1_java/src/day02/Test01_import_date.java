package day02;

import java.util.Date;
//동일한 이름 import는 안된다
//import java.sql.Date;

public class Test01_import_date {
	//클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)
	
//	int 		num;
//	Data Type	변수명
//	String 		name;
//	System.out.println();  error 발생-명령문x
	
	//new 없이 메모리 올라가게 하는 역할 static
	public static void main(String[] args) {
		//데이터(local 변수), 명령문
		int num = 'a';	//문자가 int로 바뀜(아스키코드)
		//'A'65, 'a'97 -> 대문자+32=소문자
		System.out.println(num);
		//String
		java.lang.String name = new String("홍길동");
		
		System.out.println(name);
		// . 는 참조형에서만 가능
		System.out.println(name.charAt(0)+"**");
		System.out.println("*"+name.charAt(1)+"*");
		//full path
//		java.util.Date now = new java.util.Date();
		//import를 써줌으로 풀패스를 안써도 된다
		Date now = new Date();
		System.out.println(now);
//		System.out.println(now.getYear());

		java.sql.Date now1 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(now1);
//		System.out.println(now1.getYear());
		
		name = null;
		now = null;
		now1 = null;
		
		System.gc();
		
		System.out.println();		
	}
}
