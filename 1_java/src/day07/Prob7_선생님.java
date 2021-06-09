package day07;

public class Prob7_선생님 {

	public static void main(String[] args) {
		MyStack2 stack = new MyStack2(10);
		
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 15; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.peek());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}



class MyStack2{
	int[] stack;
	int count = 0;
	
	MyStack2(){
		stack = new  int[10];
	}
	public MyStack2(int size) {
		stack = new int[ size > 0 ? size : 10 ];
	}
	
	public boolean isEmpty() {
		return count == 0 ? true : false ;
	}
	
	public boolean isFull() {
		return count == stack.length ? true : false;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("스택이 가득찼습니다. ==> 리사이징 ~~~");
			int[] temp = new int[stack.length * 2];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
			temp = null;
		}else {
			stack[count++] = data;
		}
	}
	
	public int peek() {
		return count==0? -1 : stack[count-1];
	}

	public int pop() {
		int data = -1;
		
		if(!isEmpty()) {
			data = stack[count-1];
			stack[count-1] = 0;
			count--;
		}
		
		return data;
	}
	
}


















