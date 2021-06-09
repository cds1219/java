package day08;

public class Test02_has_a {
	public static void main(String[] args) {
		Circle c1 = new  Circle();
		System.out.println(c1);
		
		c1.setP(new Point(3, 3));
		c1.setR(2);
		System.out.println(c1);
		
		c1.setR(c1.getR()*2);
		System.out.println(c1);
		
		Circle c2 = new  Circle(5,new Point(0,0));
		System.out.println(c2);
	}
}

class Point{
	int x, y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

class Circle{
//	int x, y;
	int r;
	Point p; // has a  관계
	
	public Circle() {
		super();
	}
	
	public Circle(int r, Point p) {
		super();
		this.r = r;
		this.p = p;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", p=" + p + "]";
	}
	
	
}














