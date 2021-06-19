package com.learnersAcademy.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.learnersAcademy.util.HibernateUtil;

/**
 * Servlet implementation class RemoveTeachersServlet
 */
@WebServlet ("/removeSubjects")
public class RemoveSubjectsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveSubjectsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String [] subjects;
		subjects= request.getParameterValues("removesubject");
		if(subjects!=null) {
			System.out.println("If Blcok executed");
			Session s = HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			
			for(String sub:subjects) {
				s.createNativeQuery("DELETE FROM subjects WHERE subjectID='"+sub+"'").executeUpdate();
			}
			
			s.getTransaction().commit();
			s.close();
		}
		
		else {
			System.out.println("Subject List was empty");
		}
		
		response.sendRedirect("subjects.jsp");
		
	}

}
