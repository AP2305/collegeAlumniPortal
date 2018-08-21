<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="css.html"%>
<jsp:include page="/DisplayEvent"></jsp:include>
</head>
<body>
<jsp:include page="nav.jsp" />
<br>
	<br>
	<div></div>
	<div class="content-wrapper">
    <div class="container-fluid">
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
           <b>Placement</b>
        </li>
      
      </ol>
	  <div class="table-responsive">
		<form action="<%=request.getContextPath()%>/placementSevlet" method="post">
	<table  class="breadcrumb" cellpadding="5" cellspacing="5" class="table table-bordered">
					<tr>
						<td>Company Name :</td>
						<td><input type=" text" name="companyname"></td>
					</tr>
					<tr>
						<td>Job Description :</td>
						<td><input type=" text" name="jobdescription"></td>
					</tr>
					<tr>
						<td>Start Date :</td>
						<td><input type="Date" name="startdate"></td>
					</tr>
					<tr>
						<td>End Date :</td>
						<td><input type="Date" name="enddate"></td>
					</tr>
					<tr>
						<td>Venue :</td>
						<td><input type="text" name="venue"></td>
					</tr>
					<tr>
						<td><input type="submit" value="Submit"></td>
					</tr>
				</table>
		</form>
		</div>
		</div>
		</div>
			<%@include file="js.html"%>
</body>
</html>