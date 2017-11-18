package com.dotridge.nhc.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dotridge.nhc.command.LoginForm;
import com.dotridge.nhc.entity.User;
import com.dotridge.nhc.service.UserService;
import com.dotridge.nhc.util.StringUtil;


/**
 * The Class LoginController
 */
@Controller
public class LoginController {

  /** The user service. */
  @Autowired
  private UserService userService;

  /**
   * Show login form.
   *
   * @param model the model
   * @return the string
   */
  @RequestMapping(value = {"/loginForm"}, method = RequestMethod.GET)
  public String showLoginForm(Model model) {
    model.addAttribute("loginForm", new LoginForm());
    return "login";
  }

  /**
   * Submit login form.
   *
   * @param loginForm the login form
   * @param result the result
   * @param request the request
   * @return the string
   */
  @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
  public String submitLoginForm(@ModelAttribute("loginForm") LoginForm loginForm,
      BindingResult result, HttpServletRequest request, Model model) {
    String viewPage = null;
    validatLogineForm(loginForm, result);
    if (result.hasErrors()) {
      viewPage = "login";
    } else {
      User user = userService.getUserByName(loginForm.getUserName());
      if (user.getUserName().equals(loginForm.getUserName())
          && user.getPassword().equals(loginForm.getPassword())) {
        request.getSession(true).setAttribute("name", user.getFullName());
        switch (user.getRole()) {
          case "superadmin":
            viewPage = "superadmin";
            break;
          case "admin":
            viewPage = "admin";
            break;

          default:
            System.out.println("user role not found..");
            break;
        }
      }

    }
    return viewPage;

  }


  /**
   * Validate form.
   *
   * @param loginForm the login form
   * @param result the result
   */
  private void validatLogineForm(LoginForm loginForm, BindingResult result) {
    validateUserName(loginForm.getUserName(), result);

    validatePassword(loginForm.getPassword(), result);
  }

  private void validatePassword(String password, BindingResult result) {
    if (StringUtil.isEmptyOrNull(password)) {
      result.rejectValue("password", "loginForm.password.empty", "Please enter password");
    }
  }

  private void validateUserName(String userName, BindingResult result) {
    if (StringUtil.isEmptyOrNull(userName)) {
      result.rejectValue("userName", "loginForm.userName.empty", "Please enter username");
    } /*
       * else if (!StringUtil.isValidEmail(userName)) { result.rejectValue("userName",
       * "loginForm.userName.invalid.email", "Please enter valid email"); }
       */
  }
}
