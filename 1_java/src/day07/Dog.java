package day07;

public class Dog extends Animal{
//	String kind;
//	
//	public void breath() {
//		System.out.println("폐로 숨쉬기 ...");
//	}
	String kind="강아지 종류";
	String name;
	
	public Dog(){
		super("Dog");
//		super.kind = "Dog";
	}
	
	public Dog(String kind, String name) {
		super("Dog");
//		super.kind = "Dog";
		this.kind = kind;
		this.name = name;
	}

	public void print() {
		//오버라이드덮기
		super.print();
		System.out.printf("%s [%s : %s]%n",super.kind,this.kind,name);
	}

	@Override
	public void breath() {
		System.out.println("폐로 숨쉬기 ...");
		
	}
}
