package com.eni.SpringCity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eni.SpringCity.service.contrat.CityService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class AccueilController {
	@Autowired
	CityService cityService;
	
	@GetMapping("/")
	public ModelAndView detailCity() {
		ModelAndView mav = new ModelAndView("detail-city");
		
		mav.addObject("city", cityService.findCityById(1) );
		
		return mav;
	}

}
