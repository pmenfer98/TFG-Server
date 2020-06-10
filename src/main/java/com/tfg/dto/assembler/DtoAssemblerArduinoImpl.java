package com.tfg.dto.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tfg.dto.DtoAssemblerArduino;
import com.tfg.dto.entity.ArduinoDto;
import com.tfg.model.Arduino;
import com.tfg.model.ArduinoState;

@Service
public class DtoAssemblerArduinoImpl implements DtoAssemblerArduino {

	@Override
	public ArduinoDto entityToDto(Arduino entity) {
		ArduinoDto dto = new ArduinoDto();
		dto.id = entity.getId();
		dto.carga = entity.getCarga();
		dto.peso = entity.getPeso();
		dto.presencia = entity.getPresencia();
		dto.puerta = entity.getPuerta();
		dto.temperatura = entity.getTemperatura();
		dto.state = entity.getState().toString();
		if(entity.getUser()!=null)
			dto.userId = entity.getUser().getId();
		return dto;
	}
	
	@Override
	public Arduino dtoToEntity(ArduinoDto dto) {
		Arduino entity = new Arduino();
		entity.setId(dto.id);
		entity.setCarga(dto.carga);
		entity.setPeso(dto.peso);
		entity.setPresencia(dto.presencia);
		entity.setPuerta(dto.puerta);
		entity.setState(ArduinoState.valueOf(dto.state));
		entity.setTemperatura(dto.temperatura);
		//entity.setUser(repoUser.findById(dto.userId));
		return entity;
	}
	
	@Override
	public List<Arduino> listToEntity(List<ArduinoDto> dtos){
		List<Arduino> list = new ArrayList<>();
		for(ArduinoDto dto: dtos) {
			list.add(dtoToEntity(dto));
		}
		return list;
	}
	
	@Override
	public List<ArduinoDto> listToDto(List<Arduino> entities){
		List<ArduinoDto> list = new ArrayList<>();
		for(Arduino entity: entities) {
			list.add(entityToDto(entity));
		}
		return list;
	}
	
}
