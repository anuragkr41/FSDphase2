<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.learnersAcademy.models.Classes"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="com.learnersAcademy.util.HibernateUtil"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Subject</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<!-- Custom CSS  -->
<link href="CSS/styles.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

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
		Subject</h1>

	<div class="container">

		<div class=" text-center mt-2 "></div>
		<div class="row ">
			<div class="col-lg-7 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<form id="contact-form" method="post"
<%-- 								action="<%=request.getContextPath()%>/subject" role="form"> --%>
								action="<%=request.getContextPath()%>/TestServlet" role="form">
								<div class="controls">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">

												<label for="form_first_name">Subject Name</label> <input
													type="text" id="fname" name="subjectname"
													class="form-control" required="required"> </input>
											</div>
										</div>


										<div class="row">
											<div class="col-md-6">
												<div class="form-group mt-3">
													<label for="form_notes">Class</label> <select
														id="form_class" name="classname" class="form-control"
														required="required" data-error="Section is required">
														<option value="" selected disabled>----Class*----</option>


														<!-- Trying classes from db  -->

														<%!List<Classes> classlist = new ArrayList<Classes>();
													
															SessionFactory sf;%>
														<%
														sf = HibernateUtil.getSessionFactory();
														classlist = sf.openSession().createNativeQuery("Select * from classes ORDER BY classname", Classes.class)
																.getResultList();
														/* sf.getCurrentSession().close();
														sf.close(); */

														for (Classes cs : classlist) {
															out.println("<option value=" + cs.getClassname() + ">" + cs.getClassname() + "</option>");
														}
														%>

														<!-- classes from db close  -->




													</select>
												</div>
											</div>

										
										</div>


										<div class="col-md-12">
											<input type="submit"
												class="btn btn-primary mt-3 btn-send pt-2 btn-block "
												value="Next">
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