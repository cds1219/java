package day10_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test06_버퍼rw {
	public static void main(String[] args) {
		String fileName="dbinfo.txt";
		
		FileReader fr=null;
		FileWriter fw=null;
		
		BufferedReader br =null;
		BufferedWriter bw =null;
		
		int read=0;
		
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			
			fw=new FileWriter("copy.txt",false);
			bw=new BufferedWriter(fw);
			
			System.out.println(" file copy start ... ");
			
			while((read=br.read())!=-1) {
				bw.write(read);
			}
			System.out.println(" file copy end. ");
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName+" 파일 확인");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(fr!=null)fr.close();
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("===========Main End===========");
	}
}
