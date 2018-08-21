<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="css.html"%>
</head>
<body >
	<jsp:include page="nav.jsp" />
	<br>
	<br>
	<div  class="content-wrapper">
<!-- 	<img alt="" src="images/college alumni.jpg"> -->
		<div class="container-fluid">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><b>Event</b></li>
			</ol>
			<form action="<%=request.getContextPath()%>/adminEventServlet" method="post">
				<table  class="breadcrumb" cellpadding="5" cellspacing="5" class="table table-bordered">
					<tr>
						<td>Event Name:</td>
						<td><input type="text" name="eventname"></td>
					</tr>
					<tr>
						<td>Start Dates:</td>
						<td><input type="date" name="startdate"></td>
					</tr>
					<tr>
						<td>End Date :</td>
						<td><input type="date" name="enddate"></td>
					</tr>
					<tr>
						<td>Event Venue :</td>
						<td><input type="text" name="venue"></td>
					</tr>
					<tr>
						<td>Event Time :</td>
						<td><input type="time" name="time"></td>
					</tr>
					<tr>
						<td>Description :</td>
						<td><input type="text" name="description"></td>
					</tr>
					<tr>
						<td><input type="submit" value="Submit"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>