package day07;

public class Prob7_최동식_스택 {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack {
	int[] stk=new int[10];
	int n=0;
	
	public MyStack() {
		super();
	}
	
	public MyStack(int n) {
		super();
		this.n = n;
	}
	
	public int pop() {
		//오류 해결 못했습니다
		return stk[--n];
	}

	public int top() {
		return stk[n-1];
	}

	public void push(int i) {
		stk[i-1]=i;
	}

	public boolean isEmpty() {
//		return n<=0;
//		n범위가 생각처럼 안됩니다
		return n>0;
//		if(stk[0]==0)
//			return true;
	}

	//is로 시작하는  함수는 return 타입이 boolean
	public boolean isFull() {
		return n==10;
	}
}
