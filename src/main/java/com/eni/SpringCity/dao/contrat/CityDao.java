package com.eni.SpringCity.dao.contrat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eni.SpringCity.model.City;

@Repository
public interface CityDao extends CrudRepository<City, Integer> {

}
