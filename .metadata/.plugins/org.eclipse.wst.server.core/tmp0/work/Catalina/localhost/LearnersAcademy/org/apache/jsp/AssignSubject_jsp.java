/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-06-19 20:41:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.learnersAcademy.models.Classes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.learnersAcademy.util.HibernateUtil;
import java.util.ArrayList;
import com.learnersAcademy.models.Subject;
import java.util.List;

public final class AssignSubject_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

List<Classes> classlist2 = new ArrayList<Classes>();
	SessionFactory sf;
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/Main_Menu.jsp", Long.valueOf(1624135268184L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1624102452892L));
    _jspx_dependants.put("/subjects.jsp", Long.valueOf(1624102452912L));
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
    _jspx_imports_classes.add("org.hibernate.Session");
    _jspx_imports_classes.add("com.learnersAcademy.models.Subject");
    _jspx_imports_classes.add("com.learnersAcademy.util.HibernateUtil");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<!-- Custom CSS  -->\r\n");
      out.write("<link href=\"/WebApp/CSS/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>Learner's Academy Log in</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("	<!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Option 2: Separate Popper and Bootstrap JS -->\r\n");
      out.write("	<!--     \r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js\" integrity=\"sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    -->\r\n");
      out.write("\r\n");
      out.write("	");
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
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("  \r\n");
      out.write("            <li class=\"nav-item dropdown px-3\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"teachers.jsp\" id=\"dropdown03\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">Teachers</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/show_Teachers.jsp\">View all teachers</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/add_Teacher.jsp\">Add new Teacher</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/teachers.jsp\">Remove Teacher</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/assignTeacherToClass.jsp\">Assign Subject to Teacher</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/ViewSubjectTeachers.jsp\">View Subject Teachers</a></li>\r\n");
      out.write("                \r\n");
      out.write("  \r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li class=\"nav-item dropdown px-3\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"students.jsp\" id=\"dropdown03\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">Students</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/show_Students.jsp\">List of Student</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/add_Student.jsp\">Admit new student</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/students.jsp\">Remove Student</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li class=\"nav-item dropdown px-3\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"classes.jsp\" id=\"dropdown03\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">Classes</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/show_Classes.jsp\">View all classes</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/classes.jsp\">Remove class</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/add_Class.jsp\">Add new Class</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/AssignSubject.jsp\">Assign subject to class</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/assignTeacherToClass.jsp\">Assign Teacher to class</a></li>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li class=\"nav-item dropdown mx-3\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"subjects.jsp\" id=\"dropdown03\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">Subjects</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/show_Subjects.jsp\">View subjects</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/add_Subject.jsp\">Add new Subject</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/subjects.jsp\">Remove Subject</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("#\">Assign Subject to Class</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active px-3\" aria-current=\"page\" href=\"");
      out.print(request.getContextPath());
      out.write("/reports.jsp\">Reports</a>\r\n");
      out.write("            </li>\r\n");
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
      out.write("\r\n");
      out.write("	<h1 class=\"display-5 mt-5\" style=\"text-align: center;\">Subjects</h1>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container mt-5 col-6\">\r\n");
      out.write("		<div class=\"row .col-sm|md|lg|xl\">\r\n");
      out.write("\r\n");
      out.write("			<figure class=\"figure col themed-grid-col\">\r\n");
      out.write("				<a href=\"show_Subjects.jsp\"><img\r\n");
      out.write("					src=\"images/Subjects/View Master List.png\" height=150px></a>\r\n");
      out.write("				<figcaption class=\"figure-caption mt-3\">\r\n");
      out.write("					<h4>Subject Masterlist</h4>\r\n");
      out.write("				</figcaption>\r\n");
      out.write("			</figure>\r\n");
      out.write("\r\n");
      out.write("			<figure class=\"figure col themed-grid-col\">\r\n");
      out.write("				<a href=\"add_Subject.jsp\"><img\r\n");
      out.write("					src=\"images/Subjects/Add Subject.png\" height=150px></a>\r\n");
      out.write("				<figcaption class=\"figure-caption mt-3\">\r\n");
      out.write("					<h4>Add Subject</h4>\r\n");
      out.write("				</figcaption>\r\n");
      out.write("			</figure>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			<figure class=\"figure col themed-grid-col\">\r\n");
      out.write("				<a data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\" href=\"#\"><img\r\n");
      out.write("					src=\"images/Subjects/Remove Subject.png\" height=150px></a>\r\n");
      out.write("				<!-- Modal -->\r\n");
      out.write("				<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\"\r\n");
      out.write("					aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("					<div class=\"modal-dialog modal-lg\">\r\n");
      out.write("						<form action=\"");
      out.print(request.getContextPath());
      out.write("/removeSubjects\"\r\n");
      out.write("							method=\"post\">\r\n");
      out.write("							<div class=\"modal-content\">\r\n");
      out.write("								<div class=\"modal-header\">\r\n");
      out.write("									<h5 class=\"modal-title\" id=\"exampleModalLabel\">Remove\r\n");
      out.write("										Subject(s)</h5>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\r\n");
      out.write("										aria-label=\"Close\"></button>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("									<h6 class=\"modal-title\" id=\"exampleModalLabel\">Please\r\n");
      out.write("										select the Subject(s) that you wish to remove</h6>\r\n");
      out.write("\r\n");
      out.write("									<table class=\"table table-hover\">\r\n");
      out.write("										<thead>\r\n");
      out.write("											<tr>\r\n");
      out.write("												<th scope=\"col\" style=\"text-align: center;\">Select</th>\r\n");
      out.write("\r\n");
      out.write("												<th scope=\"col\">S.No</th>\r\n");
      out.write("												<th scope=\"col\">Subject Id</th>\r\n");
      out.write("												<th scope=\"col\">Subject Name</th>\r\n");
      out.write("												<th scope=\"col\">Class</th>\r\n");
      out.write("												<th scope=\"col\">Section</th>\r\n");
      out.write("\r\n");
      out.write("											</tr>\r\n");
      out.write("										</thead>\r\n");
      out.write("										<tbody>\r\n");
      out.write("\r\n");
      out.write("											");

											List<Subject> subjectList1= new ArrayList<>();
											int Sno = 1;

											subjectList1 = HibernateUtil.getSessionFactory().openSession()
													.createNativeQuery("SELECT * FROM subjects", Subject.class).getResultList();
											int originalRecords = subjectList1.size();
											System.out.println("Orignal list = " + originalRecords);
											for (Subject sub: subjectList1) {
											
      out.write("\r\n");
      out.write("											<tr>\r\n");
      out.write("												<td align=\"center\"><input type=\"checkbox\"\r\n");
      out.write("													name=\"removesubject\" value=\"");
      out.print(sub.getSubjectID());
      out.write("\"></td>\r\n");
      out.write("\r\n");
      out.write("												<td>");
      out.print(Sno);
      out.write("</td>\r\n");
      out.write("												<td>");
      out.print(sub.getSubjectID());
      out.write("</td>\r\n");
      out.write("												<td>");
      out.print(sub.getSubjectName());
      out.write("</td>\r\n");
      out.write("												<td>");
      out.print(sub.getClasses());
      out.write("</td>\r\n");
      out.write("												<td>");
      out.print(sub.getSection());
      out.write("</td>\r\n");
      out.write("												\r\n");
      out.write("											</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("											");

											Sno++;
											}
											
      out.write("\r\n");
      out.write("										</tbody>\r\n");
      out.write("									</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									<div class=\"form-check\">\r\n");
      out.write("										<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("											id=\"flexCheckChecked\" checked> <label\r\n");
      out.write("											class=\"form-check-label\" for=\"flexCheckChecked\"> I\r\n");
      out.write("											agree, to perform this operation </label>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"modal-footer\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("										data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("									<button type=\"submit\" class=\"btn btn-primary\">Proceed</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<figcaption class=\"figure-caption  mt-3\">\r\n");
      out.write("					<h4>Remove Subject</h4>\r\n");
      out.write("				</figcaption>\r\n");
      out.write("			</figure>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write(" 		<figure class=\"figure col themed-grid-col\">\r\n");
      out.write("				<a href=\"");
      out.print(request.getContextPath());
      out.write("/AssignSubject.jsp\"><img src=\"images/Classes/Assign subject.png\"\r\n");
      out.write("					height=150px></a>\r\n");
      out.write("				<figcaption class=\"figure-caption mt-3\">\r\n");
      out.write("					<h4>Assign Subjects to Class</h4>\r\n");
      out.write("				</figcaption>\r\n");
      out.write("			</figure>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	window.onload = function myfun1() {\r\n");
      out.write("		//document.getElementById('footerid').innerHTML=\"\";\r\n");
      out.write("		var mymod = new bootstrap.Modal(document\r\n");
      out.write("				.getElementById('assignstudent'));\r\n");
      out.write("		mymod.show();\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"assignstudent\" data-bs-backdrop=\"static\"\r\n");
      out.write("	data-bs-keyboard=\"false\" tabindex=\"-1\"\r\n");
      out.write("	aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("	<div class=\"modal-dialog\">\r\n");
      out.write("		<form method=\"post\" action=\"AssignSubjectServlet\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"staticBackdropLabel\">Assign\r\n");
      out.write("						existing subjects</h5>\r\n");
      out.write("					<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\"></button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("					");
      out.write("\r\n");
      out.write("					");

					sf = HibernateUtil.getSessionFactory();
					classlist2 = sf.openSession().createNativeQuery("Select * from classes", Classes.class).getResultList();
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<!-- <div class=\"container\"> -->\r\n");
      out.write("					<form id=\"contact-form\" method=\"post\"\r\n");
      out.write("						action=\"");
      out.print(request.getContextPath());
      out.write("/addClass\" role=\"form\">\r\n");
      out.write("						<div class=\"controls\">\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6\">\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<label for=\"form_class\">Subject*</label> <select\r\n");
      out.write("											id=\"form_class\" name=\"selectedsubject\" class=\"form-control\"\r\n");
      out.write("											required=\"required\" data-error=\"Section is required\">\r\n");
      out.write("\r\n");
      out.write("											<option value=\"\" selected disabled>----Subject*----</option>\r\n");
      out.write("\r\n");
      out.write("											");

											List<String> subj = new ArrayList<>();
											for (Subject s : subjectList1) {
											
      out.write("\r\n");
      out.write("\r\n");
      out.write("											");

											int x = 0;
											for (String str : subj)
												if (str.equals(s.getSubjectName()))
													x++;
											if (x == 0) {
												subj.add(s.getSubjectName());
											
      out.write("<option value='");
      out.print(s.getSubjectID());
      out.write('\'');
      out.write('>');
      out.print(s.getSubjectName());
      out.write("</option>\r\n");
      out.write("											");

											}
											
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("											");

											}
											
      out.write("\r\n");
      out.write("\r\n");
      out.write("										</select>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6\">\r\n");
      out.write("									<div class=\"form-group \">\r\n");
      out.write("										<label for=\"form_section\">Class<select\r\n");
      out.write("											class=\"form-control\" name='selectedclass' required>\r\n");
      out.write("												<option value=\"\" selected disabled>----Class*----</option>\r\n");
      out.write("\r\n");
      out.write("												");

												for (Classes c : classlist2) {
													/*Check for duplicate enrties  */
												
      out.write("\r\n");
      out.write("\r\n");
      out.write("												<option value='");
      out.print(c.getClassID());
      out.write('\'');
      out.write('>');
      out.print(c.getClassname());
      out.write("\r\n");
      out.write("													");
      out.print(c.getSection());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("												");

												}
												
      out.write("\r\n");
      out.write("										</select>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"modal-footer\">\r\n");
      out.write("\r\n");
      out.write("										<button type=\"submit\" class=\"btn btn-primary\">Assign\r\n");
      out.write("											Subject</button>\r\n");
      out.write("									</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- </div> -->\r\n");
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
