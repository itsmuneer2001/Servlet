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
@WebServlet("/editemployee")
public class GetEmployee extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		EmployeeService service=new EmployeeService();
		Employee employee=service.getByID(id);
		if(employee !=null) {
			req.setAttribute("emp", employee);
			RequestDispatcher dispatcher=req.getRequestDispatcher("updateemployee.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("getemployee.jsp");
			dispatcher.include(req, resp);
			PrintWriter printWriter=resp.getWriter();
			printWriter.println("Plz Check Your Id");
		}
				
	}
}
