package com.dt.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("Employee default constructor");
	}

	public Employee(String name, double salary) {
		super();
		System.out.println("Employee 2 args constructor");
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, double salary) {
		super();
		System.out.println("Employee 3 args constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
