package cn.itcast.test;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.service.BookService;
import cn.itcast.vo.Book;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SSHTest {
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@Test
	public void demo(){
		Book book = new Book();
		book.setId(1);
		book.setName("AJAX开发");
		book.setPrice(35d);
		
		bookService.add(book);
	}
	
	@Test
	public void demo1(){
		Book book = new Book();
		book.setId(1);
		book.setName("AJAX开发");
		book.setPrice(35d);
		
		bookService.update(book);
	}
	
	@Test
	public void demo2(){
		Book book = new Book();
		book.setId(1);
		
		bookService.delete(book);
	}
	
	@Test
	public void demo3(){
		Book book = bookService.findById(3);
		System.out.println(book);
	}
	@Test
	public void demo4(){
		List<Book> books = bookService.findAll();
		for (Book book : books) {
			System.out.println(book);
		}
	}
	@Test
	public void demo5(){
		DetachedCriteria criteria = DetachedCriteria.forClass(Book.class);
		criteria.add(Restrictions.eq("name", "Struts2入门"));
		List<Book> books = bookService.findByCriteria(criteria);
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	@Test
	public void demo6(){
		List<Book> books = bookService.findByName("SSH整合2");
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
