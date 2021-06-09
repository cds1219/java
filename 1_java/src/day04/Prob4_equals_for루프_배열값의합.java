package day04;

public class Prob4_equals_for루프_배열값의합 {

	public static void main(String[] args) {
//		예제 )문자열 참조변수  msg 가 "yes" 일때 true 인 조건식 
//	   msg.equals("yes")  , "yes".equals(msg) 
		String msg = "yes";
		System.out.println(msg.equals("yes"));
		System.out.println("yes".equals(msg));
		System.out.println("===============================");

//		예제) 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 
//	      몇까지 더해야 총합이  100  이상이 되는지 구하시오 .
//		 [for루프]
		int sum1 = 0;
		int i;
		for (i = 1;sum1<100; i++) {
			if (i % 2 == 0)
				sum1 += (-i);
			else
				sum1 += i;
//			if (sum1>=100)
//					break;
			
//			int t=i%2==0?i*-1:i;
//			sum1 +=t;
		}
		System.out.printf("%d까지 더해야 총합이 %d이상이 된다.%n", i-1, sum1);
		System.out.println("===============================");

//		예제)arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오  .
		int sum2 = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		for (int j = 0; j < arr.length; j++)
			sum2 += arr[j];
		System.out.println("sum=" + sum2);
		System.out.println("===============================");

	}

}
