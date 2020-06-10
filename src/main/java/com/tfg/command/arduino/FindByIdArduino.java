package com.tfg.command.arduino;

import com.tfg.command.Command;
import com.tfg.dto.entity.ArduinoDto;
import com.tfg.service.ServiceFactory;

public class FindByIdArduino implements Command<ArduinoDto> {

	private ServiceFactory serviceFactory;
	private Long id;
	
	public FindByIdArduino(ServiceFactory serviceFactory, Long id) {
		this.serviceFactory = serviceFactory;
		this.id= id;
	}
	
	@Override
	public ArduinoDto execute() {
		return serviceFactory.getArduino().findById(id);
	}
	
}
