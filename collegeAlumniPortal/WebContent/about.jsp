<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Alumni Portal</title>
<%@include file="css.html"%>
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
				<b>About</b>
				</li>

			</ol>
			<div>
				<form>
					<hr class="mt-2">
					<div class="card-columns">
						<div class="card mb-2">
							<a href="#"> <img class="card-img-top img-fluid w-20"
								src="images/college alumni.jpg" alt="">
							</a>
						</div>
						<div class="breadcrumb">
							<p align="justify"><b>
							We are formulating the alumni web portal which will facilitate effective communication platform through profile viewing and personal messaging within the institute between College, College students, Alumni.
							This portal highlights the feature of communication, which will enable the current students to have interaction with the alumni of the college for getting various updates on Internship opportunity, sponsored projects and much more.
							</b></p>
						</div>
					</div>
				</form>
				<div class="row">
					<div class="col-12"></div>
				</div>
			</div>
		</div>
		<%@include file="js.html"%>
	</div>
</body>
</html>