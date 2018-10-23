package com.aathif.learning.microservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aathif.learning.microservice.data.User;
import com.aathif.learning.microservice.repo.UserRepository;

@Transactional(propagation = Propagation.REQUIRED)
@Service
public class RegistrationUserServiceImpl implements RegistrationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationUserServiceImpl.class);
	
	private final UserRepository userRepository;
	
	public RegistrationUserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public Long registerUser(String name) {
		User user = new User();
		user.setName(name);
		user = userRepository.save(user);
		LOGGER.info("User {} has been registered", user);
		return user.getId();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
}
