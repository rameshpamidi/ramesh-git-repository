
<%@include file="includes/taglibs.jsp"%>
<%@include file="includes/head.jsp"%>
<title>NovelHealth Login</title>
</head>
<body>
	<div>
		<a class="hiddenanchor" id="signup"></a> 
		<a class="hiddenanchor" id="signin"></a>

		<div class="login_wrapper">
			<div id="register" class="animate form registration_form">
				<section class="login_content">
					<form:form action="./signup" commandName="signUpForm" method="get">
						<h1>Create Account</h1>
						<div>
							<form:input path="userName" class="form-control" placeholder="Username" />
						</div>
						<div>
							<form:input path="email" class="form-control" placeholder="Email" />
						</div>
						<div>
							<form:input path="password" class="form-control" placeholder="Password" />
						</div>
						<div>
							<a class="btn btn-default submit" role="submit">Submit</a>
						</div>

						<div class="clearfix"></div>

						<div class="separator">
							<p class="change_link">
								Already a member ? <a href="./signin" class="to_register"> Log in </a>
							</p>

							<div class="clearfix"></div>
							<br />

							<div>
								<h1>
									<i class="fa fa-paw"></i> Novel Health Care!
								</h1>
								<p>©2016 All Rights Reserved. Novel Health Care! Privacy and Terms</p>
							</div>
						</div>
					</form:form>
				</section>
			</div>
		</div>
	</div>

</body>
</html>