package bahar.library.service;

import java.util.ArrayList;

import javax.ejb.Local;

import bahar.book.entity.Book;

@Local
public interface BookService {
	public ArrayList<Book> findBooksByNameAndAuthor();

	public ArrayList<Book> orderByLastUpdate();
}
