<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body bgcolor="cyan">

  	<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  	
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
    <a class="navbar-brand" href="Signup.jsp">signup</a>
    <a class="navbar-brand" href="Signup.jsp">signin</a>
   
  </div>
</nav>
  <h2>
  MVC-Model View Controller
  </h2>
  <h5 style="color:orange">
  <p>
  * MVC is the one architecture which is used in almost all industries as a standard </p>
  <p>
  * The main advantage of mvc architecture is easy maintanance. </p>
  <p>
  * MVC architecture is designed in such a way that all the logics are segrigated into separate layers. </p>
  <p>
  * there are mainly 3 layers i.e. Controller, View and Model.
 	 1.Controller- Request processing logic,Navigation logic.
 	 2.View-       UI logic.
 	 3.Model-      Again it has 2 layers i.e. service, dao
  				1.service- Bussiness Logic, validation logic.
  				2.dao-     Persistance logic </p>
  				
<p>
 * The Front Controller is the design pattern and DispatcherServlet is considered as FrontController.
 <p>
 * Server will create  DispatcherServlet component.by passing the contextConfigLocation of spring.xml- 
     -at the initialization state DispatcherServlet will create Spring container i.e. ApplicationContext. </p>
 <p>
  * ApplicationContext will create 3 helper components for DispatcherServlet which uses all the helper components internally.
   </p>
   <p>
  * Three helper componets are 1.HandlerMapping  2.Controller  3.ViewResolver</p>
  </h5>
 

</body>
</html>

