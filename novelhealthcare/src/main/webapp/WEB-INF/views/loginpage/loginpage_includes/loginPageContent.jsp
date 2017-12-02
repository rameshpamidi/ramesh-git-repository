
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="main-content-wrapper">
	<div class="login-area">
		<div class="login-header">
			<a href="http://creativeitem.com/demo/bayanno/index.php?login" class="logo"> <img src='<spring:url value="/assets/images/logo.png"/>'
				height="60" alt="">
			</a>
			<h2 class="title" style="padding-top: 10px;">Novel Hospital Management System</h2>
		</div>
		<div class="login-content" style="padding-top: 10px;">
			<c:if test="${requestScope.msg!=null}">
				<h4 style="color: red;">${requestScope.msg}</h4>
			</c:if>
			<form:form method="post" role="form" id="form_login" action="./login" commandName="loginForm">
				<div class="form-group">
					<form:input type="text" class="input-field" id="username" placeholder="User name" path="userName" autocomplete="off" />
					<form:errors path="userName" cssClass="text-danger"></form:errors>
				</div>
				<div class="form-group">
					<form:input type="password" class="input-field" id="password" placeholder="Password" path="password" autocomplete="off" />
					<form:errors path="password" cssClass="text-danger"></form:errors>
				</div>
				<button type="submit" class="btn btn-primary">
					Login <i class="fa fa-lock"></i>
				</button>
				<!--demo login buttons-->
				<button type="button" class="btn btn-default" id="superadmin" onclick="demo_login(this.id)">Superadmin</button>
				<button type="button" class="btn btn-default" id="admin" onclick="demo_login(this.id)">Admin</button>
				<button type="button" class="btn btn-default" id="doctor" onclick="demo_login(this.id)">Doctor</button>

				<br>
				<br>
				<button type="button" class="btn btn-default" id="patient" onclick="demo_login(this.id)">Patient</button>
				<button type="button" class="btn btn-default" id="receptionist" onclick="demo_login(this.id)">Receptionist</button>
				<button type="button" class="btn btn-default" id="laboratorist" onclick="demo_login(this.id)">Laboratorist</button>
				<br>
				<br>
				<button type="button" class="btn btn-default" id="nurse" onclick="demo_login(this.id)">Nurse</button>
				<button type="button" class="btn btn-default" id="accountant" onclick="demo_login(this.id)">Accountant</button>
				<button type="button" class="btn btn-default" id="pharmacist" onclick="demo_login(this.id)">Pharmacist</button>
				<!--demo login buttons-->
			</form:form>
		</div>
	</div>
	<div class="image-area"></div>
</div>