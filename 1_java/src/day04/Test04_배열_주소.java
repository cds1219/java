package day04;

public class Test04_배열_주소 {
	public static void main(String[] args) {
		int[] num1 = new int[] { 11, 33, 55, 77, 99 }; // new int[] 생략가능
		int[] num2 = num1;
		int[] num3 = num2.clone();
		System.out.println();

		num1[0] = 0;
		num2[4] = 0;
		num3[2] = 1;
		System.out.println();

		num3 = num1;
		System.out.println();

		num1 = null;
		num2 = null;
		num3 = null;

		System.out.println("=================");

		int[] num4 = new int[] { 9, 6, 8, 2, 3 };
		int[] num5 = new int[num4.length*2];
		
		System.arraycopy(num4, 0, num5, 3, num4.length);
		System.out.println();
		
		String[] data="고길동 / 99/ 77/ 100".split("/");
		
		double sum=0;
		for(int i=1;i<data.length;i++)
			sum+=Double.parseDouble(data[i].trim());
			
		System.out.printf("%s 총점 : %.2f 평균 : %.2f",data[0],sum,sum/3);

	}
}