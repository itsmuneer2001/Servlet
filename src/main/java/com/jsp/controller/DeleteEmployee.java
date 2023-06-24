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
@WebServlet("/deleteemployee")
public class DeleteEmployee extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		EmployeeService service=new EmployeeService();
		Employee employee=service.deleteEmployee(id);
		if(employee!=null) {
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("employeehome.jsp");
			dispatcher.forward(req, resp);
			PrintWriter printWriter=resp.getWriter();
			printWriter.println("Your Account is Deleted ");

		}
		else {
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("employeedelete.jsp");
			dispatcher.include(req, resp);
//			PrintWriter printWriter=resp.getWriter();
//			printWriter.println("Plz Check Your Id");
		}
	}
}
