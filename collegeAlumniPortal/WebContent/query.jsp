<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Alumni Portal</title>
<%@include file="css.html"%>
<jsp:include page="/DisplayQuery"></jsp:include>

</head>
<body>
	<jsp:include page="nav.jsp" />
	
	<br>
	<br>
	<div>
	<div class="content-wrapper">
    <div class="container-fluid">
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
           <b>Query</b>
        </li>
      
      </ol>
      <table border=2 class="breadcrumb" cellpadding="5" cellspacing="5" class="table table-bordered">
					<tr>
					    <th>Student Id</th>
						<th>Posted Date</th>
						<th>Query Description</th>
						<th>Query Answer</th>
						<th>Answer Date</th>
					</tr>
					<c:forEach items="${Querylist}" var="bean">
						 <tr>
						    <td><c:out value="${bean.studentid}"></c:out></td>
							<td><c:out value="${bean.posteddate }"></c:out></td>
							<td><c:out value="${bean.desc}"></c:out></td>
							<td><c:out value="${bean.answer}"></c:out></td>
						  	<td><c:out value="${bean.answerdate}"></c:out></td>
							
 						</tr>
					</c:forEach>
				</table>
    <a href="QueryAddStudent.jsp" class="btn btn-primary btn-block"> Post Query</a>
    </div>
	</div>
    </div>
	<%@include file="js.html"%>
</body>
</html>