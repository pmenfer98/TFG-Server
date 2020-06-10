package com.tfg.service.impl.arduino;

import com.tfg.command.Command;
import com.tfg.dto.DtoAssemblerFactory;
import com.tfg.dto.entity.ArduinoDto;
import com.tfg.repo.RepositoryFactory;

public class FindByIdArduinoService implements Command<ArduinoDto> {

	private RepositoryFactory repositoryFactory;
	private DtoAssemblerFactory dtoAssemblerFactory;
	private Long id;

	public FindByIdArduinoService(RepositoryFactory repositoryFactory, DtoAssemblerFactory dtoAssemblerFactory, Long id) {
		this.repositoryFactory = repositoryFactory;
		this.dtoAssemblerFactory = dtoAssemblerFactory;
		this.id = id;
	}

	@Override
	public ArduinoDto execute() {
		return dtoAssemblerFactory.getArduino().entityToDto(repositoryFactory.getArduino().findById(id).get());
	}

}
