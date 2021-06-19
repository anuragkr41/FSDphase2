<%@page import="org.hibernate.Session"%>
<%@include file="/students.jsp" %>

<script>

window.onload = function fun3(){var sucmod = new bootstrap.Modal(document.getElementById('addstudentsuccess'));sucmod.show();};

</script>
<div id="addstudentsuccess" class="modal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Success!! </h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <p>Record(s) Added Successfully</p>
      </div>
      <!-- <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div> -->
    </div>
  </div>
</div>

<%-- <%
Session session2 =  HibernateUtil.getSessionFactory().openSession();

List<Object[]> reslist= new ArrayList<>();
reslist=session2.createNativeQuery("SELECT * FROM students").getResultList();
int x=reslist.size();
%>

<h1><%=x%> Total students in db</h1>

 --%>