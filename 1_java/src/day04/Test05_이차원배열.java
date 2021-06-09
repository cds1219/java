package day04;

public class Test05_이차원배열 {
	public static void main(String[] args) {
		int[] num1 = { 1, 1, 1 };
		int[] num2 = { 2, 2, 2, 2, 2 };
		int[] num3 = { 3 };

//		int[][] two = { num1, num2, num3 };
		//위와 동일
		int[][] two = {
				{1,1,1},
				{2,2,2,2,2},
				{3}
		};

		System.out.println();

		for (int row = 0; row < two.length; row++)
//			System.out.println(two[row].length);
			for (int col = 0; col < two[row].length; col++)
				System.out.printf("%d ", two[row][col]);
		System.out.println();
		
		int N=4;
		int[][] t1=new int[N][N];
		t1[2][3]=99;
		
		
		int[][] t2= {
				{},//0이므로 비어둠
				{99,66,89,88,44,100},		//1반
				{78,69,92,58,55,77,66,79},	//2반
				{98,67,55,66}				//3반
		};
		System.out.println();

		
		//반별 평균 점수 구하기
		double sum=0;
		for (int row = 1; row < t2.length; row++) {
			sum=0;
			int count=t2[row].length;
				for (int col = 0; col < count; col++)
					sum+=t2[row][col];
			System.out.printf("%d반 총점 : %.2f  학생수 : %d  평균 : %.2f%n",
								row, 	sum, 		count, sum / count);
			}
	}
}