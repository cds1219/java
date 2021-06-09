package day03;

public class Test01_equals {
	public static void main(String[] args) {
		int x=7, y=7;
		boolean flag = x==y;
		System.out.println(x==y);
		System.out.println(flag);
		//기본형은  == 연산자 써도 괜찮다
		System.out.println(x!=y);
		System.out.println("========");
		//힙
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		String s3="Hello";
		String s4="Hello";
		
		String s5="Hello";
		//참조형은 값을 비교할때 == 쓰면 안된다
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println("--------");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println("========");
		
		String y1=new String("yes");
		String y2=new String("yes");
		
		String y3="yes";
		String y4="yes";
		
		String y5="YES";
		
		System.out.println(y1.equals(y5));
		//대소문자 구분하지 않고 비교
		System.out.println(y1.equalsIgnoreCase(y5));
		//					yes		YES				YES		YES
		System.out.println(y1.toUpperCase().equals(y5.toUpperCase()));
		//					yes		yes				YES		yes
		System.out.println(y1.toLowerCase().equals(y5.toLowerCase()));
	}
}