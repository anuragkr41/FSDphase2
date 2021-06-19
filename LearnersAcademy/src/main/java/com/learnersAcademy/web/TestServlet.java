package com.learnersAcademy.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learnersAcademy.models.Classes;
import com.learnersAcademy.util.HibernateUtil;

@WebServlet ("/addSubjectSection")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public TestServlet() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		System.out.println("In test servlet");

		PrintWriter out = response.getWriter();
		String selectedClass = request.getParameter("classname");
		String enteredSubjectName = request.getParameter("subjectname");
		
		System.out.println(selectedClass + "selected class");
		System.out.println(enteredSubjectName+ "entered Subject Name");
		request.getSession(false).setAttribute("classname",selectedClass);
		request.getSession(false).setAttribute("subjectname",enteredSubjectName);
	
		
		List<Classes> classlist = new ArrayList<>();
		classlist = HibernateUtil.getSessionFactory().openSession()
				.createNativeQuery("SELECT * FROM classes WHERE classname='" + selectedClass + "'",Classes.class).getResultList();

		request.getRequestDispatcher("add_Subject.jsp").include(request, response);
		out.println("<script type=\"text/javascript\">\r\n" + "        $(window).on('load', function () {\r\n"
				+ "            $('#select-section').modal('show');\r\n" + "        });\r\n" + "    </script>");
		out.println("<div id ='select-section' class=\"modal\" tabindex=\"-1\">\r\n"
				+ "  <div class=\"modal-dialog\">\r\n" + "    <div class=\"modal-content\">\r\n"
				+ "      <div class=\"modal-header\">\r\n" + "        <h5 class=\"modal-title\">Modal title</h5>\r\n"
				+ "        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n"
				+ "      </div>\r\n" + "      <div class=\"modal-body\">");

		out.println("<h5>Select Section </h5>");

		System.out.println(request.getContextPath());
		out.println("<form method = 'post' action = '"+request.getContextPath()+"/subject' >");
		out.println("<div class=\"col-md-6\">\r\n"
				+ "												<div class=\"form-group mt-3\">\r\n"
				+ "													<label for=\"form_notes\">Section</label> <select\r\n"
				+ "														id=\"form_class\" name=\"section\" class=\"form-control\"\r\n"
				+ "														required=\"required\" data-error=\"Section is required\">\r\n"
				+ "														<option value=\"\" selected disabled>----Section*----</option>");

		
		for(Classes c:classlist) {
			out.println("<option value ='"+c.getSection()+ "'>"+c.getSection()+"</option>");
		}
	
		
		
		out.println("</select></div>");
		
		
		
	
		
		out.println("</div>\r\n" + "      <div class=\"modal-footer\">\r\n"
				+ "        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n"
				+ "        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n"
				+ "      </div>\r\n" + "    </div></form>\r\n" + "  </div>\r\n" + "</div>");

	}

}
