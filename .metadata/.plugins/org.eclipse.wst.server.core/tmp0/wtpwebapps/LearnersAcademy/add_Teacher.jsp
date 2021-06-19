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
		Teacher</h1>

	<div class="container">

		<div class=" text-center mt-2 "></div>
		<div class="row ">
			<div class="col-lg-7 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<form id="contact-form" method="post"
								action="<%=request.getContextPath()%>/teacher" role="form">
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

										<div class="row">
											<div class="col-md-6">
												<div class="form-group mt-3">
													<label for="form_notes">Email </label> <input type="email"
														id="form_email" name="email" class="form-control" />
												</div>
											</div>

											<div class="col-md-6">
												<div class="form-group mt-3">
													<label for="form_notes">Mobile no. </label> <input
														type="tel" pattern="[0-9]{10}" id="form_mobile"
														name="mobile" class="form-control"
														data-error="PLease enter valid phone number" />
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

													<label class="mb-2" for="form_last_name">Qualifications</label>
													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															name="qualification" value="Bachelor's of Arts"
															id="flexCheckDefault"> <label
															class="form-check-label" for="flexCheckDefault">
															Bachelor's of Arts</label>
													</div>
													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															name="qualification" value="Master's of Arts"
															id="flexCheckChecked" checked> <label
															class="form-check-label" for="flexCheckChecked">
															Master's of Arts </label>
													</div>

													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															name="qualification" value="B.ed" id="flexCheckChecked"
															checked> <label class="form-check-label"
															for="flexCheckChecked"> B.ed</label>
													</div>

													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															name="qualification" value="M.ed" id="flexCheckChecked"
															checked> <label class="form-check-label"
															for="flexCheckChecked"> M.ed</label>
													</div>
												</div>
												
												
												<!-- Check boxes not showing in database...  -->
												<%-- <%
												String qualifications[] = request.getParameterValues("qualification");
												StringBuilder builder = new StringBuilder();
																	builder = 
																	
												if (qualifications != null && qualifications.length != 0) {												
													for (int i = 0; i < qualifications.length; i++) {
														System.out.print(qualifications[i] + ", " + "Thank you");
														qual=
													}
												}
												%> --%>

												<div class="col-md-6 mt-3">

													<label class="mb-2" for="form_last_name">Teaching
														group</label>

													<div class="form-check">
														<input class="form-check-input" type="radio"
															name="teachingGroup" id="exampleRadios1"
															value="Kinder Garten" checked> <label
															class="form-check-label" for="exampleRadios1">Kinder
															Garten</label>
													</div>



													<div class="form-check">
														<input class="form-check-input" type="radio"
															name="teachingGroup" id="exampleRadios1" value="Primary"
															checked> <label class="form-check-label"
															for="exampleRadios1">Primary</label>
													</div>
													<div class="form-check">
														<input class="form-check-input" type="radio"
															name="teachingGroup" id="exampleRadios2"
															value="Secondary"> <label
															class="form-check-label" for="exampleRadios2">
															Secondary</label>
													</div>

													<div class="form-check">
														<input class="form-check-input" type="radio"
															name="teachingGroup"
															id="Senior
															Secondary"
															value="Senior Secondary" checked> <label
															class="form-check-label" for="exampleRadios1">Senior
															Secondary</label>
													</div>

												</div>


												<div class="row">
													<div class="col-md-6 mt-3">

														<label class="mb-2" for="form_experience">Experience
															in years</label>
														<div class="form-group">
															<input type="number" id="exp" name="experience"
																class="form-control" required="required" />
														</div>
													</div>

													<div class="col-md-6 mt-3">

														<label class="mb-2" for="form_CTC">Annual
															CTC(current)</label>
														<div class="form-group">
															<input type="text" id="ctc" name="ctc"
																class="form-control" required="required"
																pattern="[0-9]{6}" />
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