package com.tfg.command.arduino;

import java.util.List;

import com.tfg.command.Command;
import com.tfg.dto.entity.ArduinoDto;
import com.tfg.service.ServiceFactory;

public class FindAllArduino implements Command<List<ArduinoDto>> {

	private ServiceFactory serviceFactory;
	
	public FindAllArduino(ServiceFactory serviceFactory) {
		this.serviceFactory = serviceFactory;
	}
	
	@Override
	public List<ArduinoDto> execute() {
		return serviceFactory.getArduino().findAll();
	}
	
}
