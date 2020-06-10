package com.tfg.dto;

import java.util.List;

import com.tfg.dto.entity.UserDto;
import com.tfg.model.User;

public interface DtoAssemblerUser {

	public UserDto entityToDto(User entity);
	
	public User dtoToEntity(UserDto dto);
	
	public List<UserDto> listToDto(List<User> entities);

	public List<User> listToEntity(List<UserDto> dtos);
}
