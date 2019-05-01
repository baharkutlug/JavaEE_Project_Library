package bahar.library.service;

import java.util.List;

import javax.ejb.Local;

import bahar.book.entity.Book;

@Local
public interface BookService {
	public List<Book> findBooksByName(String name);

	public List<Book> findBooksByName(String name, int readSize);

	public List<Book> findBooksByAuthor(String author);

	public List<Book> findBooksByAuthor(String author, int readSize);

	public List<Book> findBooksByIDX(int idx);

	public List<Book> findBooksByIDX(int idx, int readSize);
	
	public void saveBook(Book book);
	
	public void mergeBook(Book book);
}
