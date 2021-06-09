package day05;

public class Calc {
//						명사			동사(+하다)
//클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)
	// + - / * %

	//절대 값이 바뀌면 안된다 - final
	static final double pi = 3.14;
	
	// 두 정수를 더하는 add 함수 정의
	//static은 this 자원 사용x
//	public static int add(int x, int y) {
//		return x + y;
//	}
//	
//	//Overloading
//	public static int add(int x, int y, int z) {
//		return x + y + z;
//	}
	
	public static double add(double x, double y) {
		return x + y;
	}

	// 두 정수를 빼는 sub 함수 정의
	public static int sub(int x, int y) {
		return x - y;
	}

								//int[] 처리 됨
								//항상 마지막에
	public static int add(int ... n) {
		int sum =0;
		
		for(int data:n)
			sum+=data;
				
		return sum;
	}


}
