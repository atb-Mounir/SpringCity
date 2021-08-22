package com.eni.SpringCity.service.contrat;

import java.util.Optional;

import com.eni.SpringCity.model.City;

public interface CityService {
	
	public City createOrUpdateCity(City city);
	public Optional<City> findCityById(int id);

}
