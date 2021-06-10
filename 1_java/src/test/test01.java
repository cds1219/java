package test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//import java.util.ArrayList;
//import java.util.List;

//public class test01 {
//	public static void main(String[] args) {
//		int total=0, x=0,y;
//		while(x++<5){
//		  y=x*x;
//		  System.out.println(y);
//		  total +=y;
//		}
//		System.out.println("총합은 "+total);
//	}
//}

//class Radio {
//
//}
//
//class Speaker {
//
//}
//
//class Earphone {
//
//}
//
//interface Playable {
//
//}
//
//interface Portable {
//
//}
//
//public class Radio extends Speaker implements Playable {
//
//}
//
//public class Radio extends Speaker implements Playable, Portable {
//
//}
//
//public class Radio extends Speaker, Earphone{
//	
//}
//
//public class Speaker implements Playable, Portable{
//	
//}

//public class test01{
//    public static void main(){
//            System.out.println("test");
//    }
//}

//public class test01{
//    public static void main(String args[]){
//            TestA a = new TestA(0);
//            a.i = 200; 
//            a.go(); 
//    }  
//}  
//
//class TestA{  
//    public int i = 100; 
//    public TestA( int i ){ 
//            this.i = i; 
//    }  
//    public void go(){ 
//            System.out.println("i = " + i);
//    }  
//}  

//public class test01{   
//    public static void main(String args[]){ 
//            char[] y = {'h', 'e', 'l', 'l', 'o'};  
//            for(int i=0; i < y.length ; i++){ 
//                    System.out.print(y[i]);         
//            }    
//    }    
//}

//public class test01{  
//	public static void main(String[] args) {
//		
//	}
//    public String getDetails(){ return "String";}  
//    public void getDetails(char c){} 
////    public void getDetails(){}//1   
//    void getDetails(String s){}//2   
//    public void getDetails(int i){}//3   
//    void getDetails(double d){}//4   
//}     

//public class test01 {
//	public static void main(String[] args) {
////		Staff st = (Staff) new Student();
//		Student s = (Student) new Person();
////		Teacher t = (Teacher) new Student();
////		Staff f = (Staff) new Teacher();
//	}
//}
//
//class Person {
//}
//
//class Student extends Person {
//}
//
//class Teacher extends Person {
//}
//
//class Staff extends Person {
//}

//class Company {
//	private static Company instance=new Company();
//	public static Company getCompany(){       
//            return instance;         
//    }
//	private Company() {}
//}

//class MyStack {
//	// ...
//	public void push(char c) {
//		synchronized (this) {
//			data[idx] = c;
//			idx++;
//		}
//	}
//	// ...
//}

//public class test01 {
//	public static void main(String[] args) {
//		int out = 10; 
//        class Inner{ 
//                public int count(){
//                        int cnt = 0;
//                        for ( int i = 0 ; i < out ; i++){
//                                cnt += i;
//                        } 
//                        return cnt;
//                } 
//        }  
//        Inner in = new Inner();
//        System.out.println( in.count() );
//	}
//}

//import java.util.*;
//class LandAnimal { public void crying() { System.out.println("육지동물"); } }
//class Cat extends LandAnimal { public void crying() { System.out.println("냐옹냐옹"); } }
//class Dog extends LandAnimal { public void crying() { System.out.println("멍멍"); } }
//class Sparrow { public void crying() { System.out.println("짹짹"); } }
//
//class AnimalList<T> {
//    ArrayList<T> al = new ArrayList<T>();
//    public static void cryingAnimalList(AnimalList<? extends LandAnimal> al) {
//        LandAnimal la = al.get(0);
//        la.crying();
//    }
//    void add(T animal) { al.add(animal); }
//    T get(int index) { return al.get(index); }
//    boolean remove(T animal) { return al.remove(animal); }
//    int size() { return al.size(); }
//} 

//public class test01 {
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("Hi");
//
//		Object[] array = new Long[10];
//		array[0] = 1L;
//	}

//	public static void main(String[] var0) {
//		ArrayList var1 = new ArrayList();
//		var1.add("Hi");
//		Long[] var2 = new Long[10];
//		var2[0] = Long.valueOf(1L);
//	}
//
//	public static void main(String[] var0) {
//		List var1 = new ArrayList();
//		var1.add("Hi");
//		Long[] var2 = new Long[10];
//		var2[0] = Long.valueOf(1L);
//	}
//
//	public static void main(String[] var0) {
//	  ArrayList var1 = new ArrayList();
//	  var1.add("Hi");
//	  Object[] var2 = new Long[10];
//	  var2[0] = Long.valueOf(1L);
//	}
//	
//	public static void main(String[] var0) {
//	  List var1 = new ArrayList();
//	  var1.add("Hi");
//	  Object[] var2 = new Long[10];
//	  var2[0] = Long.valueOf(1L);
//	}
//
//}

//public class test01 {
//	public static void main(String[] args) throws IOException {
//		ServerSocket s = null;     
//		s = new ServerSocket(5432);    
//		while (true) {      
//		        try {      
//		                Socket s1 = s.accept();    
//		                OutputStream s1out = s1.getOutputStream();  
//		                DataOutputStream dos = new DataOutputStream(s1out); 
//		        }finally {
//					
//				}
//		}
//	}
//}



//@FunctionalInterface
//public interface test01 {
//    public int Calc(int first, int second);
//}