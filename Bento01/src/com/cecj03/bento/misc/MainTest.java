package com.cecj03.bento.misc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cecj03.bento.model.DailyMeal;
import com.cecj03.bento.model.Meal;
import com.cecj03.bento.model.OrderType;
import com.cecj03.bento.model.Restaurant;
import com.cecj03.bento.model.dao.DailyMealDao;
import com.cecj03.bento.model.dao.MealDao;
import com.cecj03.bento.model.dao.OrderTypeDao;
import com.cecj03.bento.model.dao.RestaurantDao;

public class MainTest {

	public static void testOrderType() {
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "beans.config.xml");
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/beans-cofig.xml");
		OrderTypeDao dao = (OrderTypeDao) context.getBean("OrderTypeDao");
		dao.delete(9);
		dao.delete(13);
		List<OrderType> result = dao.findAll();
		for (OrderType oBean : result) {
			System.out.println(oBean.getId());
			System.out.println(oBean.getType());
		}
	}

	public static void testRestaurant() {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/beans-cofig.xml");
		RestaurantDao dao = (RestaurantDao) context.getBean("RestaurantDao");
		List<Restaurant> result = dao.findAll();
		for (Restaurant rBean : result) {
			System.out.println(rBean.getId());
			System.out.println(rBean.getName());
		}
	}

	public static void testMeal() {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/beans-cofig.xml");
		MealDao dao = (MealDao) context.getBean("MealDao");
		List<Meal> result = dao.findAll();
		for (Meal mBean : result) {
			System.out.println(mBean.getId());
			System.out.println(mBean.getName());
		}
	}

	public static void testDailyMeal() {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/beans-cofig.xml");
		DailyMealDao dao = (DailyMealDao) context.getBean("DailyMealDao");
		List<DailyMeal> result = dao.findAll();
		for (DailyMeal dBean : result) {
			System.out.println(dBean.getId());
			System.out.println(dBean.getOrderDate());
			System.out.println(dBean.getMealId());
		}
	}

	public static void main(String[] args) {
		// testOrderType();
		// testRestaurant();
		//testMeal();
		testDailyMeal();
	}

}
