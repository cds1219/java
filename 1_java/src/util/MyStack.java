package util;

public class MyStack<T>{
	T[] stack;
	int count = 0;
	
	public MyStack(){
//		stack = (T[]) new Object[10];
		this(10);
	}
	public MyStack(int size) {
		stack = (T[]) new Object[ size > 0 ? size : 10 ];
	}
	
	public synchronized boolean isEmpty() {
		return count == 0 ? true : false ;
	}
	
	public synchronized boolean isFull() {
		return count == stack.length ? true : false;
	}
	
	public synchronized void push(T data) {
		if(isFull()) {
			System.out.println("스택이 가득찼습니다. ==> 리사이징 ~~~");
			T[] temp = (T[]) new Object[stack.length * 2];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
			temp = null;
		}else {
			stack[count++] = data;
		}
	}
	
	public T peek() {
		return count==0? null : stack[count-1];
	}

	public synchronized T pop() {
		T data = null;
		
		if(!isEmpty()) {
			data = stack[count-1];
			stack[count-1] = null;
			count--;
		}
		
		return data;
	}
	
}