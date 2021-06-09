package day06;

public class Prob6_최동식 {

	public static void main(String[] args) {
		Person[] people = { 
//				이   름 : 홍길동    나 이 : 20     학    번 : 200201
//				이   름 : 이순신    나 이 : 30     담당과목 : JAVA
//				이   름 : 유관순    나 이 : 40     부    서 : 교무과
				new Student("홍길동",20,200201), 
				new Teacher("이순신",30,"JAVA"), 
				new Employee("유관순",40,"교무과")
		};
		for (Person data : people) {
			data.print();
		}
	}
	
}

class Person{
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void print() {
		
	}
	
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
}

class Student extends Person{
	private String name;
	private int age;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void print() {
		//이   름 : 홍길동    나 이 : 20     학    번 : 200201
		System.out.printf("이 름 : %s	나 이 : %d	학   번 : %d%n",name,age,id);
	}
	
	
	public Student() {
		super();
	}
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	
	
}

class Teacher extends Person{
	private String name;
	private int age;
	private String subject;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public void print() {
		//이   름 : 이순신    나 이 : 30     담당과목 : JAVA
		System.out.printf("이 름 : %s	나 이 : %d	담당과목 : %s%n",name,age,subject);
	}
	
	
	public Teacher() {
		super();
	}
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
}

class Employee extends Person{
	private String name;
	private int age;
	private String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public void print() {
		//이   름 : 유관순    나 이 : 40     부    서 : 교무과
		System.out.printf("이 름 : %s	나 이 : %d	부   서 : %s%n",name,age,dept);
	}
	
	
	public Employee() {
		super();
	}
	public Employee(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	
}