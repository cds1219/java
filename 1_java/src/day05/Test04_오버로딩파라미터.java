package day05;

public class Test04_오버로딩파라미터 {

	public static void main(String[] args) {
		Employee emp0 = new Employee();
//		emp0.print();
		
		//오버로딩한 것으로 생성
		Employee emp1 = new Employee("홍길동", "인사부", 29);
//		emp1.print();

		//기본생성자로 생성
		Employee emp2 = new Employee();
		emp2.setName("고길동");
		emp2.setDept("영업부");
		emp2.setAge(31);
//		emp2.print();

		Employee[] employees= {
				new Employee("이길동", "인사부", 29),
				new Employee("고길동", "영업부", 31),
				new Employee("박길동", "영업부", 32),
				new Employee("최길동", "영업부", 29),
				new Employee("나길동", "인사부", 33),
				null,
				null,
				null
		};

		for (Employee data : employees) {
			if (data != null && data.getName().length()>0)
				System.out.println(data.getName().charAt(0)+"**");
			if(data != null && data.getName()!= null&&data.getName().equals("고길동")) {
				System.out.println(data);
				data.print();
			}
		}

	}
}
