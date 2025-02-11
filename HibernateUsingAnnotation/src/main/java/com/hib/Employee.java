package com.hib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int E_id;
	private String E_name;
	private double E_salary;
	
	
	
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public double getE_salary() {
		return E_salary;
	}
	public void setE_salary(double e_salary) {
		E_salary = e_salary;
	}
	
	
	
	public Employee(int e_id, String e_name, double e_salary) {
		super();
		E_id = e_id;
		E_name = e_name;
		E_salary = e_salary;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [E_id=" + E_id + ", E_name=" + E_name + ", E_salary=" + E_salary + "]";
	}
	
	
	
}
