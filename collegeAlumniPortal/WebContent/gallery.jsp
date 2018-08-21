<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>College Alumni Portal</title>
<%@include file="css.html"%>
<jsp:include page="/DisplayImage"></jsp:include>
</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top">
	<jsp:include page="nav.jsp" />
	<div class="content-wrapper">
		<div class="container-fluid">
			<!-- Breadcrumbs-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item active">Gallery</li>
			</ol>
			<div class="breadcrumb" class="row">

				<c:forEach items="${gallerylist}" var="bean">
						<c:url var="delete" value="DeleteImage">
							<c:param name="id" value="${bean.id }"></c:param>
						</c:url>
					<div class="card mb-3">
						<a href="data:image/jpeg;base64,${bean.image}"> <img height="300" width="300"
							src="data:image/jpeg;base64,${bean.image}" alt="">
						</a>
						<hr class="my-0">
						<div class="card-body py-2 small">
							<a class="btn btn-primary btn-block" href="${delete}">Delete</a>
						</div>
					</div>
					&nbsp;&nbsp;
							<%-- 					<a href="data:image/jpeg;base64,${bean.image}" rel="" class="b-link-stripe b-animate-go  thickbox" > --%>
							<%-- 					<img height="300" width="300" alt="img" src="data:image/jpeg;base64,${bean.image}" /> --%>
							<!-- 					</a> -->
							<!-- 					&nbsp;&nbsp; -->
				</c:forEach>
			</div>
			<div>
				<a class="btn btn-primary btn-block" href="Addimage.jsp"> Upload New
					Image</a>
				
			</div>
		</div>
	</div>
	<%@include file="js.html"%>
</body>
</html>