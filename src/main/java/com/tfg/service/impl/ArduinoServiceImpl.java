package com.tfg.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tfg.dto.DtoAssemblerFactory;
import com.tfg.dto.entity.ArduinoDto;
import com.tfg.repo.RepositoryFactory;
import com.tfg.service.ArduinoService;
import com.tfg.service.impl.arduino.FindAllArduinoService;
import com.tfg.service.impl.arduino.FindByIdArduinoService;
import com.tfg.service.impl.arduino.SaveArduinoService;
import com.tfg.service.impl.arduino.UpdateArduinoService;

@Service
public class ArduinoServiceImpl implements ArduinoService{
	
	private RepositoryFactory repositoryFactory;
	private DtoAssemblerFactory dtoAssemblerFactory;
	
	@Inject
	public ArduinoServiceImpl(
			RepositoryFactory repositoryFactory,
			DtoAssemblerFactory dtoAssemblerFactory) {
		this.repositoryFactory = repositoryFactory;
		this.dtoAssemblerFactory = dtoAssemblerFactory;
	}
	
	@Override
	public List<ArduinoDto> findAll(){
		return new FindAllArduinoService(repositoryFactory, dtoAssemblerFactory).execute();
	}
	
	@Override
	public ArduinoDto findById(Long id){
		return new FindByIdArduinoService(repositoryFactory, dtoAssemblerFactory, id).execute();
	}
	
	@Override
	public ArduinoDto save(ArduinoDto dto) {
		return new SaveArduinoService(repositoryFactory, dtoAssemblerFactory, dto).execute();
	}
	
	@Override
	public ArduinoDto update(ArduinoDto dto) {
		return new UpdateArduinoService(repositoryFactory, dtoAssemblerFactory, dto).execute();
	}
	
	
}
