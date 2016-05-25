package controller;

import model.User;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import validator.UserValidator;

@Controller
public class UserController
{
	
	UserValidator validator;
	
	public UserController(UserValidator validator)
	{
		super();
		this.validator = validator;
	}
	
	@RequestMapping("/showForm")
	public ModelAndView viewForm()
	{
		return new ModelAndView("showForm.jsp", "jaiHo", new User());
	}
	
	@RequestMapping("/mvcForm")
	public ModelAndView viewResult(@ModelAttribute("hi") User user, BindingResult result)
	{
		validator.validate(user, result);
		
		if (result.hasErrors())
		{
			return new ModelAndView("showForm.jsp", "jaiHo", user);
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayName.jsp");
		return mv;
	}
}
