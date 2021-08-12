package srotavele.mvc.controllers;

import org.springframework.stereotype.Controller;

import srotavele.mvc.repositories.BookRepository;
import srotavele.mvc.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

}
