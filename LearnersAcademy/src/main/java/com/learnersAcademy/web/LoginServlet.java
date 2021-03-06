package com.learnersAcademy.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learnersAcademy.dao.UserDao;
import com.learnersAcademy.models.User;

@WebServlet("/login")
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao dao = new UserDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
//		System.out.println("You clicked me");

//		User user = new User();
//		user.setFirstName("Anurag");
//		user.setLastName("Kumar");
//		user.setUsername("admin");
//		user.setPassword("password");
//		dao.saveUser(user);
//		System.out.println("User Added");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher dispatcher = null;

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (dao.validate(username, password)) {

			HttpSession session = request.getSession();
			session.setAttribute("username", username);

			dispatcher = request.getRequestDispatcher("admin_dashboard.jsp");
			dispatcher.forward(request, response);

		}

		else {
			dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);

			out.println("<script>");
			out.println(
					"window.onload = myfunction; function myfunction() {document.getElementById('loginError').innerHTML = \"<h6 style = 'color: red'>Login failed Try again..!!</h6>\";}");
			out.println("</script>");

//			out.println("<h6 style = 'color: red'>Login failed Try again..!!</h6>");
		}
	}

}
