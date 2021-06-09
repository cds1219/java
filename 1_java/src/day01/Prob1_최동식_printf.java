package day01;

public class Prob1_최동식_printf {

	public static void main(String s[]) {
	    int tom = -1;
	    char marry = '9';
	    Boolean john = false;
	    String  sarah = "Sarah Jang";
            System.out.println( "our friends..\n" 
       + tom + ", " + marry + ", " + john + " and " + sarah);

       //System.out.printf() 구문으로 표현
       System.out.printf("%s %n%d, %c, %b %s %s",
    		   "our friends..", tom, marry, john, "and", sarah);
	}

}

/*
[클래스 실행결과]
our friends..
-1, 9, false and Sarah Jang
*/