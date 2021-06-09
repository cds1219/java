package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test05_파일열기 {
	public static void main(String[] args) {
		System.out.println("start");

		Scanner scanner = null;

//		scanner = new Scanner(System.in);
		try {
			scanner = new Scanner(new File("D:\\multi\\workspace_5_17\\1_java\\data.txt"));
			System.out.println("===============================================");
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("===============================================");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("data.txt 파일 준비해");
		} finally {
			if (scanner != null) {
				scanner.close();
				scanner = null;
			}
		}
//		scanner.close();
//		scanner = null;
		System.out.println("end");
	}
}
