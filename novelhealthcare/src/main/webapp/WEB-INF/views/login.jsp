
<%@include file="includes/loginpage/loginpage_taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
<!-- BEGIN HEAD -->
<head>
<%@include file="includes/loginpage/loginpage_head.jsp"%>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="hold-transition login-page">
	<div class="login-box" style="padding-top: 30px;">
		<div class="login-logo">
			<img src='<spring:url value="/assets/images/novel_health_logo.png"/>' alt="HMS" /><br /> <a><b>NOVEL</b> HEALTH</a>
		</div>
		<div class="login-box-body">
			<div class="message-box"></div>
			<form:form action="./login" class="login-form" commandName="loginForm" method="post">
				<h3 class="form-title text-center">Login to your account</h3>
				<div class="form-group">
					<div class="input-icon">
						<i class="fa fa-user"></i>
						<form:input class="form-control placeholder-no-fix" path="userName" placeholder="Username" />
						<span class="field-validation-valid" data-valmsg-for="UserName" data-valmsg-replace="true"></span>
						 <span class="glyphicon glyphicon-user form-control-feedback"></span>
						<form:errors path="userName" class="text-danger"></form:errors>
					</div>
				</div>
				<div class="form-group">
					<div class="input-icon">
						<i class="fa fa-lock"></i> 
						<form:input class="form-control placeholder-no-fix" path="password" placeholder="Password"/> 
							<span class="field-validation-valid" data-valmsg-for="Password" data-valmsg-replace="true"></span> 
							<span class="glyphicon glyphicon-lock form-control-feedback"></span>
							<form:errors path="password" class="text-danger"></form:errors>
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

	<div class="copyright text-center">
		<label>2017 &#169; NOVEL HEALTH [Developed By : NPDEV13]</label>
	</div>
</body>

<%@include file="includes/loginpage/scripts.jsp"%>

<script type="text/javascript">
	$(this.document).ready(function() {

		$(":checkbox").uniform();

		if ('' != null && '' != '') {
			notificationMessage('', 'danger')
		}
	});
</script>

<!-- END BODY -->
</html>
