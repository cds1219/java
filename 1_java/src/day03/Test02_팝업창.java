package day03;

import javax.swing.JOptionPane;

public class Test02_팝업창 {
	public static void main(String[] args) {
		System.out.println("start");
		
		//String msg="Quit";
		String msg=JOptionPane.showInputDialog("종료하려면 quit를 입력하세요");
		
		if(msg.equalsIgnoreCase("quit")) {
			System.out.println("종료합니다.");
			return;	//	return문을 가진 함수 종료
		}else {
			System.out.println("end");
			return;	//	return문을 가진 함수 종료
		}
	}
}
