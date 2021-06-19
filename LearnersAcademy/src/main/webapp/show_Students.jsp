<%@page import="com.learnersAcademy.models.Student"%>
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
<title>Students Masterlist</title>

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

	<h1 class="display-5 mt-5" style="text-align: center;">Students
		MasterList</h1>


	<div class="container mt-5 col-12">
		<table class="table table-striped">

			<thead>
				<tr>
					<th scope="col">S.No</th>
					<th scope="col">ID</th>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">Gender</th>
					<th scope="col">Date Of Birth</th>
					<th scope="col">Class</th>
					<th scope="col">Section</th>
					<th scope="col">Father's Name</th>
					<th scope="col">Mother's Name</th>
					<th scope="col">Address</th>
					<th scope="col">Contact</th>
					<th scope="col">Blood Grp</th>


				</tr>
			</thead>
			<tbody>
				<%!List<Student> studentList = new ArrayList<Student>();
	SessionFactory sf;%>
				<%
				sf = HibernateUtil.getSessionFactory();
				studentList = sf.openSession().createNativeQuery("Select * from students", Student.class).getResultList();
				/* sf.getCurrentSession().close();
				sf.close(); */
				int sno = 1;
				for (Student student: studentList) {
					out.println("<tr>");
					out.println("<td>" + sno + "</td>");
					out.println("<td>"+student.getStudentID()+"</td>");
					out.println("<td>" + student.getFirstName() + "</td>");
					out.println("<td>" + student.getLastName() + "</td>");
					out.println("<td>" + student.getGender() + "</td>");
					out.println("<td>" + student.getDateOfBirth() + "</td>");
					out.println("<td>" + student.getClassname() + "</td>");
					out.println("<td>" + student.getSection() + "</td>");
					out.println("<td>" + student.getFathersName() + "</td>");
					out.println("<td>" + student.getMothersName() + "</td>");
					out.println("<td>" + student.getAddress() + "</td>");
					out.println("<td>" + student.getContact() + "</td>");
					out.println("<td>" + student.getBloodGroup() + "</td>");
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