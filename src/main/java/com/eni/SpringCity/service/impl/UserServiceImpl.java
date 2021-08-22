package com.eni.SpringCity.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eni.SpringCity.dao.contrat.UserDao;
import com.eni.SpringCity.model.User;
import com.eni.SpringCity.service.contrat.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User createOrUpdateCity(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public Optional<User> findCityById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

}
