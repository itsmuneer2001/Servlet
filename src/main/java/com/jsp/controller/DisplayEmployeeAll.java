package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
@WebServlet("/displayall")
public class DisplayEmployeeAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeService service=new EmployeeService();
		List<Employee> list=service.getByAll();
		if(list.size()>0) {
			req.setAttribute("list", list);
			RequestDispatcher dispatcher=req.getRequestDispatcher("displayemployee.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("employeehome.jsp");
			dispatcher.include(req, resp);
		}
	}

}
