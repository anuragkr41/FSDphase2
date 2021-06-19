<%@page import="com.learnersAcademy.models.Classes"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@include file="subjects.jsp"%>



<script>
	window.onload = function myfun1() {
		//document.getElementById('footerid').innerHTML="";
		var mymod = new bootstrap.Modal(document
				.getElementById('assignstudent'));
		mymod.show();
	}
</script>

<div class="modal fade" id="assignstudent" data-bs-backdrop="static"
	data-bs-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true">
	<div class="modal-dialog">
		<form method="post" action="AssignSubjectServlet">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="staticBackdropLabel">Assign
						existing subjects</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<%!List<Classes> classlist2 = new ArrayList<Classes>();
	SessionFactory sf;%>
					<%
					sf = HibernateUtil.getSessionFactory();
					classlist2 = sf.openSession().createNativeQuery("Select * from classes", Classes.class).getResultList();
					%>

					<!-- <div class="container"> -->
					<form id="contact-form" method="post"
						action="<%=request.getContextPath()%>/addClass" role="form">
						<div class="controls">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label for="form_class">Subject*</label> <select
											id="form_class" name="selectedsubject" class="form-control"
											required="required" data-error="Section is required">

											<option value="" selected disabled>----Subject*----</option>

											<%
											List<String> subj = new ArrayList<>();
											for (Subject s : subjectList1) {
											%>

											<%
											int x = 0;
											for (String str : subj)
												if (str.equals(s.getSubjectName()))
													x++;
											if (x == 0) {
												subj.add(s.getSubjectName());
											%><option value='<%=s.getSubjectID()%>'><%=s.getSubjectName()%></option>
											<%
											}
											%>



											<%
											}
											%>

										</select>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group ">
										<label for="form_section">Class<select
											class="form-control" name='selectedclass' required>
												<option value="" selected disabled>----Class*----</option>

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
									<div class="modal-footer">

										<button type="submit" class="btn btn-primary">Assign
											Subject</button>
									</div>
					</form>
				</div>
			</div>
	</div>
</div>
<!-- </div> -->
