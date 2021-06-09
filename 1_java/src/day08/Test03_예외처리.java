package day08;

public class Test03_예외처리 {
	public static void main(String[] args) {
		System.out.println("start");

		if (args.length == 0) {
			System.out.println(" 실행 파라미터 필요 (양수값 입력) ");
			System.out.println("end");
			return;
		}
		String msg = args[0];
		int num = 0;
		String[] s = null;

		try {
			System.out.println("1");
			num = Integer.parseInt(msg);
			s = new String[num];
			System.out.println("2");
			s = null; // 실행안됨
		} catch (NegativeArraySizeException e) {
//			e.printStackTrace();
			System.err.println("배열의 크기는 음수 안됨");
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.err.println("배열의 크기는 숫자를 입력해야함");
			System.err.println(e.getMessage());
		} catch (Exception e) {	//항상 아래에 위치
			e.printStackTrace();
			System.err.println("문제 발생");
			System.err.println(e.getMessage());
		} finally {
			System.out.println("finally { }");
			s = null; // 필수
		}

		System.out.println("end");
	}
}
