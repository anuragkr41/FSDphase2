/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-06-19 22:42:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fTeacher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Main_Menu.jsp", Long.valueOf(1624135278240L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1624102452892L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Add Class</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<!-- Custom CSS  -->\r\n");
      out.write("<link href=\"CSS/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("	<!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
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
      out.write("/AssignSubject.jsp\">Assign Subject to Class</a></li>\r\n");
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
      out.write("	<h1 class=\"display-5 mt-5 mb-5\" style=\"text-align: center;\">Add a\r\n");
      out.write("		Teacher</h1>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\" text-center mt-2 \"></div>\r\n");
      out.write("		<div class=\"row \">\r\n");
      out.write("			<div class=\"col-lg-7 mx-auto\">\r\n");
      out.write("				<div class=\"card mt-2 mx-auto p-4 bg-light\">\r\n");
      out.write("					<div class=\"card-body bg-light\">\r\n");
      out.write("						<div class=\"container\">\r\n");
      out.write("							<form id=\"contact-form\" method=\"post\"\r\n");
      out.write("								action=\"");
      out.print(request.getContextPath());
      out.write("/teacher\" role=\"form\">\r\n");
      out.write("								<div class=\"controls\">\r\n");
      out.write("									<div class=\"row\">\r\n");
      out.write("										<div class=\"col-md-6\">\r\n");
      out.write("											<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("												<label for=\"form_first_name\">First Name</label> <input\r\n");
      out.write("													type=\"text\" id=\"fname\" name=\"firstname\"\r\n");
      out.write("													class=\"form-control\" required=\"required\"> </input>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("\r\n");
      out.write("										<div class=\"col-md-6\">\r\n");
      out.write("											<div class=\"form-group \">\r\n");
      out.write("												<label for=\"form_last_name\">Last Name</label> <input\r\n");
      out.write("													type=\"text\" id=\"fname\" name=\"lastname\" class=\"form-control\"\r\n");
      out.write("													required=\"required\"> </input>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("\r\n");
      out.write("										<!-- Attmept gender -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										<div class=\"row\">\r\n");
      out.write("											<div class=\"col-md-6 mt-3\">\r\n");
      out.write("												<label for=\"form_last_name\">Gender</label>\r\n");
      out.write("\r\n");
      out.write("												<div class=\"form-check\">\r\n");
      out.write("													<input class=\"form-check-input\" type=\"radio\" name=\"gender\"\r\n");
      out.write("														id=\"exampleRadios1\" value=\"Male\" checked> <label\r\n");
      out.write("														class=\"form-check-label\" for=\"exampleRadios1\">Male</label>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"form-check\">\r\n");
      out.write("													<input class=\"form-check-input\" type=\"radio\" name=\"gender\"\r\n");
      out.write("														id=\"exampleRadios2\" value=\"Female\"> <label\r\n");
      out.write("														class=\"form-check-label\" for=\"exampleRadios2\">\r\n");
      out.write("														Female</label>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("											<!-- Attmept gender -->\r\n");
      out.write("\r\n");
      out.write("											<div class=\"col-md-6 mt-3\">\r\n");
      out.write("												<label for=\"form_date\">Date of Birth</label>\r\n");
      out.write("												<div class=\"form-group mt-2\">\r\n");
      out.write("													<input type=\"date\" id=\"form_date\" name=\"dateofbirth\"\r\n");
      out.write("														class=\"form-control\" required=\"required\"> </input>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("\r\n");
      out.write("										<div class=\"row\">\r\n");
      out.write("											<div class=\"col-md-6\">\r\n");
      out.write("												<div class=\"form-group mt-3\">\r\n");
      out.write("													<label for=\"form_notes\">Email </label> <input type=\"email\"\r\n");
      out.write("														id=\"form_email\" name=\"email\" class=\"form-control\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("											<div class=\"col-md-6\">\r\n");
      out.write("												<div class=\"form-group mt-3\">\r\n");
      out.write("													<label for=\"form_notes\">Mobile no. </label> <input\r\n");
      out.write("														type=\"tel\" pattern=\"[0-9]{10}\" id=\"form_mobile\"\r\n");
      out.write("														name=\"mobile\" class=\"form-control\"\r\n");
      out.write("														data-error=\"PLease enter valid phone number\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("											<div class=\"col-md-12\">\r\n");
      out.write("												<div class=\"form-group mt-3\">\r\n");
      out.write("													<label for=\"form_notes\">Address </label> <input type=\"text\"\r\n");
      out.write("														id=\"form_address\" name=\"address\" class=\"form-control\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-6 mt-3\">\r\n");
      out.write("\r\n");
      out.write("													<label class=\"mb-2\" for=\"form_last_name\">Qualifications</label>\r\n");
      out.write("													<div class=\"form-check\">\r\n");
      out.write("														<input class=\"form-check-input\" type=\"checkbox\"\r\n");
      out.write("															name=\"qualification\" value=\"Bachelor's of Arts\"\r\n");
      out.write("															id=\"flexCheckDefault\"> <label\r\n");
      out.write("															class=\"form-check-label\" for=\"flexCheckDefault\">\r\n");
      out.write("															Bachelor's of Arts</label>\r\n");
      out.write("													</div>\r\n");
      out.write("													<div class=\"form-check\">\r\n");
      out.write("														<input class=\"form-check-input\" type=\"checkbox\"\r\n");
      out.write("															name=\"qualification\" value=\"Master's of Arts\"\r\n");
      out.write("															id=\"flexCheckChecked\" checked> <label\r\n");
      out.write("															class=\"form-check-label\" for=\"flexCheckChecked\">\r\n");
      out.write("															Master's of Arts </label>\r\n");
      out.write("													</div>\r\n");
      out.write("\r\n");
      out.write("													<div class=\"form-check\">\r\n");
      out.write("														<input class=\"form-check-input\" type=\"checkbox\"\r\n");
      out.write("															name=\"qualification\" value=\"B.ed\" id=\"flexCheckChecked\"\r\n");
      out.write("															checked> <label class=\"form-check-label\"\r\n");
      out.write("															for=\"flexCheckChecked\"> B.ed</label>\r\n");
      out.write("													</div>\r\n");
      out.write("\r\n");
      out.write("													<div class=\"form-check\">\r\n");
      out.write("														<input class=\"form-check-input\" type=\"checkbox\"\r\n");
      out.write("															name=\"qualification\" value=\"M.ed\" id=\"flexCheckChecked\"\r\n");
      out.write("															checked> <label class=\"form-check-label\"\r\n");
      out.write("															for=\"flexCheckChecked\"> M.ed</label>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												\r\n");
      out.write("												\r\n");
      out.write("												<!-- Check boxes not showing in database...  -->\r\n");
      out.write("												");
      out.write("\r\n");
      out.write("\r\n");
      out.write("												<div class=\"col-md-6 mt-3\">\r\n");
      out.write("\r\n");
      out.write("													<label class=\"mb-2\" for=\"form_last_name\">Teaching\r\n");
      out.write("														group</label>\r\n");
      out.write("\r\n");
      out.write("													<div class=\"form-check\">\r\n");
      out.write("														<input class=\"form-check-input\" type=\"radio\"\r\n");
      out.write("															name=\"teachingGroup\" id=\"exampleRadios1\"\r\n");
      out.write("															value=\"Kinder Garten\" checked> <label\r\n");
      out.write("															class=\"form-check-label\" for=\"exampleRadios1\">Kinder\r\n");
      out.write("															Garten</label>\r\n");
      out.write("													</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("													<div class=\"form-check\">\r\n");
      out.write("														<input class=\"form-check-input\" type=\"radio\"\r\n");
      out.write("															name=\"teachingGroup\" id=\"exampleRadios1\" value=\"Primary\"\r\n");
      out.write("															checked> <label class=\"form-check-label\"\r\n");
      out.write("															for=\"exampleRadios1\">Primary</label>\r\n");
      out.write("													</div>\r\n");
      out.write("													<div class=\"form-check\">\r\n");
      out.write("														<input class=\"form-check-input\" type=\"radio\"\r\n");
      out.write("															name=\"teachingGroup\" id=\"exampleRadios2\"\r\n");
      out.write("															value=\"Secondary\"> <label\r\n");
      out.write("															class=\"form-check-label\" for=\"exampleRadios2\">\r\n");
      out.write("															Secondary</label>\r\n");
      out.write("													</div>\r\n");
      out.write("\r\n");
      out.write("													<div class=\"form-check\">\r\n");
      out.write("														<input class=\"form-check-input\" type=\"radio\"\r\n");
      out.write("															name=\"teachingGroup\"\r\n");
      out.write("															id=\"Senior\r\n");
      out.write("															Secondary\"\r\n");
      out.write("															value=\"Senior Secondary\" checked> <label\r\n");
      out.write("															class=\"form-check-label\" for=\"exampleRadios1\">Senior\r\n");
      out.write("															Secondary</label>\r\n");
      out.write("													</div>\r\n");
      out.write("\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("												<div class=\"row\">\r\n");
      out.write("													<div class=\"col-md-6 mt-3\">\r\n");
      out.write("\r\n");
      out.write("														<label class=\"mb-2\" for=\"form_experience\">Experience\r\n");
      out.write("															in years</label>\r\n");
      out.write("														<div class=\"form-group\">\r\n");
      out.write("															<input type=\"number\" id=\"exp\" name=\"experience\"\r\n");
      out.write("																class=\"form-control\" required=\"required\" />\r\n");
      out.write("														</div>\r\n");
      out.write("													</div>\r\n");
      out.write("\r\n");
      out.write("													<div class=\"col-md-6 mt-3\">\r\n");
      out.write("\r\n");
      out.write("														<label class=\"mb-2\" for=\"form_CTC\">Annual\r\n");
      out.write("															CTC(current)</label>\r\n");
      out.write("														<div class=\"form-group\">\r\n");
      out.write("															<input type=\"text\" id=\"ctc\" name=\"ctc\"\r\n");
      out.write("																class=\"form-control\" required=\"required\"\r\n");
      out.write("																pattern=\"[0-9]{6}\" />\r\n");
      out.write("														</div>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<input type=\"submit\"\r\n");
      out.write("														class=\"btn btn-primary mt-3 btn-send pt-2 btn-block \"\r\n");
      out.write("														value=\"Submit\">\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("							</form>\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /.8 -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /.row-->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
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
