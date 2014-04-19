package com.cecj03.bento.misc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cecj03.bento.model.OrderType;
import com.cecj03.bento.model.dao.impl.OrderTypeDAO;

public class MainTest {

	public static void testOrderType() {
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "beans.config.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/beans-cofig.xml");
		OrderTypeDAO dao = (OrderTypeDAO) context.getBean("OrderTypeDao");
		List<OrderType> result = dao.findAll();
		System.out.println(result);

		for (OrderType oBean : result) {
			System.out.println(oBean.getId());
			System.out.println(oBean.getType());
		}
	}

	public static void main(String[] args) {
		testOrderType();

	}

}
