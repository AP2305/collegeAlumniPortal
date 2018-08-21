<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="css.html"%>
<jsp:include page="/DisplayProfile" />
</head>
<body>
<jsp:include page="nav.jsp" />

<br>
<br>
<div class="content-wrapper">
    <div class="container-fluid">
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
           <b> User Detail</b>
        </li>
      </ol>
      <form action="<%=request.getContextPath()%>/StudentProfileServlet" method="post">
	  <div>Name: <input type="text" name="name" value="${userData.fullname }"> </div><br>
	  <div>Email : <input type="email" name="email" value="${userData.email }"> </div><br>
	  <div>Contact : <input type="text" name="contact" value="${userData.contact }"> </div><br>
	  <div>DOB : <input type="date" name="dob" value="${userData.dob }"> </div>
      <div>Admission: <input type="text" name="admision" value="${studentData.admission }"> </div><br>
	  <div>Year : <input type="text" name="pass" value="${studentData.passing }"> </div><br>
	  <br>
			<input type="submit" value="Submit">
      <br>
      </form>
    </div>
    </div>
<%@include file="js.html"%>
</body>
</html>