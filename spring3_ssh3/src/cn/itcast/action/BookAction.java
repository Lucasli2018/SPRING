package cn.itcast.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.service.BookService;
import cn.itcast.vo.Book;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
// <package namespace="/" extends="strtus-default">
@Namespace("/")
@ParentPackage("struts-default")
@Controller("bookAction")
@Scope("prototype")
public class BookAction extends ActionSupport implements ModelDriven<Book>{
	private Book book = new Book();
	public Book getModel() {
		return book;
	}

	// 在Action中注入Service
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@Action(value="book_add")
	public String add(){
		System.out.println("web层添加图书...");
		bookService.add(book);
		return NONE;
	}
}
