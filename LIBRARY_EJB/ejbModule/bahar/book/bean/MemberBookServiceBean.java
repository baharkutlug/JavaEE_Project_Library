package bahar.book.bean;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import bahar.book.entity.MemberBook;
import bahar.library.service.MemberBookService;

@Stateless
public class MemberBookServiceBean implements MemberBookService {

	@PersistenceContext(unitName = "LIBRARY_DB")
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<MemberBook> findMembersByBorrowedBookIdx() {
		return (ArrayList<MemberBook>) em.createNamedQuery("MemberBook.findMembersByBorrowedBookIdx").getResultList();
	}

	@Override
	public ArrayList<MemberBook> orderByLastUpdate() {
		return null;
	}

}
