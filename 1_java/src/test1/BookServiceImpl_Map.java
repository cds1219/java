package test1;

import java.util.HashMap;
import java.util.Map;

public class BookServiceImpl_Map implements BookService {

	Map<String, BookDTO> map;

	BookServiceImpl_Map(){
		map=new HashMap<String, BookDTO>();
	}

	@Override
	public void insertBook(BookDTO book) {
		map.put(book.getIsbn(), book);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
