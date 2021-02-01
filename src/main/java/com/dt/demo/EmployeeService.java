package com.dt.demo;

import java.util.List;
import org.hibernate.Session;

public class EmployeeService {
	private static Session session = null;
	private static Employee emp;

	public static Employee getEmployeeById(int id) {
		System.out.println("getEmployeeById");
		try {
			session = DbUtil.getSessionFactory().openSession();
			emp = session.get(Employee.class, id);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return emp;
	}

	@SuppressWarnings("unchecked")
	public static List<Employee> getEmployees() {
		System.out.println("getEmployees");

		List<Employee> emps;
		try (Session session = DbUtil.getSessionFactory().openSession()) {
			emps = session.createQuery("from Employee").list();
		}
		return emps;
	}

	public static void save(Employee emp) {
		System.out.println("saveEmployees");
		try (Session session = DbUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		}
	}
}
