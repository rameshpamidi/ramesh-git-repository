package com.dotridge.nhc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.nhc.model.HospitalBean;
import com.dotridge.nhc.service.HospitalService;


/**
 * The Class HomeController.
 */
@Controller
public class HomeController {

	/** The hospital service. */
	@Autowired
	private HospitalService hospitalService;

	/**
	 * Superadmin home page.
	 *
	 * @param model the model
	 * @param request the request
	 * @return the string
	 */
	@RequestMapping(value = { "/superadminhome" }, method = RequestMethod.GET)
	public String superadminHomePage(Model model, HttpServletRequest request) {
		List<HospitalBean> allHospitals = hospitalService.getAllHospitals();
		model.addAttribute("totalhospitals", allHospitals.size());
		return "superadmin/superadmin_home";
	}
}
