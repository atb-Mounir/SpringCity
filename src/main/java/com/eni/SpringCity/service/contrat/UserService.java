package com.eni.SpringCity.service.contrat;

import java.util.Optional;

import com.eni.SpringCity.model.User;

public interface UserService {
	
	public User createOrUpdateCity(User user);
	public Optional<User> findCityById(int id);

}
