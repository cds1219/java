package day03;

public class Test07_StringBuilder {
	public static void main(String[] args) {
//		System.out.println("start");
//		String msg="hello";
//		System.out.println(msg.length());
//		char c= msg.charAt(0);
//		System.out.println(c);
//		
//		System.out.println("end");
		
		//string에서 +연산자를 쓰면 자원 낭비
		String msg="hello"+", "+"java "+'A'+1+true;
		System.out.println(msg);
		
//		StringBuffer sb= new StringBuffer();
		//성능이 좋다
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(", ");
		sb.append("java ");
		sb.append('A');
		sb.append(1);
		sb.append(true);

		String result = sb.toString();
		System.out.println(result);
		
		return;		
	}
}
