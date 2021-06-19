package com.learnersAcademy.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learnersAcademy.models.Classes;
import com.learnersAcademy.models.Subject;
import com.learnersAcademy.util.HibernateUtil;


public class AssignSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AssignSubjectServlet() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String selectedsubjectid=request.getParameter("selectedsubject");
		String selectedclassid=request.getParameter("selectedclass");
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session se=sf.openSession();
		se.beginTransaction();
		
		List<Subject> sub=se.createNativeQuery("Select * from subjects where subjectid='"+selectedsubjectid+"'", Subject.class).getResultList();
		List<Classes> cl=se.createNativeQuery("Select * from classes where classid='"+selectedclassid+"'", Classes.class).getResultList();
		
		Subject ns=new Subject();
		ns.setSubjectName(sub.get(0).getSubjectName());
		ns.setClasses(cl.get(0).getClassname());
		ns.setSection(cl.get(0).getSection());
		
		se.save("Subject", ns);
		
		
		se.getTransaction().commit();
		se.close();
		
		response.sendRedirect(request.getContextPath()+"/subjects.jsp");
		
		
	}

}
