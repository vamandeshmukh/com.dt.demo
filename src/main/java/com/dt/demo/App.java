package com.dt.demo;

import java.util.List;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {

	public static void main(String[] args) {
		System.out.println("Start");
//		int id = 1;
//		Employee emp = EmployeeService.getEmployeeById(id);
//		System.out.println(emp);
//		Employee newEmployee = new Employee();
//		newEmployee.setName("Sonu");
//		newEmployee.setSalary(10.5);
//		EmployeeService.save(newEmployee);
		List<Employee> emps = EmployeeService.getEmployees();
		for (Employee e : emps) {
			System.out.println(e);
		}
		DbUtil.shutdown();
		System.out.println("End");
	}
}
