package com.afg.logistic.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afg.logistic.core.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	 User findByEmail(String email);
	 
	
	
}
