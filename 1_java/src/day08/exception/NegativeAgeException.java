package day08.exception;

public class NegativeAgeException extends Exception{
	
	public NegativeAgeException(){
		super("나이 음수 안됨");
	}
	public NegativeAgeException(String msg){
		super(msg);
	}
}
