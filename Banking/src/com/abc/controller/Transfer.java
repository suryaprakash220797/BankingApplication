package com.abc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.model.Model;

@WebServlet("/Transfer")
public class Transfer extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	int accno = (Integer)session.getAttribute("accno");
	String samt=request.getParameter("amt");
	int amt = Integer.parseInt(samt);
	String sraccno=request.getParameter("raccno");
	int raccno = Integer.parseInt(sraccno);
	try {
		Model m=new Model();
		m.setAccno(accno);
		m.setBal(amt);
		m.setRaccno(raccno);
		boolean b=m.transfer();		
		if(b==true)
		{
			response.sendRedirect("/Banking/TransferSuccess.html");
		}
		else
		{
			response.sendRedirect("/Banking/TransferFail.html");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}


}
