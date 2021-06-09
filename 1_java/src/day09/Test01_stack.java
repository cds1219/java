package day09;

import java.util.Stack;

import day08.Employee;
import util.MyStack;

public class Test01_stack {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>(); //String[]
		s1.push("홍길동");
		s1.push("김길동");
		s1.push("고길동");
		
		System.out.println(s1.peek().charAt(0)+"**"); //엿보기
		System.out.println(s1.pop().charAt(0)+"**");
		System.out.println(s1.peek().charAt(0)+"**");
		System.out.println(s1.pop().charAt(0)+"**");
		System.out.println(s1.peek().charAt(0)+"**");
		System.out.println(s1.pop().charAt(0)+"**");
		
		Stack<Integer> s2 = new Stack<Integer>(); //Integer[]
		s2.push(1);
		s2.push(2);
		s2.push(3);
		
		System.out.println(s2.peek());
		System.out.println(s2.pop());
		System.out.println(s2.peek());
		System.out.println(s2.pop());
		System.out.println(s2.peek());
		System.out.println(s2.pop());
		
		Stack s3 = new Stack(); //Object[]
		s3.push("홍길동");
		s3.push(2);
		s3.push(new day05.Employee());
		
		if(s3.peek() instanceof String)
		System.out.println(s3.peek());
		System.out.println(s3.pop());
		System.out.println(s3.peek());
		System.out.println(s3.pop());
		System.out.println(s3.peek());
		System.out.println(s3.pop());
		
		MyStack<String> s4 = new MyStack<String>();
		s4.push("1111");
		s4.push("222");
		System.out.println(s4.peek());
		System.out.println(s4.pop());
		System.out.println(s4.peek());
		System.out.println(s4.pop());
		
		
		
	}
}
