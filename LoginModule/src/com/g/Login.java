package com.g;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDAO;

@WebServlet("/Login")
public class Login extends HttpServlet 
{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String uname= request.getParameter("uname");
		String pass=  request.getParameter("pass");
		
		LoginDAO l= new LoginDAO();
		if(l.check(uname, pass))                             // static with out creating db	if(uname.equals("vinay") && pass.equals("kumar")) 
    	{
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			response.sendRedirect("llogin.jsp");
		}

	}

}
