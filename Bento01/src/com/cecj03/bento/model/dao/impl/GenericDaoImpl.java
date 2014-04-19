package com.cecj03.bento.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.cecj03.bento.model.dao.GenericDao;

public class GenericDaoImpl<T> implements GenericDao<T> {
	
	private Class<T> clazz;
	private SessionFactory sessionFactory = null;

	@Override
	public T findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T insert(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
