package com.afg.logistic.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afg.logistic.business.abstracts.UserService;
import com.afg.logistic.core.dataAccess.UserRepository;
import com.afg.logistic.core.entities.User;
import com.afg.logistic.core.utilities.results.DataResult;
import com.afg.logistic.core.utilities.results.Result;
import com.afg.logistic.core.utilities.results.SuccessDataResult;
import com.afg.logistic.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserRepository userRepository;
	
	@Autowired
	public UserManager(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public Result add(User user) {
		this.userRepository.save(user);
		return new SuccessResult("Kullanıcı eklendi.");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userRepository.findByEmail(email), "Kullanıcı bulundu.");
	}

	
	
	

}
