package day09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test03_set {
	public static void main(String[] args) {
								//Set은 주머니 같은 공간
//		Set<String> set = new HashSet<String>();
		//부모					자식
		//						TreeSet은 정렬해준다
		Set<String> set = new TreeSet<String>();
		//중복이 허용되지 않는다
		System.out.printf("등록 : %b%n",set.add("홍길동"));
		set.add("고길동");
		set.add("김길동");
		System.out.printf("등록 : %b%n",set.add("홍길동"));
		set.add("박길동");
		set.add("나길동");
		set.add("이길동");
		
		System.out.println(set);
		
		System.out.println("----------------Iterator 기반 순회-------------------");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String data = it.next();
			if(data.equals("박길동")) it.remove();			
		}
		System.out.println(set);
		System.out.println("===================================================");
		
		System.out.println("종료");
	}
}
