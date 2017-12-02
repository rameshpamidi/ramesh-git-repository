<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@include file="superadmin_includes/superAdminHead.jsp"%>
</head>
<body class="page-body">
	<div class="page-container">
		<div class="sidebar-menu">

			<!-- superadmin side menu header -->
			<%@include file="superadmin_includes/sideMenuHeader.jsp"%>

			<!-- superadmin side menu content -->
			<%@include file="superadmin_includes/superAdminSideMenu.jsp"%>
		</div>
		<div class="main-content">

			<!-- body header -->
			<%@include file="superadmin_includes/superAdminBodyHeader.jsp"%>

			<h3 style="margin: 20px 0px; color: #818da1; font-weight: 200;">
				<i class="entypo-right-circled"></i>${hospName}<i class="entypo-right-circled"></i>Add Branch
			</h3>
			<div class="panel-heading">
				<div class="panel-title">
					<h3>Branch Details</h3>
					<hr>
				</div>
			</div>
			<form:form class="form-horizontal form-groups validate" action="./addbranch" method="post" commandName="hospitalBranch">
			<input type="hidden" name="hospId" value="${hospId}">
			<input type="hidden" name="hospName" value="${hospName}">
				<spring:bind path="address1">
					<div class="form-group  ${status.error ? 'has-error' : ''}">
						<label for="field-1" class="col-sm-3 control-label">Address1*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="address1" />
							<form:errors path="address1" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>

				<spring:bind path="address2">
					<div class="form-group  ${status.error ? 'has-error' : ''}">
						<label for="field-ta" class="col-sm-3 control-label">Address2</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="address2" />
							<form:errors path="address2" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>
				<spring:bind path="city">
					<div class="form-group  ${status.error ? 'has-error' : ''}">
						<label for="field-ta" class="col-sm-3 control-label">City*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="city" />
							<form:errors path="city" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>

				<spring:bind path="state">
					<div class="form-group   ${status.error ? 'has-error' : ''}">
						<label for="field-ta" class="col-sm-3 control-label">State*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="state" />
							<form:errors path="state" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>

				<spring:bind path="zipcode">
					<div class="form-group   ${status.error ? 'has-error' : ''}">
						<label for="field-ta" class="col-sm-3 control-label">zipcode*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="zipcode" />
							<form:errors path="zipcode" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>

				<spring:bind path="email">
					<div class="form-group   ${status.error ? 'has-error' : ''}">
						<label for="field-1" class="col-sm-3 control-label">Email*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="email" />
							<form:errors path="email" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>

				<spring:bind path="phoneNo">
					<div class="form-group   ${status.error ? 'has-error' : ''}">
						<label for="field-1" class="col-sm-3 control-label">Phone*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="phoneNo" />
							<form:errors path="phoneNo" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>
				<div class="form-group">
					<label class="col-sm-3 control-label">Image</label>

					<div class="col-sm-5">

						<div class="fileinput fileinput-new" data-provides="fileinput">
							<div class="fileinput-new thumbnail" style="width: 200px; height: 150px;" data-trigger="fileinput">
								<img src="http://placehold.it/200x150" alt="...">
							</div>
							<div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px; line-height: 10px;"></div>
							<div>
								<span class="btn btn-white btn-file"> <span class="fileinput-new">Select image</span> <span class="fileinput-exists">Change</span> <form:input
										type="file" path="image" accept="image/*" />
								</span> <a href="#" class="btn btn-orange fileinput-exists" data-dismiss="fileinput">Remove</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-3 control-label col-sm-offset-2">
					<button type="submit" class="btn btn-success" id="form-submit">
						<i class="fa fa-check"></i> add branch
					</button>
				</div>
			</form:form>
		</div>
		<!-- super admin footer -->
		<%@include file="superadmin_includes/superAdminFooter.jsp"%>
	</div>
	<!-- Bottom Scripts -->
	<%@include file="superadmin_includes/superAdminScripts.jsp"%>
</body>
</html>
