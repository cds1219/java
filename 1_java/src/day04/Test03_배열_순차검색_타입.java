package day04;

import java.util.Arrays;

public class Test03_배열_순차검색_타입 {
	public static void main(String[] args) {

//		String[] names= {"홍길동","고아무개","이이","고길동"};
		
//		String[] names=null;
//		names=new String[] {"홍길동","고아무개","이이","고길동"};
		
		String[] names=new String[] 
				{"홍길동", "김가", null, "고길동", "", "고아무개", "이이", "고길동", "김길동"};
		
		System.out.println(names.length);
		System.out.println(Arrays.toString(names));
		
		
		//////////////////순차검색/////////////////////
		String[] res=new String[10];
		int count=0;
		for (int i = 0; i < names.length; i++)
//			if(names[i].equals("고길동"))
//			if(names[i].startsWith("김"))
			if(names[i] != null && names[i].contains("길동"))
				res[count++]=names[i];
			
		System.out.println("------검색결과------");
		if(count==0) 
			System.out.println(" X");
		else
			System.out.println(Arrays.toString(res));
		System.out.println("=========================================");

		/////////////////////////////////////////////////

		
		//////////////////이진검색/////////////////////
		
		/////////////////////////////////////////////////
		
		for(int i=0;i<names.length;i++)
			if (names[i] != null && names[i].length()>0)
				System.out.printf("%c** ",names[i].charAt(0));
		System.out.println();

		
		boolean[] flag=new boolean[5];
		System.out.println();
		
		char[] ch2= "abcdefghijklmnopqrstuvwxyz".toCharArray();	
//		char[] ch3= "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();	
		//아스키코드 확인
		for(char data:ch2) {
			System.out.printf("%c : %d%n",data,(int)data);
		}
		System.out.println();
		
		char[] ch= {'a','b','c'};	
		String abc=new String(ch);
		String msg="hello java";
		System.out.println();
		
	}
}