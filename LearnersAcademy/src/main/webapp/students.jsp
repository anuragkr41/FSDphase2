<%@page import="com.learnersAcademy.util.HibernateUtil"%>
<%@page import="com.learnersAcademy.models.Student"%>
<%@page import="java.util.ArrayList"%>
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
<link href="CSS/styles.css" rel="stylesheet">
<title>Students</title>
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

	<%@include file="/Main_Menu.jsp"%>

	<h1 class="display-5 mt-5" style="text-align: center;">Students</h1>

	<div class="container mt-5 col-8">
		<div class="row .col-sm|md|lg|xl">

			<figure class="figure col themed-grid-col">
				<a href="<%=request.getContextPath()%>/show_Students.jsp"><img
					src="<%=request.getContextPath()%>/images/Students/Student Details.png" height=150px></a>
				<figcaption class="figure-caption mt-3">
					<h4>Student Details</h4>
				</figcaption>
			</figure>

			<figure class="figure col themed-grid-col">
				<a href="<%=request.getContextPath()%>/add_Student.jsp"><img
					src="<%=request.getContextPath()%>/images/Students/Add New Student.png" height=150px></a>
				<figcaption class="figure-caption mt-3">
					<h4>Add New Student</h4>
				</figcaption>
			</figure>



			<figure class="figure col themed-grid-col">
				<a data-bs-toggle="modal" data-bs-target="#exampleModal" href="#"><img
					src="<%=request.getContextPath()%>/images/Students/Remove Student.png" height=150px></a>
				<!-- Modal -->
				<div class="modal fade" id="exampleModal" tabindex="-1"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog modal-lg">
						<form action="<%=request.getContextPath()%>/removeStudents"
							method="post">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title" id="exampleModalLabel">Remove
										Student(s)</h5>


									<button type="button" class="btn-close" data-bs-dismiss="modal"
										aria-label="Close"></button>
								</div>
								<div class="modal-body">

									<h6 class="modal-title" id="exampleModalLabel">Please
										select the Student(s) that you wish to remove</h6>

									<table class="table table-hover">
										<thead>
											<tr>
												<th scope="col" style="text-align: center;">Select</th>

												<th scope="col">S.No</th>
												<th scope="col">Student Id</th>
												<th scope="col">First Name</th>
												<th scope="col">Last Name</th>
												<th scope="col">Class</th>
												<th scope="col">Section</th>
												<th scope="col">Father's Name</th>

											</tr>
										</thead>
										<tbody>

											<%
											List<Student> studentList1 = new ArrayList<>();
											int Sno = 1;

											studentList1 = HibernateUtil.getSessionFactory().openSession()
													.createNativeQuery("SELECT * FROM students", Student.class).getResultList();
											int originalRecords = studentList1.size();
											System.out.println("Orignal list = " + originalRecords);
											for (Student stu : studentList1) {
											%>
											<tr>
												<td align="center"><input type="checkbox"
													name="removestudent" value="<%=stu.getStudentID()%>"></td>

												<td><%=Sno%></td>
												<td><%=stu.getStudentID()%></td>
												<td><%=stu.getFirstName()%></td>
												<td><%=stu.getLastName()%></td>
												<td><%=stu.getClassname()%></td>
												<td><%=stu.getSection()%></td>
												<td><%=stu.getFathersName()%></td>
											</tr>


											<%
											Sno++;
											}
											%>
										</tbody>
									</table>


									<div class="form-check">
										<input class="form-check-input" type="checkbox" value=""
											id="flexCheckChecked" checked> <label
											class="form-check-label" for="flexCheckChecked"> I
											agree, to perform this operation </label>
									</div>
								</div>
								<div class="modal-footer">


									<button type="button" class="btn btn-secondary"
										data-bs-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary">Proceed</button>
								</div>
							</div>
						</form>
					</div>
				</div>

				<figcaption class="figure-caption  mt-3">
					<h4>Remove Student</h4>
				</figcaption>
			</figure>

			<!-- Button trigger modal -->
			<!-- <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
  Launch demo modal
</button>
 -->


			<%-- <figure class="figure col themed-grid-col">
				<a href="<%=request.getContextPath()%>/AssignStudent.jsp"><img
					src="images/Students/Assign Student to class.png" height=150px></a>
				<figcaption class="figure-caption mt-3">
					<h4>Assign Student to class</h4>
				</figcaption>
			</figure> --%>


		</div>
	</div>

	<!-- <div class="container mt-5 col-8">
		<div class="row .col-sm|md|lg|xl">
			<figure class="figure col themed-grid-col">
				<a href="#"><img
					src="images/Students/List of Students by class.png" height=150px></a>
				<figcaption class="figure-caption mt-3" style="margin-left: 2rem;">
					<h4>List of Students by Class</h4>
				</figcaption>
			</figure>
		</div>
	</div> -->

	<%@include file="footer.jsp"%>

</body>
</html>