package bahar.library.service;

import java.util.List;

import javax.ejb.Local;

@Local
public interface LibraryService {
	
	public <T> List<T> findByNamedQuery(Class<T> clazz, String namedQuery);
	public <T> List<T> findByNamedQuery(Class<T> clazz, String namedQuery, Object... params);
	public <T> List<T> findByNamedQuery(Class<T> clazz, String namedQuery, Integer readSize);
	public <T> List<T> findByNamedQuery(Class<T> clazz, String namedQuery, Integer readSize, Object... params);
	
}
