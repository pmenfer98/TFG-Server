package com.tfg.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tfg.service.ArduinoService;
import com.tfg.service.ServiceFactory;
import com.tfg.service.UserService;

@Service
public class ServiceFactoryImpl implements ServiceFactory {

	private ArduinoService arduinoService;
	private UserService userService;
	
	@Inject
	public ServiceFactoryImpl(
			ArduinoService arduinoService,
			UserService userService) {
		this.arduinoService = arduinoService;
		this.userService = userService;
	}
	
	@Override
	public ArduinoService getArduino() {
		return arduinoService;
	}

	@Override
	public UserService getUser() {
		return userService;
	}

	
}
