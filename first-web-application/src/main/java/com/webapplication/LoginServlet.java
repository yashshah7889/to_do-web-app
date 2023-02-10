package com.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")//annotations add information to the class.
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException {
		String name = request.getParameter("name");//get parameter from browser and will set attribute from it.
		String name1 = "yash1";
		request.setAttribute("name", name1);
		
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
}
