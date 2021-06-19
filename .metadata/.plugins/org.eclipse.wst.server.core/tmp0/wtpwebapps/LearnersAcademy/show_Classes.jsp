<%@page import="com.learnersAcademy.models.Student"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.learnersAcademy.models.Classes" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
    <%@page import="com.learnersAcademy.util.HibernateUtil"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Class MAsterList</title>

    <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
  integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<!-- Custom CSS  -->
<link href="CSS/styles.css" rel="stylesheet">
<title>All classes</title>
</head>
<body>
<!-- Optional JavaScript; choose one of the two! -->
<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
  crossorigin="anonymous"></script>
  
  <%@include file="Main_Menu.jsp"%>
  
      <h1 class="display-5 mt-5" style="text-align: center;">Classes MasterList</h1>
    

  <div class="container mt-5 col-12">
    <table class="table table-striped">
        
        <thead>
            <tr>
              <th scope="col">S.No</th>
              <th scope="col">ID</th>
              <th scope="col">Class</th>
              <th scope="col">Section</th>
              <th scope="col">Group</th>
              <th scope="col">Stream</th>
              <th scope="col">No. of Students</th>
              <th scope="col">Class Teacher</th>
                            
            </tr>
          </thead>
          <tbody>
          
         


          
          
          <%! List<Classes> classlist = new ArrayList<Classes>();
          SessionFactory sf;
          %>
          <%
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
          %>
                      
          </tbody>


      </table>

    </div>
    
    <%@include file="footer.jsp"%>
    
</body>
</html>