package com.cg.employeecrud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="workingemp")
public class Employee {
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name="ename")
	private String empName;
	private int empSalary;
	@Column(name="eadd")
	private String address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public Employee() {

	}

	public Employee(int empId, String empName, int empSalary, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}
	

}
