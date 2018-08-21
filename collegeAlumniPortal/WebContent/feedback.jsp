<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Alumni Portal</title>
<%@include file="css.html"%>
<jsp:include page="/DisplayFeedback"></jsp:include>
</head>
<body>

	<jsp:include page="nav.jsp" />
	<br>
	<br>
	<div></div>
	<div class="content-wrapper">
		<div class="container-fluid">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><b>Feedback</b></li>

			</ol>
			<div>
				
				<table border=2 class="table table-bordered" class="breadcrumb" cellpadding="5" cellspacing="5">
						<tr> 
							<th>Subject</th>
							<th>Description</th>
							<th>Date</th>
						</tr>
						<c:forEach items="${feedbacklist}" var="bean">
							<tr>
								<td><c:out value="${bean.subject }"></c:out></td>
								<td><c:out value="${bean.desc }"></c:out></td>
								<td><c:out value="${bean.date }"></c:out></td>
							</tr>
						</c:forEach>
					</table>
					<a href="AddUserFeedback.jsp" class="btn btn-primary btn-block"> Add a Feedback</a>
			</div>
		</div>
		<%@include file="js.html"%>
		</div>
</body>
</html>