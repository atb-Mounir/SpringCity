package com.eni.SpringCity.model.data;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.eni.SpringCity.dao.contrat.CityDao;
import com.eni.SpringCity.model.City;


@Component
public class CityData {
	
	@Autowired
	private CityDao cityDao;
	
	@EventListener
	public void appReady(ApplicationReadyEvent Event) {
		cityDao.save(new City(0, "SpringBootCity", 2457356, "Une merveilleuse cité où se regroupent tous les amoureux de Spring", LocalDate.parse("2021-10-05")));
	}

}
