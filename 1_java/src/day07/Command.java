package day07;


@FunctionalInterface
public interface Command {
	//추상 메소드만 들어간다
	//abstract를 생략해도 된다
	public abstract void exec();
	
	default public void base() {
		System.out.println("~~~~~~~~~~~");
	}
	
}
