package com.tfg.service.impl.user;

import java.util.List;

import com.tfg.command.Command;
import com.tfg.dto.DtoAssemblerFactory;
import com.tfg.dto.entity.UserDto;
import com.tfg.repo.RepositoryFactory;

public class FindAllUserService implements Command<List<UserDto>> {

	private RepositoryFactory repositoryFactory;
	private DtoAssemblerFactory dtoAssemblerFactory;
	
	public FindAllUserService(
			RepositoryFactory repositoryFactory,
			DtoAssemblerFactory dtoAssemblerFactory) {
		this.repositoryFactory = repositoryFactory;
		this.dtoAssemblerFactory = dtoAssemblerFactory;
	}
	
	@Override
	public List<UserDto> execute(){
		return dtoAssemblerFactory.getUser().listToDto(repositoryFactory.getUser().findAll());
	}
	
}
