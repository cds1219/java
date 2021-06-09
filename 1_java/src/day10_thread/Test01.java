package day10_thread;

public class Test01 {
	public static void main(String[] args) {
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);
		System.out.println("=====================main start=====================");
		
		
		System.out.println(Thread.currentThread());
		
		//스레드 생성
		Job1 job1=new Job1();
		Thread t1=new Thread(job1,"job1");//가상의cpu
		
		Job2 job2=new Job2();
		Thread t2=new Thread(job2,"job2");//가상의cpu
		
		//스레디를 실행기 대기 큐에 넣기
		t1.start();
		t2.start();
		
//		try {	//무조건 동작
//			Thread.sleep(20);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
//		Thread.yield();	//양보?
		
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.printf("홀수합 + 짝수합 = %d%n",job1.sum+job2.sum);
		
		System.out.println("=====================main end=====================");
	}
}

class Job1 implements Runnable{
	int sum=0;
	@Override
	public void run() {
		for(int i=1;i<1000;i=i+2) {
			sum+=i;
			System.out.print(Thread.currentThread()+" => ");
			System.out.println("1 ~ "+i+" 홀수합 : "+sum);
		}
	}
}

class Job2 implements Runnable{
	int sum=0;
	@Override
	public void run() {
		for(int i=0;i<1000;i=i+2) {
			sum+=i;
			System.out.print(Thread.currentThread()+" => ");
			System.out.println("0 ~ "+i+" 짝수합 : "+sum);
		}
	}
}