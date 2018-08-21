<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="css.html"%>
</head>
<body class="bg-dark">
	<div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Reset Password</div>
      <div class="card-body">
        <div class="text-center mt-4 mb-5">
          <h4>Forgot your password?</h4>
          <p>Enter your email address and we will send you instructions on how to reset your password.</p>
        </div>
        <form action="<%=request.getContextPath() %>/ForgetPasswordServlet" method="post">
          <div class="form-group">
            <input class="form-control" id="exampleInputEmail1" type="email" name="email" aria-describedby="emailHelp" placeholder="Enter email address" required>
          </div>
          <input type="submit" class="btn btn-primary btn-block" value="Reset Password">
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="register.jsp">Register an Account</a>
          <a class="d-block small" href="login.jsp">Login Page</a>
        </div>
      </div>
    </div>
    <%@include file="js.html"%>
  </div>

</body>
</html>