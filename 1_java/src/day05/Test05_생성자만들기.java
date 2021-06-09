package day05;

public class Test05_생성자만들기 {

	public static void main(String[] args) {

		Loc p1 = new Loc(127.999, 77.7777);
		p1.print();
		
		int y, month, day;
		int h, m, s;
		
	}

}

class MyTime{
	int y, month, day;
	int h, m, s;
	
	public MyTime(int y, int month, int day, int h, int m, int s) {
		super();
		this.y = y;
		this.month = month;
		this.day = day;
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
}

class Loc{
	private double x;
	private double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Loc() {}
	public Loc(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.printf("(%f, %f)%n",x,y);
	}
	
}
