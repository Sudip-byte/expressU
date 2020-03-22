package com.sudo.expressu.repository;

import org.springframework.data.repository.CrudRepository;

import com.sudo.expressu.domain.LoginDetailsDao;

public interface LoginDetailsRepository extends CrudRepository<LoginDetailsDao,Integer> {

	LoginDetailsDao findByUsername(String username);
	
}
