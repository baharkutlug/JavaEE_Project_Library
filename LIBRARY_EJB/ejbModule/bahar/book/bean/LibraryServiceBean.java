package bahar.book.bean;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import bahar.book.entity.Member;
import bahar.book.entity.Book;
import bahar.book.entity.MemberBook;
import bahar.library.service.LibraryService;

@Stateless
public class LibraryServiceBean implements LibraryService {

	@PersistenceContext(unitName = "LIBRARY_DB")
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Member> findByMemberName(String name) {
		// Dışardan verilen üye ismine göre bilgileri getiren aramayı yaratma
		return (ArrayList<Member>) em.createQuery("SELECT m FROM Member m WHERE m.memFirstName = :name")
				.setParameter("name", name).getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Member> findByMemberIDX(int idx) {
		// Dışarıdan verilen üye idx ine göre bilgileri getiren aramayı yaratma
		return (ArrayList<Member>) em.createQuery("SELECT m FROM Member m WHERE m.idx = :idx").setParameter("idx", idx)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<MemberBook> findRecordByMemberName(String name) {
		// Dışarıdan verilen üye ismine göre kitap alım kayıtlarını getiren sorguyu yaratma
		int memberIDX = em.createQuery("SELECT m.idx FROM Member m WHERE m.memFirstName = :name").setParameter("name", name).getFirstResult();
		return (ArrayList<MemberBook>) em.createQuery("SELECT mb FROM MemberBook mb WHERE mb.memCardIdx = :idx").setParameter("idx", memberIDX)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<MemberBook> findRecordByMemberIDX(int idx) {
		// Dışarıdan verilen üye ismine göre kitap alım kayıtlarını getiren sorguyu yaratma
		return (ArrayList<MemberBook>) em.createQuery("SELECT mb FROM MemberBook mb WHERE mb.memCardIdx = :idx").setParameter("idx", idx)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Book> findByBookName(String name) {
		// Dışarıdan verilen kitap adına göre diğer bilgileri getiren sorguyu yaratma
		return  (ArrayList<Book>) em.createQuery("SELECT b FROM Book b WHERE b.name = :name").setParameter("name", name)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Book> findByBookIDX(int idx) {
		// Dışarıdan verilen kitap idx ine göre diğer bilgileri getiren sorguyu yaratma
		return (ArrayList<Book>) em.createQuery("SELECT b FROM Book b WHERE b.idx = :idx").setParameter("idx", idx)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<MemberBook> findRecordByBookName(String name) {
		// Dışarıdan verilen kitap ismine göre kitap alım kayıtlarını getiren sorguyu yaratma
		int bookIDX = em.createQuery("SELECT b.idx FROM Book b WHERE b.name = :name").setParameter("name", name).getFirstResult();
		return (ArrayList<MemberBook>) em.createQuery("SELECT mb FROM MemberBook mb WHERE mb.bookIdx = :idx").setParameter("idx", bookIDX)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<MemberBook> findRecordByBookIDX(int idx) {
		// Dışarıdan verilen kitap idx ine göre kitap alım kayıtlarını getiren sorguyu yaratma
		return (ArrayList<MemberBook>) em.createQuery("SELECT mb FROM MemberBook mb WHERE mb.bookIdx = :idx").setParameter("idx", idx)
				.getResultList();
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<MemberBook> findByLastUpdate() {
		// Kayıtları sondan başa sıralayan sorguyu yaratma
		return (ArrayList<MemberBook>) em.createQuery("SELECT mb FROM MemberBook mb ORDER BY mb.sysLastUpdate DESC").getResultList();
	}

}
