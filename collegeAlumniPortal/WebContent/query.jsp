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
<%@page import="com.shared.UserBean"%>
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
					<c:forEach items="${querylist}" var="bean">
					<c:url var="answer" value="">
							<c:param name="id" value="${bean.id}">
							</c:param>
						</c:url>
					</c:forEach>
					<c:forEach items="${Querylist}" var="bean">
					
						 <tr>
						    <td><c:out value="${bean.studentid}"></c:out></td>
							<td><c:out value="${bean.posteddate }"></c:out></td>
							<td><c:out value="${bean.desc}"></c:out></td>
							<td><c:out value="${bean.answer}"></c:out></td>
						  	<td><c:out value="${bean.answerdate}"></c:out></td>
							<c:if  test="${utype}== FACULTY" >
							<td><a type="link" href="${answer}" class="btn btn-primary"
								data-toggle="modal" data-target="#exampleModal"
								data-desc="${bean.desc}" data-id="${bean.id}"> Answer </a></td>
							</c:if>
 						</tr>
					</c:forEach>
				</table>
				<c:if  test="${utype}== STUDENT" >
    <a href="QueryAddStudent.jsp" class="btn btn-primary btn-block"> Post Query</a>
    </c:if>
    </div>
	</div>
    </div>
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<div>
						<h5 class="modal-title" id="exampleModalLabel"></h5>
					</div>
				</div>
				<div class="modal-body">
					<input class="form-control" id="exampleInputAns" type="text"
						aria-describedby="nameHelp" placeholder="Enter Answer Here"
						name="answer">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary" id="submitans">Submit
						Answer</button>
				</div>
			</div>
		</div>
	</div>
	<%@include file="js.html"%>
</body>
</html>