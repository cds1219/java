package test2;

public class BookDTO {
	private String title, author, publisher, des;
	int price, isbn;
	
	public BookDTO(int isbn, String title, String author, String publisher, int price, String des) {
		super();
		setAuthor(author);
		setDes(des);
		setIsbn(isbn);
		setPrice(price);
		setPublisher(publisher);
		setTitle(title);
	}

	public BookDTO() {
		super();
		
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		if (isbn > 0) {
			this.isbn = isbn;
		} else {
			System.out.println("도서 번호를 입력하세요");
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null) {
			this.title = title;
		} else {
			System.out.println("도서 명을 입력하세요");
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if (author != null) {
			this.author = author;
		} else {
			System.out.println("저자를 입력하세요");
		}
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		if (publisher != null) {
			this.publisher = publisher;
		} else {
			System.out.println("출판사를 입력하세요");
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("가격을 입력하세요");
		}
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		if (des != null) {
			this.des = des;
		} else {
			System.out.println("상세 설명을 입력하세요");
		}
	}

	@Override
	public String toString() {
		String msg = String.format("%-8d| %-15s	| %-4s| %-13s| %d |%s",
				getIsbn(),getTitle(),getAuthor(),getPublisher(),getPrice(),getDes());
		return msg;
	}
}