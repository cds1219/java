package day04;

public class Test07_클래스 {
	public static void main(String[] args) {
		//				메모리에 new
		Employee emp1 = new Employee();
		emp1.print();		
	}
}

class Employee{
	//						명사			동사(+하다)
	// 클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)
	String name;	//	이름
	String dept;	//	부서
	int age;		//	나이	
	
	//출력하다
	public void print(){
		System.out.printf("사원명 : %s, 근무부서 : %s%n",name,dept);		
		return;
	}
}