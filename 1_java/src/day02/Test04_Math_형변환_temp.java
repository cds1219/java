package day02;

public class Test04_Math_형변환_temp {
	public static void main(String[] args) {
		double pi=Math.PI;
		System.out.println(pi);
		
		//난수(double) 0보다 크고 1보다 작은 실수
		System.out.println(Math.random());
		//int로 캐스팅하면 0이 되므로 100을 곱해서 캐스팅한다
		int num = (int) (Math.random() * 100) ;
		System.out.println(num);
		
		//byte : Byte, int : Integer 각각 별도의 클래스가 있다
		System.out.printf("byte : %d ~ %d%n", -128, 127);
		System.out.printf("int : %d ~ %d%n",
				Integer.MIN_VALUE , Integer.MAX_VALUE);
		
		//형변환
		double sum=Integer.parseInt("99")+Integer.parseInt("77")
		+Double.parseDouble("88.5");
		double avg = sum/3;
		System.out.printf("총점: %.2f, 평균: %.2f%n", sum, avg);
		
		System.out.println("==================");
		
		int x=99, y=77;
		System.out.printf("(x=%d, y=%d)%n",x, y);
		
		//x y 값 바꾸기
		//null은 참조형에만 사용가능. 기본형에는 x
		int temp = x;
		x=y;
		y=temp;
		System.out.printf("(x=%d, y=%d)%n",x, y);
		
		System.out.println("==================");
	}
}
