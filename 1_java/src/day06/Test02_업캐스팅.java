package day06;

public class Test02_업캐스팅 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1.kind);			//동물의 종류

		Dog d1 = new Dog();
		System.out.println(d1.kind);			//강아지 종류
							//부모type으로 up casting
		System.out.println(((Animal)d1).kind);	//동물의 종류
		System.out.println(d1.name);			
//		System.out.println(((Animal)d1).name);			//x
		
		d1.print();
//		((Animal)d1).print();	//x
		d1.breath();
		((Animal)d1).breath();
		
	}
}
