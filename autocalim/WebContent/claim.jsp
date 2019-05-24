<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<title>claim</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type"
	content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style/style.css"
	title="style" />
</head>

<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<div id="logo_text">
					<!-- class="logo_colour", allows you to change the colour of the text -->
					<h1>
						<a href="index.html">Assure<span class="logo_colour">Insurance</span></a>
					</h1>
					<h2>You're in Good Hands with Assure Insurance</h2>
				</div>
			</div>
			<div id="menubar">
				<ul id="menu">
					<!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
					<li><a href="index.jsp">Home</a></li>
					<li><a href="register.jsp">Register</a></li>
					<li class="selected"><a href="claim.jsp">Claim</a></li>
					<li><a href="guideline.jsp">Guideline & FAQ</a></li>
					<li><a href="claim_status.jsp">Claim Status</a></li>
					<li><a href="login.jsp">Login</a></li>
				</ul>
			</div>
		</div>
		<div id="site_content">
			<div class="sidebar">
				<div class="insert_image">
					<p>Upload Damage Image</p>
				</div>
			</div>
			<div id="content">
				<h2>Claim For Your Insurance</h2>
				<p>Insert your credentials to claim for your Insurance</p>
				<form action="ClaimServlet" method="post">
					<div class="form_settings">
						<p>
							<span>Policy ID</span><input class="contact" type="text"
								name="policy_id" value="" />
						</p>
						<p>
							<span>Policy Start Date</span><input class="contact" type="date"
								name="start_date" value="" />
						</p>
						<p>
							<span>Policy Expiry Date</span><input class="contact" type="date"
								name="expiry_date" value="" />
						</p>
						<p>
							<span>Vehicle Registration Number</span><input class="contact"
								type="text" name="vehicle_reg_no" value="" />
						</p>
						<p>
							<span>Vehicle Type</span><input class="contact" type="text"
								name="vehicle_type" value="" />
						</p>
						<p>
							<span>Vehicle Price</span><input class="contact" type="text"
								name="vehicle_price" value="" />
						</p>
						<p>
							<span>Claim Amount</span><input class="contact" type="text"
								name="claim_amount" value="" />
						</p>
						<p style="padding-top: 15px">
							<span>&nbsp;</span><input class="submit" type="submit"
								name="contact_submitted" value="submit" />
						</p>
					</div>
				</form>

			</div>
		</div>
		<div id="footer">Copyright &copy; Assure Insurance</div>
	</div>
</body>
</html>
