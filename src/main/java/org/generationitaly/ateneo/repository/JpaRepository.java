package org.generationitaly.ateneo.repository;

import java.util.List;

public interface JpaRepository<T, ID> {

	void save(T entity);

	void update(T entity);

	void delete(T entity);
	
	void deleteById(ID primaryKey);

	T findById(ID primaryKey);

	List<T> findAll();

	Long count();

}
