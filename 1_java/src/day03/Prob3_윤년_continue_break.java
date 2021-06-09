package day03;

import java.util.Scanner;

public class Prob3_윤년_continue_break {

	public static void main(String[] args) {
//		char c=' ';
//		System.out.println((int)c);
		
//		[1] int형 변수 year가 400으로 나눠떨어지거나 
//	    또는 4로 나눠떨어지고  
//	    100 나눠떨어지지 않을 때 인 조건식을 만들어 보세요(윤년공식).
		Scanner keyboard = new Scanner(System.in);
		System.out.println("알아보고 싶은 년도를 입력하세요.");
		int year = keyboard.nextInt();
		keyboard.nextLine();
		if(year%100!=0 && year%4==0 || year%400==0 ? true : false)
			System.out.println("윤년입니다.");
		else
			System.out.println("평년입니다.");
		
//		[2] 1부터 20까지의 정수 중에서 
//	    2또는 3의 배수가 아닌 수의 총합을 구해 보세요  .
		int sum = 0; 
		for(int i=1;i<21;i++) {
			if(i%2==0||i%3==0)
				continue;
			else
				sum+=i;
		}
		System.out.println("sum="+sum);
		
//		[3]
//				1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 구해 보세요
		sum=0;
		for(int i=1;i<11;i++) {
			for(int j=1;j<11;j++) {
				sum+=j;
				if(j==i)
					break;
			}
		}
		System.out.println("sum2="+sum);
			
	}

}
