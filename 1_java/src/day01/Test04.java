package day01;

public class Test04 {
	//클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)


	public static void main(String[] args) {
		//데이터(local 변수), 명령문
//		int num;`
		//초기화를 해야지 사용가능
		long num2 =9999999999l;
		//			기본int라서 l붙여줘야 한다
		int x=(int)num2;
		//데이터 손실은 발생하지만
		//큰사이즈에서 작은사이즈로 바꾸려면 캐스팅
		x=200;
		System.out.println(x); // 200
		
		int y=(int)7.9;
		System.out.println(y);// 7
		
//		double d=6.6;
		float f=6.6f;
		System.out.println(f);// 6.6
		
		String name = "홍길동";
		System.out.println(name);
		System.out.println(name.charAt(0)+"**");
		
		String msg=null; //null 주소가 없음
		msg="	hello java ~~~~~~	";
		System.out.println(msg);
		System.out.println(msg.toUpperCase()); //읽어온 데이터를 대문자로 (원본은 그대로)
		System.out.println(msg.trim().toUpperCase());
		//trim 공백을 제거(양옆만 가능, 가운데는 안됨)하고 대문자로
		System.out.println(msg);// 원본 변화 없음 확인
		msg=msg.trim();// 원래 있던것을 읽어와서 공백을 제거한 것을 주소 할당
		System.out.println(msg);// 바뀐 것 확인
		msg=null;//주소 없음
	}

}
