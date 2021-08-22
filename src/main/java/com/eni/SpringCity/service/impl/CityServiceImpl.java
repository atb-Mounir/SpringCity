package com.eni.SpringCity.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eni.SpringCity.dao.contrat.CityDao;
import com.eni.SpringCity.model.City;
import com.eni.SpringCity.service.contrat.CityService;

@Service
public class CityServiceImpl implements CityService {
	@Autowired
	CityDao cityDao;

	@Override
	public City createOrUpdateCity(City city) {
		// TODO Auto-generated method stub
		return cityDao.save(city);
	}

	@Override
	public Optional<City> findCityById(int id) {
		// TODO Auto-generated method stub
		return cityDao.findById(id);
	}

}
