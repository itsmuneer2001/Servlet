package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
	
	public Employee saveEmployee(Employee employee) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
		}
		return employee;
	}
	public Employee deleteEmployee(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee= entityManager.find(Employee.class, id);
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		return employee;
		
	}
	public Employee updateEmployee(Employee employee) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee2=entityManager.find(Employee.class, employee.getId());
		if(employee2!=null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		
		return employee2;
	}
	public Employee getById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		return entityManager.find(Employee.class , id);
	}
	public List<Employee> getByAll(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select a from Employee a");
		return query.getResultList();
	}
	
}
