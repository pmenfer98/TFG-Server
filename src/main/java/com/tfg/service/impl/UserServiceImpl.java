package com.tfg.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tfg.dto.DtoAssemblerFactory;
import com.tfg.dto.entity.UserDto;
import com.tfg.repo.RepositoryFactory;
import com.tfg.service.UserService;
import com.tfg.service.impl.user.FindAllUserService;

@Service
public class UserServiceImpl implements UserService{
	
	private RepositoryFactory repositoryFactory;
	private DtoAssemblerFactory dtoAssemblerFactory;
	
	@Inject
	public UserServiceImpl(
			RepositoryFactory repositoryFactory,
			DtoAssemblerFactory dtoAssemblerFactory) {
		this.repositoryFactory = repositoryFactory;
		this.dtoAssemblerFactory = dtoAssemblerFactory;
	}
	
	public List<UserDto> findAll(){
		return new FindAllUserService(repositoryFactory, dtoAssemblerFactory).execute();  
	}
}
