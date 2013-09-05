package com.ibr.storeinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibr.storeinventory.services.UserService;
import com.ibr.storeinventory.ui.form.LoginForm;

@Controller("loginController")
public class LoginController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("LoginForm") LoginForm loginForm,BindingResult bindingResult)
	{
		ModelAndView mv = new ModelAndView();
		if(userService.login(loginForm.getEmailId(),loginForm.getPassword()))
		{
			mv.setViewName("Home");
		}
		else
		{
			bindingResult.rejectValue("emailId", "error.invalidLoginCredentials");
			mv.setViewName("Login");
		}
		return mv;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView showLogin()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login");
		mv.getModelMap().put("LoginForm", new LoginForm());
		return mv;
	}
	
}
