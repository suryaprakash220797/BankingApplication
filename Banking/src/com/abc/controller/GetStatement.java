package com.abc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.model.Model;

@WebServlet("/GetStatement")
public class GetStatement extends HttpServlet {
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int accno =(Integer) session.getAttribute("accno");
		try {
			Model m = new Model();
			m.setAccno(accno);
			ArrayList al=m.getStatement();
			if(al.isEmpty()==true)
			{
				response.sendRedirect("/Banking/StatementFail.html");
			}
			else
			{
				session.setAttribute("sal", m.sal);
				session.setAttribute("ral", m.ral);
				session.setAttribute("al", m.al);
				response.sendRedirect("/Banking/StatementSuccess.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
