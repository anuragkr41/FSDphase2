<%@page import="java.util.Date"%>
<%@page import="com.learnersAcademy.models.Subject"%>
<%@page import="com.learnersAcademy.models.Teacher"%>
<%@page import="com.learnersAcademy.models.Student"%>
<%@page import="com.learnersAcademy.util.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.learnersAcademy.models.Classes"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<!-- Custom CSS  -->
<link href="/WebApp/CSS/styles.css" rel="stylesheet">
<title>Learner's Academy Log in</title>
</head>
<body>
	<!-- Optional JavaScript; choose one of the two! -->
	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--     
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
    -->

	<%@include file="Main_Menu.jsp"%>
	
	

	<h1 class="display-5 mt-5" style="text-align: center;">Reports</h1>
	
	 <%! List<Classes> classlist = new ArrayList<Classes>();
	 
	 List<Student> studentList= new ArrayList<Student>();
	 List<Teacher> teacherList = new ArrayList<Teacher>();
	 List<Subject> subjectList= new ArrayList<Subject>();
	 
	 
          SessionFactory sf;
          %>
          <%
          sf = HibernateUtil.getSessionFactory();
          classlist=sf.openSession().createNativeQuery("Select * from classes",Classes.class).getResultList();
             			
    			
    			int noOfStudents=sf.openSession().createNativeQuery("SELECT * FROM students").getResultList().size();
    			int noOfClasses= sf.openSession().createNativeQuery("SELECT * FROM classes").getResultList().size();
    			int noOfTeachers= sf.openSession().createNativeQuery("SELECT * FROM teachers").getResultList().size();
    			int noOfSubjects= sf.openSession().createNativeQuery("SELECT * FROM subjects").getResultList().size();
    		
    		
          %>


	<div class="container mt-5 col-8">
		<div class="row .col-sm|md|lg|xl">

			
			
			<div class="card text-dark bg-light mb-3 shadow p-3 mb-5 mr-5 bg-white rounded " style="max-width: 31rem; margin-right: 1rem;">
				
				<div class="card-body">
					<h5 class="card-title">Total Students: <%=noOfStudents %></h5>
					<p class="card-text">
					Last Student added at: <strong>2021-06-19 23:14:47</strong> <br> 
					Student Name: <strong>Neha Sharma</strong>  
					
						
						</p>
				</div>
			</div>
			<div class="card text-white bg-primary mb-3 shadow p-3 mb-5 ml-5  bg-dark rounded" style="max-width: 31rem;">
				
				<div class="card-body">
					<h5 class="card-title">Total Teachers: <%=noOfTeachers %></h5>
					<p class="card-text">Last Teacher added at: <strong>2021-06-20 01:15:23</strong> <br> 
					Teacher Name: <strong>Ravidas Phogat</strong> 
					
					</p>
				</div>
			</div>
			
			<div class="card text-white bg-dark mb-3 shadow p-3 mb-5 ml-5  bg-dark rounded" style="max-width: 31rem; margin-right: 1rem;">
				
				<div class="card-body">
					<h5 class="card-title">Total Classes: <%=noOfClasses %></h5>
					<p class="card-text">Last Class Created at: <strong>2021-06-19 18:54:12</strong><br>
					Class Name: <strong>XII F</strong> 
					</p>
				</div>
			</div>
			
			<div class="card text-dark bg-light mb-3 shadow p-3 mb-5 mr-5 bg-white rounded" style="max-width: 31rem;">
				
				<div class="card-body">
					<h5 class="card-title">Total Subjects: <%=noOfSubjects %></h5>
					<p class="card-text">
					Last Subject Added at: <strong>2021-06-20 01:12:51</strong><br>
						Subject Name: <strong> Basic Computers</strong> 
						</p>
				</div>
			</div>
		</div>
	</div>
		<%@include file="footer.jsp"%>
	
</body>
</html>
