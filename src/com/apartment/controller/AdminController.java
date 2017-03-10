package com.apartment.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.apartment.service.AdminService;
import com.apartment.service.ApartmentService;
import com.apartment.service.ModelService;
import com.apartment.service.TenantService;
import com.apartment.vo.Admin;
import com.apartment.vo.Apartment;
import com.apartment.vo.Model;
import com.apartment.vo.Tenant;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired 
	AdminService theAdminService;
	
	@Autowired
	TenantService theTenantService;
	
	@Autowired
	ApartmentService theApartmentService;
	
	@Autowired
	ModelService theModelService;
	
	// To go Admin Home Page
	@RequestMapping(value="/adminHome", method = RequestMethod.GET)
	public String adminHome(ModelMap model, HttpServletRequest request) {
		System.out.println("============ AdminController ======= adminHome====GET=======");
		System.out.println("Inside Admin GET");
		Admin admin =  theAdminService.getProfileById(Integer.parseInt((String) request.getSession().getAttribute("sadminId")));
		model.addAttribute("adminInfoPage", admin);
		System.out.println("Admin Data is ....." + admin.toString());
		return "adminHome";
	}
	
	
	@RequestMapping(value="/getAllTenant", method = RequestMethod.GET)
	public String getAllTenant(ModelMap model, HttpServletRequest request) {
		System.out.println("============ AdminController ======= getAllTenant =======GET=====");
//		System.out.println("");
		List<Tenant> tenantList = theTenantService.getTenantList();
		model.addAttribute("tenantList", tenantList);
		//model.addAllAttributes(tenantList);
		return "allTenant";
	}
	
	@RequestMapping(value="/getParticularTenant",  method=RequestMethod.GET)
	public String getParticularTenant(ModelMap model) {
		Tenant t = new Tenant();
		model.addAttribute("getParticularTenant", t);		
		return "getParticularTenant";
	}
		
	@RequestMapping(value="/getParticularTenant",  method=RequestMethod.POST)
	public String getParticularTenantRecord(@ModelAttribute("commandGetParticularTenant")Tenant t, ModelMap model) {
		int id =(Integer.parseInt( (String) t.getId()));
		Tenant tenant = theTenantService.getProfileById(id);
		System.out.println("Tenant Information....." + tenant.toString());
		model.addAttribute("tenantInfoPage", tenant);		
		return "tenantHome";
	}
	
		
	@RequestMapping(value="/addNewTenant",  method=RequestMethod.GET)
	public String addNewTenantForm(ModelMap model) {
		System.out.println("============addNewTenant===GET===START====");
		Tenant t = new Tenant(true);
		
		model.addAttribute("tenantInfoPage", t);	
		System.out.println("============addNewTenant===GET===end====");
		return "addNewTenant";
	}
		
	@RequestMapping(value="/addNewTenant",  method=RequestMethod.POST)
	public String addNewTenantSuccess(@ModelAttribute("commandAddNewTenant")Tenant t, ModelMap model) {
		System.out.println("============addNewTenant==========POST=======");		
		theTenantService.addNewTenant(t );
		System.out.println("Tenant Information....." + t.toString());
		model.addAttribute("tenantInfoPage", t);		
		return "tenantHome";
	}
	
	
	@RequestMapping(value="/getParticularApartment",  method=RequestMethod.GET)
	public String getParticularApartment(ModelMap model) {
		System.out.println("============getParticularApartment==========Get=======");
		Apartment a = new Apartment();
		model.addAttribute("apartment", a);
		Model m = new Model();
		model.addAttribute("model", m);
		return "getParticularApartment";
	}
		
	@RequestMapping(value="/getParticularApartment",  method=RequestMethod.POST)
	public String getParticularApartmentRecord(@ModelAttribute("apartment")Apartment a, @ModelAttribute("model")Model m,  ModelMap model) {
	
		System.out.println("============getParticularApartment==========POST=======");
		System.out.println(a.getId());
		Apartment a1 = theApartmentService.getApartmentInfo(a.getId());
		System.out.println("Apartment Information....." + a1.toString());
		model.addAttribute("apartment", a1);
//		Model m = (Model) model.get("model");
		return "getParticularApartment";
	}
	
	@RequestMapping(value="/allApartment",  method=RequestMethod.GET)
	public String getAllApartment (ModelMap model) {
		System.out.println("============getAllApartment==========GET=======");

		List<Apartment> list = theApartmentService.getApartmentList();
		model.addAttribute("apartmentList", list);		
		return "allApartment";
	}
	
	@RequestMapping(value="/allApartment",  method=RequestMethod.POST)
	public String getAllApartment( ModelMap model, HttpServletRequest request) {
		System.out.println("============getAllApartment==========post=======");
		int searchId  = Integer.parseInt(request.getParameter("apartmentId"));
		
		List<Apartment> list = null;
		if (searchId != 0) {
			Apartment a1 = theApartmentService.getApartmentInfo(searchId);
			list = new ArrayList<Apartment>();
			list.add(a1);
			System.out.println("Apartment Information....." + a1.toString());
		} else {
			 list = theApartmentService.getApartmentList();
		}
		model.addAttribute("apartmentList", list);	
		return "allApartment";
	}
	
	@RequestMapping(value="/getParticularModel",  method=RequestMethod.GET)
	public String getParticularModel(ModelMap model) {
		System.out.println("============getParticularModel==========Get=======");
		Model myModel = new Model();
		model.addAttribute("model", myModel);		
		return "getParticularModel";
	}
		
	@RequestMapping(value="/getParticularModel",  method=RequestMethod.POST)
	public String getParticularModelRecord(@ModelAttribute("commandGetParticularModel")Model myModel, ModelMap model) {
		System.out.println("============getParticularModel==========POST=======");
		Model m = theModelService.getModel(myModel.getId());
		System.out.println("Model Information ==========  getParticularModel ==========" + m.toString());
		model.addAttribute("model", m);
		return "getParticularModel";
	}
	
	@RequestMapping(value="/getAllModel",  method=RequestMethod.GET)
	public String getAllModel(ModelMap model) {
		System.out.println("============getAllModel==========GET=======");
		List<Model> modelList = theModelService.getModelList();
		model.addAttribute("modelList", modelList);		
		return "allModel";
	}
		
	@RequestMapping(value="/updateTenantMain", method = RequestMethod.GET)
	public String updateTenantForm(@RequestParam("id") int id, ModelMap model, HttpServletRequest request) {
		System.out.println("==============================================================");
		System.out.println("Inside GET of updateTenantMain  page");
//		System.out.println("tenantId is ..." +(String) request.getSession().getAttribute("stenantId") );
		//Tenant t2 = theTenantService.getProfileById((Integer.parseInt( (String) request.getSession().getAttribute("stenantId"))));	
		//System.out.println("New value of tenant is ...." + t2.toString());
		//model.addAttribute("tenantInfoPage", t2);
		return "redirect:/tenant/updateTenantMain?id="+id;
	}


	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response){
//		   String view = "login.jsp";
		   request.getSession().invalidate();
//		   return view;
		   return "redirect:/login";
	}
	
	
	/*@RequestMapping(value="/mapDirection", method = RequestMethod.GET)
	public String mapDirection(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("============ AdminController ======= getMap =======GET=====");
		System.out.println("[[[[[[[[[[[[[");
		request.getMethod();
		return "redirect:/mapDirection";
	}*/
	
	@RequestMapping(value="/amenities", method = RequestMethod.GET)
	public String amenities() {
		System.out.println("============ AdminController ======= getMap =======GET=====");
		System.out.println("[[[[[[[[[[[[[");		
		return "amenities";
	}
	
	
}
