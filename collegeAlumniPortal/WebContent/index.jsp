<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>College Alumni Portal</title>
  <!-- Bootstrap core CSS-->
  

  <%@include file="css.html" %>
</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<jsp:include page="nav.jsp"/>
  
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="index.jsp">Home</a>
        </li>
        <li class="breadcrumb-item active">My Home</li>
      </ol>
    </div>
     <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
         <i class="fa fa-image"></i>Gallery</li>
      </ol>
      <hr class="mt-2">
					<div class="card-columns">
						<div >
							<a href="images/IMG_6942.JPG" > 
							<img height="20" width="20" class="card-img-top img-fluid w-20" src="images/IMG_6842.JPG" alt="">
							</a>
						</div>
						<div >
							<a href="images/IMG_6923.JPG" > 
							<img class="card-img-top img-fluid w-20" src="images/IMG_6923.JPG" alt="">
							</a>
						</div>
					
     				</div>
     				<div></div>	
      				<div class="card-columns">
      					<div >
							<a href="images/IMG_6843.JPG" > 
							<img class="card-img-top img-fluid w-20" src="images/IMG_6843.JPG" alt="">
							</a>
						</div>
						<div >
							<a href="images/IMG_6873.JPG" > 
							<img class="card-img-top img-fluid w-20" src="images/IMG_6873.JPG" alt="">
							</a>
						</div>
      				</div>
    </div>
    <%@include file="js.html" %>
    </div>
</body>
</html>