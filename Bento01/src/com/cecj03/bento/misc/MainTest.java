package com.cecj03.bento.misc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cecj03.bento.model.OrderType;
import com.cecj03.bento.model.dao.OrderTypeDao;

public class MainTest {

	public static void testOrderType() {
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "beans.config.xml");
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/beans-cofig.xml");
		OrderTypeDao dao = (OrderTypeDao) context.getBean("OrderTypeDao");
		List<OrderType> result = dao.findAll();

		for (OrderType oBean : result) {
			System.out.println(oBean.getId());
			System.out.println(oBean.getType());
		}
	}

	public static void main(String[] args) {
		testOrderType();
	}

}
