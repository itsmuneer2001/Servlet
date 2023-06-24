package com.jsp.service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {
	EmployeeDao dao=new EmployeeDao();
	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}
	public Employee deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}
	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}
	public Employee getByID(int id) {
		return dao.getById(id);
	}
	public List<Employee> getByAll(){
		return dao.getByAll();
	}

}
