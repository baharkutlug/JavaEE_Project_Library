package bahar.book.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import bahar.library.service.LibraryService;

@Stateless
public class LibraryServiceBean implements LibraryService {

	@PersistenceContext(unitName = "LIBRARY_DB")
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findByNamedQuery(Class<T> clazz, String namedQuery) {
		return createNamedQuery(clazz, namedQuery).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findByNamedQuery(Class<T> clazz, String namedQuery, Object... params) {
		return createNamedQuery(clazz, namedQuery, params).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findByNamedQuery(Class<T> clazz, String namedQuery, Integer readSize) {
		return createNamedQuery(clazz, namedQuery).setMaxResults(readSize).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findByNamedQuery(Class<T> clazz, String namedQuery, Integer readSize, Object... params) {
		return createNamedQuery(clazz, namedQuery, params).setMaxResults(readSize).getResultList();

	}

	@Override
	public <T> void persist(T t) throws Exception {
		try {
			em.persist(t);

		} catch (Exception e) {
			throw e;
		}

	}
	
	@Override
	public <T> void remove(Class<T> clazz, Object idx) {
		try {
			Object entity = em.getReference(clazz, idx);
			em.remove(entity);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public <T> void merge(T t) throws Exception {
		try {
			em.merge(t);
		} catch (Exception e) {
			throw e;
		}
	}

	public Query createNamedQuery(Class<?> clazz, String namedQuery) {
		Query query = em.createNamedQuery(namedQuery, clazz);
		return query;
	}

	public Query createNamedQuery(Class<?> clazz, String namedQuery, Object... params) {
		Query query = em.createNamedQuery(namedQuery, clazz);
		setParams(query, params);
		return query;
	}

	public void setParams(Query query, Object... params) {
		int indeks = 1;
		for (Object param : params) {
			query.setParameter(indeks++, param);
		}

	}

}
