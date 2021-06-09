package day10_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05_버퍼io {

	public static void main(String[] args) {
		String fileName="ben.mp3";
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int count =0;
		int read=0;
		
		try {
			fis = new FileInputStream(fileName);
			bis=new BufferedInputStream(fis);
			fos = new FileOutputStream("copy.mp3");
			bos=new BufferedOutputStream(fos);
			
			byte[] buffer = new byte[1024*1024];
			
			System.out.println(" file copy start ... ");
			
			while((read=bis.read())!=-1) {
				bos.write(read);
				count++;
			}
			bos.flush();	/////////////////////
			
			System.out.println("IO 횟수 : "+count);
			System.out.println(" file copy end. ");
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName+" 파일 확인해주세요");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(bis!=null)bis.close();
					if(fis!=null)fis.close();
					if(bos!=null)bos.close();
					if(fos!=null)fos.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("==============Main End==============");

	}
}
