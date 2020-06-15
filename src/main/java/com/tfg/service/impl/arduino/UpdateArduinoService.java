package com.tfg.service.impl.arduino;

import com.tfg.command.Command;
import com.tfg.dto.DtoAssemblerFactory;
import com.tfg.dto.entity.ArduinoDto;
import com.tfg.repo.RepositoryFactory;

public class UpdateArduinoService implements Command<ArduinoDto> {

	private RepositoryFactory repositoryFactory;
	private DtoAssemblerFactory dtoAssemblerFactory;
	private ArduinoDto dto;

	public UpdateArduinoService(RepositoryFactory repositoryFactory, 
			DtoAssemblerFactory dtoAssemblerFactory,
			ArduinoDto dto) {
		this.repositoryFactory = repositoryFactory;
		this.dtoAssemblerFactory = dtoAssemblerFactory;
		this.dto = dto;
	}


	public UpdateArduinoService(ArduinoDto dto) {
		this.dto = dto;
	}

	@Override
	public ArduinoDto execute() {
		if(dto.temperatura>=60)
			dto.state = "PELIGRO";
		else if(dto.peso != dto.presencia)
			dto.state = "NO_DISPONIBLE";
		else if(dto.peso && dto.presencia)
			dto.state = "EN_USO";
		else if(!dto.peso && !dto.presencia)
			dto.state = "DISPONIBLE";
		else 
			dto.state = "NO_DISPONIBLE";
		dto.id = repositoryFactory.getArduino().save(dtoAssemblerFactory.getArduino().dtoToEntity(dto)).getId();
		return dto;
	}

}
