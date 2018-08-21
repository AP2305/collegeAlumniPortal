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
				<li class="breadcrumb-item"><b>Placement</b></li>

			</ol>
			<form action="<%=request.getContextPath()%>/UpdatePlacement" method="post">
				<div>
					Company Name : <input type="text" name="companyname" value="${placement.companyname }">
				</div>
				<br>
				<div>
					Job Description : <input type="text" name="jobdescription" value="${placement.jobdesc }">
				</div>
				<br>
				<div>
					Start Date : <input type="date" name="startdate" value="${placement.startdate }">
				</div>
				<br>
				<div>
					End Date : <input type="date" name="enddate" value="${placement.enddate}">
				</div>
				<br>
				<div>
					Venue : <input type="text" name="venue" value="${placement.venue}">
				</div>
				<br>
				<input type="hidden" name="upid" value="${placement.id }">
				<br> <input type="submit" value="Update">
			</form>
		</div>
	</div>
</body>
</html>