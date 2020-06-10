package com.tfg.repo;

public interface RepositoryFactory {

	ArduinoRepository getArduino();
	
	UserRepository getUser();
	
}
