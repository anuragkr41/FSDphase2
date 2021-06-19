<%@page import="com.learnersAcademy.util.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.learnersAcademy.models.Classes"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Class</title>

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
	<h1 class="display-5 mt-5 mb-5" style="text-align: center;">Add a
		Student</h1>

	<div class="container">

		<div class=" text-center mt-2 "></div>
		<div class="row ">
			<div class="col-lg-7 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<form id="contact-form" method="post"
								action="<%=request.getContextPath()%>/student" role="form">
								<div class="controls">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">

												<label for="form_first_name">First Name</label> <input
													type="text" id="fname" name="firstname"
													class="form-control" required="required"> </input>
											</div>
										</div>

										<div class="col-md-6">
											<div class="form-group ">
												<label for="form_last_name">Last Name</label> <input
													type="text" id="fname" name="lastname" class="form-control"
													required="required"> </input>
											</div>
										</div>

										<!-- Attmept gender -->


										<div class="row">
											<div class="col-md-6 mt-3">
												<label for="form_last_name">Gender</label>

												<div class="form-check">
													<input class="form-check-input" type="radio" name="gender"
														id="exampleRadios1" value="Male" checked> <label
														class="form-check-label" for="exampleRadios1">Male</label>
												</div>
												<div class="form-check">
													<input class="form-check-input" type="radio" name="gender"
														id="exampleRadios2" value="Female"> <label
														class="form-check-label" for="exampleRadios2">
														Female</label>
												</div>

											</div>

											<!-- Attmept gender -->

											<div class="col-md-6 mt-3">
												<label for="form_date">Date of Birth</label>
												<div class="form-group mt-2">
													<input type="date" id="form_date" name="dateofbirth"
														class="form-control" required="required"> </input>
												</div>
											</div>
										</div>





										<%!List<Classes> classlist2 = new ArrayList<Classes>();
											SessionFactory sf;%>
										<%
										sf = HibernateUtil.getSessionFactory();
										classlist2 = sf.openSession().createNativeQuery("Select * from classes", Classes.class).getResultList();
										%>

										<div class="row" >
											<div class="col-md-8" >
												<div class="form-group mt-3 ">
													<label for="form_section">Class<select
														class="form-control"  name='selectedclass' required>
															<option value="" selected disabled>-------Class With Section*-------</option>

															<%
															for (Classes c : classlist2) {
																/*Check for duplicate enrties  */
															%>

															<option value='<%=c.getClassID()%>'><%=c.getClassname()%>
																<%=c.getSection()%></option>

															<%
															}
															%>
													</select>
												</div>
											</div>







										</div>

										<div class="col-md-6">
											<div class="form-group mt-3">
												<label for="form_notes">Father's Name. </label> <input
													type="text" id="form_fathersname" name="fathersname"
													class="form-control"
													data-error="PLease enter valid phone number" />
											</div>
										</div>

										<div class="col-md-6">
											<div class="form-group mt-3">
												<label for="form_notes">Mother's Name. </label> <input
													type="text" id="form_mothersname" name="mothersname"
													class="form-control" />
											</div>
										</div>

										<div class="col-md-12">
											<div class="form-group mt-3">
												<label for="form_notes">Address </label> <input type="text"
													id="form_address" name="address" class="form-control" />
											</div>
										</div>


										<div class="row">
											<div class="col-md-6 mt-3">

												<label class="mb-2" for="form_experience">Emergency
													Contact in years</label>
												<div class="form-group">
													<input type="tel" id="exp" name="contact"
														class="form-control" pattern="[0-9]{10}"
														required="required" />
												</div>
											</div>

											<div class="col-md-6 mt-3">

												<label class="mb-2" for="form_bloogGroup">Blood
													Group </label>
												<div class="form-group">
													<select id="bloodgroup" name="bloodgroup"
														class="form-control">
														<option value="" selected disabled>----Blood
															Group*----</option>
														<option value="Pre-Nursery">B+ve</option>
														<option>B-ve</option>
														<option>AB+</option>
														<option>A+</option>
														<option>A-</option>
														<option>O+</option>
														<option>O-</option>

													</select>

												</div>
											</div>
										</div>



										<div class="col-md-12">
											<input type="submit"
												class="btn btn-primary mt-3 btn-send pt-2 btn-block "
												value="Submit">
										</div>
									</div>
								</div>
							</form>

						</div>
					</div>
				</div>
				<!-- /.8 -->
			</div>
			<!-- /.row-->
		</div>
	</div>


	<%@include file="footer.jsp"%>
</body>
</html>