package day05;

/**
 * 
 * @author javains
 * @since 2021_05_24
 *
 */
//public이 없으면 패키지 레벨
public class Employee {
//						명사			동사(+하다)
// 클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)
	// 사원명 부서명 나이 사원정보출력 ...

	// 밖에서 접근 못하게 숨김 private (Employee 밖 클래스에서는 사용x)
	private String name;
	private String dept;
	private int age;

	// 기본 생성자
	// 반드시 하나 만들어준다
	public Employee() {

	}

	// 파라미터를 받아서 생성
	public Employee(String name, String dept, int age) {
		super(); // 첫번째 라인에만 허용하는 문장
		this.setName(name);
//		this.name = name;
		this.setDept(dept);
//		this.dept = dept;
		this.setAge(age);
	}

	public Employee(String name, int age) {
//		this.name = name;
////		this.age = age;
//		this.setAge(age);	//점검

		this(name, null, age); // 첫번째 라인에만 허용하는 문장

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * 
	 * @param age 양수만 가능
	 */
	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	public int getAge() {
		return age;
	}

	/**
	 * 사원 정보 출력
	 */
	public void print() {
		// 변수 + 명령문

		String data = String.format("사원[%5s, %10s, %d]", this.name, this.dept, this.age);
		System.out.println(data);

		return;
	}
}
