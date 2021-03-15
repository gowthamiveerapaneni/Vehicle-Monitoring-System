package com.vehicles.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vehicles.springboot.model.Vehicle;


import com.vehicles.springboot.repository.VehicleRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleController {
	
	@Autowired
	 VehicleRepository vehicleRepository;

	@GetMapping("/vehicle")
	 List<Vehicle> getVehicles(){
		return getUpdatedStatus(vehicleRepository.findAll());
	}

	
	
	public List<Vehicle> getUpdatedStatus(List<Vehicle> vehicles){		
		vehicles.forEach(vehicle->{
			vehicle.setStatus(Status.randomStatus().toString());
		});
		
		return vehicles;
	}
}
