package com.tfg.command.arduino;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tfg.command.Command;
import com.tfg.dto.entity.ArduinoDto;
import com.tfg.service.ServiceFactory;

public class SaveArduino implements Command<ArduinoDto> {

	private ServiceFactory serviceFactory;

	private String json;

	public SaveArduino(ServiceFactory serviceFactory, String json) {
		this.serviceFactory = serviceFactory;
		this.json = json;
	}

	@Override
	public ArduinoDto execute() {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			ArduinoDto dto = objectMapper.readValue(json, ArduinoDto.class);
			return serviceFactory.getArduino().save(dto);
		} catch (JsonProcessingException e) {
			throw new IllegalArgumentException("Los datos del arduino no son validos");
		}
	}

}
