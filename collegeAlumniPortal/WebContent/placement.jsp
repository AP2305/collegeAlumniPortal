<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="css.html"%>
<jsp:include page="/DisplayPlacement"></jsp:include>
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
		<table border=2 cellpadding="5" cellspacing="5" class="table table-bordered">
						<tr>
							<th>Company Name</th>
							<th>Job Discription</th>
							<th>Start Date</th>
							<th>End Date</th>
							<th>Venue</th>
							<th>Posted Date</th>
							<th>Update</th>
							<th>Delete</th>
						</tr>
						<c:forEach items="${PlacementList}" var="bean">
							<c:url var="update" value="UpdatePlacement">
								<c:param name="upid" value="${bean.id }"></c:param>
							</c:url>
							<c:url var="delete" value="DeletePlacement">
								<c:param name="did" value="${bean.id }"></c:param>
							</c:url>
						 <tr>
								<td><c:out value="${bean.companyname }"></c:out></td>
								<td><c:out value="${bean.jobdesc }"></c:out></td>
								<td><c:out value="${bean.startdate }"></c:out></td>
								<td><c:out value="${bean.enddate}"></c:out></td>
								<td><c:out value="${bean.venue}"></c:out></td>
								<td><c:out value="${bean.posteddate}"></c:out></td>
								<td><a href="${update }">Update</a></td>
								<td><a href="${delete }">Delete</a></td>
							</tr>
						</c:forEach>
					</table>
						<a href="AddUserPlacement.jsp" class="btn btn-primary btn-block"> Add a Placement</a>
    
    </div>
    </div>
	<%@include file="js.html"%>
	</div>
</body>
</html>