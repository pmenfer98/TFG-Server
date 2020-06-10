package com.tfg.service.impl.arduino;

import java.util.List;

import com.tfg.command.Command;
import com.tfg.dto.DtoAssemblerFactory;
import com.tfg.dto.entity.ArduinoDto;
import com.tfg.repo.RepositoryFactory;

public class FindAllArduinoService implements Command<List<ArduinoDto>> {

	private RepositoryFactory repositoryFactory;
	private DtoAssemblerFactory dtoAssemblerFactory;

	public FindAllArduinoService(RepositoryFactory repositoryFactory, DtoAssemblerFactory dtoAssemblerFactory) {
		this.repositoryFactory = repositoryFactory;
		this.dtoAssemblerFactory = dtoAssemblerFactory;
	}

	@Override
	public List<ArduinoDto> execute() {
		return dtoAssemblerFactory.getArduino().listToDto(repositoryFactory.getArduino().findAll());
	}

}
