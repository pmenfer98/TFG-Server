package com.tfg.dto.assembler;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tfg.dto.DtoAssemblerArduino;
import com.tfg.dto.DtoAssemblerFactory;
import com.tfg.dto.DtoAssemblerUser;

@Service
public class DtoAssemblerFactoryImpl implements DtoAssemblerFactory{

	private DtoAssemblerArduino dtoAssemblerArduino;
	private DtoAssemblerUser dtoAssemblerUser;
	
	@Inject
	public DtoAssemblerFactoryImpl(
			DtoAssemblerArduino dtoAssemblerArduino,
			DtoAssemblerUser dtoAssemblerUser) {
		this.dtoAssemblerArduino = dtoAssemblerArduino;
		this.dtoAssemblerUser = dtoAssemblerUser;
	}
	
	@Override
	public DtoAssemblerArduino getArduino() {
		return dtoAssemblerArduino;
	}

	@Override
	public DtoAssemblerUser getUser() {
		return dtoAssemblerUser;
	}

	
	
}
