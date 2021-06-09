package day03;

public class Test06_구구단 {
	public static void main(String[] args) {
		// 구구단
		for (int x = 1; x < 10; x++) {
			for (int y = 2; y < 10; y++) {
					System.out.printf("%d*%d=%2d|", y, x, x * y);
			}
			System.out.println();
		}
	}
}
