package com.apartment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apartment.service.LoginService;
import com.apartment.vo.Login;

@Controller
public class LoginController {
	
	//TODO: will check with Dhamu 
	//private BeanValidator beanValidator = new BeanValidator(new AnnotationBeanValidationConfigurationLoader());
	// form validation at client side 	
	@Autowired
	LoginService theloginService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("Inside login GET");
		Login login = new Login();
		model.addAttribute("login", login);
		return "login";
	}	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginSuccess(@ModelAttribute("login") Login l, ModelMap model, HttpServletRequest request) {		
		
		System.out.println("////////////////");
		HttpSession session = request.getSession();
		session.setAttribute("slogin", l.getLoginName());
		
		System.out.println("Hello");
		Login login = theloginService.authenticateAndReturnRole(l.getLoginName(), l.getPassword());
		if ( login ==null ) {
			model.addAttribute("loginFailed", "YES");
			return "login";
		}
				
		String role = login.getRole();
		session.setAttribute("srole", role);		
		
		System.out.println("Inside login POST");
		
		
		if("TENANT".equalsIgnoreCase(role)){
			System.out.println("Role is ... "+ role);
			session.setAttribute("stenantId", login.getTenantId());			
			System.out.println("exit  login post ");
			return "redirect:/tenant/tenantHome";
		}
		else if ("ADMIN".equalsIgnoreCase(role)) {
			System.out.println("Role is ... "+ role);
			System.out.println("AdminId is ....." + login.getAdminId());
			session.setAttribute("sadminId", login.getAdminId());
			
			System.out.println("exit  login post ");
			return "redirect:/admin/adminHome";
		} 
		else {
			return "login";
		}
		//VALIDATION FOR 
	}	

	
//	@RequestMapping(value="/logout", method = RequestMethod.GET)
//	public String logoutSuccess(HttpServletRequest request, HttpServletResponse response){
////		   String view = "login.jsp";
//		   request.getSession().invalidate();
//		   return "redirect:/login";
//	}
	
}
