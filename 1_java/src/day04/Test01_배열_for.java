package day04;

import java.util.Arrays;

public class Test01_배열_for {
	public static void main(String[] args) {
		//[배열] 선언 -> 생성 -> 초기화
//		int[] jumsu = null; //Array 선언
//		jumsu = new int[5]; //Array 생성
		
		int[] jumsu = new int[5];	//Array 선언&생성
		
		System.out.println(jumsu.length);
		System.out.println(jumsu);
		System.out.println(Arrays.toString(jumsu)); //출력용
		
		//Array 초기화
		for(int i=0;i<jumsu.length;i++)
			jumsu[i]=(int)(Math.random()*100);
		
		for(int i=0;i<jumsu.length;i++)
			System.out.printf("%d ",jumsu[i]);
		
		System.out.println();
		System.out.println(Arrays.toString(jumsu)); //출력용
		
		int sum=0;
		for(int i=0;i<jumsu.length;i++)
			sum+=jumsu[i];
			
		System.out.printf("총점 : %d, 평균 : %d%n",sum,sum/jumsu.length);
		System.out.println("=====================");
		
		for(int data:jumsu) 
			System.out.println(data);
		
		
		double[] num = new double[100];	//100개 만들기
		
		for(int i=0;i<num.length;i++)
			num[i]=Math.random();
		
		for(double data:num) 
			System.out.printf("%.4f ",data);
	}
}