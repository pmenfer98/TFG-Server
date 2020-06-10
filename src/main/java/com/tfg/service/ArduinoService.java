package com.tfg.service;

import java.util.List;

import com.tfg.dto.entity.ArduinoDto;

public interface ArduinoService {

	public List<ArduinoDto> findAll();
	
	public ArduinoDto findById(Long id);
	
	public ArduinoDto save(ArduinoDto dto);
	
	public ArduinoDto update(ArduinoDto dto);
	
}
