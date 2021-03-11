package com.vehicles.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//import com.vehicles.springboot.exception.VehicleNotFoundException;
import com.vehicles.springboot.model.Vehicle;
import com.vehicles.springboot.repository.VehicleRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleController {
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@PostMapping("/vehicles")
	 public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
		 return vehicleRepository.save(vehicle);
	 } 
	 
	@GetMapping("/vehicles")
	public List<Vehicle> getAllVehicles(){
		return vehicleRepository.findAll();	
	}
	
	

}
