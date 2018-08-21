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
<body class="bg-dark">
	<jsp:include page="nav.jsp" />
	<jsp:include page="/StateAndCityServlet" />
	<br>
	<br>

	<div class="content-wrapper">
		<div class="container-fluid">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><b>Report Parameter</b></li>

			</ol>
			<form action="<%=request.getContextPath()%>/generateReport" method="post">
				<div class="form-group">
					<div class="form-row">
						<label for="exampleInputCity">City : </label> 
						<select name="City"	id="selectCity">
							<option value="null">Please Select city</option>
							<c:forEach var="entry" items="${cityMap2}">
								<option value="${entry.key}">${entry.value}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="form-group">
					<div class="form-row">
						<label for="exampleInputUser">User : </label> 
						<select name="usertype" id="selectUser">
							<option value="null">Please Select User Type</option>
							<option value="STUDENT">Student</option>
							<option value="FACULTY">Faculty</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<div class="form-row">
						<input class="btn btn-primary btn-block" type="submit" value="Generate Report">
					</div>
				</div>
			</form>
		</div>
		
		
		<%@include file="js.html"%>
	</div>
</body>
</html>