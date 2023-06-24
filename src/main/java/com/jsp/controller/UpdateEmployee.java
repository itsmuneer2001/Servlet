package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
@WebServlet("/updateemployee")
public class UpdateEmployee extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee employee=new Employee();
		employee.setId(Integer.parseInt(req.getParameter("id")));
		employee.setName(req.getParameter("name"));
		employee.setPhone(Long.parseLong(req.getParameter("phone")));
		employee.setEmail(req.getParameter("email"));
		employee.setPasswor(req.getParameter("password"));
		EmployeeService service=new EmployeeService();
		Employee employee2=service.updateEmployee(employee);
		if(employee2!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("employeehome.jsp");
			dispatcher.forward(req, resp);
			
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("editemployee.jsp");
			dispatcher.include(req, resp);
			PrintWriter printWriter=resp.getWriter();
			printWriter.println("Plz Check Your Id");
		}
	}
}
