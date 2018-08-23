<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="css.html"%>
	<jsp:include page="/DisplayUserData"></jsp:include>
	<%@page import="com.shared.UserBean"%>
</head>
<body>
	<jsp:include page="nav.jsp" />
	<div>
	<br>
	<br>
	<div class="content-wrapper">
		<div class="container-fluid">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><b>Users</b></li>

			</ol>
			<form action="<%=request.getContextPath()%>/adminEventServlet" method="post">
				<table border=2 class="breadcrumb" cellpadding="5" cellspacing="5" class="table table-bordered">
					<tr>
						<th>User Id</th>
						<th>Email Id</th>
						<th>Password</th>
						<th>Full Name</th>
						<th>Address</th>
						<th>Contact No</th>
						<th>Gender</th>
						<th>DOB</th>
						<th>User type</th>
						<th>Enrollment Id</th>
						<th>State</th>
						<th>City</th>
						<c:if  test="${utype}== ADMIN" >
						<th>Active</th>
						<th>Inactive</th>
						</c:if>
					</tr>
					<c:forEach items="${users}" var="bean">
						<c:url var="active" value="ChangeUserStatus">
								<c:param name="id" value="${bean.id }"></c:param>
								<c:param name="status" value="1"></c:param>
						</c:url>
						<c:url var="inactive" value="ChangeUserStatus">
								<c:param name="id" value="${bean.id }"></c:param>
								<c:param name="status" value="-1"></c:param>
						</c:url>
						 <tr>
							<td><c:out value="${bean.id }"></c:out></td>
							<td><c:out value="${bean.email }"></c:out></td>
							<td><c:out value="${bean.password}"></c:out></td>
							<td><c:out value="${bean.fullname}"></c:out></td>
							<td><c:out value="${bean.address}"></c:out></td>
							<td><c:out value="${bean.contact}"></c:out></td>
							<td><c:out value="${bean.gender}"></c:out></td>
							<td><c:out value="${bean.dob}"></c:out></td>
							<td><c:out value="${bean.usertype}"></c:out></td>
							<td><c:out value="${bean.enrollno}"></c:out></td>
							<td><c:out value="${bean.state}"></c:out></td>
							<td><c:out value="${bean.city}"></c:out></td>
							<c:if  test="${utype}== ADMIN" >
							<td><a href="${active}">Active</a></td>
							<td><a href="${inactive}">Inactive</a></td>
							</c:if>
						</tr>
					</c:forEach>
				</table>
				<c:if  test="${utype}== ADMIN" >
				<a href="AdminAddFaculty.jsp" class="btn btn-primary btn-block"> Add a Faculty</a>
				</c:if>
				</form>
				</div>
				</div>
		<%@include file="js.html"%>
	</div>
</body>
</html>