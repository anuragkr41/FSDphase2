package com.learnersAcademy.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.learnersAcademy.models.Assign_teacher_to_class;
import com.learnersAcademy.util.HibernateUtil;

@WebServlet (name="/assignTeacher")
public class AssignTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AssignTeacherServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String selectedClassName=(String)request.getSession(false).getAttribute("selectedClassName");
		String selectedClassID=(String)request.getSession(false).getAttribute("selectedClassID");
		String selectedTeacherID=(String)request.getSession(false).getAttribute("selectedTeacherID");
		String selectedClassSection=(String)request.getSession(false).getAttribute("selectedClassSection");
		String selectedSubjectID = request.getParameter("subjectID");
		
		System.out.println("selectedClassName "+selectedClassName);
		System.out.println("selectedClassID "+selectedClassID);
		System.out.println("selectedTeacherID "+selectedTeacherID);
		System.out.println("selectedClassSection "+selectedClassSection);
		System.out.println("selectedSubjectID "+selectedSubjectID);
		
		Assign_teacher_to_class Attc = new Assign_teacher_to_class(selectedTeacherID, selectedSubjectID, selectedClassID);
//		Assign_teacher_to_class a2= new 
		System.out.println(Attc);
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		ses.save(Attc);
		ses.getTransaction().commit();
		
		System.out.println("Redirecteing to teachers.jsp");
		
		response.sendRedirect(request.getContextPath()+"/teachers.jsp");
		
	}

}
