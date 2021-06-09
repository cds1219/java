package day07;

import day06.Animal;

public class Test01_접근제한자 {
	public static void main(String[] args) {

		//default는 같은 패키지까지 범위
		//protected는 상속받은 곳까지 범위 - 메소드 앞에 많이 붙어짐
		//private					-메소드 앞에 붙이면 오버라이드 금지
		//final						-메소드 앞에 붙이면 오버라이드 금지
		new Animal();
		
	}
}

class Cat extends Animal{
	public void display() {
		System.out.println();
	}
}