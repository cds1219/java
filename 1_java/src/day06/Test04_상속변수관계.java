package day06;

public class Test04_상속변수관계 {
	public static void main(String[] args) {

//		Dog d = new Dog();
//		Animal d = new Dog();
//		Fish f = new Fish();
//		Animal f = new Fish();
				
//		breathCall(d);
		breathCall(new Dog());
//		breathCall(f);
		breathCall(new Fish());
		breathCall(new Animal());
		
	}
	
	//부모타입으로 받으면 자식타입까지 다 받을 수 있다
	//자식타입으로 받을 경우 부모타입은 받을 수 없다
	public static void breathCall(Animal a) {
		a.breath();
	}
}
