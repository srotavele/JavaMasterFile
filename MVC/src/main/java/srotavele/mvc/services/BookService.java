package srotavele.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import srotavele.mvc.models.Book;
import srotavele.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	// returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Book updated = bookRepository.findById(id).get();
		updated.setTitle(title);
		updated.setDescription(desc);
		updated.setLanguage(lang);
		updated.setNumberOfPages(numOfPages);
		return bookRepository.save(updated);
	}
		
//	}
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}

}
