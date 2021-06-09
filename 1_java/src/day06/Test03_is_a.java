package day06;

public class Test03_is_a {
	public static void main(String[] args) {
		// is a 관계 => 모든 객체의 Data type은 부모가 될 수 있다.
		// 부모 타입인 경우 : 접근 영역이 부모 영역만 가능, 메모리 하단부 접근x
		// 메모리 하단부로 접근 하려면 => 다운 캐스팅

		Object a1 = new Animal();
		Animal a2 = new Animal();
		((Animal) a1).breath();

		//stack 영역에 만들어진건 자동 초기화되지 않는다
		Object obj;
		Animal animal;
		Dog dog = new Dog();
		System.out.println(dog.kind);
		System.out.println(((Animal) dog).kind);

		//dog로 초기화
		animal = dog;
		System.out.println(animal.kind);

		//부모 타입은 가능
		obj = dog;
		//obj에 dog를 넣어도 dog만큼 되는게 아니라 obj만큼 된다
		//타입만큼만 본다는 것이다
		animal = (Animal) obj;

		obj = "홍길동";
		//obj가 String 타입이면 실행
		if (obj instanceof String)
			System.out.println(((String) obj).charAt(0) + "**");

	}
}
