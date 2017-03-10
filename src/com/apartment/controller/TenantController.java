package com.apartment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apartment.service.TenantService;
import com.apartment.vo.Tenant;

@Controller
@RequestMapping("/tenant")
public class TenantController {

	@Autowired
	TenantService theTenantService;
	
	@RequestMapping(value="/tenantHome", method = RequestMethod.GET)
	public String tenantHome(ModelMap model, HttpServletRequest request) {
		System.out.println("////////////////Inside Tenant Controller////////////////");
//		System.out.println("(String) request.getSession().getAttribute('stenantId')"+ (String) request.getSession(false).getAttribute("slogin"));
		Tenant tenant = theTenantService.getProfileById((Integer.parseInt((String) request.getSession(false).getAttribute("stenantId"))) );
//		Tenant tenant = theTenantService.getProfileById((String) request.getSession().getAttribute("stenantId") );

		System.out.println("Tenant Information....." + tenant.toString());
		model.addAttribute("tenantInfoPage", tenant);
		return "tenantHome";
	}	

	
	@RequestMapping(value="/updateTenantMain", method = RequestMethod.GET)
	public String updateTenantForm(@RequestParam("id") int id,ModelMap model, HttpServletRequest request) {
		System.out.println("==============================================================");
		System.out.println("Inside GET of updateTenantMain  page");
		System.out.println("tenantId is ..." +id );
		Tenant t2 = theTenantService.getProfileById(id);	
		System.out.println("New value of tenant is ...." + t2.toString());
		model.addAttribute("tenantInfoPage", t2);
		return "updateTenantMain";
	}
	
	@RequestMapping(value="/updateTenantMain", method = RequestMethod.POST)
	public String updateTenantSuccess(@RequestParam("id") String id,@ModelAttribute("commandupdateTenant")Tenant t, ModelMap model, HttpServletRequest request) {
		t.setId(id);
		theTenantService.updateTenantProfile(t);
		model.addAttribute("tenantInfoPage", t);
		System.out.println("New value of tenant is ...." + t.toString());
		return "tenantHome";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response){
//		   String view = "login.jsp";
		   request.getSession().invalidate();
//		   return view;
		   return "redirect:/login";
	}
	
}
