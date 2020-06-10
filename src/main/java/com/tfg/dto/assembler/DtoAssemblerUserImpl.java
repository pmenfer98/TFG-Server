package com.tfg.dto.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tfg.dto.DtoAssemblerUser;
import com.tfg.dto.entity.UserDto;
import com.tfg.model.User;

@Service
public class DtoAssemblerUserImpl implements DtoAssemblerUser {
	
	@Override
	public UserDto entityToDto(User entity) {
		UserDto dto = new UserDto();
		dto.id = entity.getId();
		dto.username = entity.getUsername();
		if(entity.getArduino()!=null) {
			dto.arduinoId = entity.getArduino().getId();
		}
		return dto;
	}
	
	@Override
	public User dtoToEntity(UserDto dto) {
		User entity = new User();
		entity.setId(dto.id);
		entity.setUsername(dto.username);
		//entity.setArduino(repoArduino.findById(dto.arduinoId));
		return entity;
	}
	
	@Override
	public List<User> listToEntity(List<UserDto> dtos){
		List<User> list = new ArrayList<>();
		for(UserDto dto: dtos) {
			list.add(dtoToEntity(dto));
		}
		return list;
	}
	
	@Override
	public List<UserDto> listToDto(List<User> entities){
		List<UserDto> list = new ArrayList<>();
		for(User entity: entities) {
			list.add(entityToDto(entity));
		}
		return list;
	}
}
