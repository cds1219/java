package day04;

import java.util.Arrays;

public class Test02_배열_변수_함수 {
	// 클래스의 구성 요소(멤버) = 데이터(변수) + 기능(함수=method)
	// name close()
	public static void main(String[] args) {
		// 데이터(local 변수), 명령문

		int[] num = { 5, 7, 9, 11, 66, 77, 11 };
		System.out.println(Arrays.toString(num));

		// num 배열에서 11번 위치 찾기
		int data = 11;
		for (int i = 0; i < num.length; i++)
			if (num[i] == data)
				System.out.printf("%d -> num[%d]%n", data, i);
		// 하나만 찾기일때는 break;

		String[] msg = new String[5];
		System.out.println(Arrays.toString(msg));

		msg[0] = "hello"; // h e l l o
		msg[1] = null; //
		msg[2] = "java"; // j a v a
		msg[3] = ""; //
		msg[4] = "SQL"; // S Q L
		System.out.println(Arrays.toString(msg));

		// msg에서 마지막문자들만
		for (int i = 0; i < msg.length; i++) {
//			System.out.println(msg[i].charAt(msg[i].length()-1));
			if (msg[i] != null)
				for (int idx = 0; idx < msg[i].length(); idx++) 
					System.out.printf("%c ", msg[i].charAt(idx));
				
			System.out.println();
		}

	}
}