package com.cecj03.bento.model.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cecj03.bento.model.dao.GenericDao;

public class GenericDaoImpl<T> implements GenericDao<T> {

	private Class<T> clazz;
	private SessionFactory sessionFactory = null;

	public GenericDaoImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
		System.out.println("the real type of this dao class is："
				+ this.clazz.getName());
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public T findById(int id) {
		Session session = sessionFactory.openSession();
		return (T) session.get(this.clazz, new Integer(id));
	}

	@Override
	public List<T> findAll() {
		Session session = sessionFactory.openSession();
		return (List<T>) session.createCriteria(this.clazz).list();
	}

	@Override
	public T insert(T entity) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(entity);
			tx.commit();
			return entity;
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public T update(T entity) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.update(entity);
			tx.commit();
			return entity;
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean delete(int id) {
		Session session = sessionFactory.openSession();
		T entity = this.findById(id);
		if (entity != null) {
			Transaction tx = session.beginTransaction();
			try {
				session.delete(entity);
				tx.commit();
				return true;
			} catch (HibernateException e) {
				tx.rollback();
				e.printStackTrace();
				System.out.println("error occured while deleting");
				return false;
			}
		} else {
			System.out.println("there's nothing to delete!");
			return false;
		}
	}

}
