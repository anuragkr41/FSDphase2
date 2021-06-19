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
 * Servlet implementation class RemoveClassesServlet
 */
@WebServlet ("/removeClasses")
public class RemoveClassesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RemoveClassesServlet() {
        super();
    
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String [] classes;
		classes=request.getParameterValues("removeclasses");
		if(classes!=null) {
			System.out.println("if blocked executed");
			System.out.println(classes.toString());
			
			Session s=HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			for(String c:classes) {
				System.out.print("one record Deleteion");
				s.createNativeQuery("DELETE FROM classes WHERE classID='"+c+"'").executeUpdate();
				
			}
			s.getTransaction().commit();
//			s.getSessionFactory().close();
			s.close();
			
			
			
			
		}
		
		else {
		
			System.out.println("Else blocked Classes were empty");
		}
		response.sendRedirect(request.getContextPath()+"/classes.jsp");
		
	}

}
