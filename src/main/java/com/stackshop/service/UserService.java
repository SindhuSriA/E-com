package com.stackshop.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackshop.model.UserModel;
import com.stackshop.repository.UserRepository;

@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public UserModel saveUser(UserModel user) {
		return userRepository.save(user);
	}


}
