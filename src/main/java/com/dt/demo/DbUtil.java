package com.dt.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		System.out.println("Configuring...");
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		System.out.println("Session factory");
		return sessionFactory;
	}

	public static void shutdown() {
		System.out.println("Shutting down...");
		getSessionFactory().close();
	}
}