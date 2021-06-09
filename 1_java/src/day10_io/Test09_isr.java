package day10_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test09_isr {
	public static void main(String[] args) {
		//InputStream(System.in)
		//byte		char
		//Reader
		//char
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		try {
			System.out.println("키보드로 msg를 입력하세요...");
			String msg=br.readLine();
			System.out.println("Input Data : "+msg);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(ir!=null)ir.close();
			}catch(Exception e){
				
			}
		}
	}
}
