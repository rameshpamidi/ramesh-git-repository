package com.dotridge.nhc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dotridge.nhc.model.AdminBean;
import com.dotridge.nhc.model.HospitalBean;
import com.dotridge.nhc.service.AdminService;
import com.dotridge.nhc.service.HospitalService;

/**
 * The Class AdminController.
 */
@Controller
public class AdminController {

	/** The admin service. */
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private HospitalService hospitalService;

	/**
	 * Show add admin page.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/addAdminPage" }, method = RequestMethod.GET)
	public String showAddAdminPage(Model model) {
		
		List<HospitalBean> allHospitals = hospitalService.getAllHospitals();
		Map<Integer,String> hospitalNames=new HashMap<Integer,String>();
		for (HospitalBean hospitalBean : allHospitals) {
			hospitalNames.put(hospitalBean.getHospitalId(),hospitalBean.getHospitalName());
		}
		model.addAttribute("adminBean", new AdminBean());
		model.addAttribute("hospitalNames", hospitalNames);
		return "superadmin/addAdminPage";
	}

	/**
	 * Adds the admin handler.
	 *
	 * @param adminBean
	 *            the admin bean
	 * @param bindingResult
	 *            the binding result
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/addAdmin" }, method = RequestMethod.POST)
	public String addAdminHandler(@Valid @ModelAttribute("adminBean") AdminBean adminBean, BindingResult bindingResult,
			Model model) {
		String viewPage = null;
		if (bindingResult.hasErrors()) {
			viewPage = "superadmin/addAdminPage";
		} else {
			AdminBean addedAdmin = adminService.addAdmin(adminBean);
			if (addedAdmin.getAdminId() != 0) {
				viewPage = viewAllAdminsHandler(model);
			} else {
				model.addAttribute("adminAddActionFailureMsg", "adding of admin failed");
				viewPage = showAddAdminPage(model);
			}
		}
		return viewPage;
	}

	/**
	 * Show update admin page.
	 *
	 * @param adminId
	 *            the admin id
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/updateAdminPage" }, method = RequestMethod.GET)
	public String showUpdateAdminPage(@RequestParam("adminId") int adminId, Model model) {
		AdminBean adminBean = adminService.getAdminById(adminId);
		model.addAttribute("adminBean", adminBean);
		return "superadmin/updateAdminPage";
	}

	/**
	 * Update admin handler.
	 *
	 * @param adminBean
	 *            the admin bean
	 * @param bindingResult
	 *            the binding result
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/updateAdmin" }, method = RequestMethod.POST)
	public String updateAdminHandler(@Valid @ModelAttribute("adminBean") AdminBean adminBean,
			BindingResult bindingResult, Model model) {

		String viewPage = null;
		if (bindingResult.hasErrors()) {
			viewPage = "superadmin/updateAdminPage";
		} else {
			AdminBean updatedAdmin = adminService.updateAdmin(adminBean);
			if (updatedAdmin != null) {
				viewPage = viewAllAdminsHandler(model);
			} else {
				model.addAttribute("adminUpdatedActionFailureMsg", "update of admin failed");
				viewPage = showAddAdminPage(model);
			}
		}
		return viewPage;
	}

	/**
	 * Delete admin handler.
	 *
	 * @param adminId
	 *            the admin id
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/deleteAdmin" }, method = RequestMethod.POST)
	public String deleteAdminHandler(@RequestParam("adminId") int adminId, Model model) {
		adminService.deleteAdmin(adminId);
		return viewAllAdminsHandler(model);
	}

	/**
	 * View all admins handler.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/viewalladmins" }, method = RequestMethod.GET)
	public String viewAllAdminsHandler(Model model) {
		List<AdminBean> allAdmins = adminService.getAllAdmins();
		
		model.addAttribute("admins", allAdmins);
		
		return "superadmin/viewAdminsPage";
	}

}
