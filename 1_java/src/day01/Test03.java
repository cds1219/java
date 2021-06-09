package day01;

public class Test03 {
	//클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)
	//						int a;
	//		System.out.println("hello");
	//클래스 안에는 명령문은 들어가지 못한다
	public static void main(String[] args){
		//데이터(local 변수), 명령문
		System.out.println("hello");
		//문자열은 ""
		System.out.println("홍길동");
		//문자는 ''
		System.out.println('A');
		System.out.println(27);
		System.out.println(1.1);
		System.out.println(true);
		System.out.println(170>177);
		System.out.println(80+71+99);
		System.out.println((80+71+99)/3);
		System.out.println(127.2323+", "+448.5555);
		System.out.printf("loc(x=%.6f, y=%.6f) %n",127.2323, 448.5555);
		System.out.println("---------------------");
		System.out.println(7+7);
		System.out.println(1/2);
		System.out.println(1/2.); // 1 -> 1.0 프로모션
		//큰 사이즈에서 작은 사이즈로 갈때는 자동으로 변환 불가능 (캐스팅 해줘야한다)
		System.out.println(1/(int)2.); // 2. -> 2 캐스팅(명시적인 형변환)
		System.out.println(""+1+1); //"11"
//							""+"1"+"1"
		System.out.println(1+1+""); //2+"" -> "2"
		System.out.println(1+1);//2
		System.out.println("---------------------");
		// 성능에 문제가 되는 코드
		System.out.println(3+4+"홍길동"+"\t"+'A'+":"+(3>4)+30.77);
		// printf
		System.out.printf("%d \t %s %c : %b %5.2f \n",3+4,"홍길동",'A',(3>4),30.77);
		System.out.printf("%s %s %s %s %s \n",3+4,"홍길동",'A',(3>4),30.77);
						//포맷기호					데이터
		System.out.printf("(%d) %.2f %c %n", 1, 1.7, 'A');
	}
	
}


class A{
	//클래스의 구성 요소 = 데이터(변수) + 기능(함수=method)

}


class B{
	//클래스의 구성 요소 = 데이터(변수) + 기능(함수=method)

}