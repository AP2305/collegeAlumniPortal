<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.shared.UserBean"%>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="index.html">College Alumni Portal</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Home" id="home">
          <a class="nav-link" href="index.jsp">
            <i class="fa fa-fw fa-home"></i>
            <span class="nav-link-text">Home</span>
          </a>
        </li>
        <c:if  test="${utype}== ADMIN" >
         <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Users" id="user">
          <a class="nav-link" href="Users.jsp" color="red">
            <i class="fa fa-fw fa-user"></i>  <!--change this for changing icon -->
            <span class="nav-link-text">Users</span>
          </a>
        </li>
        </c:if>
        
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Profile" id="profile">
          <a class="nav-link" href="Profile.jsp" color="red">
            <i class="fa fa-fw fa-user"></i>  <!--change this for changing icon -->
            <span class="nav-link-text">Profile</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Tables" id="gallery">
          <a class="nav-link" href="gallery.jsp">
            <i class="fa fa-fw fa-image"></i>
            <span class="nav-link-text">Gallery</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Events" id="events">
          <!-- <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents" data-parent="#exampleAccordion"> -->
            <a class="nav-link" href="event.jsp">
			<i class="fa fa-fw fa-link"></i>
            <span class="nav-link-text" >Events</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Placements" id="placement">
          <!-- <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseExamplePages" data-parent="#exampleAccordion"> -->
            <a class="nav-link" href="placement.jsp">
			<i class="fa fa-fw fa-link"></i>
            <span class="nav-link-text">Placements</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Queries" id="query" >
<!--           <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti" data-parent="#exampleAccordion"> -->
		  <a class="nav-link" href="query.jsp">
            <i class="fa fa-fw fa-question"></i>
            <span class="nav-link-text">Queries</span>
          </a>
        </li>
        <c:if  test="${utype}== ADMIN" >
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Report" id="report">
          <a class="nav-link" href="reports.jsp">
            <i class="fa fa-fw fa-link"></i>
            <span class="nav-link-text">Reports</span>
          </a>
        </li>
        </c:if>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Feedback" id="feedback">
          <a class="nav-link" href="feedback.jsp">
            <i class="fa fa-fw fa-link"></i>
            <span class="nav-link-text">Feedback</span>
          </a>
        </li>
		<li class="nav-item" data-toggle="tooltip" data-placement="right" title="Link" id="about">
          <a class="nav-link" href="about.jsp">
            <i class="fa fa-fw fa-link"></i>
            <span class="nav-link-text">About</span>
          </a>
        </li>
      </ul>
      <ul class="navbar-nav sidenav-toggler">
        <li class="nav-item">
          <a class="nav-link text-center" id="sidenavToggler">
            <i class="fa fa-fw fa-angle-left"></i>
          </a>
        </li>
      </ul>      
      <ul class="navbar-nav ml-auto">
		<li class="nav-item">
          <a class="nav-link"  href="login.jsp" >
           <i class="fa fa-fw fa-sign-in"></i>
            Login</a>
        </li>
		<li class="nav-item">
          <a class="nav-link" href="register.jsp" >
           <i class="fa fa-fw fa-sign-in"></i>
            Register</a>
        </li>
        
<!--         <li class="nav-item dropdown"> -->
<!--           <a class="nav-link dropdown-toggle mr-lg-2" id="alertsDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> -->
<!--             <i class="fa fa-fw fa-bell"></i> -->
<!--             <span class="d-lg-none">Alerts -->
<!--               <span class="badge badge-pill badge-warning">6 New</span> -->
<!--             </span> -->
<!--             <span class="indicator text-warning d-none d-lg-block"> -->
<!--               <i class="fa fa-fw fa-circle"></i> -->
<!--             </span> -->
<!--           </a> -->
<!--           <div class="dropdown-menu" aria-labelledby="alertsDropdown"> -->
<!--             <h6 class="dropdown-header">Notification:</h6> -->
<!--             <div class="dropdown-divider"></div> -->
<!--             <a class="dropdown-item" href="#"> -->
<!--               <span class="text-success"> -->
<!--                 <strong> -->
<!--                   <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong> -->
<!--               </span> -->
<!--               <span class="small float-right text-muted">11:21 AM</span> -->
<!--               <div class="dropdown-message small">This is an automated server response message. All systems are online.</div> -->
<!--             </a> -->
<!--             <div class="dropdown-divider"></div> -->
<!--             <a class="dropdown-item" href="#"> -->
<!--               <span class="text-danger"> -->
<!--                 <strong> -->
<!--                   <i class="fa fa-long-arrow-down fa-fw"></i>Status Update</strong> -->
<!--               </span> -->
<!--               <span class="small float-right text-muted">11:21 AM</span> -->
<!--               <div class="dropdown-message small">This is an automated server response message. All systems are online.</div> -->
<!--             </a> -->
<!--             <div class="dropdown-divider"></div> -->
<!--             <a class="dropdown-item" href="#"> -->
<!--               <span class="text-success"> -->
<!--                 <strong> -->
<!--                   <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong> -->
<!--               </span> -->
<!--               <span class="small float-right text-muted">11:21 AM</span> -->
<!--               <div class="dropdown-message small">This is an automated server response message. All systems are online.</div> -->
<!--             </a> -->
<!--             <div class="dropdown-divider"></div> -->
<!--             <a class="dropdown-item small" href="#">View all notification</a> -->
<!--           </div> -->
<!--         </li> -->
        <li class="nav-item">
          <a class="nav-link" href="login.jsp" >
            <i class="fa fa-fw fa-sign-out"></i>Logout</a>
        </li>
      </ul>
    </div>
  </nav>