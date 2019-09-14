package cn.itcast.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.BookDao;
import cn.itcast.vo.Book;
@Transactional
public class BookService {

	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void add(Book book) {
		System.out.println("Service层保存图书...");
		bookDao.save(book);
	}

}
