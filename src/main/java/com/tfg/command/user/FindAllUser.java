package com.tfg.command.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfg.command.Command;
import com.tfg.dto.entity.UserDto;
import com.tfg.service.UserService;

public class FindAllUser implements Command<List<UserDto>> {
	
	@Autowired
	private UserService service;
	
	@Override
	public List<UserDto> execute(){
		return service.findAll();
	}
}
