package day06;

public class Prob6_선생님 {
	public static void main(String[] args) {
		
		Person2[] persons = {
				new Student2("박학생", 15, 202001),
				new Student2(),
				new Teacher2("김선생", 34,"JAVA"),
				new Teacher2(),
				new Employee2("이사원", 55, "행정실"),
				new Employee2()
		};
		
		for( Person2 data :persons ) {
			if(data instanceof Student2) 
				 System.out.println(((Student2)data).getId());
			data.print();
		}
		
	}
}


class Person2 extends Object{
	private String name;
	private int age;
	
	
	public Person2() {
		//super();
	}
	
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
	public void print(){
		System.out.printf("이   름 : %5s    나 이 : %3d    ",name,age);
	}
}

class Student2 extends Person2{
	
	private int id;
	
	public Student2() {
		super();
	}
	public Student2(String name, int age,int id) {
		super(name, age);
		this.id = id;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void print(){
		//System.out.printf("이   름 : %s    나 이 : %d    ",this.getName(),super.getAge());
        super.print();
		System.out.printf("학    번 : %d   %n",id);
	}
}

class Teacher2 extends Person2{
	private String subject;
	
	
	
	public Teacher2() {
		super();
	}
    

	public Teacher2(String name, int age,String subject) {
		super(name, age);
		this.subject = subject;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public void print(){
		super.print();
		System.out.printf("담당과목 : %s   %n",subject);
	}
}

class Employee2 extends  Person2{
	String dept;
	
	
	public Employee2() {
		super();
	}
	
	public Employee2(String name, int age,String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print(){
		super.print();
		System.out.printf("부    서 : %s   %n",dept);
	}
}