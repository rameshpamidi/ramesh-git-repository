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
				<i class="entypo-right-circled"></i>Edit Hospital
			</h3>
			<div class="panel-heading">
				<div class="panel-title">
					<h3>Hospital Details</h3>
				</div>
			</div>
			<form:form class="form-horizontal form-groups validate" action="./edithospital" method="post" commandName="hospitalForm">
				<form:input type="hidden" class="form-control" path="hospitalId" />
				<spring:bind path="hospitalName">
					<div class="form-group  ${status.error ? 'has-error' : ''}">
						<label for="field-1" class="col-sm-3 control-label">Hospital Name*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="hospitalName" />
							<form:errors path="hospitalName" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>

				<spring:bind path="websiteUrl">
					<div class="form-group ${status.error ? 'has-error' : ''}">
						<label for="field-1" class="col-sm-3 control-label">Webiste URL*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control" path="websiteUrl" />
							<form:errors path="websiteUrl" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>
				<spring:bind path="status">
					<div class="form-group ${status.error ? 'has-error' : ''}">
						<label for="field-1" class="col-sm-3 control-label">Status*</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<div class="radio">
								<c:choose>
									<c:when test="${hospitalForm.status==true}">
										<label> <form:radiobutton class="flat" name="iCheck" value="true" checked="checked" path="status" /> Active
										</label>
										<label> <form:radiobutton class="flat" name="iCheck" value="false" path="status" />In Active
										</label>
									</c:when>
									<c:when test="${hospitalForm.status==false}">
										<label> <form:radiobutton class="flat" name="iCheck" value="true"  path="status" /> Active
										</label>
										<label> <form:radiobutton class="flat" name="iCheck" value="false" checked="checked" path="status" />In Active
										</label>
									</c:when>
								</c:choose>
							</div>
							<form:errors path="status" cssClass="text-danger"></form:errors>
						</div>
					</div>
				</spring:bind>
				<div class="col-sm-3 control-label col-sm-offset-2">
					<button type="submit" class="btn btn-success" id="form-submit">
						<i class="fa fa-check"></i> edit hospital
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






<!-- Ajax Model -->

<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
	<div class="col-md-12">
		<div class="panel panel-primary" data-collapsed="0">
			<div class="panel-heading">
				<div class="panel-title">
					<h3>Hospital details</h3>
					<hr>
				</div>
			</div>
			<div class="panel-body">
				<form:form class="form-horizontal form-groups validate" action="./addhospital" method="post" commandName="hospitalForm">
					<div class="form-group">
						<label for="field-1" class="col-sm-3 control-label">Hospital Name*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="hospitalName" />
							<form:errors path="hospitalName" cssClass="text-danger"></form:errors>
						</div>
					</div>

					<div class="form-group">
						<label for="field-1" class="col-sm-3 control-label">Webiste URL*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="websiteUrl" />
							<form:errors path="websiteUrl" cssClass="text-danger"></form:errors>
						</div>
					</div>

					<div class="form-group">
						<label for="field-1" class="col-sm-3 control-label">Status*</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<div class="radio">
								<label> <form:radiobutton class="flat" name="iCheck" value="true" path="status" /> Active
								</label> <label> <form:radiobutton class="flat" name="iCheck" checked="checked" value="false" path="status" />In Active
								</label>
							</div>
							<form:errors path="status" cssClass="text-danger"></form:errors>
						</div>
					</div>

					<div class="panel-heading">
						<div class="panel-title">
							<h3>Branch Details</h3>
							<hr>
						</div>
					</div>

					<div class="form-group">
						<label for="field-ta" class="col-sm-3 control-label">Address1*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="branch.address1" />
							<form:errors path="branch.address1" cssClass="text-danger"></form:errors>
						</div>
					</div>

					<div class="form-group">
						<label for="field-ta" class="col-sm-3 control-label">Address2</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="branch.address2" />
							<form:errors path="branch.address2" cssClass="text-danger"></form:errors>
						</div>
					</div>
					
					<div class="form-group">
						<label for="field-ta" class="col-sm-3 control-label">City*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="branch.city" />
							<form:errors path="branch.city" cssClass="text-danger"></form:errors>
						</div>
					</div>
					
					<div class="form-group">
						<label for="field-ta" class="col-sm-3 control-label">State*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="branch.state" />
							<form:errors path="branch.state" cssClass="text-danger"></form:errors>
						</div>
					</div>
					
					<div class="form-group">
						<label for="field-ta" class="col-sm-3 control-label">zipcode*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="branch.zipcode" />
							<form:errors path="branch.zipcode" cssClass="text-danger"></form:errors>
						</div>
					</div>

					<div class="form-group">
						<label for="field-1" class="col-sm-3 control-label">Email*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="branch.email" />
							<form:errors path="branch.email" cssClass="text-danger"></form:errors>
						</div>
					</div>
					<div class="form-group">
						<label for="field-1" class="col-sm-3 control-label">Phone*</label>
						<div class="col-sm-7">
							<form:input type="text" class="form-control"  path="branch.phoneNo" />
							<form:errors path="branch.phoneNo" cssClass="text-danger"></form:errors>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">Image</label>

						<div class="col-sm-5">

							<div class="fileinput fileinput-new" data-provides="fileinput">
								<input type="hidden">
								<div class="fileinput-new thumbnail" style="width: 200px; height: 150px;" data-trigger="fileinput">
									<img src="http://placehold.it/200x150" alt="...">
								</div>
								<div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px; line-height: 10px;"></div>
								<div>
									<span class="btn btn-white btn-file"> <span class="fileinput-new">Select image</span> <span class="fileinput-exists">Change</span> <form:input
											type="file" path="branch.image" accept="image/*" />
									</span> <a href="#" class="btn btn-orange fileinput-exists" data-dismiss="fileinput">Remove</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-3 control-label col-sm-offset-2">
						<button type="submit" class="btn btn-success" id="form-submit">
							<i class="fa fa-check"></i> Save
						</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>

 --%>