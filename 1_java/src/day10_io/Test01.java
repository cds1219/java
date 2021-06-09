package day10_io;

import java.io.File;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {

		File dir = new File("d:\\");
		String[] list= dir.list();
		System.out.println(Arrays.toString(list));
		
		System.out.println("====================================");
		
		File file = null;
		for(String data:list) {
			file = new File(dir, data);
			System.out.printf("%s : %s",file.getName(),file.length());
			if(file.isDirectory()) System.out.println("<dir>");
		}
	}
}
