package com.sathya.spring.mvc;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
@RequestMapping(value="/login", method=RequestMethod.GET)
public ModelAndView getLoginPage()
{
	
	return new ModelAndView("login","u",new Login());
	
	
}
@RequestMapping(value="/check",method=RequestMethod.POST)
public ModelAndView 
checkLogin(@Valid@ModelAttribute("u")Login user,BindingResult br)
{
	if(br.hasErrors())
	{
		
		return new ModelAndView("login");
		
		
	}
	else
	{
		
		String uname=user.getUname();
	    String pwd=user.getPwd();
	
	if(uname.equals("Sathya")&&pwd.equals("java"))
	 return new ModelAndView("success","msg","Valid User........");
	else
		return new ModelAndView("failure","msg","Invalid User");
	
	
}

}
}