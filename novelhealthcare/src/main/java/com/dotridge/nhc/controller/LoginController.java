package com.dotridge.nhc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.nhc.model.HospitalBean;
import com.dotridge.nhc.model.LoginBean;
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
	@RequestMapping(value = { "/loginPage" }, method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		//model.addAttribute("loginForm", new LoginBean());
		return "loginpage/loginPage";
	}

	/*@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String submitLoginForm(@Valid @ModelAttribute("loginForm") LoginBean loginForm, BindingResult result,
			HttpServletRequest request, Model model) {
		String viewPage = null;
		if (result.hasErrors()) {
			viewPage = "loginpage/loginPage";
		} else {
			Object[] userDetials = userService.getUserDetials(loginForm.getUserName());
			if (userDetials.length != 0 && userDetials[0].equals(loginForm.getUserName()) 
					&& userDetials[1].equals(loginForm.getPassword())) {
				request.getSession(true).setAttribute("name", userDetials[0]);
				switch ((String) userDetials[2]) {
				case "superadmin":
					viewPage = superAdminDashBoard(model);
					break;
				case "admin":
					viewPage = "admin/superadmin";
					break;

				default:
					break;
				}
			}

			else {
				model.addAttribute("msg", "invalid username (or) password");
				viewPage = "loginpage/loginPage";
			}

		}
		return viewPage;

	}*/

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
			model.addAttribute("loginForm", new LoginBean());
			return "redirect:/";
		} else {
			System.out.println("logout failed");
			return null;
		}
	}

	@RequestMapping(value = { "/dashboard" }, method = RequestMethod.GET)
	public String superAdminDashBoard(Model model) {
		String viewPage = null;
		List<HospitalBean> allHospitals = hospitalService.getAllHospitals();
		if (allHospitals != null) {
			model.addAttribute("totalhospitals", allHospitals.size());
			viewPage = "superadmin/superAdminDashBoard";
		}
		return viewPage;
	}

}
