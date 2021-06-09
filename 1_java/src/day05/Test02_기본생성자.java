package day05;

public class Test02_기본생성자 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
//		emp1.name = "홍길동";
		emp1.setName("홍길동");
//		emp1.dept = "인사부";
		emp1.setDept("인사부");
//		emp1.age = 29;
		emp1.setAge(29);
		
		Employee emp2 = new Employee();
//		emp2.name = "고길동";
//		emp2.dept = "영업부";
//		emp2.age = 31;
		emp2.setName("고길동");
		emp2.setDept("영업부");
		emp2.setAge(31);
		
		Employee emp3 = new Employee();
//		emp3.name = "박길동";
//		emp3.dept = "영업부";
//		emp3.age = 32;
		emp3.setName("박길동");
		emp3.setDept("영업부");
		emp3.setAge(32);
		
		/*
		emp1.print();
		emp2.print();
		
		emp1=emp2;
		emp1.print();
		emp2.print();
		
		System.out.printf("%c**%n",emp2.name.charAt(0));//참조형 name
		System.out.println(emp2.age);//기본형 age
		*/
		
//		Employee[] employees = new Employee[10];
		Employee[] employees = {emp1,emp2,emp3,new Employee(),null,null,null,null};
		
		for(Employee data:employees) {
			if(data==null) break;
			data.print();
			if(data.getName()==null) break;
			System.out.println(data.getName().charAt(0)+"**");
			
		}
	}
}












