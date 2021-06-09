package day03;

import java.util.Scanner;

public class Test03_Scanner_if_삼항_switch {
	public static void main(String[] args) {
		// 키보드로 입력을 받겠다
		Scanner keyboard = new Scanner(System.in);
		System.out.println("성적처리를 진행할까요?");
		System.out.println("진행을 원하면 yes를 입력하세요.");

		String msg = keyboard.nextLine();
		// msg 값이 yes가 아닌 경우 App 종료하도록 코딩하세요
		if (!msg.equalsIgnoreCase("yes")) {
			if(keyboard!=null)keyboard.close();
			keyboard = null;
			System.out.println("종료합니다.");
			return;
		}

		// AI는 코딩이다.

		System.out.print("이름을 입력하세요 __");
		System.out.println();
		String name = keyboard.nextLine();

		System.out.print("나이를 입력하세요 __");
		System.out.println();
		// int로 변환 (keyboard.nextLine()는 string)
		int age = Integer.parseInt(keyboard.nextLine());

		System.out.println("국어 영어 수학 점수를 입력하세요 __");
		System.out.println("입력예 > 90 90 90 처럼 점수를 입력하고 엔터를 입력하세요 __");
		System.out.println();

		int ko = keyboard.nextInt();
		int eng = keyboard.nextInt();
		int math = keyboard.nextInt();
		// 엉킬수 있으니 엔터를 읽어서 버린다
		keyboard.nextLine();

		System.out.println("***********");
		System.out.printf("이름 : %s%n나이 : %d%n", name, age);
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d%n", ko, eng, math);
		int sum = 0;
		double avg = 0.0;
		System.out.printf("총점 : %d, 평균 : %.2f%n", sum = ko + eng + math, avg = sum / 3.0);

		if (avg > 100 || avg < 0) {
			System.out.println("***점수를 정확히 입력하세요***");
			return;
		}

		char grade = 'F';
		// avg 100~90 A, 89~80 B, 79~70 C, 69~60 D, 나머지는 F
		if (avg >= 90)
			grade = 'A';
		else if (avg < 90 && avg >= 80)
			grade = 'B';
		else if (avg < 80 && avg >= 70)
			grade = 'C';
		else if (avg < 70 && avg >= 60)
			grade = 'D';
		else
			grade = 'F';

		// 삼항 연산자로 학점 처리
		char grade2 = 'F';
		grade2 = avg >= 90 ? 'A' : avg >= 80 ? 'B' : avg >= 70 ? 'C' : avg >= 60 ? 'D' : 'F';

		// switch 구문으로 성적 처리
		char grade3 = 'F';
		// int char string만 들어갈수 있다
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade3 = 'A';
			break;// 포함되어 있는 switch구문을 나간다
		case 8:
			grade3 = 'B';
			break;
		case 7:
			grade3 = 'C';
			break;
		case 6:
			grade3 = 'D';
			break;
		default:
			grade3 = 'F';
			break;
		}

		System.out.printf("등급 : %c, 학점 : %c, 성적 : %c%n", grade, grade2, grade3);

		if(keyboard!=null)keyboard.close();
		keyboard = null;
	}
}
