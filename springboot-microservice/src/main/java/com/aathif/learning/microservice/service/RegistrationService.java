package com.aathif.learning.microservice.service;

import java.util.List;

import com.aathif.learning.microservice.data.User;

public interface RegistrationService {

	public Long registerUser(String user);

	public List<User> getAllUsers();
	
}
