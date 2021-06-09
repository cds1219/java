package day02;

import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		// String은 참조형이지만 세미타입으로 기본형처럼 사용
		java.lang.String name1 = new String("홍길동");	//heap영역
		String name2 = new String("홍길동");

		String name3 = "홍길동";	//코드표영역
		String name4 = "홍길동";

		//name1 2 3 4 다 동일한 결과를 가진다
		System.out.println(name3);
		System.out.println(name3.charAt(0) + "**");
		System.out.println("*" + name3.charAt(1) + "*");
		
		//== 변수의 있는 실제 데이터를 비교한다.	참조형을 비교할 때는 사용하면 안된다.
		System.out.println(name1==name2);	//서로 주소가 다르다 false
		System.out.println(name3==name4);	//서로 주소가 같다 true
		
		name1=name2;
		name3=name4;
		
		System.out.println(name1==name2);	//서로 주소가 같다 true
		System.out.println(name3==name4);	//서로 주소가 같다 true
		
		String date = new Date().toLocaleString();//임시객체	gc()대상
		System.out.println(date);
	}

}

//javac -d ../bin day02/Test02.java -encoding utf-8
