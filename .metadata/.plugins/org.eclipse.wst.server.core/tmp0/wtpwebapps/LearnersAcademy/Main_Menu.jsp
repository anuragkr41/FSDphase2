



<% HttpSession Session = request.getSession(false);
		if(session.getAttribute("username")==null){
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
	
	%> 
 
 <div class="container.fluid">
      <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  
        <a class="navbar-brand" style="padding-left: 1em;" href="<%=request.getContextPath()%>/admin_dashboard.jsp"><img src="<%=request.getContextPath()%>/images/logo_Menu.png" height="30px" >   Learners Academy</a>
        <!-- <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button> -->
  
  
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
  
  
        <div class="collapse navbar-collapse" id="PrimaryMenu">
          <ul class="navbar-nav" style="margin-left: auto; padding-right: 1em;">
            <li class="nav-item">
              <a class="nav-link active px-3" aria-current="page" href="<%=request.getContextPath()%>/admin_dashboard.jsp">Home</a>
            </li>
            
            
  
            <li class="nav-item dropdown px-3">
              <a class="nav-link dropdown-toggle" href="teachers.jsp" id="dropdown03" data-bs-toggle="dropdown"
                aria-expanded="false">Teachers</a>
              <ul class="dropdown-menu" aria-labelledby="dropdown03">
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/show_Teachers.jsp">View all teachers</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/add_Teacher.jsp">Add new Teacher</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/teachers.jsp">Remove Teacher</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/assignTeacherToClass.jsp">Assign Subject to Teacher</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/ViewSubjectTeachers.jsp">View Subject Teachers</a></li>
                
  
              </ul>
            </li>
  
            <li class="nav-item dropdown px-3">
              <a class="nav-link dropdown-toggle" href="students.jsp" id="dropdown03" data-bs-toggle="dropdown"
                aria-expanded="false">Students</a>
              <ul class="dropdown-menu" aria-labelledby="dropdown03">
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/show_Students.jsp">List of Student</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/add_Student.jsp">Admit new student</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/students.jsp">Remove Student</a></li>
              </ul>
            </li>
  
            <li class="nav-item dropdown px-3">
              <a class="nav-link dropdown-toggle" href="classes.jsp" id="dropdown03" data-bs-toggle="dropdown"
                aria-expanded="false">Classes</a>
              <ul class="dropdown-menu" aria-labelledby="dropdown03">
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/show_Classes.jsp">View all classes</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/classes.jsp">Remove class</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/add_Class.jsp">Add new Class</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/AssignSubject.jsp">Assign subject to class</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/assignTeacherToClass.jsp">Assign Teacher to class</a></li>
  
  
              </ul>
            </li>
  
            <li class="nav-item dropdown mx-3">
              <a class="nav-link dropdown-toggle" href="subjects.jsp" id="dropdown03" data-bs-toggle="dropdown"
                aria-expanded="false">Subjects</a>
              <ul class="dropdown-menu" aria-labelledby="dropdown03">
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/show_Subjects.jsp">View subjects</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/add_Subject.jsp">Add new Subject</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/subjects.jsp">Remove Subject</a></li>
                <li><a class="dropdown-item" href="<%=request.getContextPath()%>/AssignSubject.jsp">Assign Subject to Class</a></li>
              </ul>
              <li class="nav-item">
              <a class="nav-link active px-3" aria-current="page" href="<%=request.getContextPath()%>/reports.jsp">Reports</a>
            </li>
            </li>
            <a href = "<%=request.getContextPath()%>/logout" class="btn btn-outline-light me-2">Logout</a>
          </ul>
  
        </div>
  
      </nav>
    </div>
