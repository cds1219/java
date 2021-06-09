package day05;

public class Test03_오버로딩Calc {

	public static void main(String[] args) {
		System.out.println(Calc.add(789, 42153));
		System.out.println(Calc.add(789, 42153, 415685));
		System.out.println(Calc.add(0.5, 0.7));
		
		System.out.println(Calc.add(1,2,3,4,45,4,5,65,6));
		
		System.out.println(Calc.sub(18996, 1650));
		System.out.println();		
		
		System.out.println(Calc.add(786453, 42153));
		System.out.println(Calc.add(786453, 42153));
		System.out.println(Calc.add(786453, 42153));		
		
		System.out.println(Calc.pi);
	}
}
