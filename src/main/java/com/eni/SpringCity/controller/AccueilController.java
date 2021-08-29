package com.eni.SpringCity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eni.SpringCity.model.City;
import com.eni.SpringCity.service.contrat.CityService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class AccueilController {
	@Autowired
	CityService cityService;
	
	@GetMapping("/{id}")
	public ResponseEntity<City> getCIty(@PathVariable("id") int id){
		Optional<City> city = cityService.findCityById(id);
		
		// Réponse à retourner en fonction du status de la requête
		if (city.isPresent()) {
			return new ResponseEntity<City>(city.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
		}
	}

}
