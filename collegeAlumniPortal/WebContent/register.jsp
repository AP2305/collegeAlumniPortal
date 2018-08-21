<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <%@include file="css.html" %>
<title>College Alumni Portal</title>
<script type="text/javascript">
function password(){
	var confpass=$("#exampleConfirmPassword").val();
	var password=$("#exampleInputPassword1").val();
	if(confpass != password){
		$("#alertTextLabel").text("Password does not match.Please check your password");
		$("#messageDiv").show();
		$("#exampleConfirmPassword").val("");
	}
};
</script>
</head>
<body class="bg-dark">
<jsp:include page="/StateAndCityServlet"/>
<div class="alert alert-danger alert-dismissable" style="display: none;" id = "messageDiv">
 <button type="button" class="close" data-hide="alert" aria-label="Close">
    <span aria-hidden="true">&times;</span>
  </button>
  <strong>Error!</strong> <label id ="alertTextLabel"></label>.
</div>
  <div class="container">
     <div class="card card-register mx-auto mt-5">
      <div class="card-header">Register an Account</div>
      <div class="card-body">
        <form action="<%=request.getContextPath()%>/registrationServlet" method="post">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">Full name</label>
                <input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" placeholder="Enter full name" name="fullname" required>
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">Contact</label>
                <input class="form-control" id="exampleInputContact" type="number"   aria-describedby="nameHelp" placeholder="Enter contact no."name="contact" required>
              </div>
            </div>
          </div>
          <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input class="form-control" id="exampleInputEmail1"  required type="email" aria-describedby="emailHelp" placeholder="Enter email" name="email">
          </div>
		  <div class="form-group">
            <label for="exampleInputAdress">Address</label>
            <input class="form-control" id="exampleInputAddress" type="address" aria-describedby="emailHelp" placeholder="Enter Address" name="address" required>
          </div>
          <div class="form-group">
           <div class="form-row">
            <div class="col-md-6">
            	<label for="exampleInputState">State : </label>
            	<select name="State" id="selectState">
            	<option value="-1">Please Select state</option>
            	
          		<c:forEach var="entry" items="${stateMap}">
        	  <option value="${entry.key}">${entry.value}</option>
			</c:forEach>
            </select> 
           </div>
          	<div class="col-md-6">
            	<label for="exampleInputCity">City : </label>
            		<select name="City" id = "selectCity">
             		 <option value="-1">Please Select city</option>
             		 <c:forEach var="entry" items="${cityMap}">
        	  		<option value="${entry.key}">${entry.value}</option>
			</c:forEach>
          		  </select> 
          	</div>
            </div>
          </div>
          <div class="form-group">
           <div class="form-row">
            <div class="col-md-6">
            	<label for="exampleInputGender">Gender</label>
            	<input  id="exampleInputGender" type="radio" name="gender" checked="checked" >Male
            	<input  id="exampleInputGender" type="radio" name="gender">Female
            	
          	</div>
          	<div class="col-md-6">
            	<label for="exampleInpuDate">Date Of Birth</label>
            	<input  id="exampleInputDate" type="date" name="dob" required>
          	</div>
            </div>
          </div>
          <div class="form-group">
           <div class="form-row">
            <div class="col-md-6">
            	<label for="exampleInputEnrollmentno">Enrollment No</label>
            	<input class="form-control" id="exampleInputEnrollmentno" type="text" name="Enrollmentno" placeholder="Enter Enrollment No" required>            	
          	</div>
          	</div>
          </div>
          <div class="form-group">
           <div class="form-row">
            <div class="col-md-6">
            	<label for="exampleInputAdmissionYear">Admission Year</label>
            	<input class="form-control" id="exampleInputAdmissionyear" type="text" name="admissionyear" placeholder="Enter Admission year" required>            	
          	</div>
          	<div class="col-md-6">
            	<label for="exampleInpuPassingyear">Passing Year</label>
            	<div>
            	<input class="form-control" id="exampleInputPassingyear" type="text" name="passingyear" placeholder="Enter Pasing year" required>
          		</div>
          	</div>
            </div>
          </div>
          
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1">Password</label>
                <input class="form-control" id="exampleInputPassword1" type="password" placeholder="Password" name="password" required>
              </div>
              <div class="col-md-6">
                <label for="exampleConfirmPassword">Confirm password</label>
                <input class="form-control" id="exampleConfirmPassword" type="password" onblur="password()" placeholder="Confirm password" required>
              </div>
            </div>
            <input type="hidden" name="user" value="STUDENT">
          </div>
<!--           <a class="btn btn-primary btn-block" href="login.jsp">Register</a> -->
          <input class="btn btn-primary btn-block" type="submit"  value="Register">
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="login.jsp">Login Page</a>
          <a class="d-block small" href="forget.jsp">Forgot Password?</a>
        </div>
      </div>
    </div>
    <%@include file="js.html"%>
  </div>
  
</body>
<script> 

$('#selectState').on('change', function (e) {
    var optionSelected = $("option:selected", this);
    var valueSelected = this.value;

    $.get( "<%=request.getContextPath()%>/StateAndCityServlet", { id: ""+valueSelected+""} )
    .done(function( data ) {
    	var obj = $.parseJSON(data);
    	
    	$('#selectCity').children('option:not(:first)').remove();


//       alert( "Data Loaded: " + data );
		
		for (var key in obj) {
			$('#selectCity')
	         .append($("<option></option>")
	         .attr("value",key)
	         .text(obj[key]));
			
//  	   		alert(key + ': ' + obj[key]);
		}

//     	 $.each(data, function(index, element) {
//              alert(index);
//              alert(element);
//          });
    });
    
});


$("[data-hide]").on("click", function(){
    $(this).closest("." + $(this).attr("data-hide")).hide();
});

$( "#exampleInputContact" ).blur(function() {
	  var contact = $("#exampleInputContact").val();
	  if(contact.length > 0 && contact.length!=10){
		  $("#alertTextLabel").text("Please enter correct mobile number.");
		  $("#messageDiv").show();
		  $ ("#exampleInputContact").val("");
	  }
	});

$( document ).ready(function() {
	
});

</script>
</html>