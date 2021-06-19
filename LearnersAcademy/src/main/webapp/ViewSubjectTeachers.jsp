<%@page import="com.learnersAcademy.models.Subject"%>
<%@page import="com.learnersAcademy.models.Assign_teacher_to_class"%>
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
<title>Subject Teachers List</title>

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

	<h1 class="display-5 mt-5" style="text-align: center;">Subject Teachers List</h1>


	<div class="container mt-5 col-12">
		<table class="table table-striped">

			<thead>
				<tr>
					<th scope="col">S.No</th>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">Subject</th>
					<th scope="col">Class</th>
					<th scope="col">Section</th>
					<th scope="col">Contact</th>

				</tr>
			</thead>
			<tbody>
				
					<%!List<Teacher> teacherList = new ArrayList<Teacher>();
	List<Assign_teacher_to_class> assignList = new ArrayList<Assign_teacher_to_class>();
	List<Subject> subjectList = new ArrayList<Subject>();

	SessionFactory sf;%>
					<%
					sf = HibernateUtil.getSessionFactory();

					assignList = sf.openSession().createNativeQuery("Select * from assign_teacher_to_class", Assign_teacher_to_class.class)
							.getResultList();

					/* sf.getCurrentSession().close();
					sf.close(); */
					int sno = 1;
					List<String> firstName = new ArrayList<>();
					List<String> lastName = new ArrayList<>();
					List<String> subjectName = new ArrayList<>();
					List<String> className = new ArrayList<>();
					List<String> section = new ArrayList<>();
					List<String> contact = new ArrayList<>();
					
					for (Assign_teacher_to_class as : assignList) {

						//teacherName = this.entityManager.createNativeQuery("Select first_name from teachers WHERE teacherID='" + as.getTeacher_id() + "'").getSingleResult().toString();

						firstName.add((String) (sf.openSession().createNativeQuery("Select first_name from teachers WHERE teacherID='" + as.getTeacher_id() + "' AND teacherID IS NOT NULL").uniqueResult()));
						lastName.add((String) (sf.openSession().createNativeQuery("Select last_name from teachers WHERE teacherID='" + as.getTeacher_id() + "' AND teacherID IS NOT NULL").uniqueResult()));
						subjectName.add((String) (sf.openSession().createNativeQuery("Select subject_name from subjects WHERE subjectID='" + as.getSubject_id()+ "'").uniqueResult()));
						className.add((String) (sf.openSession().createNativeQuery("Select classes from subjects WHERE subjectID='" + as.getSubject_id()+ "'").uniqueResult()));
						section.add((String) (sf.openSession().createNativeQuery("Select section from subjects WHERE subjectID='" + as.getSubject_id()+ "'").uniqueResult()));
						contact.add((String) (sf.openSession().createNativeQuery("Select phone from teachers WHERE teacherID='" + as.getTeacher_id()+ "'").uniqueResult()));
						// to be triedsubjectList=(sf.openSession().createNativeQuery("Select * from subject WHERE subjectID='" + as.getSubject_id() + "'", Subject.class).getResultList());
						//subjectList= sf.openSession().createNativeQuery("Select * from subjects", Subject.class).getResultList();

					}
					
					
					int i =0;
					
					while(i<firstName.size()){
					
						out.println("<tr>");
						out.println("<td>" + sno + "</td>");
						out.println("<td>" + firstName.get(i) + "</td>");
						out.println("<td>" + lastName.get(i) + "</td>");
						out.println("<td>" + subjectName.get(i) + "</td>");
						out.println("<td>" + className.get(i)+ "</td>");
						out.println("<td>" + section.get(i)+ "</td>");
						out.println("<td>" + contact.get(i)+ "</td>");
						i++;
						sno++;
					}
	
					%>
			</tbody>
		</table>
	</div>

	<%@include file="footer.jsp"%>
</body>
</html>