<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />

<title>Novel Health</title>

<link rel="shortcut icon" href='<spring:url value="/assets/images/favicon.ico"></spring:url>' />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic" rel="stylesheet" type="text/css" />
<link href='<spring:url value="/assets/css/content/main.css"></spring:url>' rel="stylesheet" />
<link href="<spring:url value="/assets/css/content/theme.css"></spring:url>" rel="stylesheet" />
<link href='<spring:url value="/assets/css/content/bootstrap.min.css"></spring:url>' rel="stylesheet" />
<link href="<spring:url value="/assets/css/content/login.table.css"></spring:url>" rel="stylesheet" />
<link href="<spring:url value="/assets/css/plugin/uniform/uniform.css"></spring:url>" rel="stylesheet" />
<script>
	(function(w, d, s, l, i) {
		w[l] = w[l] || [];
		w[l].push({
			'gtm.start' : new Date().getTime(),
			event : 'gtm.js'
		});
		var f = d.getElementsByTagName(s)[0], j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : '';
		j.async = true;
		j.src = 'https://www.googletagmanager.com/gtm.js?id=' + i + dl;
		f.parentNode.insertBefore(j, f);
	})(window, document, 'script', 'dataLayer', 'GTM-NQRQTLL');
</script>
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="hold-transition login-page">
	<div class="panel panel-default">
		<div class="panel-body">
			<div class="login-box">
				<div class="login-logo">
					<img src="/img/hms-logo.png" alt="HMS" /><br /> <a><b>HMS</b> PRO</a>
				</div>
				<div class="login-box-body">
					<div class="message-box"></div>
					<form:form action="./account/login" class="login-form" id="frmLogin" commandName="loginForm" method="post">
						<h3 class="form-title text-center">Login to your account</h3>
						<div class="form-group">
							<div class="input-icon">
								<i class="fa fa-user"></i>
								<form:input class="form-control placeholder-no-fix" id="userName" path="userName" placeholder="Username" type="text" />
								<span class="glyphicon glyphicon-user form-control-feedback"></span>
								<form:errors path="userName"></form:errors>
							</div>
						</div>
						<div class="form-group">
							<div class="input-icon">
								<i class="fa fa-lock"></i>
								<form:input class="form-control placeholder-no-fix" id="Password" path="password" placeholder="Password" type="password" />
								<span class="glyphicon glyphicon-lock form-control-feedback"></span>
								<form:errors path="password"></form:errors>
							</div>
						</div>
						<div class="form-actions">
							<input type="submit" value="Login" class="btn btn-primary btn-block btn-flat pull-right" />
						</div>
					</form:form>
					<br /> <br />

					<hr />
					<div class="text-center">
						<h4>Super Admin Login</h4>
					</div>
					<div>
						<table>
							<thead>
								<tr>
									<th>Role</th>
									<th>Username</th>
									<th>Password</th>
								</tr>
							</thead>
							<tbody>

								<tr>
									<td>Super Admin</td>
									<td>superadmin@email.com</td>
									<td>123456</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="text-center">
						<h4>Hospital Login</h4>
					</div>
					<div>
						<table>
							<thead>
								<tr>
									<th>Role</th>
									<th>Username</th>
									<th>Password</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Admin</td>
									<td>admin@email.com</td>
									<td>123456</td>
								</tr>
								<tr>
									<td>Doctor</td>
									<td>doctor@email.com</td>
									<td>123456</td>
								</tr>
								<tr>
									<td>Nurse</td>
									<td>nurse@email.com</td>
									<td>123456</td>
								</tr>
								<tr>
									<td>Pharmacist</td>
									<td>pharmacist@email.com</td>
									<td>123456</td>
								</tr>
								<tr>
									<td>Laboratorist</td>
									<td>laboratorist@email.com</td>
									<td>123456</td>
								</tr>
								<tr>
									<td>Accountant</td>
									<td>accountant@email.com</td>
									<td>123456</td>
								</tr>
							</tbody>
						</table>
					</div>

				</div>
			</div>
		</div>
	</div>
	<div class="copyright text-center">
		<label>2017 &#169; HMS PRO [Developed By : NPDEV13]</label>
	</div>
</body>

<script src='<spring:url value="/assets/js/jquery.js"></spring:url>'></script>
<script src='<spring:url value="/assets/js/jquery.min.js"></spring:url>'></script>
<script src='<spring:url value="/assets/js/jquery.plugin.js"></spring:url>'></script>


<!-- <script type="text/javascript">
	$(this.document).ready(function() {

		$(":checkbox").uniform();

		if ('Your login failed due to invalid password.' != null && 'Your login failed due to invalid password.' != '') {
			notificationMessage('Your login failed due to invalid password.', 'danger')
		}
	});
</script> -->

</body>

</html>