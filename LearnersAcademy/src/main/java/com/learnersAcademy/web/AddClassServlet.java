package com.learnersAcademy.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learnersAcademy.dao.ClassesDao;
import com.learnersAcademy.models.Classes;

/**
 * Servlet implementation class AddClassServlet
 */
@WebServlet ("/addClass")
public class AddClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ClassesDao classesdao= new ClassesDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		System.out.println("You are trying to add a new class");
		
		Classes classes = new Classes();
		classes.setClassname(request.getParameter("classname"));
		classes.setSection(request.getParameter("section"));
		classes.setGroup(request.getParameter("group"));
		classes.setStream(request.getParameter("stream"));
		classes.setNotes(request.getParameter("notes"));
		
		
		classesdao.saveClasses(classes);
		
		System.out.println("Records saved Successfully");
		response.sendRedirect("classes.jsp");
		
		
	}

}
