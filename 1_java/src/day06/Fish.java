package day06;

public class Fish extends Animal{

	String name;
	
	public Fish() {
		super("Fish");
	}
	
	public Fish(String name) {
		super("Fish");
		this.name = name;
	}

	public void print(){
		//오버라이드덮기

		super.print();
		System.out.printf("%s[%s]%n",kind,name);
	}
	
	//오버라이딩 - 부모 메소드를 그대로 유지하면서 내용만 수정
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기 ...");
	}
	
	public static void main(String[] args) {
		Fish f=new Fish("구피");
		f.print();
		
		f.breath();
		((Animal)f).breath();
		
	}
	
}
