<%@page import="com.learnersAcademy.models.Subject"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.learnersAcademy.models.Teacher"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="com.learnersAcademy.util.HibernateUtil"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Subjects Masterlist</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<!-- Custom CSS  -->
<link href="CSS/styles.css" rel="stylesheet">

</head>
<body>
	<!-- Optional JavaScript; choose one of the two! -->
	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>

	<%@include file="Main_Menu.jsp"%>

	<h1 class="display-5 mt-5" style="text-align: center;">Subjects
		MasterList</h1>


	<div class="container mt-5 col-12">
		<table class="table table-striped">

			<thead>
				<tr>
					<th scope="col">S.No</th>
					<th scope="col">Subject Code</th>
					<th scope="col">Subject Name</th>
					<th scope="col">Class</th>
					<th scope="col">Section</th>


				</tr>
			</thead>
			<tbody>
				<%!List<Subject> subjectList = new ArrayList<Subject>();
				SessionFactory sf;%>
				<%
				sf = HibernateUtil.getSessionFactory();
				subjectList= sf.openSession().createNativeQuery("Select * from subjects", Subject.class).getResultList();
				/* sf.getCurrentSession().close();
				sf.close(); */
				int sno = 1;
				for (Subject subject: subjectList) {
					out.println("<tr>");
					out.println("<td>" + sno + "</td>");
					out.println("<td>" + subject.getSubjectID() + "</td>");
					out.println("<td>" + subject.getSubjectName() + "</td>");
					out.println("<td>" + subject.getClasses() + "</td>");
					out.println("<td>" + subject.getSection() + "</td>");
					
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