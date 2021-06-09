package day07;

import javax.swing.JOptionPane;

public class Test03_팝업스위치다양성 {
	public static void main(String[] args) {

		System.out.println("====== App Start ======");
		//객체 생성은 불가능 하고 타입만 가능
		Command cmd = null;
		
		String msg = JOptionPane.showInputDialog("1.Delete | 2.Insert | 3.List | 4.Update");
		
		switch (msg) {
		case "1":
			cmd = new DeleteCommnad();
			break;
		case "2":
			cmd = new InsertCommnad();
			break;
		case "3":
			cmd = new ListCommnad();
			break;
		case "4":
			cmd = new UpdateCommnad();
			break;
		default:
			System.out.println("1 2 3 4 중 하나를 입력하세요");
			break;
		}
		
		if(cmd!=null) {
			cmd.exec();
			cmd.base();
		}
	}
}

class DeleteCommnad extends Object implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행 => 삭제 작업 ~~");
	}
	
	@Override
	public void base() {
		Command.super.base();
	}
	
	
}

class InsertCommnad extends Object implements Command{

	@Override
	public void exec() {
		System.out.println("InsertCommand 수행 => 생성 작업 ~~");
	}
	
	@Override
	public void base() {
		// TODO Auto-generated method stub
		Command.super.base();
	}
	
}

class UpdateCommnad extends Object implements Command{

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행 => 수정 작업 ~~");
	}
	
}

class ListCommnad extends Object implements Command{

	@Override
	public void exec() {
		System.out.println("ListCommand 수행 => 검색 작업 ~~");
	}
	
}