 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Alumni Portal</title>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>College Alumni Portal</title>
  <!-- Bootstrap core CSS-->
  <jsp:include page="css.html"></jsp:include>
</head>
<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
        <form action="<%=request.getContextPath() %>/Login" method="post" >
          <div class="form-group">
            <label for="exampleInputEmail1">User Id</label>
            <input class="form-control" id="exampleInputEmail1" name="email" type="email" aria-describedby="emailHelp" placeholder="Enter user id" required>         
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input class="form-control" id="exampleInputPassword1" name="password" type="password" placeholder="Password" required>
          </div>
<!--           <div class="form-group"> -->
<!--             <div class="form-check"> -->
<!--               <label class="form-check-label"> -->
<!--                 <input class="form-check-input" type="checkbox"> Remember Password</label> -->
<!--             </div> -->
<!--           </div> -->
          <input type="submit" class="btn btn-primary btn-block" value="Login"> 
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="register.jsp">Register an Account</a>
          <a class="d-block small" href="forget.jsp">Forgot Password?</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <jsp:include page="js.html"></jsp:include>
</body>

</html>
