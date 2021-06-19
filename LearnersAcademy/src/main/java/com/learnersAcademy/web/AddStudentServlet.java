package com.learnersAcademy.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.learnersAcademy.dao.StudentDao;
import com.learnersAcademy.models.Classes;
import com.learnersAcademy.models.Student;
import com.learnersAcademy.util.HibernateUtil;

/**
 * Servlet implementation class AddTeacherServlet
 */
@WebServlet ("/student")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	StudentDao studentDao= new StudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
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
		System.out.println("You are trying to add a new Student");
		String selectedclassid=request.getParameter("selectedclass");
		
		
		Student student= new Student();
		student.setFirstName(request.getParameter("firstname"));
		student.setLastName(request.getParameter("lastname"));
		student.setGender(request.getParameter("gender"));
		student.setDateOfBirth(request.getParameter("dateofbirth"));
		
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        List<Classes> cl=session.createNativeQuery("Select * from classes where classid='"+selectedclassid+"'", Classes.class).getResultList();
	        
	        student.setClassname(cl.get(0).getClassname());
			student.setSection(cl.get(0).getSection());
	 
//	        session.persist(classes);
//		student.setClassname(request.getParameter("classname"));
//
//		
////
////		student.setClassname(request.getParameter("classname"));
//		student.setSection(request.getParameter("section"));
////		
		student.setFathersName(request.getParameter("fathersname"));
		student.setMothersName(request.getParameter("mothersname"));
		student.setAddress(request.getParameter("address"));
		student.setContact(request.getParameter("contact"));
		student.setBloodGroup(request.getParameter("bloodgroup"));
			
		studentDao.saveStudent(student);
		
		System.out.println("Records saved Successfully");
		response.sendRedirect("successMessage/Success.jsp");
		
	}

}
