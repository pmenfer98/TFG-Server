package com.tfg.dto;

import java.util.List;

import com.tfg.dto.entity.ArduinoDto;
import com.tfg.model.Arduino;

public interface DtoAssemblerArduino {

	public ArduinoDto entityToDto(Arduino entity);
	
	public Arduino dtoToEntity(ArduinoDto dto);
	
	public List<ArduinoDto> listToDto(List<Arduino> entities);

	public List<Arduino> listToEntity(List<ArduinoDto> dtos);
}
