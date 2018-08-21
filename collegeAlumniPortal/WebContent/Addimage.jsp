<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="css.html"%>
</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<jsp:include page="nav.jsp" />
<div class="content-wrapper">
		<div class="container-fluid">
				<form action="<%=request.getContextPath()%>/Gallery"
					enctype="multipart/form-data" method="post">
					Image<input type="file" name="image"> <br>
					<br> Description<input type="text" name="description">
					<br>
					<br> <input type="submit" value="Add">
				</form>
		</div>
		<%@include file="js.html"%>
</div>
</body>
</html>