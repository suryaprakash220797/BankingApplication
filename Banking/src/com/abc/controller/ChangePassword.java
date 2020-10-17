package com.abc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.model.Model;
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pwd = request.getParameter("npwd");
		HttpSession session = request.getSession();
		int accno = (Integer) session.getAttribute("accno");
		try {
			Model m = new Model();
			m.setAccno(accno);
			m.setPwd(pwd);
			boolean b=m.chanePwd();
			if(b==true)
			{
				response.sendRedirect("/Banking/ChangePwdSuccess.html");
			}
			else
			{
				response.sendRedirect("/Banking/ChangePwdFail.html");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

}
