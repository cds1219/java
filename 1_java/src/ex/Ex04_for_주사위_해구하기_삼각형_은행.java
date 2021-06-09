package ex;

import java.util.Scanner;

public class Ex04_for_주사위_해구하기_삼각형_은행 {

	public static void main(String[] args) {
		// for문으로 1~100 3의 배수 총합
		// 3의 배수의 합: 1683

		int sum = 0;
		for (int i = 3; i < 100; i++)
			if (i % 3 == 0)
				sum += i;

		System.out.printf("3의 배수의 합: %d%n", sum);
		System.out.println("===========================");
		System.out.println();

		// while문과 Math.random()메소드로 두 개의 주사위를 던졌을 때 나오는 눈을
		// (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속, 5이면 멈추는 코드

		while (true) {
			int n1 = (int) (Math.random() * 10) % 6 + 1;
			int n2 = (int) (Math.random() * 10) % 6 + 1;

			System.out.printf("(눈%d, 눈%d)%n", n1, n2);
			if (n1 + n2 == 5)
				break;
		}
		System.out.println("===========================");
		System.out.println();

		// 중첩for문으로 4x+5y=60의 모든 해를 구해서 (x, y)형태로 출력
		// x와 y는 10 이하의 자연수

		for (int x = 1; x <= 10; x++)
			for (int y = 1; y <= 10; y++)
				if (4 * x + 5 * y == 60)
					System.out.printf("(%d, %d)%n", x, y);
		System.out.println("===========================");
		System.out.println();

		// for문으로 5단 *삼각형 출력

		StringBuilder sb = new StringBuilder();
		for (int c = 0; c < 5; c++) {
			sb.append('*');
			String result = sb.toString();
			System.out.println(result);
		}
		System.out.println("===========================");
		System.out.println();

		for (int i = 1; i <= 5; i++)
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i)
					System.out.println();
			}
		System.out.println("===========================");
		System.out.println();

		// while문과 Scanner를 이용하여 입력한 데이터로
		// 예금, 출금, 조회, 종료 기능을 코드로 작성

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();
			scanner.nextLine();
			if (menu == 1) {
				System.out.print("예금액> ");
				int bank = scanner.nextInt();
				scanner.nextLine();
				balance += bank;
			}
			if (menu == 2) {
				System.out.print("출금액> ");
				int bank = scanner.nextInt();
				scanner.nextLine();
				balance -= bank;
			}
			if (menu == 3) {
				System.out.print("잔고> ");
				System.out.println(balance);
			}
			if (menu == 4) {
				System.out.println();
				break;
			}
		}

		System.out.println("프로그램 종료");

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}

		System.out.println("프로그램 종료");

		if (scanner != null)
			scanner.close();
		scanner = null;
	}
}
