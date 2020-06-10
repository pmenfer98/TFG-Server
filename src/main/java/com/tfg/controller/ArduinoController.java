package com.tfg.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfg.command.arduino.FindAllArduino;
import com.tfg.command.arduino.FindByIdArduino;
import com.tfg.command.arduino.SaveArduino;
import com.tfg.command.arduino.UpdateArduino;
import com.tfg.service.ServiceFactory;

@RestController
@RequestMapping("/arduino")
public class ArduinoController {
	
	private ServiceFactory serviceFactory;

    @Inject
    public ArduinoController(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

	@GetMapping("/list")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(new FindAllArduino(serviceFactory).execute(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		return new ResponseEntity<>(new FindByIdArduino(serviceFactory, id).execute(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody String json){
		return new ResponseEntity<>(new SaveArduino(serviceFactory, json).execute(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody String json){
		return new ResponseEntity<>(new UpdateArduino(serviceFactory, json).execute(), HttpStatus.OK);
	}
}
