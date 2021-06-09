package day09;

import java.io.FileInputStream;
import java.util.Properties;

public class Test07_Properties {
	public static void main(String[] args) {
		//환경설정파일 읽어오기
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("dbinfo.txt"));
			String driver = p.getProperty("driver");
			String driver2 = p.getProperty("_driver");
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String pw = p.getProperty("pw");
			
			System.out.println(driver);
			System.out.println(driver2);
					
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
	}
}
