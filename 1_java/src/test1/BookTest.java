package test1;

public class BookTest {

	public static void main(String[] args) {
//		BookService service=new BookServiceImpl_Map();
//		BookDTO encap = new BookDTO();
//		encap.setIsbn("21424");
//		encap.setTitle("Java Basic");
//		encap.setAuthor("김하나");
//		encap.setPublisher("Jaen.kr");
//		encap.setPrice(15000);
//		encap.setDes("Java 기본 문법");
//		
//		encap.setIsbn("33455");
//		encap.setTitle("JDBC Pro");
//		encap.setAuthor("김철수");
//		encap.setPublisher("Jaen.kr");
//		encap.setPrice(23000);
//		
//		encap.setIsbn("55355");
//		encap.setTitle("Servlet/JSP");
//		encap.setAuthor("박자바");
//		encap.setPublisher("Jaen.kr");
//		encap.setPrice(41000);
//		encap.setDes("Model2 기반");
//		
//		encap.setIsbn("35332");
//		encap.setTitle("Android App");
//		encap.setAuthor("홍길동");
//		encap.setPublisher("Jaen.kr");
//		encap.setPrice(25000);
//		encap.setDes("Lightweight Framwork");
//		
//		encap.setIsbn("35355");
//		encap.setTitle("OOAD 분석, 설계");
//		encap.setAuthor("소나무");
//		encap.setPublisher("Jaen.kr");
//		encap.setPrice(30000);

//		service.insertBook(new BookDTO("21424", "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본 문법"));

		BookDTO booklist[] = new BookDTO[5];
		BookDTO b1 = new BookDTO(21424, "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		BookDTO b2 = new BookDTO(33455, "JDBC Pro", "김철수", "Jaen.kr", 23000, "");
		BookDTO b3 = new BookDTO(55355, "Servlet/Jsp", "박자바", "Jaen.kr", 41000, "Model2 기반");
		BookDTO b4 = new BookDTO(35332, "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
		BookDTO b5 = new BookDTO(35355, "OOAD 분석, 설계", "소나무", "Jaen.kr", 30000, "");

		booklist[0] = b1;
		booklist[1] = b2;
		booklist[2] = b3;
		booklist[3] = b4;
		booklist[4] = b5;

		System.out.println("************************ 도서 목록 ************************");
		for (BookDTO book : booklist) {
			System.out.println(book.toString());
		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println(booklist[i].toString());
//		}
//		System.out.println(encap.toString());
//		System.out.println(service.toString());

	}

}
