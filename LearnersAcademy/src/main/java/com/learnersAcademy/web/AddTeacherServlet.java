package com.learnersAcademy.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learnersAcademy.dao.TeacherDao;
import com.learnersAcademy.models.Teacher;

/**
 * Servlet implementation class AddTeacherServlet
 */
@WebServlet ("/teacher")
public class AddTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TeacherDao teacherDao= new TeacherDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherServlet() {
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
		System.out.println("You are trying to add a new Teacher");
		
		Teacher teacher = new Teacher();
		teacher.setFirstName(request.getParameter("firstname"));
		teacher.setLastName(request.getParameter("lastname"));
		teacher.setGender(request.getParameter("gender"));
		teacher.setDateOfBirth(request.getParameter("dateofbirth"));
		teacher.setEmail(request.getParameter("email"));
		teacher.setPhone(request.getParameter("mobile"));
		teacher.setAddress(request.getParameter("address"));
		teacher.setQualification(request.getParameter("qualification"));
		teacher.setTeachingGroup(request.getParameter("teachingGroup"));
		
		String temp=request.getParameter("experience");
		int exp=Integer.parseInt(temp);
		teacher.setExperience(exp);
		
		String sal = request.getParameter("ctc");
		double ctc = Double.parseDouble(sal);
		teacher.setSalary(ctc);
		
		teacherDao.saveTeacher(teacher);
		
		System.out.println("Records saved Successfully");
		response.sendRedirect("teachers.jsp");
		
	}

}
