package day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test02_list {
	public static void main(String[] args) {
							//인터페이스라서 안된다
//		List<String> list = new List<String>();
		
		//부모					자식
		List<String> list = new ArrayList<String>();

//								synchronized - 멀티스레드 이용할때
//		List<String> list = new Vector<String>();
		
//		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println(list.size());
		
		list.add("홍길동");
		list.add("고길동");
		list.add("김길동");
		list.add("홍길동");
		list.add("박길동");
		list.add("나길동");
		list.add("이길동");
		System.out.println(list.size());
		
		String keyword = "최길동";
		System.out.printf("%s ? %b%n",keyword,list.contains(keyword));
		
		if(!list.contains(keyword)) {
			list.add(keyword);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(String data:list) {
			System.out.print(data.charAt(0)+"** ");
		}
		System.out.println();
		
		System.out.println("----------------Iterator 기반 순회-------------------");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
							//제네릭을 안썼으면 써야함
//			String data = (String) it.next();
			String data = it.next();
			if(data.equals("박길동")) it.remove();			
		}
		
		System.out.println("===================================================");
		
		
		
		
		
	}
}
