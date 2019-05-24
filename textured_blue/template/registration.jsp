<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: DodgerBlue;
 /* border:solid;
  border-color:green;*/
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  width: 100%;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=number]{
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=number]:focus{
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/*image style*/
img.avatar {
  width: 40%;
  border-radius: 50%;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  foat: right;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: DodgerBlue;/*#4CAF50;*/
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>

<form action="CustomerServlet" method="post">
  <div class="imgcontainer">
    <img src="https://www.royalsundaram.in/blog/wp-content/uploads/2017/10/Personal-accident-cover-in-car-insurance-explained.jpg" alt="Avatar" class="avatar">
  </div>
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="cust_name" required>
   <label for="dob"><b>Date Of Birth</b></label>
    <input type="text" placeholder="Enter Dob" name="cust_dob" required>
   
     <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="cust_email" required>
    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Address" name="cust_address" required>
    <label for="phoneno"><b>Phone No</b></label>
    <input type="text" placeholder="Enter Phone No" name="cust_mobile"   maxlength="10" required>

    
    <label for="Gender"><b>Gender</b></label><br>
    <input type="radio" name="cust_gender" value="m" > Male<br>
    <input type="radio" name="cust_gender" value="f"> Female<br>
    <input type="radio" name="cust_gender" value="o"> Others </br>

    <label for="vehicle no"><b>Policy Number</b></label>
    <input type="text" placeholder="PolicyNumber" name="policy_id" required>
    
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <button type="submit" class="registerbtn">Register</button>
  </div>
</form>

</body>
</html>
