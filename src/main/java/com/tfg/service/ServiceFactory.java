package com.tfg.service;

public interface ServiceFactory {

	ArduinoService getArduino();
	
	UserService getUser();
	
}
