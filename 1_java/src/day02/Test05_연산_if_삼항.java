package day02;

public class Test05_연산_if_삼항 {
	//클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)

	public static void main(String[] args) {
		//데이터(local 변수), 명령문
		int x=100, y=7;
		System.out.println(x/y);	//몫
		System.out.println(x%y);	//나머지
		
		int num=100;
		System.out.println(num);	//100
		System.out.println(num++);	//num을 출력하고 1 증가
		System.out.println(num);	//101
		System.out.println(++num);	//num을 1 증가시키고 출력
		System.out.println(num--);	//102
		System.out.println(num);	//101
		
		//산술연산자의 리턴값은 정수, 실수	비교연산자의 리턴값은 참, 거짓
		boolean flag=false;
		System.out.println(10<10);	//false
		System.out.println(flag=(10<=10));	//true
		System.out.println("*"+flag+"*");
		System.out.println(x<y);	//false
		System.out.println(x==y);	//false
		System.out.println("--------------------");
		
		x=1;
		flag=(x>5)&&(x<10);			//false	뒤에 것 연산하지 않고 바로 리턴
		flag=(x>5)&(x<10);			//false	AND true -> false
		System.out.println(flag);	//false
		System.out.println("--------------------");

		//비트연산
		System.out.println(4	&	1);	//0
						//0100	&	0001 ->0000
		System.out.println(4|1);	//5
						//0100	|	0001 ->0101
		System.out.println(4<<2);	//16
						//0100	->	010000
		System.out.println(4>>1);	//2
						//0100	->	0010
		System.out.println("--------------------");
		
		String msg=null;
		int idx=-1;
		if(msg!=null&&idx<=msg.length()&&idx>=0) {	//문장이 하나일때 블락 생략가능
			System.out.println(msg.length());
			System.out.println(msg.toUpperCase());
			System.out.println(msg.toUpperCase().charAt(idx));
		}else {
			System.out.println("msg에 데이터가 필요합니다.");
			idx++;
		}
		msg="hello java";	
		if(msg!=null&&idx<=msg.length()&&idx>=0) {
			System.out.println(msg.length());
			System.out.println(msg.toUpperCase());
			System.out.println(msg.toUpperCase().charAt(idx));
		}else {
			System.out.println("msg에 데이터가 필요합니다.");
			idx++;
		}
		System.out.println("--------------------");
		
		//조건 삼항 연산자
		int jumsu=-100;	//0~100
		if(jumsu>=0 && jumsu<=100) {
			String res=jumsu>70?"패스":"재시";
			System.out.printf("%d : %s%n", jumsu, res);
		}else {
			System.out.println("점수를 확인해주세요.");
			jumsu+=150;
		}
		if(jumsu>=0 && jumsu<=100) {
			String res=jumsu>70?"패스":"재시";
			System.out.printf("%d : %s%n", jumsu, res);
		}else {
			System.out.println("점수를 확인해주세요.");
			jumsu+=150;
		}
		
		
	}
}















