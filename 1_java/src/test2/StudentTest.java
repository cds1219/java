package test2;

public class StudentTest {
	public static void insertBook() {
		BookTest bt = new BookTest();
		bt.insertBook(new BookDTO(21424, "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본 문법"));
		bt.insertBook(new BookDTO(33455, "JDBC Pro", "김철수", "Jaen.kr", 23000, " "));
		bt.insertBook(new BookDTO(55355, "Servlet/Jsp", "박자바", "Jaen.kr", 41000, "Model2 기반"));
		bt.insertBook(new BookDTO(35332, "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework"));
		bt.insertBook(new BookDTO(35355, "OOAD 분석, 설계", "소나무", "Jaen.kr", 30000, " "));
		
	}
	public static void printAllBooks() {
		BookTest bt = new BookTest();
		bt.printAllBooks();
	}
	public static void main(String[] args) {
		insertBook();
		printAllBooks();
	}
}