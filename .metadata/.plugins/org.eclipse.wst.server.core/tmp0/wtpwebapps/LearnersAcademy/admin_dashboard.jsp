<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  <!-- Custom CSS  -->
  <link href="/WebApp/CSS/styles.css" rel="stylesheet">
  <title>Learner's Academy Log in</title>
</head>
<body>
  <!-- Optional JavaScript; choose one of the two! -->
  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
    crossorigin="anonymous"></script>

   <!-- Option 2: Separate Popper and Bootstrap JS -->
  <!--     
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
    -->


<%@include file="Main_Menu.jsp"%>
   
   
    <h1 class="display-5 mt-5 " style="text-align: center;">Welcome to Admin Dashboard</h1>



  <div class="container mt-5 col-8">
    <div class="row .col-sm|md|lg|xl">

      <figure class="figure col themed-grid-col shadow p-3 mb-5 bg-white rounded " style= "margin-right: 1rem;">
        <a href="teachers.jsp"><img src="images/Admin_Dashboard/teacher.png" style="margin-left: 3rem;" height=100px></a>
        <figcaption class="figure-caption mt-3" style="margin-left: 3rem;"><h4>Teacher</h4></figcaption>
      </figure>

      <figure class="figure col themed-grid-col shadow p-3 mb-5 bg-white rounded"  style= "margin-right: 1rem;">
        <a href="classes.jsp"><img src="images/Admin_Dashboard/classes.png" style="margin-left: 3rem;" height=100px></a>
        <figcaption class="figure-caption  mt-3"style="margin-left: 3rem;"><h4>Classes</h4></figcaption>
      </figure>

      <figure class="figure col themed-grid-col shadow p-3 mb-5 bg-white rounded"  style= "margin-right: 1rem;">
        <a href="subjects.jsp"><img src="images/Admin_Dashboard/Subject.png" style="margin-left: 3rem;" height=100px></a>
        <figcaption class="figure-caption mt-3" style="margin-left: 4rem;"><h4>Subjects</h4></figcaption>
      </figure>

      <figure class="figure col themed-grid-col shadow p-3 mb-5 bg-white rounded"  style= "margin-right: 1rem;">
        <a href="students.jsp"><img src="images/Admin_Dashboard/student.png" style="margin-left: 3rem;" height=100px></a>
        <figcaption class="figure-caption mt-3" style="margin-left: 50px;" ><h4>Students</h4></figcaption>
      </figure>
    </div>
  </div>

  <div class="container mt-5 col-8">
    <div class="row .col-sm|md|lg|xl">
      <figure class="figure col-3 shadow p-3 mb-5 bg-white rounded">
        <a href="reports.jsp"> <img src="images/Admin_Dashboard/Reports.png" style="margin-left: 3rem;" height=100px></a>
        <figcaption class="figure-caption mt-3" style="margin-left: 4rem;"><h4>Reports</h4></figcaption>
      </figure>
    </div>
  </div>
  
  
<%@include file="footer.jsp"%>

</body>
</html>