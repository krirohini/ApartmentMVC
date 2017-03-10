package com.apartment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MiscellaneousController {	
	
	@RequestMapping(value="/mapDirection", method = RequestMethod.GET)
	public String mapDirection() {
		System.out.println("============ Controller ======= getMap =======GET=====");
		System.out.println("[[[[[[[[[[[[[");		
		return "mapDirection";
	}
	
	@RequestMapping(value="/photosOrVideos", method = RequestMethod.GET)
	public String photosOrVideos() {
		System.out.println("============ Controller ======= getphotosOrVideos =======GET=====");
		 return "photosOrVideos";
	}
	
}
