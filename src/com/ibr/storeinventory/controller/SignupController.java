package com.ibr.storeinventory.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibr.storeinventory.bo.UserBO;
import com.ibr.storeinventory.services.UserService;
import com.ibr.storeinventory.services.exception.BusinessException;
import com.ibr.storeinventory.ui.form.LoginForm;
import com.ibr.storeinventory.ui.form.UserSignupForm;

@Controller("signupController")
public class SignupController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/viewsignup",method=RequestMethod.GET)
	public ModelAndView viewSignUp()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SignUp");
		mv.getModelMap().put("UserSignupForm", new UserSignupForm());
		return mv;
	}

	@RequestMapping(value="signup",method=RequestMethod.POST)
	public String signUp(@ModelAttribute("UserSignupForm") @Valid UserSignupForm userSignupForm, BindingResult result, ModelMap model)
	{
		
		if(result.hasErrors())
		{
			model.addAttribute("UserSignupForm", userSignupForm);
			return "SignUp";
		}
		
		UserBO userBO = convertFormToUserBO(userSignupForm);
		try{
			userService.signUp(userBO);
			model.addAttribute("LoginForm", new LoginForm());
			return "Login";
		}
		catch(BusinessException signUpEx)
		{
			model.addAttribute("UserSignupForm", userSignupForm);
			return "SignUp";
		}
		catch(Exception ex)
		{
			return "GlobalErrorPage";
		}
	}

	private UserBO convertFormToUserBO(UserSignupForm userSignupForm) {
		UserBO userBO = new UserBO();
		userBO.setEmailId(userSignupForm.getEmailId());
		userBO.setAge(userSignupForm.getAge());
		userBO.setFirstName(userSignupForm.getFirstName());
		userBO.setMiddleName(userSignupForm.getMiddleName());
		userBO.setLastName(userSignupForm.getLastName());
		userBO.setOccupation(userSignupForm.getOccupation());
		userBO.setPassword(userSignupForm.getPassword());
		return userBO;
	}
}
