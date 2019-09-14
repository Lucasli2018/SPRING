package cn.itcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.BookDao;
import cn.itcast.vo.Book;
@Transactional
@Service("bookService")
public class BookService {
	@Autowired
	@Qualifier("bookDao")
	private BookDao bookDao;
	
	public void add(Book book) {
		System.out.println("Service层的添加图书...");
		bookDao.save(book);
	}

}
