
<!DOCTYPE html>
<html lang="en" dir="">
<head>

<title>Doctor - Bayanno Hospital Management System</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="Ekattor School Manager Pro - Creativeitem" />
<meta name="author" content="Creativeitem" />



<link rel="stylesheet" href="assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css">
<link rel="stylesheet" href="assets/css/font-icons/entypo/css/entypo.css">
<!--<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic">-->
<!--<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700" rel="stylesheet">-->
<link href="https://fonts.googleapis.com/css?family=Poppins:400,500,600" rel="stylesheet">
<link rel="stylesheet" href="assets/css/bootstrap.css">
<link rel="stylesheet" href="assets/css/neon-core.css">
<link rel="stylesheet" href="assets/css/neon-theme.css">
<link rel="stylesheet" href="assets/css/neon-forms.css">
<link rel="stylesheet" href="assets/css/custom.css">
<!--<link rel="stylesheet" href="assets/css/skins/green.css">-->

<script src="assets/js/jquery-1.11.0.min.js"></script>

<!--[if lt IE 9]><script src="assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<link rel="shortcut icon" href="uploads/favicon.png">
<link rel="stylesheet" href="assets/css/font-icons/font-awesome/css/font-awesome.min.css">




<link rel="stylesheet" href="assets/js/vertical-timeline/css/component.css">
<link rel="stylesheet" href="assets/js/datatables/responsive/css/datatables.responsive.css">

<!--<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular-route.js"></script>
<script src="script.js"></script>-->

<script>
	function checkDelete() {
		var chk = confirm("Are You Sure To Delete This !");
		if (chk) {
			return true;
		} else {
			return false;
		}
	}
</script>

<style>
.tile-stats .icon {
	bottom: 30px;
}
</style>
</head>
<body class="page-body">
	<div class="page-container             ">
		<div class="sidebar-menu">
			<header class="logo-env">

				<!-- logo -->
				<div class="logo" style="">
					<a href="http://creativeitem.com/demo/bayanno/"> <img src="uploads/logo.png" style="max-height: 60px;" />
					</a>
				</div>

				<!-- logo collapse icon -->
				<div class="sidebar-collapse" style="">
					<a href="#" class="sidebar-collapse-icon with-animation"> <i class="entypo-menu"></i>
					</a>
				</div>

				<!-- open/close menu icon (do not remove if you want to enable menu on mobile devices) -->
				<div class="sidebar-mobile-menu visible-xs">
					<a href="#" class="with-animation"> <i class="entypo-menu"></i>
					</a>
				</div>
			</header>
			<div class="sidebar-user-info">

				<div class="sui-normal">
					<a href="#" class="user-link"> <img src="http://creativeitem.com/demo/bayanno/uploads/user.jpg" alt="" class="img-circle"
						style="height: 44px;"> <span>Welcome,</span> <strong>Mr. Admin </strong>
					</a>
				</div>

				<div class="sui-hover inline-links animate-in">
					<!-- You can remove "inline-links" class to make links appear vertically, class "animate-in" will make A elements animateable when click on user profile -->
					<a href="http://creativeitem.com/demo/bayanno/index.php?admin/manage_profile"> <i class="entypo-pencil"></i> Edit Profile
					</a> <a href="http://creativeitem.com/demo/bayanno/index.php?admin/manage_profile"> <i class="entypo-lock"></i> Change Password
					</a> <span class="close-sui-popup">×</span>
					<!-- this is mandatory -->
				</div>
			</div>

			<ul id="main-menu" class="">
				<!-- add class "multiple-expanded" to allow multiple submenus to open -->
				<!-- class "auto-inherit-active-class" will automatically add "active" class for parent elements who are marked already with class "active" -->


				<!-- DASHBOARD -->
				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/dashboard"> <i class="fa fa-desktop"></i> <span>Dashboard</span>
				</a></li>

				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/department"> <i class="fa fa-sitemap"></i> <span>Department</span>
				</a></li>

				<li class="active"><a href="http://creativeitem.com/demo/bayanno/index.php?admin/doctor"> <i class="fa fa-user-md"></i> <span>Doctor</span>
				</a></li>

				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/patient"> <i class="fa fa-user"></i> <span>Patient</span>
				</a></li>

				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/nurse"> <i class="fa fa-plus-square"></i> <span>Nurse</span>
				</a></li>

				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/pharmacist"> <i class="fa fa-medkit"></i> <span>Pharmacist</span>
				</a></li>

				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/laboratorist"> <i class="fa fa-user"></i> <span>Laboratorist</span>
				</a></li>

				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/accountant"> <i class="fa fa-money"></i> <span>Accountant</span>
				</a></li>

				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/receptionist"> <i class="fa fa-plus-square"></i> <span>Receptionist</span>
				</a></li>

				<li class=" "><a href="#"> <i class="fa fa-sun-o"></i> <span>Monitor Hospital</span>
				</a>
					<ul>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/payment_history"> <i class="entypo-dot"></i> <span>Payment
									History</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/bed_allotment"> <i class="entypo-dot"></i> <span>Bed
									Allotment</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/blood_bank"> <i class="entypo-dot"></i> <span>Blood
									Bank</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/blood_donor"> <i class="entypo-dot"></i> <span>Blood
									Donor</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/medicine"> <i class="entypo-dot"></i> <span>Medicine</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/operation_report"> <i class="entypo-dot"></i> <span>Operation
									Report</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/birth_report"> <i class="entypo-dot"></i> <span>Birth
									Report</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/death_report"> <i class="entypo-dot"></i> <span>Death
									Report</span>
						</a></li>
					</ul></li>

				<li class=""><a href="#"> <i class="entypo-tag"></i> <span>Payroll</span>
				</a>
					<ul>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/payroll"> <span><i class="entypo-dot"></i> Create
									Payroll</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/payroll_list"> <span><i class="entypo-dot"></i>
									Payroll List</span>
						</a></li>
					</ul></li>

				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/notice"> <i class="entypo-doc-text-inv"></i> <span>Noticeboard</span>
				</a></li>

				<!-- SETTINGS -->
				<li class=" "><a href="#"> <i class="fa fa-wrench"></i> <span>Settings</span>
				</a>
					<ul>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/system_settings"> <span><i class="fa fa-h-square"></i>
									System Settings</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/manage_language"> <span><i class="fa fa-globe"></i>
									Language Settings</span>
						</a></li>
						<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/sms_settings"> <span><i class="entypo-paper-plane"></i>
									Sms Settings</span>
						</a></li>
					</ul></li>

				<!-- forntend -->
				<li class=""><a href="http://creativeitem.com/demo/bayanno/index.php?admin/frontend"> <i class="fa fa-laptop"></i> <span>Frontend</span>
				</a></li>

				<!-- contact emails -->
				<li class=""><a href="http://creativeitem.com/demo/bayanno/index.php?admin/contact_email"> <i class="fa fa-envelope"></i> <span>Contact
							Emails</span>
				</a></li>

				<!-- ACCOUNT -->
				<li class=" "><a href="http://creativeitem.com/demo/bayanno/index.php?admin/manage_profile"> <i class="fa fa-user"></i> <span>Account</span>
				</a></li>



			</ul>

		</div>
		<div class="main-content">

			<div class="row">
				<div class="col-md-12 col-sm-12 clearfix" style="text-align: center;">
					<h2 style="font-weight: 200; margin: 0px;">Bayanno Hospital Management System</h2>
				</div>

				<!-- Raw Links -->
				<div class="col-md-12 col-sm-12 clearfix ">

					<ul class="list-inline links-list pull-left">
						<!-- Language Selector -->
						<li class="dropdown language-selector"><a href="#" class="dropdown-toggle" data-toggle="dropdown" data-close-others="true"> <i
								class="entypo-user"></i> admin
						</a></li>

						<!-- Message Notifications -->
					</ul>


					<ul class="list-inline links-list pull-right">

						<li><a href="http://creativeitem.com/demo/bayanno/index.php?home" target="_blank"> <i class="fa fa-globe"></i> &nbsp;Website
						</a></li>
						<li class="sep"></li>
						<li><a href="http://creativeitem.com/demo/bayanno/index.php?login/logout"> Logout &nbsp;<i class="fa fa-sign-out"></i>
						</a></li>
					</ul>
				</div>

			</div>

			<hr style="margin-top: 0px;" />
			<h3 style="margin: 20px 0px; color: #818da1; font-weight: 200;">
				<i class="entypo-right-circled"></i> Doctor
			</h3>

			<button onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/add_doctor/');" class="btn btn-primary pull-right">
				<i class="fa fa-plus"></i>&nbsp;Add Doctor
			</button>
			<div style="clear: both;"></div>
			<br>
			<table class="table table-bordered table-striped datatable" id="table-2">
				<thead>
					<tr>
						<th>Image</th>
						<th>Name</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Department</th>
						<th>Options</th>
					</tr>
				</thead>

				<tbody>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/1.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Micheal Pewd</td>
						<td>doctor@example.com</td>
						<td>+984-46-9388638</td>
						<td>Cardiology</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/1');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/1')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/2.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Erich Mcbride</td>
						<td>xidim@gmail.com</td>
						<td>+612-92-1385682</td>
						<td>Anesthetics</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/2');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/2')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/6.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Imogene Ellison</td>
						<td>daxi@hotmail.com</td>
						<td>+229-60-7458914</td>
						<td>Gastroenterology</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/6');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/6')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/3.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Bette Mathews</td>
						<td>daxi@hotmail.com</td>
						<td>+229-60-7458914</td>
						<td>Gastroenterology</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/3');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/3')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/4.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>John Snow</td>
						<td>doctor@example2.com</td>
						<td>+984-46-9388638</td>
						<td>Cardiology</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/4');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/4')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/5.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Chris Heisenberg</td>
						<td>xidim@gmail.com</td>
						<td>+612-92-1385682</td>
						<td>Anesthetics</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/5');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/5')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/7.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Jackques Nelson</td>
						<td>doctor@example4.com</td>
						<td>+984-46-9388638</td>
						<td>Cardiology</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/7');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/7')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/8.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Samuel Etto</td>
						<td>xidim@gmail.com</td>
						<td>+612-92-1385682</td>
						<td>Anesthetics</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/8');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/8')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/9.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Doctor Strange</td>
						<td>daxi@hotmail.com</td>
						<td>+229-60-7458914</td>
						<td>Gastroenterology</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/9');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/9')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/10.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Sophie Turner</td>
						<td>daxi@hotmail.com</td>
						<td>+229-60-7458914</td>
						<td>Gastroenterology</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/10');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/10')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/11.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Alicia Stone</td>
						<td>doctor@example3.com</td>
						<td>+984-46-9388638</td>
						<td>Cardiology</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/11');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/11')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>

					<tr>
						<td><img src="http://creativeitem.com/demo/bayanno/uploads/doctor_image/12.jpg" class="img-circle" width="40px" height="40px"></td>
						<td>Britney Spears</td>
						<td>xidim@gmail.com</td>
						<td>+612-92-1385682</td>
						<td>Anesthetics</td>
						<td><a onclick="showAjaxModal('http://creativeitem.com/demo/bayanno/index.php?modal/popup/edit_doctor/12');" class="btn btn-info btn-sm">
								<i class="fa fa-pencil"></i>&nbsp;Edit
						</a> <a onclick="confirm_modal('http://creativeitem.com/demo/bayanno/index.php?admin/doctor/delete/12')" class="btn btn-danger btn-sm"> <i
								class="fa fa-trash-o"></i>&nbsp;Delete
						</a></td>
					</tr>
				</tbody>
			</table>

			<script type="text/javascript">
				jQuery(window)
						.load(
								function() {
									var $ = jQuery;

									$("#table-2")
											.dataTable(
													{
														"sPaginationType" : "bootstrap",
														"sDom" : "<'row'<'col-xs-3 col-left'l><'col-xs-9 col-right'<'export-data'T>f>r>t<'row'<'col-xs-3 col-left'i><'col-xs-9 col-right'p>>"
													});

									$(".dataTables_wrapper select").select2({
										minimumResultsForSearch : -1
									});

									// Highlighted rows
									$("#table-2 tbody input[type=checkbox]")
											.each(
													function(i, el) {
														var $this = $(el), $p = $this
																.closest('tr');

														$(el)
																.on(
																		'change',
																		function() {
																			var is_checked = $this
																					.is(':checked');

																			$p[is_checked ? 'addClass'
																					: 'removeClass']
																					('highlight');
																		});
													});

									// Replace Checboxes
									$(".pagination a").click(function(ev) {
										replaceCheckboxes();
									});
								});
			</script>
			<!-- Footer -->
			<footer class="main">
				&copy; 2017 <strong>Bayanno Hospital Management System</strong> <strong class="pull-right"> VERSION 4.0</strong> Developed by <a
					href="http://creativeitem.com" target="_blank">Creativeitem</a>
			</footer>

		</div>

	</div>
	<script type="text/javascript">
		function showAjaxModal(url) {
			// SHOWING AJAX PRELOADER IMAGE
			jQuery('#modal_ajax .modal-body')
					.html(
							'<div style="text-align:center;margin-top:200px;"><img src="assets/images/preloader.gif" style="height:25px;" /></div>');

			// LOADING THE AJAX MODAL
			jQuery('#modal_ajax').modal('show', {
				backdrop : 'true'
			});

			// SHOW AJAX RESPONSE ON REQUEST SUCCESS
			$.ajax({
				url : url,
				success : function(response) {
					jQuery('#modal_ajax .modal-body').html(response);
				}
			});
		}
	</script>

	<!-- (Ajax Modal)-->
	<div class="modal fade" id="modal_ajax">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title">Bayanno Hospital Management System</h4>
				</div>

				<div class="modal-body" style="height: 500px; overflow: auto;"></div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>




	<script type="text/javascript">
		function confirm_modal(delete_url) {
			jQuery('#modal-4').modal('show', {
				backdrop : 'static'
			});
			document.getElementById('delete_link').setAttribute('href',
					delete_url);
		}
	</script>

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

	<!--    custom width modal -->

	<script type="text/javascript">
		function showCustomWidthModal(url) {
			// SHOWING AJAX PRELOADER IMAGE
			jQuery('#modal-2 .modal-body')
					.html(
							'<div style="text-align:center;margin-top:200px;"><img src="assets/images/preloader.gif" style="height:25px;" /></div>');

			// LOADING THE AJAX MODAL
			jQuery('#modal-2').modal('show', {
				backdrop : 'true'
			});

			// SHOW AJAX RESPONSE ON REQUEST SUCCESS
			$.ajax({
				url : url,
				success : function(response) {
					jQuery('#modal-2 .modal-body').html(response);
				}
			});
		}
	</script>

	<div class="modal fade custom-width" id="modal-2">
		<div class="modal-dialog" style="width: 75%;">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title">Bayanno Hospital Management System</h4>
				</div>

				<div class="modal-body"></div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
	<link rel="stylesheet" href="assets/js/daterangepicker/daterangepicker-bs3.css">

	<link rel="stylesheet" href="assets/js/selectboxit/jquery.selectBoxIt.css">

	<link rel="stylesheet" href="assets/js/wysihtml5/bootstrap-wysihtml5.css">
	<link rel="stylesheet" href="assets/js/selectboxit/jquery.selectBoxIt.css">
	<link rel="stylesheet" href="assets/js/datatables/responsive/css/datatables.responsive.css">
	<link rel="stylesheet" href="assets/js/select2/select2-bootstrap.css">
	<link rel="stylesheet" href="assets/js/select2/select2.css">

	<!-- Bottom Scripts -->
	<script src="assets/js/gsap/main-gsap.js"></script>
	<script src="assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js"></script>
	<script src="assets/js/bootstrap.js"></script>
	<script src="assets/js/joinable.js"></script>
	<script src="assets/js/resizeable.js"></script>
	<script src="assets/js/neon-api.js"></script>
	<script src="assets/js/bootstrap-switch.min.js"></script>
	<script src="assets/js/toastr.js"></script>
	<script src="assets/js/jquery.validate.min.js"></script>
	<script src="assets/js/fullcalendar/fullcalendar.min.js"></script>
	<script src="assets/js/bootstrap-datepicker.js"></script>
	<script src="http://creativeitem.com/demo/bayanno/assets/js/bootstrap-timepicker.min.js"></script>
	<script src="assets/js/fileinput.js"></script>
	<script src="assets/js/wysihtml5/wysihtml5-0.4.0pre.min.js"></script>
	<script src="assets/js/wysihtml5/bootstrap-wysihtml5.js"></script>
	<script src="assets/js/jquery.multi-select.js"></script>
	<script src="assets/js/jquery.knob.js"></script>
	<script src="assets/js/selectboxit/jquery.selectBoxIt.min.js"></script>
	<script src="assets/js/jquery.inputmask.bundle.min.js"></script>
	<script src="assets/js/daterangepicker/moment.min.js"></script>
	<script src="assets/js/daterangepicker/daterangepicker.js"></script>
	<script src="assets/js/dropzone/dropzone.js"></script>
	<script src="assets/js/jquery.dataTables.min.js"></script>
	<script src="assets/js/datatables/TableTools.min.js"></script>
	<script src="assets/js/dataTables.bootstrap.js"></script>
	<script src="assets/js/datatables/jquery.dataTables.columnFilter.js"></script>
	<script src="assets/js/datatables/lodash.min.js"></script>
	<script src="assets/js/datatables/responsive/js/datatables.responsive.js"></script>
	<script src="assets/js/select2/select2.min.js"></script>
	<script src="assets/js/neon-calendar.js"></script>
	<script src="assets/js/neon-chat.js"></script>
	<script src="assets/js/neon-custom.js"></script>
	<script src="assets/js/neon-demo.js"></script>
	<script src="assets/js/neon-notes.js"></script>
	<script src="assets/js/jquery.form.js"></script>
	<script src="assets/js/ajax-form-submission.js"></script>

	<script>
		$(".html5editor").wysihtml5();
	</script>



</body>
</html>
