package com.dotridge.nhc.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.nhc.entity.User;
import com.dotridge.nhc.model.HospitalForm;
import com.dotridge.nhc.model.LoginForm;
import com.dotridge.nhc.service.HospitalService;
import com.dotridge.nhc.service.UserService;

/**
 * The Class LoginController.
 */
@Controller
public class LoginController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
	}

	/** The user service. */
	@Autowired
	private UserService userService;

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
	@RequestMapping(value = { "/loginForm" }, method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		model.addAttribute("loginForm", new LoginForm());
		return "loginpage/loginPage";
	}

	/**
	 * Submit login form.
	 *
	 * @param loginForm
	 *            the login form
	 * @param result
	 *            the result
	 * @param request
	 *            the request
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String submitLoginForm(@Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult result,
			HttpServletRequest request, Model model) {
		String viewPage = null;
		if (result.hasErrors()) {
			viewPage = "loginpage/loginPage";
		} else {
			User user = userService.getUserByName(loginForm.getUserName());
			if (user!=null&&user.getUserName().equals(loginForm.getUserName())
					&& user.getPassword().equals(loginForm.getPassword())) {
				request.getSession(true).setAttribute("name", user.getFullName());
				switch (user.getRole()) {
				case "superadmin":
					viewPage =superAdminDashBoard(model);
					break;
				case "admin":
					viewPage = "admin/superadmin";
					break;

				default:
					System.out.println("user role not found..");
					break;
				}
			}
			else
			{
				model.addAttribute("msg", "invalid username (or) password");
				viewPage="loginpage/loginPage";
			}

		}
		return viewPage;

	}

	/**
	 * Logout action.
	 *
	 * @param request
	 *            the request
	 * @return the string
	 */
	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public String logoutAction(HttpServletRequest request, Model model) {
		if (request.getSession(false) != null) {
			request.getSession(false).invalidate();
			model.addAttribute("loginForm", new LoginForm());
			return "loginpage/loginPage";
		} else {
			System.out.println("logout failed");
			return null;
		}
	}
	
	@RequestMapping(value={"/dashboard"},method=RequestMethod.GET)
	public String superAdminDashBoard(Model model)
	{
		String viewPage=null;
		List<HospitalForm> allHospitals = hospitalService.getAllHospitals();
		if (allHospitals != null) {
			model.addAttribute("totalhospitals", allHospitals.size());
			viewPage="superadmin/superAdminDashBoard";
		}
		return viewPage;
	}
	

}
