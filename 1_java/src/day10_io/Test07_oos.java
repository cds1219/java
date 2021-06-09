package day10_io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import day10.ex.Member;

public class Test07_oos {
	public static void main(String[] args) {
		String fileName ="members.obj";
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(fileName);
			oos=new ObjectOutputStream(fos);
			
			String msg=" ObjectOutputStream 실습 ...";
			oos.writeObject(msg);
			oos.flush();
			
			Member member = new Member("java01", "1234", "홍길동");
			oos.writeObject(member);
			oos.flush();
			
			Set<Member> set=new HashSet<Member>();
			set.add(new Member("java02","1234","김길동"));
			set.add(new Member("java03","1234","고길동"));
			set.add(new Member("java04","1234","박길동"));
			oos.writeObject(set);
			oos.flush();
			
			
			System.out.println("file이 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
