package day02;

public class Prob2 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 
		System.out.println(y >= 5 || x < 0 && x > 2);     
		System.out.println( !('A' <= c && c <='Z') );     
		System.out.println('C'-c);                        
		System.out.println('5'-'0'); 
		System.out.println("-------------------"); 
		
		System.out.println(c+1);                         
		System.out.println(++c);                          
		System.out.println(c++);                          
		System.out.println(c);     
		System.out.println("-------------------"); 
		
		System.out.printf("%c = %d%n",'A',(int)'A');
		System.out.printf("%c = %d%n",'Z',(int)'Z');
		System.out.printf("%c = %d%n",'a',(int)'a');
		System.out.printf("%c = %d%n",'z',(int)'z');
		System.out.printf("%c = %d%n",'0',(int)'0');
		System.out.printf("%c = %d%n",'9',(int)'9');
		System.out.println("-------------------"); 
		
		String msg="hElLo";
		System.out.println(msg);
		System.out.println(msg.toUpperCase());
		System.out.println("-------------------"); 

		char rc=Character.isUpperCase(c)?(char)(c+32):c;
		System.out.println(rc);
	}
} 

