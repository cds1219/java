package day10_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02_버퍼x {
	public static void main(String[] args) {
		String fileName="d:\\lib\\ben.mp3";
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		int count =0;
		int read=0;
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("d:\\lib\\copy.mp3");
			
			System.out.println(" file copy start ... ");
			
			while((read=fis.read())!=-1) {
				fos.write(read);
				count++;
			}
			
			System.out.println("IO 횟수 : "+count);
			System.out.println(" file copy end. ");
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName+" 파일 확인해주세요");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(fis!=null)fis.close();
					if(fos!=null)fos.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("==============Main End==============");
	}
}
