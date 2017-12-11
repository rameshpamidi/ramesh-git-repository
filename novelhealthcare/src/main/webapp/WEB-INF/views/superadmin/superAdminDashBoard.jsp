<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
			<!-- super admin body content-->
			<%@include file="superadmin_includes/superAdminBodyHeader.jsp"%>
			
			<h3 style="margin: 20px 0px; color: #818da1; font-weight: 200;">
				<i class="entypo-right-circled"></i>SuperAdmin Dashboard
			</h3>
			<div class="row" style="height: 10cm;">
				<div class="col-sm-3">
					<a href="http://creativeitem.com/demo/bayanno/index.php?admin/doctor">
						<div class="tile-stats tile-white tile-white-primary">
							<div class="icon">
								<i class="fa fa-user-md"></i>
							</div>
							<div class="num" data-start="0" data-end="${totalhospitals}" data-duration="1500" data-delay="0">${totalhospitals}</div>
							<h3>Hospitals</h3>
						</div>
					</a>
				</div>

				<div class="col-sm-3">
					<a href="http://creativeitem.com/demo/bayanno/index.php?admin/patient">
						<div class="tile-stats tile-white-red">
							<div class="icon">
								<i class="fa fa-user"></i>
							</div>
							<div class="num" data-start="0" data-end="${totaladmins}" data-duration="1500" data-delay="0">1</div>
							<h3>Admins</h3>
						</div>
					</a>
				</div>
			</div>

			<!-- super admin footer -->
			<%@include file="superadmin_includes/superAdminFooter.jsp"%>
		</div>
	</div>
	<!-- (Ajax Modal)-->
	<div class="modal fade" id="modal_ajax">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title">ADD HOSPITAL</h4>
				</div>
				<div class="modal-body" style="height: 500px; overflow: auto;"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>

	<!-- (Normal Modal)-->
	<div class="modal fade" id="modal-4">
		<div class="modal-dialog">
			<div class="modal-content" style="margin-top: 100px;">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" style="text-align: center;">Are you sure to delete this information ?</h4>
				</div>


				<div class="modal-footer" style="margin: 0px; border-top: 0px; text-align: center;">
					<a href="#" class="btn btn-danger" id="delete_link">Delete</a>
					<button type="button" class="btn btn-info" data-dismiss="modal">Cancel</button>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade custom-width" id="modal-2">
		<div class="modal-dialog" style="width: 75%;">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title">Novel Hospital Management System</h4>
				</div>

				<div class="modal-body"></div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>

	<%@include file="superadmin_includes/superAdminScripts.jsp"%>
</body>
</html>
