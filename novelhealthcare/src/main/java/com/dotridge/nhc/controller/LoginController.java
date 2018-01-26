package com.dotridge.nhc.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.nhc.model.HospitalBean;
import com.dotridge.nhc.service.HospitalService;

/**
 * The Class LoginController.
 */
@Controller
public class LoginController {

	public static Logger log=Logger.getLogger(LoginController.class);
	/** The user service. 

	/** The hospital service. */
	@Autowired
	private HospitalService hospitalService;

	/**
	 * Show login form.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/loginPage" }, method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		if(log.isDebugEnabled())
		{
		log.debug("[show loginform handler method]--> execution started..!");
		log.info("loginPage handler rendering requested view page");
		}
		return "loginpage/loginPage";
	}

	/*
	 * @RequestMapping(value = { "/login" }, method = RequestMethod.POST) public
	 * String submitLoginForm(@Valid @ModelAttribute("loginForm") LoginBean
	 * loginForm, BindingResult result, HttpServletRequest request, Model model)
	 * { String viewPage = null; if (result.hasErrors()) { viewPage =
	 * "loginpage/loginPage"; } else { Object[] userDetials =
	 * userService.getUserDetials(loginForm.getUserName()); if
	 * (userDetials.length != 0 &&
	 * userDetials[0].equals(loginForm.getUserName()) &&
	 * userDetials[1].equals(loginForm.getPassword())) {
	 * request.getSession(true).setAttribute("name", userDetials[0]); switch
	 * ((String) userDetials[2]) { case "superadmin": viewPage =
	 * superAdminDashBoard(model); break; case "admin": viewPage =
	 * "admin/superadmin"; break;
	 * 
	 * default: break; } }
	 * 
	 * else { model.addAttribute("msg", "invalid username (or) password");
	 * viewPage = "loginpage/loginPage"; }
	 * 
	 * } return viewPage;
	 * 
	 * }
	 */

	/**
	 * Logout action.
	 *
	 * @param request
	 *            the request
	 * @return the string
	 */
	/*@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public String logoutAction(HttpServletRequest request, Model model) {
		if (request.getSession(false) != null) {
			request.getSession(false).invalidate();
			model.addAttribute("loginForm", new LoginBean());
			return "redirect:/";
		} else {
			System.out.println("logout failed");
			return null;
		}
	}
*/
	@RequestMapping(value = { "/dashboard" }, method = RequestMethod.GET)
	public String superAdminDashBoard(Model model,HttpServletRequest request,Authentication authentication) {
		log.debug("[superadmin dashboard handler method]--> execution started..!");
		log.debug("retrieving authenticated user principal from request scope");
	    Principal userPrincipal = request.getUserPrincipal();
	    if(userPrincipal!=null)
	    log.info("retrived userPrincipal object from request scope ");
		String viewPage = null;
		log.debug("getting all hospitals to show on superadmin dashboard");
		List<HospitalBean> allHospitals = hospitalService.getAllHospitals();
		if (allHospitals != null) {
			log.info("successfully rerived existed hospitals ");
			log.info("retrived hospitals from database are:"+allHospitals.toString() );
			model.addAttribute("totalhospitals", allHospitals.size());
			log.debug("binding count of hospitals to model object");
			model.addAttribute("name", userPrincipal.getName());
			log.debug("binding user name  to model object");
			viewPage = "superadmin/superAdminDashBoard";
			
		}
		log.debug("handovering view page and model object to viewResolver");
		return viewPage;
		
	}

}
