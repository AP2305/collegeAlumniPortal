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

<br>
<br>
<div class="content-wrapper">
		<div class="container-fluid">
		
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><b>Report</b></li>

			</ol>
				<table id="example" class="table table-bordered">
					<thead>
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
					</tr>
					</thead>
					<tbody>
					<c:forEach items="${pdfData}" var="bean">
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
						</tr>
					</c:forEach>
					</tbody>
					<tfoot>
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
					</tr>
					</tfoot>
				</table>
		</div>
		<%@include file="js.html"%>
		
</div>
</body>
<script type="text/javascript">
$(document).ready(function() {
	$('#example').DataTable({
	dom:'Bfrtip',
	buttons:[
	         'pdf'
	         ]
	});
	
});
</script>
</html>