/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-06-19 16:42:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/CSS/styles.css", Long.valueOf(1624102452886L));
    _jspx_dependants.put("/CSS/signin.css", Long.valueOf(1624102452886L));
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS  -->\r\n");
      out.write("    <style>");
      out.write("</style>\r\n");
      out.write("    <style>");
      out.write("html,\r\n");
      out.write("body {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  padding-top: 40px;\r\n");
      out.write("  padding-bottom: 40px;\r\n");
      out.write("  background-color: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  max-width: 330px;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .checkbox {\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .form-floating:focus-within {\r\n");
      out.write("  z-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin input[type=\"email\"] {\r\n");
      out.write("  margin-bottom: -1px;\r\n");
      out.write("  border-bottom-right-radius: 0;\r\n");
      out.write("  border-bottom-left-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin input[type=\"password\"] {\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("  border-top-left-radius: 0;\r\n");
      out.write("  border-top-right-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    <title>Learner's Academy Log in</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JSs -->\r\n");
      out.write("    <!--\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdeldivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js\" integrity=\"sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    -->\r\n");
      out.write("    \r\n");
      out.write("    <main class=\"form-signin\">\r\n");
      out.write("    <form action=\"");
      out.print(request.getContextPath());
      out.write("/login\" method=\"post\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("      <img class=\"mb-4\" src=\"images/Main_logo.png\" alt=\"Main logo\" width=\"75\" height=\"75\">\r\n");
      out.write("      \r\n");
      out.write("      <h1 class=\"h3 mb-3 fw-normal\">Please sign in</h1>\r\n");
      out.write("  \r\n");
      out.write("      <div class=\"form-floating\">\r\n");
      out.write("        <input type=\"text\" name =\"username\" class=\"form-control\" id=\"floatingInput\" placeholder=\"username\">\r\n");
      out.write("        <label for=\"floatingInput\">Username</label>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-floating\">\r\n");
      out.write("        <input type=\"password\" name = \"password\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"Password\">\r\n");
      out.write("        <label for=\"floatingPassword\">Password</label>\r\n");
      out.write("      </div>\r\n");
      out.write("  \r\n");
      out.write("  		<span id=\"loginError\"></span>\r\n");
      out.write("  \r\n");
      out.write("      <div class=\"checkbox mb-3\">\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"checkbox\" value=\"remember-me\"> Remember me\r\n");
      out.write("        </label>\r\n");
      out.write("      </div>\r\n");
      out.write("     <button class=\"w-100 btn btn-lg btn-primary\" type=\"submit\">Sign in</button>\r\n");
      out.write("      <p class=\"mt-5 mb-3 text-muted\">&copy; Made by Anurag Kumar</p>\r\n");
      out.write("    </form>\r\n");
      out.write("    </main>\r\n");
      out.write("  </body>\r\n");
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
