package day03;

public class Test05_dowhile_무한루프 {
	public static void main(String[] args) {

		System.out.println("Hello Java");
		System.out.println("=============");
		
		int i;
		
		for(i=0;i<5;i++) {
			System.out.printf("Hello Java %d%n", i);
		}
		
		System.out.println(i);
		System.out.println("=============");
		
//		//무한루프
//		for(;;) {
//			System.out.println(".....");
//		}
		
		//무한루프2
//		for(int a=0;;a++) {
//			System.out.println("......."+a);
//		}
		
		for(int a=0;;a++) {
			System.out.println("......."+a);
			if(a==10) break;
		}
		System.out.println("=============");
		
		i=0;
		while(i<5) {
			System.out.println("Hello Java");
			i++;
		}
		
		i=0;
		boolean flag =false;
		while(!flag) {
			i++;
			int num=(int)(Math.random()*100);
			System.out.println(num);
			if(num==45) flag=!flag;
		}
		System.out.println(i+"번 실행");
		System.out.println("=============");
		
		i=9;
		//조건에 안맞더라도 최소한 한번은 실행
		do{
			System.out.println("..........");
			i++;
		}while(i<5);
		
		//1~100합
		int sum=0;
		for(i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1~100합 : "+sum);
		System.out.println("=============");
		
		//1~100 3의 배수의 합
		sum=0;
		for(i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("1~100 3의 배수의 합 : "+sum);
		System.out.println("=============");
		
		for(int x=1;x<3;x++) {
			for(int y=9;y>3;y--) {
				System.out.printf("x=%d y=%d\t",x,y);
			}
			System.out.println();
		}
	}
}














