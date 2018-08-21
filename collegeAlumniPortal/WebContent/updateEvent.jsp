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
<body>
<jsp:include page="nav.jsp" />
	<br>
	<br>
	<div class="content-wrapper">
		<div class="container-fluid">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><b>Event</b></li>

			</ol>
			<form action="<%=request.getContextPath()%>/UpdateEvent" method="post">
			<div>
					Event Name : <input type="text" name="eventname" value="${event.ename }">
				</div>
				<br>
				<div>
					Start Date : <input type="date" name="startdate" value="${event.startdate }">
				</div>
				<br>
				<div>
					End Date : <input type="date" name="enddate" value="${event.enddate}">
				</div>
				<br>
				<div>
					Event Venue : <input type="text" name="venue" value="${event.venue}">
				</div>
				<br>
				<div>
					Event Time : <input type="time" name="time" value="${event.time}">
				</div>
				<br>
				<div>
					Description : <input type="text" name="description" value="${event.desc}">
				</div>
				<input type="hidden" name="upid" value="${event.id }">
				<br> <input type="submit" value="Update">
			</form>
		</div>
	</div>
</body>
</html>