package com.learnersAcademy.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learnersAcademy.dao.StudentDao;
import com.learnersAcademy.dao.SubjectDao;
import com.learnersAcademy.models.Student;
import com.learnersAcademy.models.Subject;

/**
 * Servlet implementation class AddTeacherServlet
 */
@WebServlet ("/subject")
public class AddSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SubjectDao subjectDao= new SubjectDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubjectServlet() {
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
		System.out.println("You are trying to add a new Subject");
		
		Subject subject= new Subject();
		System.out.println("From Add Subject classname"+(String)request.getAttribute("classname"));
		System.out.println("From Add Subject subject"+(String)request.getAttribute("subjectname"));
		
		
		subject.setSubjectName((String)request.getSession(false).getAttribute("subjectname")); request.getSession(false).removeAttribute("subjectname");
		subject.setClasses((String)request.getSession(false).getAttribute("classname")); request.getSession(false).removeAttribute("classname");
		
		subject.setSection(request.getParameter("section"));
		
		subjectDao.saveSubject(subject);	
		System.out.println("Records saved Successfully");
		response.sendRedirect("subjects.jsp");	
	}
}
