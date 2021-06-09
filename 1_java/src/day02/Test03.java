package day02;

public class Test03 {
	//클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)

	public static void main(String[] args) {
		//데이터(local 변수), 명령문
		
		String name="홍길동";
//		int age=29;
		double score=88.5;
		char grade='B';
		boolean avg=90 <= score;
//		String start="2021.05.17.";		//멀티캠퍼스 강의 시작일
		
		if(avg) {
			System.out.printf("%s %.2f %c => 반평균 이상입니다.%n", name, score, grade);
		}else {
			System.out.printf("%s %.2f %c => 반평균 이하입니다.%n", name, score, grade);
		}
		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(score);
//		System.out.println(grade);
//		System.out.println(avg);
//		System.out.println(start);
	}
}
