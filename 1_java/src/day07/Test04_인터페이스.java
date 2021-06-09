package day07;

public class Test04_인터페이스 {
	public static void main(String[] args) {
		
		A t1 = new T1();
		C t2 = new T2();
		
		B a = new T1();
		a.stop();
		if(a instanceof A) ((A)a).go();
		
		t2.go();
		t2.stop();
	}
}

// 자바의 인터페이스 이름은 ~~~able 

interface A{
	void go();
}

interface B{
	void stop();
}

//A와 B를 가진 C
//인터페이스에서만 다중 상속 가능
//클래스일 때는 하나만 상속 가능
//[인터페이스 통합]
interface C extends A,B{}

	//extends Object 생략가능
class T1 extends Object implements A,B{
	@Override
	public void stop() {
		System.out.println("stop t1");
	}
	@Override
	public void go() {
		System.out.println("go t1");
	}
}

class T2 extends Object implements C{
	@Override
	public void stop() {
		System.out.println("stop t2");
	}
	@Override
	public void go() {
		System.out.println("go t2");
	}
}

//abstract class Shape{
//	abstract double getArea(int r);
//}
//class Circle extends Shape{
//	@Override
//	double getArea(int r) {
//		return Math.PI*r*r;
//	}
//}

interface Shape{
	//public 생략가능
	abstract double getArea(int r);
}
class Circle implements Shape{
	@Override
	public double getArea(int r) {
		return Math.PI*r*r;
	}
}