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
		Class</h1>

	<div class="container">
		
		<div class=" text-center mt-2 "></div>
		<div class="row ">
			<div class="col-lg-7 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<form id="contact-form" method = "post" action = "<%=request.getContextPath()%>/addClass" role="form">
								<div class="controls">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_class">Class*</label> <select
													id="form_class" name="classname" class="form-control"
													required="required" data-error="Section is required">
														<option value="" selected disabled>----Section*----</option>
														<option value="Pre-Nursery">Pre-Nursery</option>
														<option value="Lower K.G.">Lower K.G.</option>
														<option value="Upper K.G.">Upper K.G.</option>
														<option value="I">I</option>
														<option>II</option>
														<option>III</option>
														<option>IV</option>
														<option>V</option>
														<option>VI</option>
														<option>VII</option>
														<option>VIII</option>
														<option>IX</option>
														<option>X</option>
														<option>XI</option>
														<option>XII</option>
												</select>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group ">
												<label for="form_section">Section<select
													id="form_section" name="section" class="form-control"
													required="required" data-error="Section is required">
														<option value="" selected disabled>----Section*----</option>
														<option>A</option>
														<option>B</option>
														<option>C</option>
														<option>D</option>
														<option>E</option>
														<option>F</option>
														<option>G</option>
												</select> 
											</div>
										</div>
										<div class="row">
											<div class="col-6">
												<div class="form-group mt-3">
													<label for="form_group">Group*<select
														id="form_group" name="group" class="form-control"
														required="required" data-error="Section is required">
															<option value="" selected disabled>Select the class group from below</option>
															<option>Kinder Garten</option>
															<option>Primary</option>
															<option>Secondary</option>
															<option>Senior Secondary</option>
													</select>
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group mt-3">
													<label for="form_stream">Stream *</label> <select
														id="form_need" name="stream" class="form-control"
														required="required" data-error="Please specify your need.">
														<option value="" selected disabled>--Please select the Stream--</option>
														<option>General</option>
														<option>Science with Maths</option>
														<option>Science with Physical Education</option>
														<option>Science with Biology</option>
														<option>Commerce</option>
														<option>Arts</option>
													</select>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-12">
												<div class="form-group mt-3">
													<label for="form_notes">Notes </label>
													<textarea id="form_notes" name="notes"
														class="form-control"
														placeholder="Any important information." rows="4"
													></textarea>
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