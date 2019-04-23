package bahar.book.bean;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import bahar.book.entity.Book;
import bahar.book.service.BookService;

@Stateless
public class BookServiceBean implements BookService {
	@PersistenceContext(unitName = "LIBRARY_DB")
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Book> findBooksByNameAndAuthor() {
		return (ArrayList<Book>) em.createNamedQuery("Book.findBooksByNameAndAuthor").getResultList();
	}

	@Override
	public ArrayList<Book> orderByLastUpdate() {
		return null;
	}

}
