package day10_io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Set;

import day10.ex.Member;

public class Test08_ois {

	public static void main(String[] args) {
		String fileName ="members.obj";
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			
			fis=new FileInputStream(fileName);
			ois=new ObjectInputStream(fis);
			
			String msg=(String)ois.readObject();
			Member member = (Member)ois.readObject();
			Set<Member> set=(Set<Member>)ois.readObject(); 
			
			System.out.println("file을 읽었습니다.");
			System.out.println(msg);
			System.out.println(member);
			System.out.println(set);
			set.forEach(i->{
				System.out.println(i);
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
