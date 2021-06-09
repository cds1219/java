package day05;

public class Test06_Singleton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		Singleton s2 = new Singleton();
//		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		Singleton s3 = new Singleton();
//		Singleton s3 = Singleton.getInstance();
		System.out.println(s3);
		
	}
}


class Singleton{
	static Singleton s = new Singleton();
	
	public Singleton() {}
	
				//타입
	public static Singleton getInstance() {
//		return Singleton.s;
		return s;
	}
}