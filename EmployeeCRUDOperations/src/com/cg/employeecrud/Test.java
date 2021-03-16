package com.cg.employeecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("working");
		EntityManager entity = factory.createEntityManager();
		
		entity.getTransaction().begin();
		Employee emp=new Employee(123,"abc",50000,"xyz");
		
		//entity.persist(emp);
		
		Employee emp1 = entity.find(Employee.class,123);
		//emp.setEmpName("mno");
		//entity.merge(emp);
		entity.remove(emp);
		
		entity.getTransaction().commit();
		entity.clear();
		factory.close();
	}
}
