package day07.inner;

import javax.swing.JOptionPane;

import day07.Command;

public class Test02_익명 {
	public static void main(String[] args) {
		// Anonymous class
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("DeleteCommand 수행 => 삭제 작업 ~~");
			}
		};

		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("UpdateCommand 수행 => 수정 작업 ~~");
			}
		};

		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("InsertCommand 수행 => 생성 작업 ~~");
			}
		};

		Command list = new Command() {
			@Override
			public void exec() {
				System.out.println("ListCommand 수행 => 검색 작업 ~~");
			}
		};

		while (true) {
			String msg = JOptionPane.showInputDialog("1.Delete | 2.Insert | 3.List | 4.Update | 5.종료");

			switch (msg) {
			case "1":
				delete.exec();
				break;
			case "2":
				insert.exec();
				break;
			case "3":
				list.exec();
				break;
			case "4":
				update.exec();
				break;
			case "5":
				System.out.println("App을 종료합니다");
				System.exit(0);
//				return;
			default:
				System.out.println("1 2 3 4 중 하나를 입력하세요");
				break;
			}
		}
	}
}
