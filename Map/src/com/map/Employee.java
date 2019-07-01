package com.map;

public class Employee {
	private int id;
	private double salary;
	private String name;
	

	public  void setData(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public  int getId() {
		return id;
	}

	public  String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
