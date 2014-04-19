package com.cecj03.bento.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cecj03.bento.model.OrderType;

public class OrderTypeDAO {

	private SessionFactory sessionFactory = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<OrderType> findAll() {
		Session session = sessionFactory.openSession();

		return (List<OrderType>) session.createCriteria(OrderType.class).list();
	}

}
