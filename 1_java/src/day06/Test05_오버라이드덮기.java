package day06;

public class Test05_오버라이드덮기 {
	public static void main(String[] args) {
		Dog[] dogs = { new Dog(), new Dog("시츄", "쫑") };
		Fish[] fishs = { new Fish(), new Fish("구피") };

		// 장점 : 부모타입에는 다 넣을 수 있다
		Animal[] animals = { 
				new Dog(), new Dog("시츄", "쫑"), 
				new Fish(), new Fish("구피") 
		};

		// 단점 : 자식타입 메소드를 불러오려면 캐스팅을 해야한다
		for (Animal data : animals) {
//			data.breath();

			/*
			if (data instanceof Dog)
				((Dog) data).print();
			if (data instanceof Fish) {
//				((Fish) data).print();
				Dog d = (Dog) data;
				d.print();
			}
			*/
			
			data.print();
			
		}
	}
}
