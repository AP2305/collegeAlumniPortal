<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="css.html"%>
<jsp:include page="/DisplayFeedback"></jsp:include>
<jsp:include page="nav.jsp" />
	<br>
	<br>
	<div></div>
	<div class="content-wrapper">
		<div class="container-fluid">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><b>Feedback</b></li>

			</ol>
			<form action="<%=request.getContextPath()%>/Feedback" method=post>
			<table>
			<tr>
			 <td>Subject :</td>
			 <td><input type="text" name="Subject"></td>
			</tr>
			<tr>
			  <td>Description :</td>
			  <td><input type="text" name="Description"></td>
			</tr>
			<tr>  
			  <td><input type="submit" value="Submit"></td>
			</tr>
			</table>
			</form>
		<div>
	</div>
</div>
</div>
</body>
</html>