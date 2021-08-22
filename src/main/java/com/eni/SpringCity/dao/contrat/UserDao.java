package com.eni.SpringCity.dao.contrat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eni.SpringCity.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

}
