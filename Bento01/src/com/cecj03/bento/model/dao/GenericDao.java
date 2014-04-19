package com.cecj03.bento.model.dao;

import java.util.List;

public interface GenericDao<T> {

	public T findById(int id);

	public List<T> findAll();

	public T insert(T entity);

	public T update(T entity);

	public boolean delete(int id);

}
