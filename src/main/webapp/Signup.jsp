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
    <a class="navbar-brand" href="Welcome.jsp">home</a>
    <a class="navbar-brand" href="#">signin</a>
   
  </div>
</nav>
<div class="text-center" align="center">
			<span style="color: green; font-family: cursive;">${name}, ${success}</span>
			<span style="color: red; font-family: cursive;">${failure}</span>
		</div>

<form action="action_page.php.do">
<div class="container w-50%">
<div class="card-body" align="center">

<div class="text-center" align="center">
	<div class="form-group col-md-4">
    <label for="username" >User name</label>
    <input type="text" class="form-control" placeholder="Enter user name" id="uname" name="userName">
     </div>
     
     <div class="form-group col-md-4">
    <label for="Email" >Email</label>
    <input type="email" class="form-control" placeholder="Enter Email" id="ema" name="email">
     </div>
     <div class="form-group col-md-4">
    <label for="mobile" >Mobile</label>
    <input type="number" class="form-control" placeholder="Enter contact number" id="mob" name="number">
     </div>
     <div class="form-group col-md-4">
    <label for="password" >Password</label>
    <input type="password" class="form-control" placeholder="Enter your password" id="pass" name="password">
     </div>
     <div class="form-group col-md-4">
    <label for="conpassword" >Confirm Password</label>
    <input type="password" class="form-control" placeholder="confirm password" id="cpass" name="confirmpassword">
     </div>
     </div>
 </div>
 <button type="submit" class="btn btn-primary">signup</button>
 </form>
</div>
</body>