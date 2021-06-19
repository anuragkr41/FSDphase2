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
<title>Teachers Masterlist</title>

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

	<h1 class="display-5 mt-5" style="text-align: center;">Teachers
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
					<th scope="col">Email</th>
					<th scope="col">Contact</th>
					<th scope="col">Address</th>
					<th scope="col">Qualifications</th>
					<th scope="col">Group</th>
					<th scope="col">Exp</th>
					<th scope="col">CTC</th>


				</tr>
			</thead>
			<tbody>
				<%!List<Teacher> teacherList = new ArrayList<Teacher>();
	SessionFactory sf;%>
				<%
				sf = HibernateUtil.getSessionFactory();
				teacherList = sf.openSession().createNativeQuery("Select * from teachers", Teacher.class).getResultList();
				/* sf.getCurrentSession().close();
				sf.close(); */
				int sno = 1;
				for (Teacher teacher : teacherList) {
					out.println("<tr>");
					out.println("<td>" + sno + "</td>");
					out.println("<td>"+teacher.getTeacherID()+"</td>");
					out.println("<td>" + teacher.getFirstName() + "</td>");
					out.println("<td>" + teacher.getLastName() + "</td>");
					out.println("<td>" + teacher.getGender() + "</td>");
					out.println("<td>" + teacher.getDateOfBirth() + "</td>");
					out.println("<td>" + teacher.getEmail() + "</td>");
					out.println("<td>" + teacher.getPhone() + "</td>");
					out.println("<td>" + teacher.getAddress() + "</td>");
					out.println("<td>" + teacher.getQualification() + "</td>");
					out.println("<td>" + teacher.getTeachingGroup() + "</td>");
					out.println("<td>" + teacher.getExperience() + "</td>");
					out.println("<td> Rs. " + teacher.getSalary() + "</td>");
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