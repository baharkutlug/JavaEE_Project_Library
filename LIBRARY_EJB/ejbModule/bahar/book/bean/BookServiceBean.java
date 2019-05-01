package bahar.book.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import bahar.book.entity.Book;
import bahar.library.service.BookService;
import bahar.library.service.LibraryService;

@Stateless
public class BookServiceBean implements BookService {

	@EJB
	private LibraryService libraryService;

	@Override
	public List<Book> findBooksByName(String name) {
		// Verilen kitap ismine göre diğer bilgileri getiren sorguyu yaratma
		List<Book> book = libraryService.findByNamedQuery(Book.class, "Book.findBooksByName", name);
		return book;
	}
	
	@Override
	public List<Book> findBooksByName(String name, int readSize) {
		// Verilen kitap ismine göre diğer bilgileri getiren sorguyu yaratma (liste büyüklüğü belirtilebilen)
		List<Book> book = libraryService.findByNamedQuery(Book.class, "Book.findBooksByName", name, readSize);
		return book;
	}

	@Override
	public List<Book> findBooksByAuthor(String author) {
		// Verilen yazar ismine göre diğer bilgileri getiren sorguyu yaratma
				List<Book> book = libraryService.findByNamedQuery(Book.class, "Book.findBoksByAuthor", author);
				return book;
	}

	@Override
	public List<Book> findBooksByAuthor(String author, int readSize) {
		// Verilen yazar ismine göre diğer bilgileri getiren sorguyu yaratma (liste büyüklüğü belirtilebilen)
				List<Book> book = libraryService.findByNamedQuery(Book.class, "Book.findBoksByAuthor", author, readSize);
				return book;
	}
	
	@Override
	public List<Book> findBooksByIDX(int idx) {
		// Verilen kitap idx ine göre diğer bilgileri getiren sorguyu yaratma
		List<Book> book = libraryService.findByNamedQuery(Book.class, "Book.findBooksByIDX", idx);
		return book;
	}
	
	@Override
	public List<Book> findBooksByIDX(int idx, int readSize) {
		// Verilen kitap idx ine göre diğer bilgileri getiren sorguyu yaratma (liste büyüklüğü belirtilebilen)
		List<Book> book = libraryService.findByNamedQuery(Book.class, "Book.findBooksByIDX", idx, readSize);
		return book;
	}

	@Override
	public void saveBook(Book book) {
		try {
			libraryService.persist(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mergeBook(Book book) {
		try {
			libraryService.merge(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
