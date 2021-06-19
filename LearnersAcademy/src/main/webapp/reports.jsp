<%@page import="java.text.SimpleDateFormat"%>
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
              			String lastStudentAddedFirstName= (String)sf.openSession().createNativeQuery("SELECT first_name FROM students ORDER BY insert_date DESC limit 1").uniqueResult();
              			String lastStudentAddedLastName= (String)sf.openSession().createNativeQuery("SELECT last_name FROM students ORDER BY insert_date DESC limit 1").uniqueResult();
              			Date lastStudentAddedTime= (Date)sf.openSession().createNativeQuery("SELECT insert_date FROM students ORDER BY insert_date DESC LIMIT 1;").uniqueResult();
              			String formattedStudentDate = new SimpleDateFormat("dd-MM-YYYY").format(lastStudentAddedTime);
              			String formattedStudentTime = new SimpleDateFormat("HH:MM a").format(lastStudentAddedTime);
              			
              			

              			
              			String lastTeacherAddedFirstName= (String)sf.openSession().createNativeQuery("SELECT first_name FROM teachers ORDER BY insert_date DESC limit 1").uniqueResult();
              			String lastTeacherAddedLastName= (String)sf.openSession().createNativeQuery("SELECT last_name FROM teachers ORDER BY insert_date DESC limit 1").uniqueResult();
              			Date lastTeacherAddedTime= (Date)sf.openSession().createNativeQuery("SELECT insert_date FROM teachers ORDER BY insert_date DESC LIMIT 1;").uniqueResult();
              			String formattedTeacherDate = new SimpleDateFormat("dd-MM-YYYY").format(lastTeacherAddedTime);
              			String formattedTeacherTime = new SimpleDateFormat("HH:MM a").format(lastTeacherAddedTime);
              			

              			String lastestClassAddedName= (String)sf.openSession().createNativeQuery("SELECT classname FROM classes ORDER BY insert_date DESC limit 1").uniqueResult();
              			String lastestClassSectionAddedName= (String)sf.openSession().createNativeQuery("SELECT section FROM classes ORDER BY insert_date DESC limit 1").uniqueResult();
              			Date lastClassAddedTime= (Date)sf.openSession().createNativeQuery("SELECT insert_date FROM classes ORDER BY insert_date DESC LIMIT 1;").uniqueResult();
              			String formattedClassDate = new SimpleDateFormat("dd-MM-YYYY").format(lastClassAddedTime);
              			String formattedClassTime = new SimpleDateFormat("HH:MM a").format(lastClassAddedTime);
              			
              			
              			String lastSubjectAddedName= (String)sf.openSession().createNativeQuery("SELECT subject_name FROM subjects ORDER BY insert_date DESC limit 1").uniqueResult();
              			Date lastSubjectAddedTime = (Date) sf.openSession().createNativeQuery("SELECT insert_date FROM subjects ORDER BY insert_date DESC LIMIT 1;").uniqueResult();
          		
              			String formattedSubjectDate = new SimpleDateFormat("dd-MM-YYYY").format(lastSubjectAddedTime);
              			String formattedSubjectTime = new SimpleDateFormat("HH:MM a").format(lastSubjectAddedTime);

          		
          %>


	<div class="container mt-5 col-8">
		<div class="row .col-sm|md|lg|xl">

			
			
			<div class="card text-dark bg-light mb-3 shadow p-3 mb-5 mr-5 bg-white rounded " style="max-width: 31rem; margin-right: 1rem;">
				
				<div class="card-body">
					<h5 class="card-title">Total Students: <%=noOfStudents %></h5>
					<p class="card-text">
					Last Student added: <strong><%="on "+formattedStudentDate+" at "+formattedStudentTime %></strong> <br> 
					Student Name: <strong><%=lastStudentAddedFirstName+" "+lastStudentAddedLastName %></strong>  
					
						
						</p>
				</div>
			</div>
			<div class="card text-white bg-primary mb-3 shadow p-3 mb-5 ml-5  bg-dark rounded" style="max-width: 31rem;">
				
				<div class="card-body">
					<h5 class="card-title">Total Teachers: <%=noOfTeachers %></h5>
					<p class="card-text">Last Teacher added at: <strong><%="on "+formattedTeacherDate+" at "+formattedTeacherTime %></strong> <br> 
					Teacher Name: <strong><%=lastTeacherAddedFirstName+" "+lastTeacherAddedLastName %></strong> 
					
					</p>
				</div>
			</div>
			
			<div class="card text-white bg-dark mb-3 shadow p-3 mb-5 ml-5  bg-dark rounded" style="max-width: 31rem; margin-right: 1rem;">
				
				<div class="card-body">
					<h5 class="card-title">Total Classes: <%=noOfClasses %></h5>
					<p class="card-text">Last Class Created at: <strong><%="on "+formattedClassDate+" at "+formattedClassTime %></strong><br>
					Class Name: <strong><%=lastestClassAddedName+" "+lastestClassSectionAddedName %></strong> 
					</p>
				</div>
			</div>
			
			<div class="card text-dark bg-light mb-3 shadow p-3 mb-5 mr-5 bg-white rounded" style="max-width: 31rem;">
				
				<div class="card-body">
					<h5 class="card-title">Total Subjects: <%=noOfSubjects %></h5>
					<p class="card-text">
					Last Subject Added at: <strong><%="on "+formattedSubjectDate+" at "+formattedSubjectTime %></strong><br>
						Subject Name: <strong><%=lastSubjectAddedName %></strong> 
						</p>
				</div>
			</div>
		</div>
	</div>
		<%@include file="footer.jsp"%>
	
</body>
</html>
