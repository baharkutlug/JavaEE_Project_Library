package bahar.library.service;

import java.util.List;

import javax.ejb.Local;

import bahar.book.entity.Book;

@Local
public interface BookService {
	public List<Book> findBooksByName(String name);

	public List<Book> findBooksByName(String name, int readSize);

	public List<Book> findBoksByAuthor(String author);

	public List<Book> findBoksByAuthor(String author, int readSize);

	public List<Book> findBooksByIDX(int idx);

	public List<Book> findBooksByIDX(int idx, int readSize);
}
