package com.apartment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apartment.service.FloorService;
import com.apartment.vo.Floor;

@Controller
@RequestMapping("/floorPlan")
public class FloorController {	
	
	@Autowired
	FloorService theFloorService;
	
	@RequestMapping(value="/floorPlan", method = RequestMethod.GET)
	public String getFloor(ModelMap model) {
		System.out.println("Inside Floor GET");
		List<Floor> floorList = theFloorService.getFloorList();
		/*List<Tenant> tenantList = theTenantService.getTenantList();*/
		System.out.println("=====" + floorList.toString());
		model.addAttribute("floorList", floorList);
		return "floorPlan";		
	}	
	
}
