package com.tfg.repo.impl;

import org.springframework.stereotype.Service;

import com.tfg.repo.ArduinoRepository;
import com.tfg.repo.RepositoryFactory;
import com.tfg.repo.UserRepository;

@Service
public class RepositoryFactoryImpl implements RepositoryFactory {
	
	private ArduinoRepository arduinoRepository;
	private UserRepository userRepository;

	public RepositoryFactoryImpl(
			ArduinoRepository arduinoRepository,
			UserRepository userRepository) {
		this.arduinoRepository = arduinoRepository;
		this.userRepository = userRepository;
	}
	
	@Override
	public ArduinoRepository getArduino() {
		return arduinoRepository;
	}

	@Override
	public UserRepository getUser() {
		return userRepository;
	}
	
}
