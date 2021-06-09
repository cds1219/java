package day07;

public abstract class Animal {
	
	protected String kind="동물의 종류";
	
	public Animal() {	}

	public Animal(String kind) {
		this.kind = kind;
	}

	public abstract void breath() ;

	public void print() {
		System.out.printf("**** %s ****%n",kind);
	}
}
