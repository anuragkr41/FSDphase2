/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-06-19 12:24:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.learnersAcademy.models.Student;
import org.hibernate.SessionFactory;
import com.learnersAcademy.models.Classes;
import java.util.List;
import java.util.ArrayList;
import com.learnersAcademy.util.HibernateUtil;

public final class show_005fClasses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 List<Classes> classlist = new ArrayList<Classes>();
          SessionFactory sf;
          
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Main_Menu.jsp", Long.valueOf(1624102452887L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1624102452892L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.hibernate.SessionFactory");
    _jspx_imports_classes.add("com.learnersAcademy.models.Classes");
    _jspx_imports_classes.add("com.learnersAcademy.util.HibernateUtil");
    _jspx_imports_classes.add("com.learnersAcademy.models.Student");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Class MAsterList</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("  integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\r\n");
      out.write("<!-- Custom CSS  -->\r\n");
      out.write("<link href=\"CSS/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>All classes</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("<!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("  integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("  \r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 HttpSession Session = request.getSession(false);
		if(session.getAttribute("username")==null){
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
	
	
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" <div class=\"container.fluid\">\r\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n");
      out.write("  \r\n");
      out.write("        <a class=\"navbar-brand\" style=\"padding-left: 1em;\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin_dashboard.jsp\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/logo_Menu.png\" height=\"30px\" >   Learners Academy</a>\r\n");
      out.write("        <!-- <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample03\" aria-controls=\"navbarsExample03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("          </button> -->\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample03\" aria-controls=\"navbarsExample03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"PrimaryMenu\">\r\n");
      out.write("          <ul class=\"navbar-nav\" style=\"margin-left: auto; padding-right: 1em;\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active px-3\" aria-current=\"page\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin_dashboard.jsp\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li class=\"nav-item dropdown px-3\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"teachers.jsp\" id=\"dropdown03\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">Teachers</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">View all teachers</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Add new Teacher</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Remove Teacher</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Assign Subject to Teacher</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Assign Class to Teacher</a></li>\r\n");
      out.write("  \r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li class=\"nav-item dropdown px-3\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"students.jsp\" id=\"dropdown03\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">Students</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">List of Student by class</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Admit new student</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Remove Student</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li class=\"nav-item dropdown px-3\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"classes.jsp\" id=\"dropdown03\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">Classes</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">View all classes</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Remove class</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Add new Class</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Assign subject to class</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Assign Teacher to class</a></li>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li class=\"nav-item dropdown mx-3\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"subjects.jsp\" id=\"dropdown03\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">Subjects</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">View subjects</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Add new Subject</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Remove Subject</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <a href = \"");
      out.print(request.getContextPath());
      out.write("/logout\" class=\"btn btn-outline-light me-2\">Logout</a>\r\n");
      out.write("          </ul>\r\n");
      out.write("  \r\n");
      out.write("        </div>\r\n");
      out.write("  \r\n");
      out.write("      </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("      <h1 class=\"display-5 mt-5\" style=\"text-align: center;\">Classes MasterList</h1>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  <div class=\"container mt-5 col-12\">\r\n");
      out.write("    <table class=\"table table-striped\">\r\n");
      out.write("        \r\n");
      out.write("        <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th scope=\"col\">S.No</th>\r\n");
      out.write("              <th scope=\"col\">ID</th>\r\n");
      out.write("              <th scope=\"col\">Class</th>\r\n");
      out.write("              <th scope=\"col\">Section</th>\r\n");
      out.write("              <th scope=\"col\">Group</th>\r\n");
      out.write("              <th scope=\"col\">Stream</th>\r\n");
      out.write("              <th scope=\"col\">No. of Students</th>\r\n");
      out.write("              <th scope=\"col\">Class Teacher</th>\r\n");
      out.write("                            \r\n");
      out.write("            </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          ");
      out.write("\r\n");
      out.write("          ");

          sf = HibernateUtil.getSessionFactory();
          classlist=sf.openSession().createNativeQuery("Select * from classes",Classes.class).getResultList();
          /* sf.getCurrentSession().close();
          sf.close(); */
        //  int numberOfStudents=sf.openSession().createNativeQuery("SELECT COUNT studentID FROM students",Student.class).getResultList();
          int sno=1;
          		for(Classes cs:classlist)
          		{
          			//List<Object[]> reslist= new ArrayList<>();
          			//reslist=sf.openSession().createNativeQuery("SELECT * FROM students WHERE classID='"+cs.getClassID()+"'"  ).getResultList();
          			
          			
          			int noOfStudents=sf.openSession().createNativeQuery("SELECT * FROM students WHERE classname='"+cs.getClassname()+"'"+"AND section='"+cs.getSection()+"'" ).getResultList().size();
          			out.println("<tr>");
          			out.println("<td>"+sno+"</td>");
          			out.println("<td>"+cs.getClassID()+"</td>");
          			out.println("<td>"+cs.getClassname()+"</td>");
          			out.println("<td>"+cs.getSection()+"</td>");
          			out.println("<td>"+cs.getGroup()+"</td>");
          			out.println("<td>"+cs.getStream()+"</td>");
          			out.println("<td>"+noOfStudents+"</td>");
          			out.println("</tr>");
          			sno++;
          		}
          
      out.write("\r\n");
      out.write("                      \r\n");
      out.write("          </tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </table>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer id = \"footerid\" class=\"page-footer font-small blue\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Copyright -->\r\n");
      out.write("	<div class=\"footer-copyright text-center py-3\">\r\n");
      out.write("		© 2021 Copyright: <a href=\"#\">\r\n");
      out.write("			Learner's Academy</a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Copyright -->\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- Footer -->");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
