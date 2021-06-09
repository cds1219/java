package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test06_자동반납 {
	public static void main(String[] args) {
		System.out.println("start");

		try(Scanner scanner = new Scanner(new File("D:\\multi\\workspace_5_17\\1_java\\data.txt"));) {
			System.out.println("===============================================");
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("===============================================");
		} catch (FileNotFoundException e) {
			System.out.println("data.txt 파일 준비해");
		}
		System.out.println("end");
	}
}
